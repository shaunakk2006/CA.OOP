/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp; 

  

/** 

* 

* @author shauna 

*/ 

public class sea extends welcome{ 
    private String email; 
    private String password; 
    private int age; 
    private double donate; 

     

    public sea(){ 
        email = " "; 
        password = " "; 
        age = 0; 
        donate = 0; 
    } 

    //overloaded constructor 
    public sea(String email, String password, int age, double donate) { 
        this.email = email; 
        this.password = password; 
        this.age = age; 
        this.donate = donate; 
    } 

  


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDonate() {
        return donate;
    }

    public void setDonate(double donate) {
        this.donate = donate;
    }

     public String getDetails(){ 
        return "Donation Details: "+email+","+age+","+donate; 

    }  

 
} 
