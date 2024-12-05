/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

import java.io.Serializable;

/**
 *
 * @author shauna kirwan kelly
 */
public class sea implements Serializable{ 
    private String email; 
    private String password; 
    private int age;  

     

    public sea(){ 
        email = " "; 
        password = " "; 
        age = 0; 
    } 

    //overloaded constructor 

    public sea(String email, String password, int age) {
        this.email = email;
        this.password = password;
        this.age = age;
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

     public String getDetails(){ 
        return "Details: "+email+","+age; 

    }  

 
} 
    

