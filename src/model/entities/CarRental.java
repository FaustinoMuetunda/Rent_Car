/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.Date;

/**
 *
 * @author faust
 */
public class CarRental {

    private Date start;
    private Date finish;

    //associacoes de classes
    private Vehicle vehivle;
    private Invoice invoice;

    public CarRental() {
    }

    public CarRental(Date start, Date finish, Vehicle vehivle) {
        this.start = start;
        this.finish = finish;
        this.vehivle = vehivle;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Vehicle getVehivle() {
        return vehivle;
    }

    public void setVehivle(Vehicle vehivle) {
        this.vehivle = vehivle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    

}
