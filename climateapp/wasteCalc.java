/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

/**
 *
 * @author shauna
 */
public class wasteCalc extends welcome{
    private String waste;
    private int days;
    private int times;
    
    public wasteCalc(){
        waste=" ";
        days = 0;
        times = 0;
    }

    public wasteCalc(String waste, int days, int times) {
        this.waste = waste;
        this.days = days;
        this.times = times;
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
    
    
    
    
}
