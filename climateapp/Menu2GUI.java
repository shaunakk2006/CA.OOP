/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package climateapp;

/**
 *
 * @author shemeneroje
 */
public class Menu2GUI extends javax.swing.JFrame {

    /**
     * Creates new form Menu2GUI
     */
    public Menu2GUI() {
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

        menuP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        landMenuLBN = new javax.swing.JLabel();
        menuBarP = new javax.swing.JPanel();
        homeP = new javax.swing.JPanel();
        home_btn = new javax.swing.JButton();
        tipsP = new javax.swing.JPanel();
        tips_btn = new javax.swing.JButton();
        wucP = new javax.swing.JPanel();
        wuc_btn = new javax.swing.JButton();
        quizP = new javax.swing.JPanel();
        quiz_btn = new javax.swing.JButton();
        main_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuP.setBackground(new java.awt.Color(255, 255, 255));
        menuP.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabel1.setFont(new java.awt.Font("Chalkduster", 0, 36)); // NOI18N

        landMenuLBN.setFont(new java.awt.Font("Helvetica Neue", 3, 48)); // NOI18N
        landMenuLBN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        landMenuLBN.setText("Land Menu");

        javax.swing.GroupLayout menuPLayout = new javax.swing.GroupLayout(menuP);
        menuP.setLayout(menuPLayout);
        menuPLayout.setHorizontalGroup(
            menuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(landMenuLBN, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        menuPLayout.setVerticalGroup(
            menuPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(menuPLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(landMenuLBN, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuBarP.setBackground(new java.awt.Color(204, 255, 204));

        home_btn.setBackground(new java.awt.Color(242, 242, 242));
        home_btn.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homePLayout = new javax.swing.GroupLayout(homeP);
        homeP.setLayout(homePLayout);
        homePLayout.setHorizontalGroup(
            homePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePLayout.createSequentialGroup()
                .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        homePLayout.setVerticalGroup(
            homePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        tips_btn.setBackground(new java.awt.Color(242, 242, 242));
        tips_btn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        tips_btn.setText("Tips");
        tips_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tips_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tipsPLayout = new javax.swing.GroupLayout(tipsP);
        tipsP.setLayout(tipsPLayout);
        tipsPLayout.setHorizontalGroup(
            tipsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tips_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tipsPLayout.setVerticalGroup(
            tipsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tips_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        wuc_btn.setBackground(new java.awt.Color(242, 242, 242));
        wuc_btn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        wuc_btn.setText("Water Usage Calculator");
        wuc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wuc_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wucPLayout = new javax.swing.GroupLayout(wucP);
        wucP.setLayout(wucPLayout);
        wucPLayout.setHorizontalGroup(
            wucPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wuc_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        wucPLayout.setVerticalGroup(
            wucPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wuc_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        quiz_btn.setBackground(new java.awt.Color(242, 242, 242));
        quiz_btn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        quiz_btn.setText("Quiz");
        quiz_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quiz_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quizPLayout = new javax.swing.GroupLayout(quizP);
        quizP.setLayout(quizPLayout);
        quizPLayout.setHorizontalGroup(
            quizPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quiz_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        quizPLayout.setVerticalGroup(
            quizPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quiz_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        main_btn.setBackground(new java.awt.Color(242, 242, 242));
        main_btn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        main_btn.setText("Main Menu");
        main_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuBarPLayout = new javax.swing.GroupLayout(menuBarP);
        menuBarP.setLayout(menuBarPLayout);
        menuBarPLayout.setHorizontalGroup(
            menuBarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tipsP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(wucP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(quizP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(main_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuBarPLayout.setVerticalGroup(
            menuBarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarPLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(main_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(homeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(tipsP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(wucP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(quizP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuBarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuP, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuP, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
            .addComponent(menuBarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        // TODO add your handling code here:
        Menu2GUI myGUI = new Menu2GUI(); 
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_home_btnActionPerformed

    private void tips_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tips_btnActionPerformed
        // TODO add your handling code here:
        TipsGUI myGUI3 = new TipsGUI(); 
        myGUI3.setVisible(true);
        this.dispose(); //gets rid of old GUIs to prevent multiple windows at once
    }//GEN-LAST:event_tips_btnActionPerformed

    private void wuc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wuc_btnActionPerformed
        // TODO add your handling code here:
        WUCGUI myGUI2 = new WUCGUI();
        myGUI2.setVisible(true);
        this.dispose(); //gets rid of old GUIs to prevent multiple windows at once
    }//GEN-LAST:event_wuc_btnActionPerformed

    private void quiz_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiz_btnActionPerformed
        // TODO add your handling code here:
        QuizGUI myGUI4 = new QuizGUI(); 
        myGUI4.setVisible(true);
        this.dispose(); //gets rid of old GUIs to prevent multiple windows at once
        
    }//GEN-LAST:event_quiz_btnActionPerformed

    private void main_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_btnActionPerformed
        // TODO add your handling code here:
         welcomeGUI myGUI = new welcomeGUI(); //opening up the seaGUI
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_main_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Menu2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homeP;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel landMenuLBN;
    private javax.swing.JButton main_btn;
    private javax.swing.JPanel menuBarP;
    private javax.swing.JPanel menuP;
    private javax.swing.JPanel quizP;
    private javax.swing.JButton quiz_btn;
    private javax.swing.JPanel tipsP;
    private javax.swing.JButton tips_btn;
    private javax.swing.JPanel wucP;
    private javax.swing.JButton wuc_btn;
    // End of variables declaration//GEN-END:variables
}
