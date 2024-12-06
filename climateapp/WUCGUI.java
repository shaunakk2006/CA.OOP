/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package climateapp;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author shemeneroje
 */
public class WUCGUI extends javax.swing.JFrame {

    /**
     * Creates new form WUCGUI
     */
    public WUCGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background_pnl = new javax.swing.JPanel();
        WUC_lbn = new javax.swing.JLabel();
        ques1_lbn = new javax.swing.JLabel();
        ques2_lbn = new javax.swing.JLabel();
        ques3_lbn = new javax.swing.JLabel();
        ans1_tf = new javax.swing.JTextField();
        ans2_tf = new javax.swing.JTextField();
        ans3_tf = new javax.swing.JTextField();
        cal_btn = new javax.swing.JButton();
        menu_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background_pnl.setBackground(new java.awt.Color(204, 255, 204));

        WUC_lbn.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        WUC_lbn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WUC_lbn.setText("Water Usage Calculator");

        ques1_lbn.setBackground(new java.awt.Color(204, 255, 204));
        ques1_lbn.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        ques1_lbn.setText("How many times do you shower a day?");

        ques2_lbn.setBackground(new java.awt.Color(204, 255, 204));
        ques2_lbn.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        ques2_lbn.setText("How many times did you flush the toliet today?");

        ques3_lbn.setBackground(new java.awt.Color(204, 255, 204));
        ques3_lbn.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        ques3_lbn.setText("Do you leave the tap on when you brush your teeth ?");

        ans3_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans3_tfActionPerformed(evt);
            }
        });

        cal_btn.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        cal_btn.setText("Calculate");
        cal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal_btnActionPerformed(evt);
            }
        });

        menu_btn.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        menu_btn.setText("Menu");
        menu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background_pnlLayout = new javax.swing.GroupLayout(background_pnl);
        background_pnl.setLayout(background_pnlLayout);
        background_pnlLayout.setHorizontalGroup(
            background_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_pnlLayout.createSequentialGroup()
                .addGroup(background_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background_pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(background_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(background_pnlLayout.createSequentialGroup()
                                .addComponent(ques1_lbn)
                                .addGap(18, 18, 18)
                                .addComponent(ans1_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(background_pnlLayout.createSequentialGroup()
                                .addComponent(ques2_lbn)
                                .addGap(18, 18, 18)
                                .addComponent(ans2_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(background_pnlLayout.createSequentialGroup()
                                .addComponent(ques3_lbn, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ans3_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(background_pnlLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(WUC_lbn, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menu_btn)
                    .addGroup(background_pnlLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(cal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 183, Short.MAX_VALUE))
        );
        background_pnlLayout.setVerticalGroup(
            background_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_btn)
                .addGap(8, 8, 8)
                .addComponent(WUC_lbn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(background_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ques1_lbn)
                    .addComponent(ans1_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(background_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ques2_lbn)
                    .addComponent(ans2_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(background_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ques3_lbn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ans3_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ans3_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans3_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans3_tfActionPerformed

    private void cal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal_btnActionPerformed
        // TODO add your handling code here:
        String showerInput = ans1_tf.getText();
        String flushInput = ans2_tf.getText();
        String tapInput = ans3_tf.getText().toLowerCase(); //convert to lowercase

        // Check if the user entered valid numbers for showers and flushes
        try {
            int showers = Integer.parseInt(showerInput);
            int flushes = Integer.parseInt(flushInput);

            // Check if the tap input is either "yes" or "no"
            int tap = (tapInput.equals("yes")) ? 3 : 0;

            // Calculate the total water usage
            int total = (showers * 10) + (flushes * 5) + tap;

            // Display the result to the user
            JOptionPane.showMessageDialog(null, "Total water usage: " + total + " litres");

        } catch (NumberFormatException e) {
            // If the input for showers or flushes is not a valid number
            JOptionPane.showMessageDialog(null, "Please enter valid amounts", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cal_btnActionPerformed

    private void menu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btnActionPerformed
        // TODO add your handling code here:
        
        Menu2GUI myGUI = new Menu2GUI(); 
        myGUI.setVisible(true);
        this.dispose(); //gets rid of old GUIs to prevent multiple windows at once


         
    }//GEN-LAST:event_menu_btnActionPerformed

    
    
        
    


   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new WUCGUI().setVisible(true));
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
            java.util.logging.Logger.getLogger(WUCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WUCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WUCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WUCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WUCGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WUC_lbn;
    private javax.swing.JTextField ans1_tf;
    private javax.swing.JTextField ans2_tf;
    private javax.swing.JTextField ans3_tf;
    private javax.swing.JPanel background_pnl;
    private javax.swing.JButton cal_btn;
    private javax.swing.JButton menu_btn;
    private javax.swing.JLabel ques1_lbn;
    private javax.swing.JLabel ques2_lbn;
    private javax.swing.JLabel ques3_lbn;
    // End of variables declaration//GEN-END:variables
}