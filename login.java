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
public class login extends sea{
        private String email; 
    private String password; 

    public login(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }
/*
    public login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
*/

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

      
     public String LoginDetails(){ 
        JOptionPane.showMessageDialog(null, "Your login details are:");
        return getDetails();
     }

}

    

