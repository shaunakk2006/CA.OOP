/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

/**
 *
 * @author shauna kirwan kelly
 */
public class wasteCalc {
    private String waste;
    private int days;
    private int times;
    private double wasteKg;
    private double weeklyWaste;
    private double monthlyWaste;
    
    public wasteCalc(){
        waste=" ";
        days = 0;
        times = 0;
        wasteKg = 0;
        weeklyWaste = 0.0;
        monthlyWaste = 0.0;
    }

    public wasteCalc(String waste, int days, int times, double wasteKg, double weeklyWaste, double monthlyWaste) {
        this.waste = waste;
        this.days = days;
        this.times = times;
        this.wasteKg = wasteKg;
        this.weeklyWaste = weeklyWaste;
        this.monthlyWaste = monthlyWaste;
        
    }

    public String getWaste() {
        return waste;
    }

    public void setWaste(String waste) {
        this.waste = waste;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public double getWeeklyWaste() {
        return weeklyWaste;
    }

    public void setWeeklyWaste(double weeklyWaste) {
        this.weeklyWaste = weeklyWaste;
    }

    public double getMonthlyWaste() {
        return monthlyWaste;
    }

    public void setMonthlyWaste(double monthlyWaste) {
        this.monthlyWaste = monthlyWaste;
    }

    public double getWasteKg() {
        return wasteKg;
    }

    public void setWasteKg(double wasteKg) {
        this.wasteKg = wasteKg;
    }
        
        
}
    

