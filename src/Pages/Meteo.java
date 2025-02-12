package Pages;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Meteo extends JPanel {

        // JPanel ProfilPanel = new javax.swing.JPanel();
        JPanel MeteoNordPanel = new javax.swing.JPanel();
        JPanel jPanel11 = new javax.swing.JPanel();
        JPanel jPanel8 = new javax.swing.JPanel();
        JPanel MeteoCentrePanel = new javax.swing.JPanel();
        JPanel jPanel23 = new javax.swing.JPanel();
        JPanel jPanel6 = new javax.swing.JPanel();
        JPanel jPanel10 = new javax.swing.JPanel();
        JPanel jPanel12 = new javax.swing.JPanel();
        JPanel jPanel14 = new javax.swing.JPanel();

        JLabel MeteoCentreIcon = new javax.swing.JLabel();
        JLabel jLabel3 = new javax.swing.JLabel();
        JLabel jLabel1 = new javax.swing.JLabel();
        JLabel MeteoCentreIcon1 = new javax.swing.JLabel();
        JLabel jLabel4 = new javax.swing.JLabel();
        JLabel MeteoCentreIcon2 = new javax.swing.JLabel();
        JLabel jLabel5 = new javax.swing.JLabel();
        JLabel MeteoCentreIcon3 = new javax.swing.JLabel();
        JLabel jLabel6 = new javax.swing.JLabel();

        JPanel jPanel13 = new javax.swing.JPanel();

        java.awt.GridBagConstraints gridBagConstraints;

        public Meteo() {
                super();

                this.setBackground(new java.awt.Color(0, 102, 102));
                this.setLayout(new java.awt.BorderLayout());

                MeteoNordPanel.setLayout(new javax.swing.BoxLayout(MeteoNordPanel, javax.swing.BoxLayout.LINE_AXIS));

                jPanel11.setBackground(new java.awt.Color(153, 153, 153));

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel3.setText("Meteo");

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                                .addGap(120, 120, 120)
                                                                .addComponent(jLabel3)
                                                                .addContainerGap(799, Short.MAX_VALUE)));
                jPanel11Layout.setVerticalGroup(
                                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel11Layout.createSequentialGroup()
                                                                                .addContainerGap(20, Short.MAX_VALUE)
                                                                                .addComponent(jLabel3)
                                                                                .addGap(20, 20, 20)));

                MeteoNordPanel.add(jPanel11);

                this.add(MeteoNordPanel, java.awt.BorderLayout.PAGE_START);

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(
                                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 1027, Short.MAX_VALUE));
                jPanel8Layout.setVerticalGroup(
                                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                this.add(jPanel8, java.awt.BorderLayout.PAGE_END);

                MeteoCentrePanel.setBackground(new java.awt.Color(0, 102, 102));
                MeteoCentrePanel.setLayout(new java.awt.BorderLayout());

                jPanel23.setBackground(new java.awt.Color(0, 102, 102));
                jPanel23.setLayout(new java.awt.GridBagLayout());

                jPanel6.setBackground(new java.awt.Color(0, 102, 102));
                jPanel6.setLayout(new java.awt.BorderLayout(0, 10));

                MeteoCentreIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                MeteoCentreIcon.setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/sun.png"))); // NOI18N
                jPanel6.add(MeteoCentreIcon, java.awt.BorderLayout.CENTER);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Ensoleillé");
                jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
                jPanel6.add(jLabel1, java.awt.BorderLayout.PAGE_END);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.ipadx = 68;
                gridBagConstraints.ipady = 24;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(35, 241, 107, 217);
                jPanel23.add(jPanel6, gridBagConstraints);

                MeteoCentrePanel.add(jPanel23, java.awt.BorderLayout.CENTER);

                jPanel10.setBackground(new java.awt.Color(0, 102, 102));
                jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

                jPanel12.setBackground(new java.awt.Color(0, 102, 102));
                jPanel12.setLayout(new java.awt.BorderLayout(0, 10));

                MeteoCentreIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                MeteoCentreIcon1.setIcon(
                                new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/humidity (2).png"))); // NOI18N
                jPanel12.add(MeteoCentreIcon1, java.awt.BorderLayout.CENTER);

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel4.setText("300 g/kg");
                jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
                jPanel12.add(jLabel4, java.awt.BorderLayout.PAGE_END);

                jPanel10.add(jPanel12);

                jPanel13.setBackground(new java.awt.Color(0, 102, 102));
                jPanel13.setLayout(new java.awt.BorderLayout(0, 10));

                MeteoCentreIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                MeteoCentreIcon2.setIcon(
                                new javax.swing.ImageIcon(
                                                HomeFrame.class.getResource("/Icons/temperature 64 - 2.png"))); // NOI18N
                jPanel13.add(MeteoCentreIcon2, java.awt.BorderLayout.CENTER);

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel5.setText("41°C");
                jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
                jPanel13.add(jLabel5, java.awt.BorderLayout.PAGE_END);

                jPanel10.add(jPanel13);

                jPanel14.setBackground(new java.awt.Color(0, 102, 102));
                jPanel14.setLayout(new java.awt.BorderLayout(0, 10));

                MeteoCentreIcon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                MeteoCentreIcon3.setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/wind (2).png"))); // NOI18N
                jPanel14.add(MeteoCentreIcon3, java.awt.BorderLayout.CENTER);

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel6.setText("5  km/h");
                jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
                jPanel14.add(jLabel6, java.awt.BorderLayout.PAGE_END);

                jPanel10.add(jPanel14);

                MeteoCentrePanel.add(jPanel10, java.awt.BorderLayout.SOUTH);

                this.add(MeteoCentrePanel, java.awt.BorderLayout.CENTER);

        }

        public void setTemperaturAndHumidity(int temperatur, int humidity) {
                jLabel5.setText(temperatur + " °C");
                // Set the Image of weather
                if (temperatur > 20) {
                        MeteoCentreIcon.setIcon(
                                        new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/sun.png")));

                        jLabel1.setText("Ensoleillé");

                } else {
                        MeteoCentreIcon.setIcon(
                                        new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/cloudy2.png")));

                        jLabel1.setText("Nuageux");
                }
                jLabel4.setText(humidity + " g/kg");

        }

}
