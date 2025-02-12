package Pages;

import DB.DB;
import User.User;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import java.awt.*;

public class HomeFrame extends javax.swing.JFrame {

        /**
         * Creates new form HomeFrame
         */
        public HomeFrame() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {
                java.awt.GridBagConstraints gridBagConstraints;

                jPanel9 = new javax.swing.JPanel();
                jPanel1 = new javax.swing.JPanel();
                jPanelRoot = new javax.swing.JPanel();
                jPanelLogin = new javax.swing.JPanel();
                jPanel5 = new javax.swing.JPanel();
                jPanel16 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                HomeMenuItem = new javax.swing.JPanel();
                jSeparator7 = new javax.swing.JSeparator();
                jPanel18 = new javax.swing.JPanel();
                jLabel7 = new javax.swing.JLabel();
                FieldsInformationMenuItem = new javax.swing.JPanel();
                jSeparator8 = new javax.swing.JSeparator();
                jPanel20 = new javax.swing.JPanel();
                jLabel8 = new javax.swing.JLabel();
                FieldsSecurityMenuItem = new javax.swing.JPanel();
                jSeparator9 = new javax.swing.JSeparator();
                jPanel22 = new javax.swing.JPanel();
                jLabel9 = new javax.swing.JLabel();
                SoilConditionMenuItem = new javax.swing.JPanel();
                jSeparator10 = new javax.swing.JSeparator();
                jPanel24 = new javax.swing.JPanel();
                jLabel10 = new javax.swing.JLabel();
                WeatherMenuItem = new javax.swing.JPanel();
                jSeparator11 = new javax.swing.JSeparator();
                jPanel26 = new javax.swing.JPanel();
                jLabel11 = new javax.swing.JLabel();
                RobotConditionMenuItem = new javax.swing.JPanel();
                jSeparator2 = new javax.swing.JSeparator();
                jPanel7 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jPanel4 = new javax.swing.JPanel();
                LoginViewIcon = new javax.swing.JLabel();

                jPanel48 = new javax.swing.JPanel();

                jPanel51 = new javax.swing.JPanel();

                LoginViewCentrePanelCard = new javax.swing.JPanel();

                jPanel50 = new javax.swing.JPanel();

                profilPanel = new Profile();
                ventilatorPanel = new Ventilator();
                fieldsSecurityPanel = new FieldsSecurity();
                fieldsInformationPanel = new FieldsInformation();
                meteoPanel = new Meteo();
                soilConditionPanel = new SoilsCondition();

                login = new Login();

                signUPPanel = new SignUP();

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(
                                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));
                jPanel9Layout.setVerticalGroup(
                                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setPreferredSize(new java.awt.Dimension(1000, 800));
                getContentPane().setLayout(
                                new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

                jPanel1.setBackground(new java.awt.Color(0, 102, 102));
                jPanelRoot.setBackground(new java.awt.Color(0, 102, 102));
                // Set CardLayout For Root Panel
                CardLayout cardLayoutForPanelRoot = new CardLayout();
                jPanelRoot.setLayout(cardLayoutForPanelRoot);

                login.setCardLayoutForPanelRoot(cardLayoutForPanelRoot);
                login.setJPanelRoot(jPanelRoot);
                // toDo ADD jPanelRoot to Login
                jPanelLogin.setBackground(new java.awt.Color(0, 102, 102));

                jPanel5.setBackground(new java.awt.Color(153, 153, 153));

                jPanel16.setBackground(new java.awt.Color(204, 204, 204));
                jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.LINE_AXIS));

                jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jPanel2.setLayout(new java.awt.GridLayout(0, 1));

                HomeMenuItem.setName("HomeMenuItem"); // NOI18N
                HomeMenuItem.setLayout(new java.awt.BorderLayout());

                jSeparator7.setBackground(new java.awt.Color(0, 153, 153));
                jSeparator7.setOpaque(true);
                HomeMenuItem.add(jSeparator7, java.awt.BorderLayout.SOUTH);

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

                jLabel7.setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/farmer.png")));
                jLabel7.setText("Profil");
                jLabel7.setIconTextGap(20);
                jLabel7.setVerifyInputWhenFocusTarget(false);

                javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
                jPanel18.setLayout(jPanel18Layout);
                jPanel18Layout.setHorizontalGroup(
                                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout
                                                                .createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jLabel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                295,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                jPanel18Layout.setVerticalGroup(
                                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel18Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                48,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                HomeMenuItem.add(jPanel18, java.awt.BorderLayout.CENTER);

                jPanel2.add(HomeMenuItem);
                HomeMenuItem.getAccessibleContext().setAccessibleName("HomeMenuItem");

                FieldsInformationMenuItem.setLayout(new java.awt.BorderLayout());

                jSeparator8.setBackground(new java.awt.Color(0, 153, 153));
                jSeparator8.setOpaque(true);
                FieldsInformationMenuItem.add(jSeparator8, java.awt.BorderLayout.SOUTH);

                jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel8.setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/computer-screen.png"))); // NOI18N
                jLabel8.setText("Informations sur le Champ");
                jLabel8.setIconTextGap(20);
                jLabel8.setVerifyInputWhenFocusTarget(false);

                javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
                jPanel20.setLayout(jPanel20Layout);
                jPanel20Layout.setHorizontalGroup(
                                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout
                                                                .createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jLabel8,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                295,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                jPanel20Layout.setVerticalGroup(
                                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel20Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel8,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                48,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                FieldsInformationMenuItem.add(jPanel20, java.awt.BorderLayout.CENTER);

                jPanel2.add(FieldsInformationMenuItem);

                FieldsSecurityMenuItem.setLayout(new java.awt.BorderLayout());

                jSeparator9.setBackground(new java.awt.Color(0, 153, 153));
                jSeparator9.setOpaque(true);
                FieldsSecurityMenuItem.add(jSeparator9, java.awt.BorderLayout.SOUTH);

                jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel9.setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/cctv.png"))); // NOI18N
                jLabel9.setText("Sécurite du Terrain");
                jLabel9.setIconTextGap(20);
                jLabel9.setVerifyInputWhenFocusTarget(false);

                javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
                jPanel22.setLayout(jPanel22Layout);
                jPanel22Layout.setHorizontalGroup(
                                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout
                                                                .createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jLabel9,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                295,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                jPanel22Layout.setVerticalGroup(
                                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel22Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel9,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                48,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                FieldsSecurityMenuItem.add(jPanel22, java.awt.BorderLayout.CENTER);

                jPanel2.add(FieldsSecurityMenuItem);

                SoilConditionMenuItem.setLayout(new java.awt.BorderLayout());

                jSeparator10.setBackground(new java.awt.Color(0, 153, 153));
                jSeparator10.setOpaque(true);
                SoilConditionMenuItem.add(jSeparator10, java.awt.BorderLayout.SOUTH);

                jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel10.setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/soil.png"))); // NOI18N
                jLabel10.setText("Etat du Sol");
                jLabel10.setIconTextGap(20);
                jLabel10.setVerifyInputWhenFocusTarget(false);

                javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
                jPanel24.setLayout(jPanel24Layout);
                jPanel24Layout.setHorizontalGroup(
                                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout
                                                                .createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jLabel10,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                295,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                jPanel24Layout.setVerticalGroup(
                                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel24Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel10,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                48,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                SoilConditionMenuItem.add(jPanel24, java.awt.BorderLayout.CENTER);

                jPanel2.add(SoilConditionMenuItem);

                WeatherMenuItem.setLayout(new java.awt.BorderLayout());

                jSeparator11.setBackground(new java.awt.Color(0, 153, 153));
                jSeparator11.setOpaque(true);
                WeatherMenuItem.add(jSeparator11, java.awt.BorderLayout.SOUTH);

                jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel11.setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/thunderstorm.png"))); // NOI18N
                jLabel11.setText("Meteo");
                jLabel11.setIconTextGap(20);
                jLabel11.setVerifyInputWhenFocusTarget(false);

                javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
                jPanel26.setLayout(jPanel26Layout);
                jPanel26Layout.setHorizontalGroup(
                                jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout
                                                                .createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jLabel11,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                295,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                jPanel26Layout.setVerticalGroup(
                                jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel26Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel11,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                48,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                WeatherMenuItem.add(jPanel26, java.awt.BorderLayout.CENTER);

                jPanel2.add(WeatherMenuItem);

                RobotConditionMenuItem.setLayout(new java.awt.BorderLayout());

                jSeparator2.setBackground(new java.awt.Color(0, 153, 153));
                jSeparator2.setOpaque(true);
                RobotConditionMenuItem.add(jSeparator2, java.awt.BorderLayout.SOUTH);

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel2.setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/water-pump (2).png"))); // NOI18N
                jLabel2.setText("Etat du Ventilateur");
                jLabel2.setIconTextGap(20);
                jLabel2.setVerifyInputWhenFocusTarget(false);

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout
                                                                .createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                295,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                jPanel7Layout.setVerticalGroup(
                                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                48,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                RobotConditionMenuItem.add(jPanel7, java.awt.BorderLayout.CENTER);

                jPanel2.add(RobotConditionMenuItem);

                jPanel16.add(jPanel2);

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel16,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                jPanel5Layout.setVerticalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGap(169, 169, 169)
                                                                .addComponent(jPanel16,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                // Setting up the main CardLayout

                jPanel4.setBackground(new java.awt.Color(204, 255, 204));

                CardLayout cardLayoutForMainView = new CardLayout();
                jPanel4.setLayout(cardLayoutForMainView);

                // Add Other Panels From other Classes

                jPanel4.add(soilConditionPanel, "SoilConditionPanel");

                jPanel4.add(meteoPanel, "MeteoFrame");

                jPanel4.add(profilPanel, "ProfilPanel");

                jPanel4.add(fieldsInformationPanel, "FieldsInformationsPanel");

                jPanel4.add(ventilatorPanel, "RobotPanel");

                jPanel4.add(fieldsSecurityPanel, "SecurityPanel");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jPanel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                login.setLayout(
                                new javax.swing.BoxLayout(login, javax.swing.BoxLayout.LINE_AXIS));

                CardLayout cardLayoutLoginViewCrad = new CardLayout();
                LoginViewCentrePanelCard.setLayout(cardLayoutLoginViewCrad);

                login.setProfilPanel(profilPanel);

                // end Login

                login.setSignUpViewCentrePanel(LoginViewCentrePanelCard);
                login.setCardLayoutLoginViewCard(cardLayoutLoginViewCrad);

                signUPPanel.setLoginViewCentrePanel(LoginViewCentrePanelCard);
                signUPPanel.setCardLayoutLoginViewCard(cardLayoutLoginViewCrad);

                LoginViewCentrePanelCard.add(login, "Login");

                LoginViewCentrePanelCard.add(signUPPanel, "Sign Up");

                jPanel48.setBackground(new java.awt.Color(0, 102, 102));
                jPanel48.setLayout(new java.awt.BorderLayout());

                jPanel51.setBackground(new java.awt.Color(0, 102, 102));

                javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
                jPanel51.setLayout(jPanel51Layout);
                jPanel51Layout.setHorizontalGroup(
                                jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 1239, Short.MAX_VALUE));
                jPanel51Layout.setVerticalGroup(
                                jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                jPanel48.add(jPanel51, java.awt.BorderLayout.PAGE_START);

                jPanel48.add(LoginViewCentrePanelCard, java.awt.BorderLayout.CENTER);

                jPanel50.setBackground(new java.awt.Color(0, 102, 102));

                javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
                jPanel50.setLayout(jPanel50Layout);
                jPanel50Layout.setHorizontalGroup(
                                jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 1239, Short.MAX_VALUE));
                jPanel50Layout.setVerticalGroup(
                                jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                jPanel48.add(jPanel50, java.awt.BorderLayout.PAGE_END);

                jPanelLogin.setLayout(new java.awt.GridLayout(1, 0));

                LoginViewIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                LoginViewIcon.setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/SmartFarm.png"))); // NOI18N

                jPanelLogin.add(LoginViewIcon);

                jPanelLogin.add(jPanel48);

                jPanelRoot.add(jPanelLogin, "Login View");
                jPanelRoot.add(jPanel1, "Main View");

                getContentPane().add(jPanelRoot);
                // getContentPane().add(jPanel1);
                // getContentPane().add(jPanelLogin);

                jLabel7.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                cardLayoutForMainView.show(jPanel4, "ProfilPanel");
                                ; // Switch to the next panel
                        }
                });

                jLabel8.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                cardLayoutForMainView.show(jPanel4, "FieldsInformationsPanel");
                                ; // Switch to the next panel
                        }
                });

                jLabel10.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                cardLayoutForMainView.show(jPanel4, "SoilConditionPanel");
                                ; // Switch to the next panel
                        }
                });

                jLabel9.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                cardLayoutForMainView.show(jPanel4, "SecurityPanel");
                        }
                });

                jLabel2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                cardLayoutForMainView.show(jPanel4, "RobotPanel");
                                ; // Switch to the next panel
                        }
                });

                jLabel11.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                cardLayoutForMainView.show(jPanel4, "MeteoFrame");
                                ; // Switch to the next panel
                        }
                });

                // Set soilHumidity

                int soilHumidity = DB.getCurrentSoilHumidity();

                soilConditionPanel.setHumidityTextAndIcon(soilHumidity);

                // Set temperatur and Air Humidity
                int temperatur = DB.getCurrentTemperature();

                int humidity = DB.getCurrentHumidity();

                meteoPanel.setTemperaturAndHumidity(temperatur, humidity);

                pack();
        }// </editor-fold>

        public static void main(String args[]) {
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(HomeFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(HomeFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(HomeFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(HomeFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new HomeFrame().setVisible(true);
                        }
                });
        }

        private javax.swing.JPanel FieldsInformationMenuItem;
        private javax.swing.JPanel FieldsSecurityMenuItem;
        private javax.swing.JPanel HomeMenuItem;
        private javax.swing.JLabel LoginViewIcon;
        private javax.swing.JPanel RobotConditionMenuItem;
        private javax.swing.JPanel SoilConditionMenuItem;
        private javax.swing.JPanel WeatherMenuItem;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanelRoot;
        private javax.swing.JPanel jPanelLogin;
        private javax.swing.JPanel jPanel16;
        private javax.swing.JPanel jPanel18;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel20;
        private javax.swing.JPanel jPanel22;
        private javax.swing.JPanel jPanel24;
        private javax.swing.JPanel jPanel26;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel9;

        private javax.swing.JSeparator jSeparator10;
        private javax.swing.JSeparator jSeparator11;
        private javax.swing.JSeparator jSeparator2;
        private javax.swing.JSeparator jSeparator7;
        private javax.swing.JSeparator jSeparator8;
        private javax.swing.JSeparator jSeparator9;
        private javax.swing.JPanel jPanel48;
        private javax.swing.JPanel jPanel51;
        private javax.swing.JPanel LoginViewCentrePanelCard;
        private javax.swing.JPanel jPanel50;
        private Profile profilPanel;
        private Ventilator ventilatorPanel;
        private FieldsSecurity fieldsSecurityPanel;
        private FieldsInformation fieldsInformationPanel;
        private Meteo meteoPanel;
        private SoilsCondition soilConditionPanel;
        private Login login;
        private SignUP signUPPanel;

}
