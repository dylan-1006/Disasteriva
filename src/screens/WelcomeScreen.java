package screens;

public class WelcomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form Welcome Screen
     */
    public WelcomeScreen() {
        initComponents();
        System.setProperty("prism.allowhidpi", "false");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startNowButton = new javax.swing.JLabel();
        welcomeScreenBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome ");
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.green);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startNowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/welcomeScreenStartNow1.png"))); // NOI18N
        startNowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startNowButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startNowButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startNowButtonMouseExited(evt);
            }
        });
        getContentPane().add(startNowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 100, 30));

        welcomeScreenBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeScreenBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/welcomeScreenBackground.png"))); // NOI18N
        welcomeScreenBackground.setDoubleBuffered(true);
        getContentPane().add(welcomeScreenBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 350, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startNowButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startNowButtonMouseClicked
        // TODO add your handling code here:
        UserLoginScreen login = new UserLoginScreen();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_startNowButtonMouseClicked

    private void startNowButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startNowButtonMouseEntered
        // TODO add your handling code here:

        startNowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/welcomeScreenStartNow2.png")));
    }//GEN-LAST:event_startNowButtonMouseEntered

    private void startNowButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startNowButtonMouseExited
        // TODO add your handling code here:
        startNowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/welcomeScreenStartNow1.png")));

    }//GEN-LAST:event_startNowButtonMouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        System.setProperty("prism.allowhidpi", "false");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new WelcomeScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel startNowButton;
    private javax.swing.JLabel welcomeScreenBackground;
    // End of variables declaration//GEN-END:variables
}
