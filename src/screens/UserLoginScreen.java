package screens;

import models.Disaster;
import data.disasterList;
import data.faqTipsList;
import data.newlyReportedDisastersList;
import data.potentialDisasterWarningList;
import java.awt.Desktop;
import java.net.URL;

import data.userData;
import java.awt.*;

import javax.swing.*;
import screens.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author eudyl
 */
public class UserLoginScreen extends javax.swing.JFrame {

    Color clickedColor;
    Color originalColor;

    /**
     * Creates new form UserLoginScreen
     */
    public UserLoginScreen() {
        initComponents();

        //Initialize Lists
        if (Disaster.initializedList == false) {
            disasterList.initializeDisasterListContent();
            faqTipsList.initializeFaqTipsList(null);
            newlyReportedDisastersList.initializeDisasterListContent(null);
            Disaster.initializedList = true;
            potentialDisasterWarningList.initializeWarningListContent();

        }

        clickedColor = new Color(255, 51, 51);
        originalColor = new Color(0, 0, 0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allPanes = new javax.swing.JTabbedPane();
        welcomeScreen = new javax.swing.JPanel();
        welcomeScreeTitle = new javax.swing.JLabel();
        welcomeScreenImage = new javax.swing.JLabel();
        startNowButton = new javax.swing.JLabel();
        aboutUsScreen = new javax.swing.JPanel();
        aboutUsImage = new javax.swing.JLabel();
        aboutUsContent = new javax.swing.JLabel();
        nextPageButton = new javax.swing.JLabel();
        sdgButton = new javax.swing.JLabel();
        loginScreen = new javax.swing.JPanel();
        userName = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        userLocation = new javax.swing.JTextField();
        location = new javax.swing.JLabel();
        loginImage = new javax.swing.JLabel();
        loginbackButton = new javax.swing.JLabel();
        loginButton = new javax.swing.JLabel();
        adminButton = new javax.swing.JLabel();
        creditsButton = new javax.swing.JLabel();
        creditsScreen = new javax.swing.JPanel();
        creditsImage = new javax.swing.JLabel();
        meetTheTeam = new javax.swing.JLabel();
        creditsBackButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        donateButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeScreen.setBackground(new java.awt.Color(255, 255, 255));
        welcomeScreen.setForeground(new java.awt.Color(255, 255, 255));
        welcomeScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeScreeTitle.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        welcomeScreeTitle.setForeground(new java.awt.Color(255, 51, 51));
        welcomeScreeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeScreeTitle.setText("DISASTERIVA ");
        welcomeScreen.add(welcomeScreeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 350, 130));

        welcomeScreenImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/userLoginScreen/welcomeScreenBackground.png"))); // NOI18N
        welcomeScreen.add(welcomeScreenImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 250, 179));

        startNowButton.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        startNowButton.setForeground(new java.awt.Color(0, 0, 0));
        startNowButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startNowButton.setText("Start Now >");
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
        welcomeScreen.add(startNowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 240, -1));

        allPanes.addTab("tab1", welcomeScreen);

        aboutUsScreen.setBackground(new java.awt.Color(255, 255, 255));

        aboutUsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/userLoginScreen/aboutsUsBackground.png"))); // NOI18N

        aboutUsContent.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        aboutUsContent.setForeground(new java.awt.Color(255, 51, 51));
        aboutUsContent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutUsContent.setText("<html><p align - center><i>Be aware of occuring natural disasters and contribute to disaster relief funds.</i></p></html>");

        nextPageButton.setBackground(new java.awt.Color(255, 51, 51));
        nextPageButton.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        nextPageButton.setForeground(new java.awt.Color(0, 0, 0));
        nextPageButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextPageButton.setText("Next >");
        nextPageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextPageButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextPageButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextPageButtonMouseExited(evt);
            }
        });

        sdgButton.setFont(new java.awt.Font("Corbel", 3, 12)); // NOI18N
        sdgButton.setForeground(new java.awt.Color(51, 51, 51));
        sdgButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sdgButton.setText("Created based on SDG13. Click to find out more");
        sdgButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdgButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sdgButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sdgButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout aboutUsScreenLayout = new javax.swing.GroupLayout(aboutUsScreen);
        aboutUsScreen.setLayout(aboutUsScreenLayout);
        aboutUsScreenLayout.setHorizontalGroup(
            aboutUsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutUsScreenLayout.createSequentialGroup()
                .addGroup(aboutUsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutUsScreenLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(sdgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(aboutUsScreenLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(nextPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(aboutUsScreenLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(aboutUsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aboutUsContent, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aboutUsImage, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        aboutUsScreenLayout.setVerticalGroup(
            aboutUsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutUsScreenLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(aboutUsImage)
                .addGap(54, 54, 54)
                .addComponent(aboutUsContent, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(nextPageButton)
                .addGap(46, 46, 46)
                .addComponent(sdgButton)
                .addGap(21, 21, 21))
        );

        allPanes.addTab("tab2", aboutUsScreen);

        loginScreen.setBackground(new java.awt.Color(255, 255, 255));
        loginScreen.setForeground(new java.awt.Color(255, 255, 255));

        userName.setBackground(new java.awt.Color(255, 255, 255));
        userName.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(0, 0, 0));
        userName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Name ");

        userLocation.setBackground(new java.awt.Color(255, 255, 255));
        userLocation.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        userLocation.setForeground(new java.awt.Color(0, 0, 0));
        userLocation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        userLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLocationActionPerformed(evt);
            }
        });

        location.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        location.setForeground(new java.awt.Color(0, 0, 0));
        location.setText("Location ");

        loginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/userLoginScreen/loginBackground.png"))); // NOI18N

        loginbackButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        loginbackButton.setForeground(new java.awt.Color(0, 0, 0));
        loginbackButton.setText("< Back");
        loginbackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbackButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbackButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginbackButtonMouseExited(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        adminButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        adminButton.setForeground(new java.awt.Color(0, 0, 0));
        adminButton.setText("Admin >");
        adminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminButtonMouseExited(evt);
            }
        });

        creditsButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        creditsButton.setForeground(new java.awt.Color(0, 0, 0));
        creditsButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creditsButton.setText("Credits");
        creditsButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        creditsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creditsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creditsButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginScreenLayout = new javax.swing.GroupLayout(loginScreen);
        loginScreen.setLayout(loginScreenLayout);
        loginScreenLayout.setHorizontalGroup(
            loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginScreenLayout.createSequentialGroup()
                .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginScreenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminButton))
                    .addGroup(loginScreenLayout.createSequentialGroup()
                        .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginScreenLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name)
                                    .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(location)
                                        .addComponent(userLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                        .addComponent(userName))))
                            .addGroup(loginScreenLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(loginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginScreenLayout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginButton)
                                    .addComponent(creditsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginScreenLayout.setVerticalGroup(
            loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginScreenLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbackButton)
                    .addComponent(adminButton))
                .addGap(42, 42, 42)
                .addComponent(loginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(location)
                .addGap(18, 18, 18)
                .addComponent(userLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(loginButton)
                .addGap(49, 49, 49)
                .addComponent(creditsButton))
        );

        userName.getAccessibleContext().setAccessibleName(" UserName");

        allPanes.addTab("tab3", loginScreen);

        creditsScreen.setBackground(new java.awt.Color(255, 255, 255));
        creditsScreen.setForeground(new java.awt.Color(242, 243, 247));

        creditsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/userLoginScreen/creditsBackground.png"))); // NOI18N

        meetTheTeam.setBackground(new java.awt.Color(0, 0, 0));
        meetTheTeam.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        meetTheTeam.setForeground(new java.awt.Color(255, 51, 51));
        meetTheTeam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meetTheTeam.setText("Meet the team ");

        creditsBackButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        creditsBackButton.setForeground(new java.awt.Color(0, 0, 0));
        creditsBackButton.setText("< Back");
        creditsBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditsBackButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creditsBackButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creditsBackButtonMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><p align = center>Abdulla Safar </p><br><p align = center>Bonifacio Ronald</p><br><p align = center>Chong Min Wen</p><br><p align = center>Choo Ern Tuong</p><br><p align = center>Dylan Eu Jiun Kai</p></html>");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        donateButton.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        donateButton.setForeground(new java.awt.Color(0, 0, 0));
        donateButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        donateButton.setText("Buy us a coffee >");
        donateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                donateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                donateButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout creditsScreenLayout = new javax.swing.GroupLayout(creditsScreen);
        creditsScreen.setLayout(creditsScreenLayout);
        creditsScreenLayout.setHorizontalGroup(
            creditsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creditsScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(creditsBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditsScreenLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(creditsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(donateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meetTheTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditsImage, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        creditsScreenLayout.setVerticalGroup(
            creditsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditsScreenLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(creditsBackButton)
                .addGap(18, 18, 18)
                .addComponent(creditsImage, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(meetTheTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(donateButton)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        allPanes.addTab("tab4", creditsScreen);

        getContentPane().add(allPanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 350, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Press Enter key and open up the WelcomeScreen and close current window
    private void userLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLocationActionPerformed
        // TODO add your handling code here:
        String uName = userName.getText();
        userData.initUserData.name = uName;
        String uLocation = userLocation.getText();
        userData.initUserData.location = uLocation;

        UserHomeScreen home = new UserHomeScreen();
        setUserHomeScreenData();
        displayPotentialWarning();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_userLocationActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        userLocation.requestFocus();
    }//GEN-LAST:event_userNameActionPerformed

    private void nextPageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextPageButtonMouseClicked
        // TODO add your handling code here:
        allPanes.setSelectedIndex(2);
    }//GEN-LAST:event_nextPageButtonMouseClicked

    private void nextPageButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextPageButtonMouseEntered
        // TODO add your handling code here:
        nextPageButton.setForeground(clickedColor);
    }//GEN-LAST:event_nextPageButtonMouseEntered

    private void nextPageButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextPageButtonMouseExited
        // TODO add your handling code here:
        nextPageButton.setForeground(originalColor);
    }//GEN-LAST:event_nextPageButtonMouseExited

    private void loginbackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbackButtonMouseClicked
        // TODO add your handling code here:
        allPanes.setSelectedIndex(1);
    }//GEN-LAST:event_loginbackButtonMouseClicked

    private void loginbackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbackButtonMouseEntered
        // TODO add your handling code here:
        loginbackButton.setForeground(clickedColor);
    }//GEN-LAST:event_loginbackButtonMouseEntered

    private void loginbackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbackButtonMouseExited
        // TODO add your handling code here:
        loginbackButton.setForeground(originalColor);
    }//GEN-LAST:event_loginbackButtonMouseExited

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        // Input validation
        if (userName.getText().isBlank() || userLocation.getText().isBlank()) {

            JOptionPane.showMessageDialog(null, "Please fill in your name and location to login", "Error", 2);
            userName.setText("");
            userLocation.setText("");
        } else {

            String uName = userName.getText();
            userData.initUserData.name = uName;
            String uLocation = userLocation.getText();
            userData.initUserData.location = uLocation;

            UserHomeScreen home = new UserHomeScreen();
            displayPotentialWarning();
            setUserHomeScreenData();
            home.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        // TODO add your handling code here:
        loginButton.setForeground(clickedColor);
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        // TODO add your handling code here:
        loginButton.setForeground(originalColor);
    }//GEN-LAST:event_loginButtonMouseExited

    private void adminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminButtonMouseClicked
        // TODO add your handling code here:
        // 
        AdminLoginScreen admin = new AdminLoginScreen();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_adminButtonMouseClicked

    private void adminButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminButtonMouseEntered
        // TODO add your handling code here:
        adminButton.setForeground(clickedColor);
    }//GEN-LAST:event_adminButtonMouseEntered

    private void adminButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminButtonMouseExited
        // TODO add your handling code here:
        adminButton.setForeground(originalColor);
    }//GEN-LAST:event_adminButtonMouseExited

    private void creditsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsButtonMouseClicked
        // TODO add your handling code here:
        allPanes.setSelectedIndex(3);
    }//GEN-LAST:event_creditsButtonMouseClicked

    private void creditsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsButtonMouseEntered
        // TODO add your handling code here:
        creditsButton.setForeground(clickedColor);
    }//GEN-LAST:event_creditsButtonMouseEntered

    private void creditsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsButtonMouseExited
        // TODO add your handling code here
        creditsButton.setForeground(originalColor);
    }//GEN-LAST:event_creditsButtonMouseExited

    private void creditsBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsBackButtonMouseClicked
        // TODO add your handling code here:
        allPanes.setSelectedIndex(2);
    }//GEN-LAST:event_creditsBackButtonMouseClicked

    private void creditsBackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsBackButtonMouseEntered
        // TODO add your handling code here:
        creditsBackButton.setForeground(clickedColor);
    }//GEN-LAST:event_creditsBackButtonMouseEntered

    private void creditsBackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsBackButtonMouseExited
        // TODO add your handling code here:
        creditsBackButton.setForeground(originalColor);
    }//GEN-LAST:event_creditsBackButtonMouseExited

    private void donateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donateButtonMouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URL("https://www.buymeacoffee.com/eudylan").toURI());
        } catch (Exception e) {
        }

    }//GEN-LAST:event_donateButtonMouseClicked

    private void donateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donateButtonMouseEntered
        // TODO add your handling code here:
        donateButton.setForeground(clickedColor);
    }//GEN-LAST:event_donateButtonMouseEntered

    private void donateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donateButtonMouseExited
        // TODO add your handling code here:
        donateButton.setForeground(originalColor);
    }//GEN-LAST:event_donateButtonMouseExited

    private void startNowButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startNowButtonMouseEntered
        // TODO add your handling code here:
        startNowButton.setForeground(clickedColor);
    }//GEN-LAST:event_startNowButtonMouseEntered

    private void startNowButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startNowButtonMouseExited
        // TODO add your handling code here:
        startNowButton.setForeground(originalColor);
    }//GEN-LAST:event_startNowButtonMouseExited
    /*
    private void startNowButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jLabel2MouseClicked
    */

    private void startNowButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startNowButtonMouseClicked
        // TODO add your handling code here:
        allPanes.setSelectedIndex(1);

    }//GEN-LAST:event_startNowButtonMouseClicked

    private void sdgButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdgButtonMouseClicked
        // TODO add your handling code here:
        try {

            Desktop.getDesktop().browse(new URL("https://www.globalgoals.org/goals/13-climate-action/").toURI());
        } catch (Exception e) {
        }

    }//GEN-LAST:event_sdgButtonMouseClicked

    private void sdgButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdgButtonMouseEntered
        // TODO add your handling code here:
        sdgButton.setForeground(clickedColor);
    }//GEN-LAST:event_sdgButtonMouseEntered

    private void sdgButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdgButtonMouseExited
        // TODO add your handling code here:
        sdgButton.setForeground(originalColor);
    }//GEN-LAST:event_sdgButtonMouseExited

    public static void displayPotentialWarning() {
        String country = "";
        String location = "";
        String type = "";
        String severity = "";
        String likeliness = "";
        boolean foundMatchingData = false;

        System.out.println(userData.initUserData.location.toLowerCase());
        switch (userData.initUserData.location.toLowerCase()) {

            case ("thailand"): {
                System.out.println("t");
                country = potentialDisasterWarningList.warningList.get(0).country;
                location = potentialDisasterWarningList.warningList.get(0).city;
                type = potentialDisasterWarningList.warningList.get(0).disasterType;
                severity = potentialDisasterWarningList.warningList.get(0).severity;
                likeliness = potentialDisasterWarningList.warningList.get(0).likeliness;
                foundMatchingData = true;
                break;
            }
            case ("malaysia"): {
                System.out.println("m");
                country = potentialDisasterWarningList.warningList.get(1).country;
                location = potentialDisasterWarningList.warningList.get(1).city;
                type = potentialDisasterWarningList.warningList.get(1).disasterType;
                severity = potentialDisasterWarningList.warningList.get(1).severity;
                likeliness = potentialDisasterWarningList.warningList.get(1).likeliness;
                foundMatchingData = true;
                break;
            }
            case ("canada"): {
                System.out.println("c");
                country = potentialDisasterWarningList.warningList.get(2).country;
                location = potentialDisasterWarningList.warningList.get(2).city;
                type = potentialDisasterWarningList.warningList.get(2).disasterType;
                severity = potentialDisasterWarningList.warningList.get(2).severity;
                likeliness = potentialDisasterWarningList.warningList.get(2).likeliness;
                foundMatchingData = true;
                break;
            }
            case ("indonesia"): {
                System.out.println("i");
                country = potentialDisasterWarningList.warningList.get(3).country;
                location = potentialDisasterWarningList.warningList.get(3).city;
                type = potentialDisasterWarningList.warningList.get(3).disasterType;
                severity = potentialDisasterWarningList.warningList.get(3).severity;
                likeliness = potentialDisasterWarningList.warningList.get(3).likeliness;
                foundMatchingData = true;
                break;
            }
            case ("chad"): {
                System.out.println("ch");
                country = potentialDisasterWarningList.warningList.get(4).country;
                location = potentialDisasterWarningList.warningList.get(4).city;
                type = potentialDisasterWarningList.warningList.get(4).disasterType;
                severity = potentialDisasterWarningList.warningList.get(4).severity;
                likeliness = potentialDisasterWarningList.warningList.get(4).likeliness;
                foundMatchingData = true;
                break;
            }
            case ("united states"): {
                System.out.println("us");
                country = potentialDisasterWarningList.warningList.get(5).country;
                location = potentialDisasterWarningList.warningList.get(5).city;
                type = potentialDisasterWarningList.warningList.get(5).disasterType;
                severity = potentialDisasterWarningList.warningList.get(5).severity;
                likeliness = potentialDisasterWarningList.warningList.get(5).likeliness;
                foundMatchingData = true;
                break;
            }
        }

        if (foundMatchingData == true) {

            JOptionPane.showMessageDialog(null, "Hi, " + userData.initUserData.name + "!\nBased on recent occurences and our database readings, user in " + userData.initUserData.location
                    + " should be mindful and informed towards a potential disaster.\nDetails are as follows:\n\nCountry: " + country + "\nLocation: " + location + "\nDisaster Type: " + type
                    + "\nSeverity: " + severity + "\nLikeliness to Occur: " + likeliness + "\n\nWe recommend you to be prepared and browse our FAQs section to learn how!", "Early Warning System", 1);
        }
    }

    private static void fetchAndSetUserHomeScreenRecentDisaster() {

        UserHomeScreen.recentDisaster1Title.setText("<html><div style='text-align: center;'><p>" + disasterList.disasterInitList.get(0).type + "</p></div></html>");
        UserHomeScreen.recentDisaster2Title.setText("<html><div style='text-align: center;'><p>" + disasterList.disasterInitList.get(1).type + "</p></div></html>");
        UserHomeScreen.recentDisaster3Title.setText("<html><div style='text-align: center;'><p>" + disasterList.disasterInitList.get(2).type + "</p></div></html>");

        UserHomeScreen.recentDisaster1Image.setIcon(new javax.swing.ImageIcon(disasterList.class.getResource(disasterList.disasterInitList.get(0).imageUrl_potrait)));
        UserHomeScreen.recentDisaster2Image.setIcon(new javax.swing.ImageIcon(disasterList.class.getResource(disasterList.disasterInitList.get(1).imageUrl_potrait)));
        UserHomeScreen.recentDisaster3Image.setIcon(new javax.swing.ImageIcon(disasterList.class.getResource(disasterList.disasterInitList.get(2).imageUrl_potrait)));
    }

    private static void fetchAndSetUserHomeScreenUsersOverviewData() {

        //Total Reports
        int totalReportMade = userData.initUserData.numberOfReport;

        //Number of Donations
        int numberOfDonation = userData.initUserData.numberOfDonation;

        //Total Donation
        double totalDonationDouble = userData.initUserData.totalDonationAmount;
        String totalDonationString;

        if (totalDonationDouble >= 1000.00) {

            totalDonationDouble = totalDonationDouble / 1000.00;
            totalDonationString = String.valueOf(totalDonationDouble + "K");
        } else {
            totalDonationString = String.valueOf(totalDonationDouble);
        }

        UserHomeScreen.usersOverview.setText("<html><p>Do you know? You have submitted <font color=\"#FF3333\"><b>" + totalReportMade + "</b></font> disaster reports and have contributed <font color=\"#FF3333\"><b>RM" + totalDonationString + "</b></font> over <font color=\"#FF3333\"><b>" + numberOfDonation + "</b></font> donations. <b>We thank you!</b></p></html>");
    }

    public static void setUserHomeScreenData() {
        UserHomeScreen.userHomeScreenUserName.setText("  " + userData.initUserData.name + " !");
        fetchAndSetUserHomeScreenRecentDisaster();
        fetchAndSetUserHomeScreenUsersOverviewData();
        ;
    }

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
            java.util.logging.Logger.getLogger(UserLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserLoginScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutUsContent;
    private javax.swing.JLabel aboutUsImage;
    private javax.swing.JPanel aboutUsScreen;
    private javax.swing.JLabel adminButton;
    public static javax.swing.JTabbedPane allPanes;
    private javax.swing.JLabel creditsBackButton;
    private javax.swing.JLabel creditsButton;
    private javax.swing.JLabel creditsImage;
    private javax.swing.JPanel creditsScreen;
    private javax.swing.JLabel donateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel location;
    private javax.swing.JLabel loginButton;
    private javax.swing.JLabel loginImage;
    private javax.swing.JPanel loginScreen;
    private javax.swing.JLabel loginbackButton;
    private javax.swing.JLabel meetTheTeam;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nextPageButton;
    private javax.swing.JLabel sdgButton;
    private javax.swing.JLabel startNowButton;
    private javax.swing.JTextField userLocation;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel welcomeScreeTitle;
    private javax.swing.JPanel welcomeScreen;
    private javax.swing.JLabel welcomeScreenImage;
    // End of variables declaration//GEN-END:variables
}
