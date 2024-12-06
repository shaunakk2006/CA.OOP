/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package climateapp;

/**
 *
 * @author shauna kirwan kelly
 */
public class shaunaaskGUI extends javax.swing.JFrame {

    /**
     * Creates new form shaunaaskGUI
     */
    public shaunaaskGUI() {
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

        rightJpnl2 = new javax.swing.JPanel();
        homeJtbn = new javax.swing.JButton();
        titleJlbl = new javax.swing.JLabel();
        wasteJlbl = new javax.swing.JLabel();
        wasteJlbl1 = new javax.swing.JLabel();
        wasteJbtn = new javax.swing.JButton();
        impactJbtn = new javax.swing.JButton();
        leftJpnl = new javax.swing.JPanel();
        welcomeJlbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rightJpnl2.setBackground(new java.awt.Color(255, 255, 255));

        homeJtbn.setBackground(new java.awt.Color(255, 255, 102));
        homeJtbn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homeJtbn.setText("Menu");
        homeJtbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeJtbnActionPerformed(evt);
            }
        });

        titleJlbl.setBackground(new java.awt.Color(0, 0, 0));
        titleJlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleJlbl.setForeground(new java.awt.Color(0, 153, 153));
        titleJlbl.setText("PLEASE SELECT WHAT YOU WANT TO SEE");

        wasteJlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        wasteJlbl.setText("The Waste Calculator");

        wasteJlbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        wasteJlbl1.setText("Tips on saving the enviornment");

        wasteJbtn.setBackground(new java.awt.Color(255, 255, 102));
        wasteJbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        wasteJbtn.setText("Calculator");
        wasteJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wasteJbtnActionPerformed(evt);
            }
        });

        impactJbtn.setBackground(new java.awt.Color(255, 255, 102));
        impactJbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        impactJbtn.setText("Tips");
        impactJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impactJbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightJpnl2Layout = new javax.swing.GroupLayout(rightJpnl2);
        rightJpnl2.setLayout(rightJpnl2Layout);
        rightJpnl2Layout.setHorizontalGroup(
            rightJpnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightJpnl2Layout.createSequentialGroup()
                .addGroup(rightJpnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightJpnl2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(rightJpnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wasteJlbl)
                            .addGroup(rightJpnl2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(wasteJbtn))))
                    .addGroup(rightJpnl2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(titleJlbl)))
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(rightJpnl2Layout.createSequentialGroup()
                .addGroup(rightJpnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeJtbn)
                    .addGroup(rightJpnl2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(wasteJlbl1))
                    .addGroup(rightJpnl2Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(impactJbtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rightJpnl2Layout.setVerticalGroup(
            rightJpnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightJpnl2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(homeJtbn)
                .addGap(35, 35, 35)
                .addComponent(titleJlbl)
                .addGap(33, 33, 33)
                .addComponent(wasteJlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wasteJbtn)
                .addGap(26, 26, 26)
                .addComponent(wasteJlbl1)
                .addGap(18, 18, 18)
                .addComponent(impactJbtn)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        leftJpnl.setBackground(new java.awt.Color(0, 153, 153));

        welcomeJlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        welcomeJlbl.setForeground(new java.awt.Color(255, 255, 102));
        welcomeJlbl.setText("WELCOME");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("TO THE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("SEA LIFE");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        jLabel4.setText("APPLICATION");

        javax.swing.GroupLayout leftJpnlLayout = new javax.swing.GroupLayout(leftJpnl);
        leftJpnl.setLayout(leftJpnlLayout);
        leftJpnlLayout.setHorizontalGroup(
            leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftJpnlLayout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addGroup(leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftJpnlLayout.createSequentialGroup()
                            .addComponent(welcomeJlbl)
                            .addGap(60, 60, 60))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftJpnlLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(90, 90, 90)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftJpnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        leftJpnlLayout.setVerticalGroup(
            leftJpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJpnlLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(welcomeJlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftJpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightJpnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftJpnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightJpnl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeJtbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeJtbnActionPerformed
        // TODO add your handling code here:
        welcomeGUI myGUI = new welcomeGUI(); //opening up the gui
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeJtbnActionPerformed

    private void wasteJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wasteJbtnActionPerformed
        // TODO add your handling code here:
        wasteGUI myGUI = new wasteGUI(); //opening up the wasteGUI
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_wasteJbtnActionPerformed

    private void impactJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impactJbtnActionPerformed
        // TODO add your handling code here:
        impactGUI myGUI = new impactGUI(); //opening up the impactGUI
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_impactJbtnActionPerformed

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
            java.util.logging.Logger.getLogger(shaunaaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shaunaaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shaunaaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shaunaaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shaunaaskGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homeJtbn;
    private javax.swing.JButton impactJbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel leftJpnl;
    private javax.swing.JPanel rightJpnl2;
    private javax.swing.JLabel titleJlbl;
    private javax.swing.JButton wasteJbtn;
    private javax.swing.JLabel wasteJlbl;
    private javax.swing.JLabel wasteJlbl1;
    private javax.swing.JLabel welcomeJlbl;
    // End of variables declaration//GEN-END:variables
}
