/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package climateapp;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author shauna kirwan kelly
 */
public class seaGUI extends javax.swing.JFrame {
    private ArrayList<sea> sea = new ArrayList<>(); 

    /**
     * Creates new form seaGUI
     */
    public seaGUI() {
        initComponents();
        emailJlbl.setVisible(false);
        emailJtf.setVisible(false);
        passwordJlbl.setVisible(false);
        passwordJpf.setVisible(false);
        ageJlbl.setVisible(false);
        ageJtf.setVisible(false);
        read();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftJpnl = new javax.swing.JPanel();
        welcomeJlbl = new javax.swing.JLabel();
        welcome2Jlbl = new javax.swing.JLabel();
        welcome3Jlbl = new javax.swing.JLabel();
        welcome4Jlbl = new javax.swing.JLabel();
        rightJpnl = new javax.swing.JPanel();
        loginJlbl = new javax.swing.JLabel();
        emailJlbl = new javax.swing.JLabel();
        passwordJlbl = new javax.swing.JLabel();
        ageJlbl = new javax.swing.JLabel();
        emailJtf = new javax.swing.JTextField();
        ageJtf = new javax.swing.JTextField();
        continueJbtn = new javax.swing.JButton();
        homeJtbn = new javax.swing.JButton();
        createJrb = new javax.swing.JRadioButton();
        loginJrb = new javax.swing.JRadioButton();
        passwordJpf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftJpnl.setBackground(new java.awt.Color(0, 153, 153));

        welcomeJlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        welcomeJlbl.setForeground(new java.awt.Color(255, 255, 102));
        welcomeJlbl.setText("WELCOME");

        welcome2Jlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcome2Jlbl.setForeground(new java.awt.Color(255, 255, 102));
        welcome2Jlbl.setText("TO THE");

        welcome3Jlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcome3Jlbl.setForeground(new java.awt.Color(255, 255, 102));
        welcome3Jlbl.setText("SEA LIFE");

        welcome4Jlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcome4Jlbl.setForeground(new java.awt.Color(255, 255, 102));
        welcome4Jlbl.setText("APPLICATION");

        rightJpnl.setBackground(new java.awt.Color(255, 255, 255));

        loginJlbl.setBackground(new java.awt.Color(0, 0, 0));
        loginJlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginJlbl.setForeground(new java.awt.Color(0, 153, 153));
        loginJlbl.setText("PLEASE SELECT AN OPTION");
        loginJlbl.setPreferredSize(new java.awt.Dimension(760, 400));

        emailJlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailJlbl.setText("Email:");

        passwordJlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordJlbl.setText("Password");

        ageJlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageJlbl.setText("Age:");

        emailJtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJtfActionPerformed(evt);
            }
        });

        continueJbtn.setBackground(new java.awt.Color(255, 255, 102));
        continueJbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        continueJbtn.setText("Continue");
        continueJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueJbtnActionPerformed(evt);
            }
        });

        homeJtbn.setBackground(new java.awt.Color(255, 255, 102));
        homeJtbn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homeJtbn.setText("Menu");
        homeJtbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeJtbnActionPerformed(evt);
            }
        });

        createJrb.setText("Create Account");
        createJrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJrbActionPerformed(evt);
            }
        });

        loginJrb.setText("Login");
        loginJrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJrbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightJpnlLayout = new javax.swing.GroupLayout(rightJpnl);
        rightJpnl.setLayout(rightJpnlLayout);
        rightJpnlLayout.setHorizontalGroup(
            rightJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightJpnlLayout.createSequentialGroup()
                .addGroup(rightJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeJtbn)
                    .addGroup(rightJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightJpnlLayout.createSequentialGroup()
                            .addGroup(rightJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(rightJpnlLayout.createSequentialGroup()
                                    .addGap(92, 92, 92)
                                    .addComponent(loginJlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(rightJpnlLayout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addGroup(rightJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ageJlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordJlbl))))
                            .addGap(0, 48, Short.MAX_VALUE))
                        .addGroup(rightJpnlLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(createJrb, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginJrb, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, 94))
            .addGroup(rightJpnlLayout.createSequentialGroup()
                .addGroup(rightJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightJpnlLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(rightJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordJpf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rightJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailJlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ageJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(rightJpnlLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(continueJbtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rightJpnlLayout.setVerticalGroup(
            rightJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightJpnlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(homeJtbn)
                .addGap(24, 24, 24)
                .addComponent(loginJlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rightJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createJrb)
                    .addComponent(loginJrb))
                .addGap(17, 17, 17)
                .addComponent(emailJlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailJtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(passwordJlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordJpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ageJlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ageJtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(continueJbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout leftJpnlLayout = new javax.swing.GroupLayout(leftJpnl);
        leftJpnl.setLayout(leftJpnlLayout);
        leftJpnlLayout.setHorizontalGroup(
            leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJpnlLayout.createSequentialGroup()
                .addGroup(leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftJpnlLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcome4Jlbl)
                            .addComponent(welcomeJlbl)))
                    .addGroup(leftJpnlLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(welcome3Jlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftJpnlLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(welcome2Jlbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(rightJpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        leftJpnlLayout.setVerticalGroup(
            leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJpnlLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(welcomeJlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(welcome2Jlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome3Jlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome4Jlbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(rightJpnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftJpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftJpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailJtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJtfActionPerformed

    private void continueJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueJbtnActionPerformed
        // TODO add your handling code here:

        if (loginJrb.isSelected()) {
            read();  // This will load the list of users from the signup txt

            String email = emailJtf.getText();
            String password = new String(passwordJpf.getPassword());

            //i used the employeeGUI to help to this
            for (sea input : sea) {
                if (input.getEmail().equals(email) && input.getPassword().equals(password)) {
                    // if the user inputted email is equal to the saved email in signup.txt the application continues
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    shaunaaskGUI myGUI = new shaunaaskGUI();
                    myGUI.setVisible(true);
                    this.dispose();
                    break; //exit the loop otherwise this gui will pop up over and over
                } else{
                    JOptionPane.showMessageDialog(null, "Invalid email or password. Please re-enter your details or make an account");
                }
            }

        } else if (createJrb.isSelected()) {
            sea s = new sea();
            s.setEmail(emailJtf.getText());
            s.setPassword(passwordJpf.getText());
            s.setAge(Integer.parseInt(ageJtf.getText()));
            sea.add(s);

            //making sure the user is old enough to create an account
            int age = Integer.parseInt(ageJtf.getText());
            if (age < 18) {
                JOptionPane.showMessageDialog(null, "You're too young to create an account");
            } else {
                JOptionPane.showMessageDialog(null, "You are old enough to create an account");
            }

            save();

            shaunaaskGUI myGUI = new shaunaaskGUI();
            myGUI.setVisible(true);
            this.dispose();

        }
    }
        
            //code from employeeGUI
       private void save() {
        // Declare objects for file output and object streams
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            // Create the file and streams
            f = new File("signup.txt");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);

           
            oStream.writeObject(this.sea);  /*have to use this.sea to make sure its reading the main sea variable
            and not a new one made in this gui, i looked at this https://stackoverflow.com/questions/49683841/passing-objects-to-a-gui-in-java
            and they had this.testField, so I did the same with this.sea*/

            oStream.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    private void read() {
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            f = new File("signup.txt");
            fStream = new FileInputStream(f);
            oStream = new ObjectInputStream(fStream);

            
            this.sea = (ArrayList<sea>) oStream.readObject();  // assigning to the sea array

            oStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }
    

    }//GEN-LAST:event_continueJbtnActionPerformed

    private void homeJtbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeJtbnActionPerformed
        // TODO add your handling code here:
        welcomeGUI myGUI = new welcomeGUI();
        myGUI.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_homeJtbnActionPerformed

    private void createJrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJrbActionPerformed
        // TODO add your handling code here:
        emailJlbl.setVisible(true);
        emailJtf.setVisible(true);
        passwordJlbl.setVisible(true);
        passwordJpf.setVisible(true);
        ageJlbl.setVisible(true);
        ageJtf.setVisible(true);
    }//GEN-LAST:event_createJrbActionPerformed

    private void loginJrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJrbActionPerformed
        // TODO add your handling code here:
        emailJlbl.setVisible(true);
        emailJtf.setVisible(true);
        passwordJlbl.setVisible(true);
        passwordJpf.setVisible(true);
        ageJlbl.setVisible(false);
        ageJtf.setVisible(false);
    }//GEN-LAST:event_loginJrbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(seaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageJlbl;
    private javax.swing.JTextField ageJtf;
    private javax.swing.JButton continueJbtn;
    private javax.swing.JRadioButton createJrb;
    private javax.swing.JLabel emailJlbl;
    private javax.swing.JTextField emailJtf;
    private javax.swing.JButton homeJtbn;
    private javax.swing.JPanel leftJpnl;
    private javax.swing.JLabel loginJlbl;
    private javax.swing.JRadioButton loginJrb;
    private javax.swing.JLabel passwordJlbl;
    private javax.swing.JPasswordField passwordJpf;
    private javax.swing.JPanel rightJpnl;
    private javax.swing.JLabel welcome2Jlbl;
    private javax.swing.JLabel welcome3Jlbl;
    private javax.swing.JLabel welcome4Jlbl;
    private javax.swing.JLabel welcomeJlbl;
    // End of variables declaration//GEN-END:variables
}
