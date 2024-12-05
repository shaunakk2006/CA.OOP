/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

/**
 *
 * @author shauna kirwan kelly
 */
public class donate {
        private double donation;
    private double monthly;
    private double total;

    public donate(double donation, double monthly, double total) {
        this.donation = donation;
        this.monthly = monthly;
        this.total = total;
    }

    public double getDonation() {
        return donation;
    }

    public void setDonation(double donation) {
        this.donation = donation;
    }

    public double getMonthly() {
        return monthly;
    }

    public void setMonthly(double monthly) {
        this.monthly = monthly;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
    

