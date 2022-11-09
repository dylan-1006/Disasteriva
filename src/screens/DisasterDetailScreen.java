/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import data.disasterList;
import javax.swing.JOptionPane;
import data.userData;

/**
 *
 * @author Bonifacio Ronald
 */
public class DisasterDetailScreen extends javax.swing.JFrame {
    public static boolean userDonated = false;
    /**
     * Creates new form DisasterDetailScreen
     */
    public DisasterDetailScreen() {
        initComponents();
    }
    
    public static int selectedDisasterListIndex;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        disasterDetailDescription = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        disasterDetailImage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        disasterDetailType = new javax.swing.JLabel();
        disasterDetailInfo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        disasterDetailDonation = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        disasterDetailDescription.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        disasterDetailDescription.setForeground(new java.awt.Color(51, 51, 51));
        disasterDetailDescription.setText("<html><p>A landslide has occurred at KM27 Jalan Simpang Pulai-Cameron Highlands near here. Police have confirmed the deaths of two men buried under the landslide at the kilometre 35 along Jalan Simpang Pulai-Cameron Highlands. The victims were identified as Muhammad Hafiz Hamdi, 31, from Tanjung Piandang in Kerian, who was driving a lorry carrying vegetable, and Tan Chee Heng, 36, from Klang, Selangor, who was driving a MPV.</p></html>");
        disasterDetailDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(disasterDetailDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 347, 220));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(disasterDetailImage, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(disasterDetailImage, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 347, 130));

        jPanel3.setBackground(new java.awt.Color(242, 243, 247));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        disasterDetailType.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        disasterDetailType.setForeground(new java.awt.Color(0, 0, 0));
        disasterDetailType.setText("<html><p>Landslide in Cameron Highlands</p></html>");
        jPanel3.add(disasterDetailType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 279, -1));

        disasterDetailInfo.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        disasterDetailInfo.setForeground(new java.awt.Color(51, 51, 51));
        disasterDetailInfo.setText("Pahang | Malaysia, 2 December 2021");
        jPanel3.add(disasterDetailInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Donations Collected");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        disasterDetailDonation.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        disasterDetailDonation.setForeground(new java.awt.Color(255, 51, 51));
        disasterDetailDonation.setText("RM90000 / RM170000 (52.9%)");
        jPanel4.add(disasterDetailDonation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Donate");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 80, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 320, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 350, 170));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String donationAmountString = null;
        int donationAmountInt = 0;
        
        JOptionPane.showMessageDialog(null, "Hi, " + userData.initUserData.name + "! Thank you for showing interest in donating to disaster relief charity. "
               + "\n\nPlease press 'OK' to continue.", "Donation", 1);
        
        while(true) {
            donationAmountString = JOptionPane.showInputDialog(null, "Please enter the amount you would like to donate (in RM) : ", "Donation Amount", 3);
            
            if(donationAmountString.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid donation amount!", "Error", 2);
            }
            
            else {
                try {
                    donationAmountInt = Integer.parseInt(donationAmountString);
                String donnationMessage = JOptionPane.showInputDialog(null, "Please enter a short mesasage for your donation (optional): ", "Donation Message", 3);
                JOptionPane.showMessageDialog(null, "Thank you for donating RM" + donationAmountInt + " to the disaster relief charity."
               + "\nThe amount you have donated will allow relief agencies to buy supplies based on the specific needs of people, \nGet aid to affected populations as quickly as possible, \nAnd support the local economy, which may have been seriously affected by the disaster.", "Title", 1);
                break;
                    
                }
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid donation amount!", "Error", 2);
                }
            }
        }
        
       userData.initUserData.totalDonationAmount += donationAmountInt;
       userData.initUserData.numberOfDonation++;       
       userDonated = true;
       
       disasterList.disasterInitList.get(selectedDisasterListIndex).donationCollection += donationAmountInt;
       
       screens.UserHomeScreen.fetchAndSetDisasterDetailScreen(selectedDisasterListIndex);
       screens.UserLoginScreen.setUserHomeScreenData();
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DisasterDetailScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisasterDetailScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisasterDetailScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisasterDetailScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisasterDetailScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel disasterDetailDescription;
    public static javax.swing.JLabel disasterDetailDonation;
    public static javax.swing.JLabel disasterDetailImage;
    public static javax.swing.JLabel disasterDetailInfo;
    public static javax.swing.JLabel disasterDetailType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
