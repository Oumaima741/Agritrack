package Pages;

import javax.swing.JLabel;
import javax.swing.JPanel;

import User.User;

public class Profile extends JPanel {

        // JPanel ProfilPanel = new javax.swing.JPanel();
        JPanel MeteoNordPanel2 = new javax.swing.JPanel();
        JPanel jPanel30 = new javax.swing.JPanel();
        JLabel jLabel16 = new javax.swing.JLabel();
        JPanel jPanel31 = new javax.swing.JPanel();
        JPanel ProfilCentrePanel2 = new javax.swing.JPanel();
        JPanel jPanel32 = new javax.swing.JPanel();
        JPanel jPanel34 = new javax.swing.JPanel();
        JPanel IconNamePanel2 = new javax.swing.JPanel();
        JLabel jLabel19 = new javax.swing.JLabel();
        JPanel jPanel39 = new javax.swing.JPanel();
        JLabel MeteoCentreIcon14 = new javax.swing.JLabel();
        JPanel IconAdressPanel = new javax.swing.JPanel();
        JLabel jLabel18 = new javax.swing.JLabel();
        JPanel jPanel38 = new javax.swing.JPanel();
        JLabel MeteoCentreIcon13 = new javax.swing.JLabel();
        JPanel IconAdressPanel1 = new javax.swing.JPanel();
        JLabel jLabel20 = new javax.swing.JLabel();
        JPanel jPanel40 = new javax.swing.JPanel();
        JLabel MeteoCentreIcon15 = new javax.swing.JLabel();
        JPanel IconAdressPanel2 = new javax.swing.JPanel();
        JLabel jLabel21 = new javax.swing.JLabel();
        JPanel jPanel41 = new javax.swing.JPanel();
        JLabel MeteoCentreIcon16 = new javax.swing.JLabel();
        JPanel IconAdressPanel3 = new javax.swing.JPanel();
        JLabel jLabel22 = new javax.swing.JLabel();
        JPanel jPanel42 = new javax.swing.JPanel();
        JLabel MeteoCentreIcon17 = new javax.swing.JLabel();
        JPanel jPanel35 = new javax.swing.JPanel();
        JPanel jPanel36 = new javax.swing.JPanel();
        JPanel IconAdressPanelGSM = new javax.swing.JPanel();
        JLabel jLabel21GSM = new javax.swing.JLabel();
        JPanel jPanel41GSM = new javax.swing.JPanel();
        JLabel MeteoCentreIcon16GSM = new javax.swing.JLabel();

        public Profile() {
                super();

                this.setBackground(new java.awt.Color(0, 102, 102));
                this.setLayout(new java.awt.BorderLayout());

                MeteoNordPanel2.setLayout(new javax.swing.BoxLayout(MeteoNordPanel2, javax.swing.BoxLayout.LINE_AXIS));

                jPanel30.setBackground(new java.awt.Color(153, 153, 153));

                jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel16.setText("Profil");

                javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
                jPanel30.setLayout(jPanel30Layout);
                jPanel30Layout.setHorizontalGroup(
                                jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel30Layout.createSequentialGroup()
                                                                .addGap(120, 120, 120)
                                                                .addComponent(jLabel16)
                                                                .addContainerGap(815, Short.MAX_VALUE)));
                jPanel30Layout.setVerticalGroup(
                                jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel30Layout.createSequentialGroup()
                                                                                .addContainerGap(20, Short.MAX_VALUE)
                                                                                .addComponent(jLabel16)
                                                                                .addGap(20, 20, 20)));

                MeteoNordPanel2.add(jPanel30);

                this.add(MeteoNordPanel2, java.awt.BorderLayout.PAGE_START);

                javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
                jPanel31.setLayout(jPanel31Layout);
                jPanel31Layout.setHorizontalGroup(
                                jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 1027, Short.MAX_VALUE));
                jPanel31Layout.setVerticalGroup(
                                jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                this.add(jPanel31, java.awt.BorderLayout.PAGE_END);

                ProfilCentrePanel2.setBackground(new java.awt.Color(0, 102, 102));
                ProfilCentrePanel2.setLayout(new java.awt.BorderLayout());

                jPanel32.setBackground(new java.awt.Color(0, 102, 102));
                jPanel32.setLayout(new java.awt.GridBagLayout());

                jPanel34.setBackground(new java.awt.Color(0, 102, 102));
                jPanel34.setLayout(new java.awt.GridLayout(0, 1, 0, 30));

                IconNamePanel2.setBackground(new java.awt.Color(0, 102, 102));

                jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

                jPanel39.setBackground(new java.awt.Color(0, 102, 102));
                jPanel39.setLayout(new java.awt.BorderLayout(0, 10));

                MeteoCentreIcon14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                MeteoCentreIcon14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                MeteoCentreIcon14
                                .setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/user (1).png"))); // NOI18N
                MeteoCentreIcon14.setText("Nom ");
                MeteoCentreIcon14.setIconTextGap(20);
                jPanel39.add(MeteoCentreIcon14, java.awt.BorderLayout.CENTER);

                javax.swing.GroupLayout IconNamePanel2Layout = new javax.swing.GroupLayout(IconNamePanel2);
                IconNamePanel2.setLayout(IconNamePanel2Layout);
                IconNamePanel2Layout.setHorizontalGroup(
                                IconNamePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(IconNamePanel2Layout.createSequentialGroup()
                                                                .addComponent(jPanel39,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                194,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel19,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                295,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                IconNamePanel2Layout.setVerticalGroup(
                                IconNamePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(IconNamePanel2Layout.createSequentialGroup()
                                                                .addGap(0, 0, 0)
                                                                .addGroup(IconNamePanel2Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jPanel39,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel19,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(0, 0, 0)));

                jPanel34.add(IconNamePanel2);

                IconAdressPanel.setBackground(new java.awt.Color(0, 102, 102));

                jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

                jPanel38.setBackground(new java.awt.Color(0, 102, 102));
                jPanel38.setLayout(new java.awt.BorderLayout(0, 10));

                MeteoCentreIcon13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                MeteoCentreIcon13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                MeteoCentreIcon13.setIcon(
                                new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/location-pin (1).png"))); // NOI18N
                MeteoCentreIcon13.setText("Adresse");
                MeteoCentreIcon13.setIconTextGap(20);
                jPanel38.add(MeteoCentreIcon13, java.awt.BorderLayout.CENTER);

                javax.swing.GroupLayout IconAdressPanelLayout = new javax.swing.GroupLayout(IconAdressPanel);
                IconAdressPanel.setLayout(IconAdressPanelLayout);
                IconAdressPanelLayout.setHorizontalGroup(
                                IconAdressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(IconAdressPanelLayout.createSequentialGroup()
                                                                .addComponent(jPanel38,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                194,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel18,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                295,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                IconAdressPanelLayout.setVerticalGroup(
                                IconAdressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(IconAdressPanelLayout.createSequentialGroup()
                                                                .addGap(0, 0, 0)
                                                                .addGroup(IconAdressPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jPanel38,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel18,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(0, 0, 0)));

                jPanel34.add(IconAdressPanel);

                IconAdressPanel1.setBackground(new java.awt.Color(0, 102, 102));

                jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

                jPanel40.setBackground(new java.awt.Color(0, 102, 102));
                jPanel40.setLayout(new java.awt.BorderLayout(0, 10));

                MeteoCentreIcon15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                MeteoCentreIcon15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                MeteoCentreIcon15.setIcon(
                                new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/id-card (1).png"))); // NOI18N
                MeteoCentreIcon15.setText("CIN");
                MeteoCentreIcon15.setIconTextGap(20);
                jPanel40.add(MeteoCentreIcon15, java.awt.BorderLayout.CENTER);

                javax.swing.GroupLayout IconAdressPanel1Layout = new javax.swing.GroupLayout(IconAdressPanel1);
                IconAdressPanel1.setLayout(IconAdressPanel1Layout);
                IconAdressPanel1Layout.setHorizontalGroup(
                                IconAdressPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(IconAdressPanel1Layout.createSequentialGroup()
                                                                .addComponent(jPanel40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                194,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel20,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                295,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                IconAdressPanel1Layout.setVerticalGroup(
                                IconAdressPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(IconAdressPanel1Layout.createSequentialGroup()
                                                                .addGap(0, 0, 0)
                                                                .addGroup(IconAdressPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jPanel40,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel20,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(0, 0, 0)));

                jPanel34.add(IconAdressPanel1);

                IconAdressPanelGSM.setBackground(new java.awt.Color(0, 102, 102));

                jLabel21GSM.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel21GSM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                jLabel21GSM.setText("25. Janvier 2003");

                jPanel41GSM.setBackground(new java.awt.Color(0, 102, 102));
                jPanel41GSM.setLayout(new java.awt.BorderLayout(0, 10));

                MeteoCentreIcon16GSM.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                MeteoCentreIcon16GSM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                MeteoCentreIcon16GSM.setIcon(
                                new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/telephone-call.png"))); // NOI18N
                MeteoCentreIcon16GSM.setText("GSM");
                MeteoCentreIcon16GSM.setIconTextGap(20);
                jPanel41GSM.add(MeteoCentreIcon16GSM, java.awt.BorderLayout.CENTER);

                javax.swing.GroupLayout IconAdressPanel2GSMLayout = new javax.swing.GroupLayout(IconAdressPanelGSM);
                IconAdressPanelGSM.setLayout(IconAdressPanel2GSMLayout);
                IconAdressPanel2GSMLayout.setHorizontalGroup(
                                IconAdressPanel2GSMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(IconAdressPanel2GSMLayout.createSequentialGroup()
                                                                .addComponent(jPanel41GSM,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                194,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel21GSM,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                295,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                IconAdressPanel2GSMLayout.setVerticalGroup(
                                IconAdressPanel2GSMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(IconAdressPanel2GSMLayout.createSequentialGroup()
                                                                .addGap(0, 0, 0)
                                                                .addGroup(IconAdressPanel2GSMLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jPanel41GSM,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel21GSM,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(0, 0, 0)));

                jPanel34.add(IconAdressPanelGSM);

                IconAdressPanel2.setBackground(new java.awt.Color(0, 102, 102));

                jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

                jPanel41.setBackground(new java.awt.Color(0, 102, 102));
                jPanel41.setLayout(new java.awt.BorderLayout(0, 10));

                MeteoCentreIcon16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                MeteoCentreIcon16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                MeteoCentreIcon16.setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/date.png"))); // NOI18N
                MeteoCentreIcon16.setText("Date de Naissance");
                MeteoCentreIcon16.setIconTextGap(20);
                jPanel41.add(MeteoCentreIcon16, java.awt.BorderLayout.CENTER);

                javax.swing.GroupLayout IconAdressPanel2Layout = new javax.swing.GroupLayout(IconAdressPanel2);
                IconAdressPanel2.setLayout(IconAdressPanel2Layout);
                IconAdressPanel2Layout.setHorizontalGroup(
                                IconAdressPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(IconAdressPanel2Layout.createSequentialGroup()
                                                                .addComponent(jPanel41,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                194,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel21,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                295,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                IconAdressPanel2Layout.setVerticalGroup(
                                IconAdressPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(IconAdressPanel2Layout.createSequentialGroup()
                                                                .addGap(0, 0, 0)
                                                                .addGroup(IconAdressPanel2Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jPanel41,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel21,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(0, 0, 0)));

                jPanel34.add(IconAdressPanel2);

                IconAdressPanel3.setBackground(new java.awt.Color(0, 102, 102));

                jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

                jPanel42.setBackground(new java.awt.Color(0, 102, 102));
                jPanel42.setLayout(new java.awt.BorderLayout(0, 10));

                MeteoCentreIcon17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                MeteoCentreIcon17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                MeteoCentreIcon17
                                .setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/user (2).png"))); // NOI18N
                MeteoCentreIcon17.setText("Nom d'utilisateur");
                MeteoCentreIcon17.setIconTextGap(20);
                jPanel42.add(MeteoCentreIcon17, java.awt.BorderLayout.CENTER);

                javax.swing.GroupLayout IconAdressPanel3Layout = new javax.swing.GroupLayout(IconAdressPanel3);
                IconAdressPanel3.setLayout(IconAdressPanel3Layout);
                IconAdressPanel3Layout.setHorizontalGroup(
                                IconAdressPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(IconAdressPanel3Layout.createSequentialGroup()
                                                                .addComponent(jPanel42,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                194,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel22,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                295,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                IconAdressPanel3Layout.setVerticalGroup(
                                IconAdressPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(IconAdressPanel3Layout.createSequentialGroup()
                                                                .addGap(0, 0, 0)
                                                                .addGroup(IconAdressPanel3Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jPanel42,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel22,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(0, 0, 0)));

                jPanel34.add(IconAdressPanel3);

                jPanel32.add(jPanel34, new java.awt.GridBagConstraints());

                ProfilCentrePanel2.add(jPanel32, java.awt.BorderLayout.CENTER);

                jPanel35.setBackground(new java.awt.Color(0, 102, 102));
                jPanel35.setLayout(new javax.swing.BoxLayout(jPanel35, javax.swing.BoxLayout.LINE_AXIS));

                jPanel36.setBackground(new java.awt.Color(0, 102, 102));
                jPanel36.setLayout(new java.awt.BorderLayout(0, 10));
                jPanel35.add(jPanel36);

                ProfilCentrePanel2.add(jPanel35, java.awt.BorderLayout.SOUTH);

                this.add(ProfilCentrePanel2, java.awt.BorderLayout.CENTER);

        }

        public void updateUserInformations(User currentUser) {

                jLabel19.setText(currentUser.getName());

                jLabel20.setText(currentUser.getCIN());

                jLabel21GSM.setText(currentUser.getGsm());

                jLabel22.setText(currentUser.getUserName());

                jLabel18.setText(currentUser.getAdress());

                jLabel21.setText(currentUser.getDateOfBirth());

        }
}
