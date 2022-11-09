package screens;

import data.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import models.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author eudyl
 */
public class AdminScreen extends javax.swing.JFrame {

    //Setting up for disasterPanel
    disasterList dataDisasterList = new disasterList();
    String disasterHeader[] = new String[]{"Type", "Date", "Location", "Description", "Image Url", "Collected", "Goal"};
    DefaultTableModel disasterDtm;
    int disasterRow;
    int disasterClick = 0;

    //Setting up for faqPanel
    faqTipsList dataFaqList = new faqTipsList();
    String faqHeader[] = new String[]{"Question", "Answer"};
    DefaultTableModel faqDtm;
    int faqRow;
    int faqClick = 0;

    //Setting up for verifyPanel
    newlyReportedDisastersList dataUserDisasterList = new newlyReportedDisastersList();
    String userHeader[] = new String[]{"User Name", "Type", "Location", "Date", "Description"};
    DefaultTableModel userDtm;
    int userRow;
    int userClick = 0;

    //Setting up for donationDetailsPanel
    userData dataUserData = new userData();
    DisasterDetailScreen donationVerification = new DisasterDetailScreen();
    String donationHeader[] = new String[]{"Donater Name", "Donater Location", "Donation Amount"};
    public DefaultTableModel donationDtm;

    //Setting up button clour
    Color clickedColor;
    Color originalColor;
    Color blackColor;

    /**
     * Creates new form AdminPage
     */
    public AdminScreen() {
        initComponents();

        //Decide if Donation Details Table should be displayed
        if (DisasterDetailScreen.userDonated == false) {
            dashboardScrollPane.setVisible(false);
            dashboardTable.setVisible(false);
        } else if (DisasterDetailScreen.userDonated == true) {
            dashboardScrollPane.setVisible(true);
            dashboardTable.setVisible(true);
            noDonationText.setVisible(false);
            noDonationImage.setVisible(false);

            donationDtm = new DefaultTableModel(donationHeader, 0);
            dashboardTable.setModel(donationDtm);
            this.setLocationRelativeTo(null);
            setDonationTable();

        }

        clickedColor = new Color(255, 51, 51);
        originalColor = new Color(255, 255, 255);
        blackColor = new Color(0, 0, 0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonSelectionPanel = new javax.swing.JPanel();
        dashboardButton = new javax.swing.JLabel();
        disastersButton = new javax.swing.JLabel();
        userReportsButton = new javax.swing.JLabel();
        faqsButton = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        allPanes = new javax.swing.JTabbedPane();
        dashboard = new javax.swing.JPanel();
        dashboardTitle = new java.awt.Label();
        welcomeMessage = new javax.swing.JLabel();
        totalDisastersPanel = new javax.swing.JPanel();
        totalDisastersBlock = new javax.swing.JPanel();
        totalDisasters = new javax.swing.JLabel();
        totalReportedDisasters = new javax.swing.JLabel();
        totalDisastersSpinner = new javax.swing.JLabel();
        totalDonationsPanel = new javax.swing.JPanel();
        totalDonationsBlock = new javax.swing.JPanel();
        totalDonations = new javax.swing.JLabel();
        totalDonationAmount = new javax.swing.JLabel();
        totalDonationsSpinner = new javax.swing.JLabel();
        totalReportsReceivedPanel = new javax.swing.JPanel();
        totalReportsReceivedBlock = new javax.swing.JPanel();
        totalReportsReceived = new javax.swing.JLabel();
        totalUserReportsReceived = new javax.swing.JLabel();
        totalReportsSpinner = new javax.swing.JLabel();
        donationDetailsPanel = new javax.swing.JPanel();
        donationDetailsBlock = new javax.swing.JPanel();
        donationDetails = new javax.swing.JLabel();
        refreshButton = new javax.swing.JLabel();
        noDonationText = new javax.swing.JLabel();
        noDonationImage = new javax.swing.JLabel();
        dashboardScrollPane = new javax.swing.JScrollPane();
        dashboardTable = new javax.swing.JTable();
        disasters = new javax.swing.JPanel();
        disastersTitle = new java.awt.Label();
        disasterDetailsPanel = new javax.swing.JPanel();
        disasterTypeBlock = new javax.swing.JPanel();
        disasterType = new javax.swing.JLabel();
        disasterTypeText = new javax.swing.JTextField();
        disasterDateBlock = new javax.swing.JPanel();
        disasterDate = new javax.swing.JLabel();
        disasterDateText = new javax.swing.JTextField();
        disasterLocationBlock = new javax.swing.JPanel();
        disasterLocation = new javax.swing.JLabel();
        disasterLocationText = new javax.swing.JTextField();
        disasterDescriptionBlock = new javax.swing.JPanel();
        disasterDescription = new javax.swing.JLabel();
        disasterDescriptionScrollPane = new javax.swing.JScrollPane();
        disasterDescriptionText = new javax.swing.JTextArea();
        disasterImageBlock = new javax.swing.JPanel();
        disasterImage = new javax.swing.JLabel();
        disasterImageText = new javax.swing.JTextField();
        disasterDonationCollectionBlock = new javax.swing.JPanel();
        disasterDonationCollection = new javax.swing.JLabel();
        disasterDonationCollectionText = new javax.swing.JTextField();
        disasterDonationGoalBlock = new javax.swing.JPanel();
        disasterDonationGoal = new javax.swing.JLabel();
        disasterDonationGoalText = new javax.swing.JTextField();
        disasterButtonSelectionPanel = new javax.swing.JPanel();
        disasterAddButton = new javax.swing.JButton();
        disasterDeleteButton = new javax.swing.JButton();
        disasterEditButton = new javax.swing.JButton();
        disasterSearchButton = new javax.swing.JButton();
        disasterClearFieldButton = new javax.swing.JButton();
        currentDisasterPanel = new javax.swing.JPanel();
        allCurrentDisastersScrollPane = new javax.swing.JScrollPane();
        allCurrentDisastersTable = new javax.swing.JTable();
        currentDisastersTitle = new javax.swing.JLabel();
        user = new javax.swing.JPanel();
        userTitle = new java.awt.Label();
        userSubmittedReportsPanel = new javax.swing.JPanel();
        userSubmittedReportsPanelTitle = new javax.swing.JLabel();
        userSubmittedReportsScrollPane = new javax.swing.JScrollPane();
        allUserSubmittedReportsTable = new javax.swing.JTable();
        userAddtoDisastersButton = new javax.swing.JButton();
        userDeleteSubmittedReportButton = new javax.swing.JButton();
        faqs = new javax.swing.JPanel();
        faqTitle = new java.awt.Label();
        faqDetailsPanel = new javax.swing.JPanel();
        faqQuestion = new javax.swing.JLabel();
        faqQuestionScrollPane = new javax.swing.JScrollPane();
        faqQuestionText = new javax.swing.JTextArea();
        faqAnswer = new javax.swing.JLabel();
        faqAnswerScrollPane = new javax.swing.JScrollPane();
        faqAnswerText = new javax.swing.JTextArea();
        faqButtonSelectionPanel = new javax.swing.JPanel();
        faqAddButton = new javax.swing.JButton();
        faqDeleteButton = new javax.swing.JButton();
        faqEditButton = new javax.swing.JButton();
        faqClearFieldButton = new javax.swing.JButton();
        currentFaqPanel = new javax.swing.JPanel();
        allCurrentFaqScrollPane = new javax.swing.JScrollPane();
        allCurrentFaqTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonSelectionPanel.setBackground(new java.awt.Color(0, 0, 0));

        dashboardButton.setBackground(new java.awt.Color(255, 153, 102));
        dashboardButton.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(255, 255, 255));
        dashboardButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardButton.setText("Dashboard");
        dashboardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dashboardButtonMousePressed(evt);
            }
        });

        disastersButton.setBackground(new java.awt.Color(0, 0, 0));
        disastersButton.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        disastersButton.setForeground(new java.awt.Color(255, 255, 255));
        disastersButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disastersButton.setText("Disasters");
        disastersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disastersButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                disastersButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                disastersButtonMouseExited(evt);
            }
        });

        userReportsButton.setBackground(new java.awt.Color(0, 0, 0));
        userReportsButton.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        userReportsButton.setForeground(new java.awt.Color(255, 255, 255));
        userReportsButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userReportsButton.setText("Reports");
        userReportsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userReportsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userReportsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userReportsButtonMouseExited(evt);
            }
        });

        faqsButton.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        faqsButton.setForeground(new java.awt.Color(255, 255, 255));
        faqsButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        faqsButton.setText("FAQs");
        faqsButton.setToolTipText("");
        faqsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faqsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                faqsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                faqsButtonMouseExited(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("< Log Out");
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

        javax.swing.GroupLayout buttonSelectionPanelLayout = new javax.swing.GroupLayout(buttonSelectionPanel);
        buttonSelectionPanel.setLayout(buttonSelectionPanelLayout);
        buttonSelectionPanelLayout.setHorizontalGroup(
            buttonSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userReportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(buttonSelectionPanelLayout.createSequentialGroup()
                .addGroup(buttonSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faqsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(buttonSelectionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(disastersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(dashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(buttonSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonSelectionPanelLayout.setVerticalGroup(
            buttonSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonSelectionPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(dashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(disastersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(userReportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(faqsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(204, 204, 204)
                .addComponent(backButton)
                .addGap(26, 26, 26))
        );

        getContentPane().add(buttonSelectionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 90, 560));

        dashboard.setBackground(new java.awt.Color(242, 243, 247));
        dashboard.setForeground(new java.awt.Color(0, 0, 0));
        dashboard.setPreferredSize(new java.awt.Dimension(750, 550));

        dashboardTitle.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        dashboardTitle.setText("Dashboard Overview");

        welcomeMessage.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        welcomeMessage.setForeground(new java.awt.Color(0, 0, 0));
        welcomeMessage.setText("Welcome, Admin!");

        totalDisastersPanel.setBackground(new java.awt.Color(255, 255, 255));
        totalDisastersPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalDisastersBlock.setBackground(new java.awt.Color(0, 0, 0));
        totalDisastersBlock.setPreferredSize(new java.awt.Dimension(10, 25));

        javax.swing.GroupLayout totalDisastersBlockLayout = new javax.swing.GroupLayout(totalDisastersBlock);
        totalDisastersBlock.setLayout(totalDisastersBlockLayout);
        totalDisastersBlockLayout.setHorizontalGroup(
            totalDisastersBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        totalDisastersBlockLayout.setVerticalGroup(
            totalDisastersBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        totalDisastersPanel.add(totalDisastersBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        totalDisasters.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        totalDisasters.setForeground(new java.awt.Color(0, 0, 0));
        totalDisasters.setText("Total Disasters");
        totalDisastersPanel.add(totalDisasters, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 125, 25));

        totalReportedDisasters.setFont(new java.awt.Font("Corbel", 1, 48)); // NOI18N
        totalReportedDisasters.setForeground(new java.awt.Color(255, 51, 51));
        totalReportedDisasters.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalReportedDisasters.setText("totalReportedDisasters");
        totalDisastersPanel.add(totalReportedDisasters, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 145, 130));

        totalDisastersSpinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/adminScreen/adminScreenDashboardElement1.png"))); // NOI18N
        totalDisastersPanel.add(totalDisastersSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 150));

        totalDonationsPanel.setBackground(new java.awt.Color(255, 255, 255));
        totalDonationsPanel.setForeground(new java.awt.Color(0, 0, 0));
        totalDonationsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalDonationsBlock.setBackground(new java.awt.Color(0, 0, 0));
        totalDonationsBlock.setPreferredSize(new java.awt.Dimension(10, 25));

        javax.swing.GroupLayout totalDonationsBlockLayout = new javax.swing.GroupLayout(totalDonationsBlock);
        totalDonationsBlock.setLayout(totalDonationsBlockLayout);
        totalDonationsBlockLayout.setHorizontalGroup(
            totalDonationsBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        totalDonationsBlockLayout.setVerticalGroup(
            totalDonationsBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        totalDonationsPanel.add(totalDonationsBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        totalDonations.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        totalDonations.setForeground(new java.awt.Color(0, 0, 0));
        totalDonations.setText("Total Donations");
        totalDonationsPanel.add(totalDonations, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 125, 25));

        totalDonationAmount.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        totalDonationAmount.setForeground(new java.awt.Color(255, 51, 51));
        totalDonationAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalDonationAmount.setText("totalDonationAmount");
        totalDonationsPanel.add(totalDonationAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 120));

        totalDonationsSpinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/adminScreen/adminScreenDashboardElement1.png"))); // NOI18N
        totalDonationsPanel.add(totalDonationsSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 140));

        totalReportsReceivedPanel.setBackground(new java.awt.Color(255, 255, 255));
        totalReportsReceivedPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalReportsReceivedBlock.setBackground(new java.awt.Color(0, 0, 0));
        totalReportsReceivedBlock.setPreferredSize(new java.awt.Dimension(10, 25));

        javax.swing.GroupLayout totalReportsReceivedBlockLayout = new javax.swing.GroupLayout(totalReportsReceivedBlock);
        totalReportsReceivedBlock.setLayout(totalReportsReceivedBlockLayout);
        totalReportsReceivedBlockLayout.setHorizontalGroup(
            totalReportsReceivedBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        totalReportsReceivedBlockLayout.setVerticalGroup(
            totalReportsReceivedBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        totalReportsReceivedPanel.add(totalReportsReceivedBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        totalReportsReceived.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        totalReportsReceived.setForeground(new java.awt.Color(0, 0, 0));
        totalReportsReceived.setText("Total Reports Received");
        totalReportsReceivedPanel.add(totalReportsReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 25));

        totalUserReportsReceived.setFont(new java.awt.Font("Corbel", 1, 48)); // NOI18N
        totalUserReportsReceived.setForeground(new java.awt.Color(255, 51, 51));
        totalUserReportsReceived.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalUserReportsReceived.setText("totalUserReportsReceived");
        totalReportsReceivedPanel.add(totalUserReportsReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 120));

        totalReportsSpinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/adminScreen/adminScreenDashboardElement1.png"))); // NOI18N
        totalReportsReceivedPanel.add(totalReportsSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 140));

        donationDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        donationDetailsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        donationDetailsBlock.setBackground(new java.awt.Color(0, 0, 0));
        donationDetailsBlock.setForeground(new java.awt.Color(255, 51, 51));
        donationDetailsBlock.setPreferredSize(new java.awt.Dimension(10, 25));

        javax.swing.GroupLayout donationDetailsBlockLayout = new javax.swing.GroupLayout(donationDetailsBlock);
        donationDetailsBlock.setLayout(donationDetailsBlockLayout);
        donationDetailsBlockLayout.setHorizontalGroup(
            donationDetailsBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        donationDetailsBlockLayout.setVerticalGroup(
            donationDetailsBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        donationDetailsPanel.add(donationDetailsBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        donationDetails.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        donationDetails.setForeground(new java.awt.Color(0, 0, 0));
        donationDetails.setText("Donation Details");
        donationDetails.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        donationDetailsPanel.add(donationDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 168, -1));

        refreshButton.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(0, 0, 0));
        refreshButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refreshButton.setText("Refresh ↺ ");
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshButtonMouseExited(evt);
            }
        });
        donationDetailsPanel.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 70, 20));

        noDonationText.setFont(new java.awt.Font("Corbel", 3, 34)); // NOI18N
        noDonationText.setForeground(new java.awt.Color(0, 0, 0));
        noDonationText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noDonationText.setText("No donations have been made");
        donationDetailsPanel.add(noDonationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 610, 30));

        noDonationImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/screens/adminScreen/adminScreenDonationDetailsBackground.png"))); // NOI18N
        donationDetailsPanel.add(noDonationImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 205, 150));

        dashboardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Donater Name", "Donater Location", "Donation Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dashboardScrollPane.setViewportView(dashboardTable);

        donationDetailsPanel.add(dashboardScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 610, 210));

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(donationDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dashboardLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(totalDisastersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(totalDonationsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(totalReportsReceivedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(dashboardLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dashboardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(welcomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(dashboardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(welcomeMessage)
                .addGap(50, 50, 50)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(totalDonationsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalReportsReceivedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalDisastersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(donationDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        allPanes.addTab("tab1", dashboard);

        disasters.setBackground(new java.awt.Color(242, 243, 247));
        disasters.setForeground(new java.awt.Color(0, 0, 0));

        disastersTitle.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        disastersTitle.setText("Add, Edit or Delete Disasters");

        disasterDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        disasterTypeBlock.setBackground(new java.awt.Color(0, 0, 0));
        disasterTypeBlock.setPreferredSize(new java.awt.Dimension(10, 25));

        javax.swing.GroupLayout disasterTypeBlockLayout = new javax.swing.GroupLayout(disasterTypeBlock);
        disasterTypeBlock.setLayout(disasterTypeBlockLayout);
        disasterTypeBlockLayout.setHorizontalGroup(
            disasterTypeBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        disasterTypeBlockLayout.setVerticalGroup(
            disasterTypeBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        disasterType.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        disasterType.setForeground(new java.awt.Color(0, 0, 0));
        disasterType.setText("Disaster Type ");

        disasterTypeText.setBackground(new java.awt.Color(242, 243, 247));

        disasterDateBlock.setBackground(new java.awt.Color(0, 0, 0));
        disasterDateBlock.setPreferredSize(new java.awt.Dimension(10, 25));

        javax.swing.GroupLayout disasterDateBlockLayout = new javax.swing.GroupLayout(disasterDateBlock);
        disasterDateBlock.setLayout(disasterDateBlockLayout);
        disasterDateBlockLayout.setHorizontalGroup(
            disasterDateBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        disasterDateBlockLayout.setVerticalGroup(
            disasterDateBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        disasterDate.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        disasterDate.setForeground(new java.awt.Color(0, 0, 0));
        disasterDate.setText("Disaster Date ");

        disasterDateText.setBackground(new java.awt.Color(242, 243, 247));

        disasterLocationBlock.setBackground(new java.awt.Color(0, 0, 0));
        disasterLocationBlock.setPreferredSize(new java.awt.Dimension(10, 25));

        javax.swing.GroupLayout disasterLocationBlockLayout = new javax.swing.GroupLayout(disasterLocationBlock);
        disasterLocationBlock.setLayout(disasterLocationBlockLayout);
        disasterLocationBlockLayout.setHorizontalGroup(
            disasterLocationBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        disasterLocationBlockLayout.setVerticalGroup(
            disasterLocationBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        disasterLocation.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        disasterLocation.setForeground(new java.awt.Color(0, 0, 0));
        disasterLocation.setText("Disaster Location");

        disasterLocationText.setBackground(new java.awt.Color(242, 243, 247));

        disasterDescriptionBlock.setBackground(new java.awt.Color(0, 0, 0));
        disasterDescriptionBlock.setPreferredSize(new java.awt.Dimension(10, 25));

        javax.swing.GroupLayout disasterDescriptionBlockLayout = new javax.swing.GroupLayout(disasterDescriptionBlock);
        disasterDescriptionBlock.setLayout(disasterDescriptionBlockLayout);
        disasterDescriptionBlockLayout.setHorizontalGroup(
            disasterDescriptionBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        disasterDescriptionBlockLayout.setVerticalGroup(
            disasterDescriptionBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        disasterDescription.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        disasterDescription.setForeground(new java.awt.Color(0, 0, 0));
        disasterDescription.setText("Disaster Description");

        disasterDescriptionText.setBackground(new java.awt.Color(242, 243, 247));
        disasterDescriptionText.setColumns(20);
        disasterDescriptionText.setRows(5);
        disasterDescriptionText.setBorder(null);
        disasterDescriptionScrollPane.setViewportView(disasterDescriptionText);

        disasterImageBlock.setBackground(new java.awt.Color(0, 0, 0));
        disasterImageBlock.setPreferredSize(new java.awt.Dimension(10, 25));

        javax.swing.GroupLayout disasterImageBlockLayout = new javax.swing.GroupLayout(disasterImageBlock);
        disasterImageBlock.setLayout(disasterImageBlockLayout);
        disasterImageBlockLayout.setHorizontalGroup(
            disasterImageBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        disasterImageBlockLayout.setVerticalGroup(
            disasterImageBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        disasterImage.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        disasterImage.setForeground(new java.awt.Color(0, 0, 0));
        disasterImage.setText("Disaster Image");

        disasterImageText.setBackground(new java.awt.Color(242, 243, 247));

        disasterDonationCollectionBlock.setBackground(new java.awt.Color(0, 0, 0));
        disasterDonationCollectionBlock.setPreferredSize(new java.awt.Dimension(10, 25));

        javax.swing.GroupLayout disasterDonationCollectionBlockLayout = new javax.swing.GroupLayout(disasterDonationCollectionBlock);
        disasterDonationCollectionBlock.setLayout(disasterDonationCollectionBlockLayout);
        disasterDonationCollectionBlockLayout.setHorizontalGroup(
            disasterDonationCollectionBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        disasterDonationCollectionBlockLayout.setVerticalGroup(
            disasterDonationCollectionBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        disasterDonationCollection.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        disasterDonationCollection.setForeground(new java.awt.Color(0, 0, 0));
        disasterDonationCollection.setText("Donation Collection");

        disasterDonationCollectionText.setBackground(new java.awt.Color(242, 243, 247));
        disasterDonationCollectionText.setForeground(new java.awt.Color(70, 73, 75));

        disasterDonationGoalBlock.setBackground(new java.awt.Color(0, 0, 0));
        disasterDonationGoalBlock.setPreferredSize(new java.awt.Dimension(10, 25));

        javax.swing.GroupLayout disasterDonationGoalBlockLayout = new javax.swing.GroupLayout(disasterDonationGoalBlock);
        disasterDonationGoalBlock.setLayout(disasterDonationGoalBlockLayout);
        disasterDonationGoalBlockLayout.setHorizontalGroup(
            disasterDonationGoalBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        disasterDonationGoalBlockLayout.setVerticalGroup(
            disasterDonationGoalBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        disasterDonationGoal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        disasterDonationGoal.setForeground(new java.awt.Color(0, 0, 0));
        disasterDonationGoal.setText("Donation Goal");

        disasterDonationGoalText.setBackground(new java.awt.Color(242, 243, 247));

        javax.swing.GroupLayout disasterDetailsPanelLayout = new javax.swing.GroupLayout(disasterDetailsPanel);
        disasterDetailsPanel.setLayout(disasterDetailsPanelLayout);
        disasterDetailsPanelLayout.setHorizontalGroup(
            disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disasterDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(disasterDetailsPanelLayout.createSequentialGroup()
                        .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(disasterDetailsPanelLayout.createSequentialGroup()
                                .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(disasterImageBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(disasterDonationGoalBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(disasterDonationCollectionBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(disasterImage)
                                    .addComponent(disasterDonationGoal)
                                    .addComponent(disasterDonationCollection)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, disasterDetailsPanelLayout.createSequentialGroup()
                                .addComponent(disasterDescriptionBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(disasterDescription)))
                        .addGap(18, 18, 18)
                        .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disasterDonationCollectionText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(disasterImageText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(disasterDescriptionScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addComponent(disasterDonationGoalText, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(disasterDetailsPanelLayout.createSequentialGroup()
                        .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(disasterDetailsPanelLayout.createSequentialGroup()
                                .addComponent(disasterLocationBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(disasterLocation)
                                    .addComponent(disasterDate)))
                            .addGroup(disasterDetailsPanelLayout.createSequentialGroup()
                                .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(disasterDateBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(disasterTypeBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(disasterType)))
                        .addGap(36, 36, 36)
                        .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disasterDateText)
                            .addComponent(disasterTypeText)
                            .addComponent(disasterLocationText))))
                .addContainerGap())
        );
        disasterDetailsPanelLayout.setVerticalGroup(
            disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disasterDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disasterTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disasterTypeBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disasterType, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, disasterDetailsPanelLayout.createSequentialGroup()
                        .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(disasterDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(disasterDate))
                            .addComponent(disasterDateBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disasterLocationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disasterLocationBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disasterLocation, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(disasterDescription)
                                .addComponent(disasterDescriptionBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(disasterDescriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(disasterImageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(disasterImage, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(disasterImageBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(disasterDonationCollectionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(disasterDonationCollection))
                            .addComponent(disasterDonationCollectionBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(disasterDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disasterDonationGoalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disasterDonationGoalBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(disasterDonationGoal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        disasterButtonSelectionPanel.setBackground(new java.awt.Color(255, 255, 255));
        disasterButtonSelectionPanel.setPreferredSize(new java.awt.Dimension(0, 30));

        disasterAddButton.setBackground(new java.awt.Color(242, 243, 247));
        disasterAddButton.setText("ADD");
        disasterAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disasterAddButtonActionPerformed(evt);
            }
        });

        disasterDeleteButton.setBackground(new java.awt.Color(242, 243, 247));
        disasterDeleteButton.setText("DELETE");
        disasterDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disasterDeleteButtonActionPerformed(evt);
            }
        });

        disasterEditButton.setBackground(new java.awt.Color(242, 243, 247));
        disasterEditButton.setText("UPDATE");
        disasterEditButton.setPreferredSize(new java.awt.Dimension(100, 22));
        disasterEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disasterEditButtonActionPerformed(evt);
            }
        });

        disasterSearchButton.setBackground(new java.awt.Color(242, 243, 247));
        disasterSearchButton.setText("SEARCH");
        disasterSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disasterSearchButtonActionPerformed(evt);
            }
        });

        disasterClearFieldButton.setBackground(new java.awt.Color(242, 243, 247));
        disasterClearFieldButton.setText("CLEAR");
        disasterClearFieldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disasterClearFieldButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout disasterButtonSelectionPanelLayout = new javax.swing.GroupLayout(disasterButtonSelectionPanel);
        disasterButtonSelectionPanel.setLayout(disasterButtonSelectionPanelLayout);
        disasterButtonSelectionPanelLayout.setHorizontalGroup(
            disasterButtonSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disasterButtonSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(disasterAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disasterDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disasterEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disasterClearFieldButton, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disasterSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        disasterButtonSelectionPanelLayout.setVerticalGroup(
            disasterButtonSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, disasterButtonSelectionPanelLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(disasterButtonSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disasterAddButton)
                    .addComponent(disasterDeleteButton)
                    .addComponent(disasterEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disasterSearchButton)
                    .addComponent(disasterClearFieldButton))
                .addContainerGap())
        );

        currentDisasterPanel.setBackground(new java.awt.Color(255, 255, 255));
        currentDisasterPanel.setForeground(new java.awt.Color(255, 255, 255));

        allCurrentDisastersTable.setAutoCreateRowSorter(true);
        allCurrentDisastersTable.setBackground(new java.awt.Color(242, 243, 247));
        allCurrentDisastersTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        allCurrentDisastersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        allCurrentDisastersTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        allCurrentDisastersTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        allCurrentDisastersTable.getTableHeader().setReorderingAllowed(false);
        allCurrentDisastersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allCurrentDisastersTableMouseClicked(evt);
            }
        });
        allCurrentDisastersScrollPane.setViewportView(allCurrentDisastersTable);

        currentDisastersTitle.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        currentDisastersTitle.setForeground(new java.awt.Color(0, 0, 0));
        currentDisastersTitle.setText("Current Disasters");

        javax.swing.GroupLayout currentDisasterPanelLayout = new javax.swing.GroupLayout(currentDisasterPanel);
        currentDisasterPanel.setLayout(currentDisasterPanelLayout);
        currentDisasterPanelLayout.setHorizontalGroup(
            currentDisasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentDisasterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentDisasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allCurrentDisastersScrollPane)
                    .addGroup(currentDisasterPanelLayout.createSequentialGroup()
                        .addComponent(currentDisastersTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        currentDisasterPanelLayout.setVerticalGroup(
            currentDisasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentDisasterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentDisastersTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allCurrentDisastersScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout disastersLayout = new javax.swing.GroupLayout(disasters);
        disasters.setLayout(disastersLayout);
        disastersLayout.setHorizontalGroup(
            disastersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, disastersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(disastersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(currentDisasterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(disasterButtonSelectionPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                    .addComponent(disasterDetailsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, disastersLayout.createSequentialGroup()
                        .addComponent(disastersTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        disastersLayout.setVerticalGroup(
            disastersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disastersLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(disastersTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disasterDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disasterButtonSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentDisasterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        allPanes.addTab("tab2", disasters);

        user.setBackground(new java.awt.Color(242, 243, 247));

        userTitle.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        userTitle.setText("Verify Disasters Reported by User");

        userSubmittedReportsPanel.setBackground(new java.awt.Color(255, 255, 255));

        userSubmittedReportsPanelTitle.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        userSubmittedReportsPanelTitle.setForeground(new java.awt.Color(0, 0, 0));
        userSubmittedReportsPanelTitle.setText("User Submitted Disasters");

        allUserSubmittedReportsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        allUserSubmittedReportsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allUserSubmittedReportsTableMouseClicked(evt);
            }
        });
        userSubmittedReportsScrollPane.setViewportView(allUserSubmittedReportsTable);

        userAddtoDisastersButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        userAddtoDisastersButton.setForeground(new java.awt.Color(0, 0, 0));
        userAddtoDisastersButton.setText("Add to Disasters");
        userAddtoDisastersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAddtoDisastersButtonActionPerformed(evt);
            }
        });

        userDeleteSubmittedReportButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        userDeleteSubmittedReportButton.setForeground(new java.awt.Color(0, 0, 0));
        userDeleteSubmittedReportButton.setText("Delete Submission");
        userDeleteSubmittedReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDeleteSubmittedReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userSubmittedReportsPanelLayout = new javax.swing.GroupLayout(userSubmittedReportsPanel);
        userSubmittedReportsPanel.setLayout(userSubmittedReportsPanelLayout);
        userSubmittedReportsPanelLayout.setHorizontalGroup(
            userSubmittedReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userSubmittedReportsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userSubmittedReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userSubmittedReportsPanelLayout.createSequentialGroup()
                        .addComponent(userSubmittedReportsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(userSubmittedReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userDeleteSubmittedReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userAddtoDisastersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(userSubmittedReportsPanelLayout.createSequentialGroup()
                        .addComponent(userSubmittedReportsPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        userSubmittedReportsPanelLayout.setVerticalGroup(
            userSubmittedReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userSubmittedReportsPanelLayout.createSequentialGroup()
                .addComponent(userSubmittedReportsPanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userSubmittedReportsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(userSubmittedReportsPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(userAddtoDisastersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userDeleteSubmittedReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userSubmittedReportsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(userLayout.createSequentialGroup()
                        .addComponent(userTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        userLayout.setVerticalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(userTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userSubmittedReportsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        allPanes.addTab("tab4", user);

        faqs.setBackground(new java.awt.Color(242, 243, 247));

        faqTitle.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        faqTitle.setText("Add, Delete or Edit Current FAQs");

        faqDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        faqQuestion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        faqQuestion.setForeground(new java.awt.Color(0, 0, 0));
        faqQuestion.setText("FAQ Question");

        faqQuestionScrollPane.setToolTipText("");

        faqQuestionText.setColumns(20);
        faqQuestionText.setRows(5);
        faqQuestionText.setWrapStyleWord(true);
        faqQuestionText.setBorder(null);
        faqQuestionScrollPane.setViewportView(faqQuestionText);

        faqAnswer.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        faqAnswer.setForeground(new java.awt.Color(0, 0, 0));
        faqAnswer.setText("FAQ Answer");

        faqAnswerText.setColumns(20);
        faqAnswerText.setRows(5);
        faqAnswerText.setBorder(null);
        faqAnswerScrollPane.setViewportView(faqAnswerText);

        javax.swing.GroupLayout faqDetailsPanelLayout = new javax.swing.GroupLayout(faqDetailsPanel);
        faqDetailsPanel.setLayout(faqDetailsPanelLayout);
        faqDetailsPanelLayout.setHorizontalGroup(
            faqDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faqDetailsPanelLayout.createSequentialGroup()
                .addGroup(faqDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faqDetailsPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(faqQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(faqDetailsPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(faqAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(faqDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faqAnswerScrollPane)
                    .addComponent(faqQuestionScrollPane))
                .addContainerGap())
        );
        faqDetailsPanelLayout.setVerticalGroup(
            faqDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faqDetailsPanelLayout.createSequentialGroup()
                .addGroup(faqDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faqDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(faqQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(faqQuestionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faqDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faqAnswerScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faqAnswer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        faqButtonSelectionPanel.setBackground(new java.awt.Color(255, 255, 255));
        faqButtonSelectionPanel.setPreferredSize(new java.awt.Dimension(0, 30));

        faqAddButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        faqAddButton.setForeground(new java.awt.Color(0, 0, 0));
        faqAddButton.setText("ADD");
        faqAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqAddButtonActionPerformed(evt);
            }
        });

        faqDeleteButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        faqDeleteButton.setForeground(new java.awt.Color(0, 0, 0));
        faqDeleteButton.setText("DELETE");
        faqDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqDeleteButtonActionPerformed(evt);
            }
        });

        faqEditButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        faqEditButton.setForeground(new java.awt.Color(0, 0, 0));
        faqEditButton.setText("UPDATE");
        faqEditButton.setPreferredSize(new java.awt.Dimension(100, 22));
        faqEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqEditButtonActionPerformed(evt);
            }
        });

        faqClearFieldButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        faqClearFieldButton.setForeground(new java.awt.Color(0, 0, 0));
        faqClearFieldButton.setText("CLEAR");
        faqClearFieldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqClearFieldButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout faqButtonSelectionPanelLayout = new javax.swing.GroupLayout(faqButtonSelectionPanel);
        faqButtonSelectionPanel.setLayout(faqButtonSelectionPanelLayout);
        faqButtonSelectionPanelLayout.setHorizontalGroup(
            faqButtonSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faqButtonSelectionPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(faqAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(faqDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(faqEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(faqClearFieldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        faqButtonSelectionPanelLayout.setVerticalGroup(
            faqButtonSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, faqButtonSelectionPanelLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(faqButtonSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faqAddButton)
                    .addComponent(faqDeleteButton)
                    .addComponent(faqEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faqClearFieldButton))
                .addContainerGap())
        );

        currentFaqPanel.setBackground(new java.awt.Color(255, 255, 255));

        allCurrentFaqTable.setAutoCreateRowSorter(true);
        allCurrentFaqTable.setBackground(new java.awt.Color(255, 255, 255));
        allCurrentFaqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        allCurrentFaqTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        allCurrentFaqTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        allCurrentFaqTable.getTableHeader().setReorderingAllowed(false);
        allCurrentFaqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allCurrentFaqTableMouseClicked(evt);
            }
        });
        allCurrentFaqScrollPane.setViewportView(allCurrentFaqTable);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Current FAQs");

        javax.swing.GroupLayout currentFaqPanelLayout = new javax.swing.GroupLayout(currentFaqPanel);
        currentFaqPanel.setLayout(currentFaqPanelLayout);
        currentFaqPanelLayout.setHorizontalGroup(
            currentFaqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentFaqPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentFaqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allCurrentFaqScrollPane)
                    .addGroup(currentFaqPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        currentFaqPanelLayout.setVerticalGroup(
            currentFaqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentFaqPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(allCurrentFaqScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout faqsLayout = new javax.swing.GroupLayout(faqs);
        faqs.setLayout(faqsLayout);
        faqsLayout.setHorizontalGroup(
            faqsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faqsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(faqsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentFaqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(faqsLayout.createSequentialGroup()
                        .addComponent(faqTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(faqDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(faqButtonSelectionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
                .addContainerGap())
        );
        faqsLayout.setVerticalGroup(
            faqsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faqsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(faqTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(faqDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(faqButtonSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentFaqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        allPanes.addTab("tab3", faqs);

        getContentPane().add(allPanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -40, 660, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fetchAndUpdateDashboard() {
        //Upates number of total disasters
        String totalDisaster = String.valueOf(disasterList.disasterInitList.size());
        AdminScreen.totalReportedDisasters.setText(totalDisaster);

        //Updates donation amount
        double totalDonationDouble = userData.initUserData.totalDonationAmount;
        String totalDonationString;
        if (totalDonationDouble >= 1000.00) {

            totalDonationDouble = totalDonationDouble / 1000.00;
            totalDonationString = String.valueOf(totalDonationDouble + "K");
        } else {
            totalDonationString = String.valueOf(totalDonationDouble);
        }
        AdminScreen.totalDonationAmount.setText("RM" + totalDonationString);

        //Updates TotalReportsReceived
        newlyReportedDisastersList.initializeDisasterListContent(null);
        AdminScreen.totalUserReportsReceived.setText(String.valueOf(data.newlyReportedDisastersList.newlyReportedDisasterList.size()));

    }

    public void setDisasterTable() {
        for (int i = 0; i < dataDisasterList.disasterInitList.size(); i++) {
            Object[] objs = {dataDisasterList.disasterInitList.get(i).type, dataDisasterList.disasterInitList.get(i).date, dataDisasterList.disasterInitList.get(i).location,
                dataDisasterList.disasterInitList.get(i).description, dataDisasterList.disasterInitList.get(i).imageUrl_potrait, dataDisasterList.disasterInitList.get(i).donationCollection,
                dataDisasterList.disasterInitList.get(i).donationGoal
            };
            allCurrentDisastersTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
            disasterDtm.addRow(objs);

        }

    }

    private void setFaqTable() {

        int i = 0;
        do {
            Object[] objs = {dataFaqList.faqTipsInitList.get(i).question, dataFaqList.faqTipsInitList.get(i).answer,};
            allCurrentFaqTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
            faqDtm.addRow(objs);
            i++;

        } while (i < dataFaqList.faqTipsInitList.size());

    }

    private void setUserTable() {

        for (int i = 0; i < dataUserDisasterList.newlyReportedDisasterList.size(); i++) {
            Object[] objs = {dataUserDisasterList.newlyReportedDisasterList.get(i).reporterName, dataUserDisasterList.newlyReportedDisasterList.get(i).type, dataUserDisasterList.newlyReportedDisasterList.get(i).location,
                dataUserDisasterList.newlyReportedDisasterList.get(i).date, dataUserDisasterList.newlyReportedDisasterList.get(i).description};
            allUserSubmittedReportsTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
            userDtm.addRow(objs);

        }

    }

    private void setDonationTable() {

        if (DisasterDetailScreen.userDonated == false) {
            dashboardScrollPane.setVisible(false);
            dashboardTable.setVisible(false);
            noDonationText.setVisible(true);

        } else {
            noDonationText.setVisible(false);
            Object[] objs = {dataUserData.initUserData.name, dataUserData.initUserData.location, dataUserData.initUserData.totalDonationAmount};
            dashboardTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
            donationDtm.addRow(objs);

        }

    }


    private void dashboardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMouseClicked
        // TODO add your handling code here:
        allPanes.setSelectedIndex(0);
        fetchAndUpdateDashboard();

        donationDtm = new DefaultTableModel(donationHeader, 0);
        dashboardTable.setModel(donationDtm);

        setDonationTable();


    }//GEN-LAST:event_dashboardButtonMouseClicked

    private void disastersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disastersButtonMouseClicked
        // TODO add your handling code here:
        allPanes.setSelectedIndex(1);

        //Setting up for disasterPanel
        if (disasterClick == 0) {
            disasterDtm = new DefaultTableModel(disasterHeader, 0);
            allCurrentDisastersTable.setModel(disasterDtm);

            setDisasterTable();
            disasterClick++;

        }


    }//GEN-LAST:event_disastersButtonMouseClicked

    private void userReportsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userReportsButtonMouseClicked
        // TODO add your handling code here:
        allPanes.setSelectedIndex(2);
        allCurrentDisastersTable.setRowSelectionInterval(0, 0);;

        if (userClick == 0) {

            userDtm = new DefaultTableModel(userHeader, 0);
            allUserSubmittedReportsTable.setModel(userDtm);
            this.setLocationRelativeTo(null);

            setUserTable();
            userClick++;
        }
    }//GEN-LAST:event_userReportsButtonMouseClicked

    private void faqsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqsButtonMouseClicked
        // TODO add your handling code here:
        allPanes.setSelectedIndex(3);

        //Setting up for faqPanel
        if (faqClick == 0) {

            faqDtm = new DefaultTableModel(faqHeader, 0);
            allCurrentFaqTable.setModel(faqDtm);
            this.setLocationRelativeTo(null);

            setFaqTable();
            faqClick++;

        }

    }//GEN-LAST:event_faqsButtonMouseClicked

    private void dashboardButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardButtonMousePressed

    private void dashboardButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMouseEntered
        // TODO add your handling code here:
        dashboardButton.setForeground(clickedColor);
    }//GEN-LAST:event_dashboardButtonMouseEntered

    private void disasterEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disasterEditButtonActionPerformed
        // TODO add your handling code here:
        String type = disasterTypeText.getText();
        String date = disasterDateText.getText();
        String location = disasterLocationText.getText();
        String description = disasterDescriptionText.getText();
        String imageUrl = String.valueOf(disasterImageText.getText());
        double collected = Double.parseDouble(disasterDonationCollectionText.getText());
        double goal = Double.parseDouble(disasterDonationGoalText.getText());

        dataDisasterList.disasterInitList.get(disasterRow).type = type;
        dataDisasterList.disasterInitList.get(disasterRow).date = date;
        dataDisasterList.disasterInitList.get(disasterRow).location = location;
        dataDisasterList.disasterInitList.get(disasterRow).description = description;
        dataDisasterList.disasterInitList.get(disasterRow).imageUrl_potrait = imageUrl;
        dataDisasterList.disasterInitList.get(disasterRow).donationCollection = collected;
        dataDisasterList.disasterInitList.get(disasterRow).donationGoal = goal;

        disasterDtm.setRowCount(0);
        setDisasterTable();

    }//GEN-LAST:event_disasterEditButtonActionPerformed

    private void disasterAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disasterAddButtonActionPerformed
        // TODO add your handling code here:
        double collectionisDouble;
        double goalisDouble;

        try {
            collectionisDouble = Double.parseDouble(disasterDonationCollectionText.getText());
            goalisDouble = Double.parseDouble(disasterDonationGoalText.getText());
        } catch (NumberFormatException e) {

            collectionisDouble = 0;
            goalisDouble = 0;
        }

        if (disasterTypeText.getText().isBlank() || disasterDateText.getText().isBlank() || disasterLocationText.getText().isBlank() || disasterDescriptionText.getText().isBlank() || disasterImageText.getText().isBlank()
                || disasterDonationCollectionText.getText().isBlank() || disasterDonationGoalText.getText().isBlank()) {

            JOptionPane.showMessageDialog(null, "Please fill in all fields before adding a disaster", "Error", JOptionPane.ERROR_MESSAGE);
            disasterClearField();

        } else if (collectionisDouble == 0 || goalisDouble == 0) {
            JOptionPane.showMessageDialog(null, "ERROR! \nPlease fill in numbers only in the Donation Collection and Donation Goal fields.", "Error", JOptionPane.ERROR_MESSAGE);
            disasterClearField();

        } else {
            String type = disasterTypeText.getText();
            String date = disasterDateText.getText();
            String location = disasterLocationText.getText();
            String description = disasterDescriptionText.getText();
            String imageUrl = String.valueOf(disasterImageText.getText());
            double collected = Double.parseDouble(disasterDonationCollectionText.getText());
            double goal = Double.parseDouble(disasterDonationGoalText.getText());
            dataDisasterList.disasterInitList.add(new Disaster(type, date, location, description, imageUrl, " ", collected, goal));
            disasterDtm.setRowCount(0);
            for (int i = 0; i < dataDisasterList.disasterInitList.size(); i++) {
                Object[] objs = {dataDisasterList.disasterInitList.get(i).type, dataDisasterList.disasterInitList.get(i).date, dataDisasterList.disasterInitList.get(i).location,
                    dataDisasterList.disasterInitList.get(i).description, dataDisasterList.disasterInitList.get(i).imageUrl_potrait, dataDisasterList.disasterInitList.get(i).donationCollection,
                    dataDisasterList.disasterInitList.get(i).donationGoal
                };
                disasterDtm.addRow(objs);

                disasterClearField();

            }
        }


    }//GEN-LAST:event_disasterAddButtonActionPerformed

    private void allCurrentDisastersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allCurrentDisastersTableMouseClicked
        // TODO add your handling code here:
        disasterRow = allCurrentDisastersTable.getSelectedRow();

        disasterTypeText.setText(disasterDtm.getValueAt(disasterRow, 0).toString());
        disasterDateText.setText(disasterDtm.getValueAt(disasterRow, 1).toString());
        disasterLocationText.setText(disasterDtm.getValueAt(disasterRow, 2).toString());
        disasterDescriptionText.setText(disasterDtm.getValueAt(disasterRow, 3).toString());
        disasterImageText.setText(disasterDtm.getValueAt(disasterRow, 4).toString());
        disasterDonationCollectionText.setText(disasterDtm.getValueAt(disasterRow, 5).toString());
        disasterDonationGoalText.setText(disasterDtm.getValueAt(disasterRow, 6).toString());
    }//GEN-LAST:event_allCurrentDisastersTableMouseClicked

    private void disasterDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disasterDeleteButtonActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if (dialogResult == 0) {
            dataDisasterList.disasterInitList.remove(disasterRow);
            disasterClearField();
        } else {

        }

        disasterDtm.setRowCount(0);
        setDisasterTable();
    }//GEN-LAST:event_disasterDeleteButtonActionPerformed

    public void setChosenDisaster(int i) {
        disasterTypeText.setText(dataDisasterList.disasterInitList.get(i).type);
        disasterDateText.setText(dataDisasterList.disasterInitList.get(i).date);
        disasterLocationText.setText(dataDisasterList.disasterInitList.get(i).location);
        disasterDescriptionText.setText(dataDisasterList.disasterInitList.get(i).description);
        disasterImageText.setText(dataDisasterList.disasterInitList.get(i).imageUrl_potrait);
        disasterDonationCollectionText.setText(String.valueOf(dataDisasterList.disasterInitList.get(i).donationCollection));
        disasterDonationGoalText.setText(String.valueOf(dataDisasterList.disasterInitList.get(i).donationGoal));

    }
    private void disasterSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disasterSearchButtonActionPerformed
        // TODO add your handling code here:

        AdminSearchDisasterScreen search = new AdminSearchDisasterScreen();
        search.setVisible(true);
        dispose();


    }//GEN-LAST:event_disasterSearchButtonActionPerformed

    private void disasterClearFieldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disasterClearFieldButtonActionPerformed
        // TODO add your handling code here:
        disasterClearField();
    }//GEN-LAST:event_disasterClearFieldButtonActionPerformed

    private void faqAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqAddButtonActionPerformed
        // TODO add your handling code here:
        if (faqQuestionText.getText().isBlank() || faqAnswerText.getText().isBlank()) {

            JOptionPane.showMessageDialog(null, "Please fill in all fields before adding a FAQ", "Error", JOptionPane.ERROR_MESSAGE);
            faqClearField();

        } else {
            String question = faqQuestionText.getText();
            String answer = faqAnswerText.getText();

            dataFaqList.faqTipsInitList.add(new Faq(question, answer));
            faqDtm.setRowCount(0);

            for (int i = 0; i < dataFaqList.faqTipsInitList.size(); i++) {
                Object[] objs = {dataFaqList.faqTipsInitList.get(i).question, dataFaqList.faqTipsInitList.get(i).answer,};
                allCurrentFaqTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
                faqDtm.addRow(objs);

                faqClearField();
            }
        }
    }//GEN-LAST:event_faqAddButtonActionPerformed

    private void faqDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqDeleteButtonActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if (dialogResult == 0) {
            dataFaqList.faqTipsInitList.remove(faqRow);
            faqClearField();
        } else {

        }

        faqDtm.setRowCount(0);
        setFaqTable();

    }//GEN-LAST:event_faqDeleteButtonActionPerformed

    private void faqEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqEditButtonActionPerformed
        // TODO add your handling code here:
        String question = faqQuestionText.getText();
        String answer = faqAnswerText.getText();

        dataFaqList.faqTipsInitList.get(faqRow).question = question;
        dataFaqList.faqTipsInitList.get(faqRow).answer = answer;

        faqDtm.setRowCount(0);
        setFaqTable();
    }//GEN-LAST:event_faqEditButtonActionPerformed

    private void faqClearFieldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqClearFieldButtonActionPerformed
        // TODO add your handling code here:
        faqClearField();
    }//GEN-LAST:event_faqClearFieldButtonActionPerformed

    private void allCurrentFaqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allCurrentFaqTableMouseClicked
        // TODO add your handling code here:
        faqRow = allCurrentFaqTable.getSelectedRow();

        faqQuestionText.setText(faqDtm.getValueAt(faqRow, 0).toString());
        faqAnswerText.setText(faqDtm.getValueAt(faqRow, 1).toString());

    }//GEN-LAST:event_allCurrentFaqTableMouseClicked

    private void allUserSubmittedReportsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allUserSubmittedReportsTableMouseClicked
        // TODO add your handling code here:
        userRow = allUserSubmittedReportsTable.getSelectedRow();

    }//GEN-LAST:event_allUserSubmittedReportsTableMouseClicked

    private void userDeleteSubmittedReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDeleteSubmittedReportButtonActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if (dialogResult == 0) {
            dataUserDisasterList.newlyReportedDisasterList.remove(userRow);
        } else {

        }

        userDtm.setRowCount(0);
        setUserTable();

    }//GEN-LAST:event_userDeleteSubmittedReportButtonActionPerformed

    private void userAddtoDisastersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAddtoDisastersButtonActionPerformed
        // TODO add your handling code here:
        if (disasterClick == 0) {
            disasterDtm = new DefaultTableModel(disasterHeader, 0);
            allCurrentDisastersTable.setModel(disasterDtm);

            setDisasterTable();
            disasterClick++;
        }

        String type = dataUserDisasterList.newlyReportedDisasterList.get(userRow).type;
        String location = dataUserDisasterList.newlyReportedDisasterList.get(userRow).location;
        String date = dataUserDisasterList.newlyReportedDisasterList.get(userRow).date;
        String description = dataUserDisasterList.newlyReportedDisasterList.get(userRow).description;

        dataDisasterList.disasterInitList.add(new Disaster(type, date, location, description, " ", " ", 0, 0));

        disasterDtm.setRowCount(0);
        for (int i = 0; i < dataDisasterList.disasterInitList.size(); i++) {
            Object[] objs = {dataDisasterList.disasterInitList.get(i).type, dataDisasterList.disasterInitList.get(i).date, dataDisasterList.disasterInitList.get(i).location,
                dataDisasterList.disasterInitList.get(i).description, dataDisasterList.disasterInitList.get(i).imageUrl_potrait, dataDisasterList.disasterInitList.get(i).donationCollection,
                dataDisasterList.disasterInitList.get(i).donationGoal
            };
            disasterDtm.addRow(objs);

            disasterClearField();

        }
        dataUserDisasterList.newlyReportedDisasterList.remove(userRow);
        userDtm.setRowCount(0);
        setUserTable();
    }//GEN-LAST:event_userAddtoDisastersButtonActionPerformed

    private void dashboardButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMouseExited
        // TODO add your handling code here:
        dashboardButton.setForeground(originalColor);
    }//GEN-LAST:event_dashboardButtonMouseExited

    private void disastersButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disastersButtonMouseEntered
        // TODO add your handling code here:
        disastersButton.setForeground(clickedColor);
    }//GEN-LAST:event_disastersButtonMouseEntered

    private void disastersButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disastersButtonMouseExited
        // TODO add your handling code here:
        disastersButton.setForeground(originalColor);
    }//GEN-LAST:event_disastersButtonMouseExited

    private void userReportsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userReportsButtonMouseEntered
        // TODO add your handling code here:
        userReportsButton.setForeground(clickedColor);
    }//GEN-LAST:event_userReportsButtonMouseEntered

    private void userReportsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userReportsButtonMouseExited
        // TODO add your handling code here:
        userReportsButton.setForeground(originalColor);
    }//GEN-LAST:event_userReportsButtonMouseExited

    private void faqsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqsButtonMouseEntered
        // TODO add your handling code here:
        faqsButton.setForeground(clickedColor);
    }//GEN-LAST:event_faqsButtonMouseEntered

    private void faqsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqsButtonMouseExited
        // TODO add your handling code here:
        faqsButton.setForeground(originalColor);
    }//GEN-LAST:event_faqsButtonMouseExited

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        AdminLoginScreen login = new AdminLoginScreen();
        login.setVisible(true);
        dispose();

    }//GEN-LAST:event_backButtonMouseClicked

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        // TODO add your handling code here:
        backButton.setForeground(clickedColor);
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        // TODO add your handling code here:
        backButton.setForeground(originalColor);
    }//GEN-LAST:event_backButtonMouseExited

    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        // TODO add your handling code here:

        donationDtm = new DefaultTableModel(donationHeader, 0);
        dashboardTable.setModel(donationDtm);
        this.setLocationRelativeTo(null);
        setDonationTable();
    }//GEN-LAST:event_refreshButtonMouseClicked

    private void refreshButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseEntered
        // TODO add your handling code here:
        refreshButton.setForeground(clickedColor);
    }//GEN-LAST:event_refreshButtonMouseEntered

    private void refreshButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseExited
        // TODO add your handling code here:
        refreshButton.setForeground(blackColor);
    }//GEN-LAST:event_refreshButtonMouseExited

    private void disasterClearField() {
        disasterTypeText.requestFocus();
        disasterTypeText.setText("");
        disasterDateText.setText("");
        disasterLocationText.setText("");
        disasterDescriptionText.setText("");
        disasterImageText.setText("");
        disasterDonationCollectionText.setText("");
        disasterDonationGoalText.setText("");

    }

    private void faqClearField() {
        faqQuestionText.requestFocus();
        faqQuestionText.setText("");
        faqAnswerText.setText("");

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
            java.util.logging.Logger.getLogger(AdminScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane allCurrentDisastersScrollPane;
    public static javax.swing.JTable allCurrentDisastersTable;
    private javax.swing.JScrollPane allCurrentFaqScrollPane;
    private javax.swing.JTable allCurrentFaqTable;
    public static javax.swing.JTabbedPane allPanes;
    private javax.swing.JTable allUserSubmittedReportsTable;
    private javax.swing.JLabel backButton;
    private javax.swing.JPanel buttonSelectionPanel;
    private javax.swing.JPanel currentDisasterPanel;
    private javax.swing.JLabel currentDisastersTitle;
    private javax.swing.JPanel currentFaqPanel;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel dashboardButton;
    public static javax.swing.JScrollPane dashboardScrollPane;
    public static javax.swing.JTable dashboardTable;
    private java.awt.Label dashboardTitle;
    private javax.swing.JButton disasterAddButton;
    private javax.swing.JPanel disasterButtonSelectionPanel;
    private javax.swing.JButton disasterClearFieldButton;
    private javax.swing.JLabel disasterDate;
    private javax.swing.JPanel disasterDateBlock;
    public static javax.swing.JTextField disasterDateText;
    private javax.swing.JButton disasterDeleteButton;
    private javax.swing.JLabel disasterDescription;
    private javax.swing.JPanel disasterDescriptionBlock;
    private javax.swing.JScrollPane disasterDescriptionScrollPane;
    public static javax.swing.JTextArea disasterDescriptionText;
    private javax.swing.JPanel disasterDetailsPanel;
    private javax.swing.JLabel disasterDonationCollection;
    private javax.swing.JPanel disasterDonationCollectionBlock;
    public static javax.swing.JTextField disasterDonationCollectionText;
    private javax.swing.JLabel disasterDonationGoal;
    private javax.swing.JPanel disasterDonationGoalBlock;
    public static javax.swing.JTextField disasterDonationGoalText;
    private javax.swing.JButton disasterEditButton;
    private javax.swing.JLabel disasterImage;
    private javax.swing.JPanel disasterImageBlock;
    public static javax.swing.JTextField disasterImageText;
    private javax.swing.JLabel disasterLocation;
    private javax.swing.JPanel disasterLocationBlock;
    public static javax.swing.JTextField disasterLocationText;
    private javax.swing.JButton disasterSearchButton;
    private javax.swing.JLabel disasterType;
    private javax.swing.JPanel disasterTypeBlock;
    public static javax.swing.JTextField disasterTypeText;
    private javax.swing.JPanel disasters;
    private javax.swing.JLabel disastersButton;
    private java.awt.Label disastersTitle;
    private javax.swing.JLabel donationDetails;
    private javax.swing.JPanel donationDetailsBlock;
    private javax.swing.JPanel donationDetailsPanel;
    private javax.swing.JButton faqAddButton;
    private javax.swing.JLabel faqAnswer;
    private javax.swing.JScrollPane faqAnswerScrollPane;
    private javax.swing.JTextArea faqAnswerText;
    private javax.swing.JPanel faqButtonSelectionPanel;
    private javax.swing.JButton faqClearFieldButton;
    private javax.swing.JButton faqDeleteButton;
    private javax.swing.JPanel faqDetailsPanel;
    private javax.swing.JButton faqEditButton;
    private javax.swing.JLabel faqQuestion;
    private javax.swing.JScrollPane faqQuestionScrollPane;
    private javax.swing.JTextArea faqQuestionText;
    private java.awt.Label faqTitle;
    private javax.swing.JPanel faqs;
    private javax.swing.JLabel faqsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel noDonationImage;
    private javax.swing.JLabel noDonationText;
    private javax.swing.JLabel refreshButton;
    private javax.swing.JLabel totalDisasters;
    private javax.swing.JPanel totalDisastersBlock;
    public static javax.swing.JPanel totalDisastersPanel;
    private javax.swing.JLabel totalDisastersSpinner;
    public static javax.swing.JLabel totalDonationAmount;
    private javax.swing.JLabel totalDonations;
    private javax.swing.JPanel totalDonationsBlock;
    private javax.swing.JPanel totalDonationsPanel;
    private javax.swing.JLabel totalDonationsSpinner;
    public static javax.swing.JLabel totalReportedDisasters;
    private javax.swing.JLabel totalReportsReceived;
    private javax.swing.JPanel totalReportsReceivedBlock;
    private javax.swing.JPanel totalReportsReceivedPanel;
    private javax.swing.JLabel totalReportsSpinner;
    public static javax.swing.JLabel totalUserReportsReceived;
    private javax.swing.JPanel user;
    private javax.swing.JButton userAddtoDisastersButton;
    private javax.swing.JButton userDeleteSubmittedReportButton;
    private javax.swing.JLabel userReportsButton;
    private javax.swing.JPanel userSubmittedReportsPanel;
    private javax.swing.JLabel userSubmittedReportsPanelTitle;
    private javax.swing.JScrollPane userSubmittedReportsScrollPane;
    private java.awt.Label userTitle;
    private javax.swing.JLabel welcomeMessage;
    // End of variables declaration//GEN-END:variables
}
