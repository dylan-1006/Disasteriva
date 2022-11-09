package screens;

import data.disasterList;
import javax.swing.JOptionPane;
import data.userData;
import data.newlyReportedDisastersList;
import java.awt.Color;
//import screens.*;
import screens.AdminScreen;
import screens.UserLoginScreen;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author eudyl
 */
public class AdminLoginScreen extends javax.swing.JFrame {

    //Declare color for JLables in the UI
    Color clickedColor;
    Color originalColor;

    /**
     * Creates new form AdminLoginPage
     */
    public AdminLoginScreen() {
        initComponents();
        //Define color used for JLabels in the UI
        clickedColor = new Color(255, 51, 51);
        originalColor = new Color(0, 0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adminIdText = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        adminID = new javax.swing.JTextField();
        adminPassword = new javax.swing.JPasswordField();
        backButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        adminIdText.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        adminIdText.setForeground(new java.awt.Color(0, 0, 0));
        adminIdText.setText("Admin ID ");

        passwordText.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        passwordText.setForeground(new java.awt.Color(0, 0, 0));
        passwordText.setText("Password ");

        adminID.setBackground(new java.awt.Color(255, 255, 255));
        adminID.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        adminID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        adminID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminIDActionPerformed(evt);
            }
        });

        adminPassword.setBackground(new java.awt.Color(255, 255, 255));
        adminPassword.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        adminPassword.setForeground(new java.awt.Color(0, 0, 0));
        adminPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        adminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPasswordActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("< Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/adminLoginScreen/adminLoginScreenBackground.png"))); // NOI18N

        loginButton.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Login >");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminIdText)
                            .addComponent(passwordText)
                            .addComponent(adminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(loginButton)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(adminIdText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(loginButton)
                .addGap(77, 77, 77))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Sets the dashboard details
    public void setAndFetchAdminScreenDashboard() {

        String totalDisaster = String.valueOf(disasterList.disasterInitList.size());
        AdminScreen.totalReportedDisasters.setText(totalDisaster);

        //Sets TotalDonationAmount
        double totalDonationDouble = userData.initUserData.totalDonationAmount;
        String totalDonationString;
        if (totalDonationDouble >= 1000.00) {

            totalDonationDouble = totalDonationDouble / 1000.00;
            totalDonationString = String.valueOf(totalDonationDouble + "K");
        } else {
            totalDonationString = String.valueOf(totalDonationDouble);
        }
        AdminScreen.totalDonationAmount.setText("RM" + totalDonationString);

        //Sets TotalReportsReceived
        newlyReportedDisastersList.initializeDisasterListContent(null);
        AdminScreen.totalUserReportsReceived.setText(String.valueOf(data.newlyReportedDisastersList.newlyReportedDisasterList.size()));

    }

    //Enter key that checks if user input adminID and adminPassword are correct
    @SuppressWarnings("empty-statement")
    private void adminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPasswordActionPerformed

        String adminId = adminID.getText();
        String adminPw = String.valueOf(adminPassword.getPassword());

        String trueAdminId = "admin";
        String trueAdminPw = "0000";

        //Allow access if adminId & adminPassword is correct
        if ((adminId.equals(trueAdminId)) && (adminPw.equals(trueAdminPw))) {
            AdminScreen admin = new AdminScreen();
            setAndFetchAdminScreenDashboard();
            admin.setVisible(true);
            dispose();

            //Not allow access
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect ID or Password. Please try again!", "Error", JOptionPane.ERROR_MESSAGE);
            AdminLoginScreen admin = new AdminLoginScreen();
            admin.setVisible(true);

            dispose();
        };


    }//GEN-LAST:event_adminPasswordActionPerformed

    private void adminIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminIDActionPerformed
        // TODO add your handling code here:
        adminPassword.requestFocus();
    }//GEN-LAST:event_adminIDActionPerformed

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        UserLoginScreen login = new UserLoginScreen();
        UserLoginScreen.allPanes.setSelectedIndex(2);
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        String adminId = adminID.getText();
        String adminPw = String.valueOf(adminPassword.getPassword());

        String trueAdminId = "admin";
        String trueAdminPw = "0000";

        //Allow access if adminId & adminPassword is correct
        if ((adminId.equals(trueAdminId)) && (adminPw.equals(trueAdminPw))) {
            AdminScreen admin = new AdminScreen();
            setAndFetchAdminScreenDashboard();

            admin.setVisible(true);
            
            dispose();
        } //Not allow access
        else {
            JOptionPane.showMessageDialog(null, "Incorrect ID or Password. Please try again!", "Error", JOptionPane.ERROR_MESSAGE);
            AdminLoginScreen admin = new AdminLoginScreen();

            admin.setVisible(true);
            dispose();
        }


    }//GEN-LAST:event_loginButtonMouseClicked

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        // TODO add your handling code here:
        backButton.setForeground(clickedColor);
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        // TODO add your handling code here:
        backButton.setForeground(originalColor);
    }//GEN-LAST:event_backButtonMouseExited

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        // TODO add your handling code here:
        loginButton.setForeground(clickedColor);
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        // TODO add your handling code here:
        loginButton.setForeground(originalColor);
    }//GEN-LAST:event_loginButtonMouseExited

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
            java.util.logging.Logger.getLogger(AdminLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminID;
    private javax.swing.JLabel adminIdText;
    private javax.swing.JPasswordField adminPassword;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginButton;
    private javax.swing.JLabel passwordText;
    // End of variables declaration//GEN-END:variables
}
