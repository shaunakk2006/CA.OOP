/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateapp;

import javax.swing.JOptionPane;

/**
 *
 * @author shauna kirwan kelly
 */
public class signup extends sea {
    private String email; 
    private String password; 
    private int age;  

    public signup(String email, String password, int age) {
        super();
        this.email = email;
        this.password = password;
        this.age = age;
    }


        @Override
    public String getEmail() {
        return email;
    }

        @Override
    public void setEmail(String email) {
        this.email = email;
    }

        @Override
    public String getPassword() {
        return password;
    }

        @Override
    public void setPassword(String password) {
        this.password = password;
    }

        @Override
    public int getAge() {
        return age;
    }

        @Override
    public void setAge(int age) {
        this.age = age;
    }

       
     public String signupDetails(){ 
        JOptionPane.showMessageDialog(null, "Your signup details are:");
        return getDetails();

    } 
}
    

