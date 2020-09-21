/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

/**
 *
 * @author faust
 */
public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;
    private PortugalTaxService taxservice;

    public RentalService() {
    }

    public RentalService(Double pricePerDay, Double pricePerHour, PortugalTaxService taxservice) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxservice = taxservice;
    }

    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();

        //converter o milisegundo em segundo-minutos-hora/ 1000/60/60
        double hours = (double) (t2 - t1) / 3600000;
        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour;

        } else {
            basicPayment = Math.ceil(hours/24) * pricePerDay;
        }
        double tax=taxservice.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
