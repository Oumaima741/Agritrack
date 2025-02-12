package Pages;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoilsCondition extends JPanel {

        JPanel MeteoNordPanel1 = new javax.swing.JPanel();
        JPanel jPanel15 = new javax.swing.JPanel();
        JPanel jPanel25 = new javax.swing.JPanel();
        JPanel MeteoCentrePanel1 = new javax.swing.JPanel();
        JPanel jPanel28 = new javax.swing.JPanel();
        JPanel jPanel29 = new javax.swing.JPanel();

        JPanel jPanel27 = new javax.swing.JPanel();
        JPanel jPanel33 = new javax.swing.JPanel();

        JLabel jLabel14 = new javax.swing.JLabel();
        JLabel MeteoCentreIcon6 = new javax.swing.JLabel();
        JLabel jLabel15 = new javax.swing.JLabel();
        JLabel humidityLabel = new javax.swing.JLabel();

        java.awt.GridBagConstraints gridBagConstraints;

        public SoilsCondition() {
                super();
                this.setBackground(new java.awt.Color(0, 102, 102));
                this.setLayout(new java.awt.BorderLayout());

                MeteoNordPanel1.setLayout(new javax.swing.BoxLayout(MeteoNordPanel1, javax.swing.BoxLayout.LINE_AXIS));

                jPanel15.setBackground(new java.awt.Color(153, 153, 153));

                jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel14.setText("Etat du Sol");

                javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
                jPanel15.setLayout(jPanel15Layout);
                jPanel15Layout.setHorizontalGroup(
                                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel15Layout.createSequentialGroup()
                                                                .addGap(120, 120, 120)
                                                                .addComponent(jLabel14)
                                                                .addContainerGap(725, Short.MAX_VALUE)));
                jPanel15Layout.setVerticalGroup(
                                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel15Layout.createSequentialGroup()
                                                                                .addContainerGap(20, Short.MAX_VALUE)
                                                                                .addComponent(jLabel14)
                                                                                .addGap(20, 20, 20)));

                MeteoNordPanel1.add(jPanel15);

                this.add(MeteoNordPanel1, java.awt.BorderLayout.PAGE_START);

                javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
                jPanel25.setLayout(jPanel25Layout);
                jPanel25Layout.setHorizontalGroup(
                                jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 1027, Short.MAX_VALUE));
                jPanel25Layout.setVerticalGroup(
                                jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                this.add(jPanel25, java.awt.BorderLayout.PAGE_END);

                MeteoCentrePanel1.setBackground(new java.awt.Color(0, 102, 102));
                MeteoCentrePanel1.setLayout(new java.awt.BorderLayout());

                jPanel27.setBackground(new java.awt.Color(0, 102, 102));
                jPanel27.setLayout(new java.awt.GridBagLayout());

                jPanel28.setBackground(new java.awt.Color(0, 102, 102));
                jPanel28.setLayout(new java.awt.BorderLayout(0, 10));

                MeteoCentreIcon6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                MeteoCentreIcon6.setIcon(new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/crying.png"))); // NOI18N
                jPanel28.add(MeteoCentreIcon6, java.awt.BorderLayout.CENTER);

                jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel15.setText("Sol Sec");
                jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
                jPanel28.add(jLabel15, java.awt.BorderLayout.PAGE_END);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.ipadx = 68;
                gridBagConstraints.ipady = 24;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(35, 241, 107, 217);
                jPanel27.add(jPanel28, gridBagConstraints);

                MeteoCentrePanel1.add(jPanel27, java.awt.BorderLayout.CENTER);

                jPanel29.setBackground(new java.awt.Color(0, 102, 102));
                jPanel29.setLayout(new javax.swing.BoxLayout(jPanel29, javax.swing.BoxLayout.LINE_AXIS));

                jPanel33.setBackground(new java.awt.Color(0, 102, 102));
                jPanel33.setLayout(new java.awt.BorderLayout(0, 10));

                humidityLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                humidityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                humidityLabel.setIcon(
                                new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/soil-analysis.png"))); // NOI18N
                humidityLabel.setText("Moisiture du sol: 00%");
                humidityLabel.setIconTextGap(20);
                jPanel33.add(humidityLabel, java.awt.BorderLayout.CENTER);

                jPanel29.add(jPanel33);

                MeteoCentrePanel1.add(jPanel29, java.awt.BorderLayout.SOUTH);

                this.add(MeteoCentrePanel1, java.awt.BorderLayout.CENTER);
        }

        public void setHumidityTextAndIcon(int humidity) {
                humidityLabel.setText("Moisiture du sol: " + humidity + "%");
                // Set the Image of Soil Humidity
                if (humidity > 0) {
                        MeteoCentreIcon6.setIcon(
                                        new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/smiling.png")));
                        jLabel15.setText("Sol Humide");
                } else {
                        MeteoCentreIcon6.setIcon(
                                        new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/crying.png")));
                        jLabel15.setText("Sol Sec");

                }

        }

}
