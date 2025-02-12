package Pages;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventilator extends JPanel {

        // JPanel ProfilPanel = new javax.swing.JPanel();
        JPanel MeteoNordPanel3 = new javax.swing.JPanel();
        JPanel jPanel43 = new javax.swing.JPanel();
        JLabel jLabel17 = new javax.swing.JLabel();
        JPanel jPanel31 = new javax.swing.JPanel();
        JPanel jPanel44 = new javax.swing.JPanel();
        JPanel jPanel47 = new javax.swing.JPanel();
        JPanel jPanel46 = new javax.swing.JPanel();
        JPanel jPanel45 = new javax.swing.JPanel();
        JLabel MeteoCentreIcon7 = new javax.swing.JLabel();
        JPanel jPanelCenter = new javax.swing.JPanel();
        JButton jButton1 = new javax.swing.JButton();
        JButton jButton2 = new javax.swing.JButton();
        java.awt.GridBagConstraints gridBagConstraints;

        public Ventilator() {
                super();

                this.setBackground(new java.awt.Color(0, 102, 102));
                this.setLayout(new java.awt.BorderLayout());

                MeteoNordPanel3.setLayout(new javax.swing.BoxLayout(MeteoNordPanel3, javax.swing.BoxLayout.LINE_AXIS));

                jPanel43.setBackground(new java.awt.Color(153, 153, 153));

                jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel17.setText("Ventilateur");

                javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
                jPanel43.setLayout(jPanel43Layout);
                jPanel43Layout.setHorizontalGroup(
                                jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel43Layout.createSequentialGroup()
                                                                .addGap(120, 120, 120)
                                                                .addComponent(jLabel17)
                                                                .addContainerGap(803, Short.MAX_VALUE)));
                jPanel43Layout.setVerticalGroup(
                                jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel43Layout.createSequentialGroup()
                                                                                .addContainerGap(20, Short.MAX_VALUE)
                                                                                .addComponent(jLabel17)
                                                                                .addGap(20, 20, 20)));

                MeteoNordPanel3.add(jPanel43);

                this.add(MeteoNordPanel3, java.awt.BorderLayout.PAGE_START);

                javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
                jPanel44.setLayout(jPanel44Layout);
                jPanel44Layout.setHorizontalGroup(
                                jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 1027, Short.MAX_VALUE));
                jPanel44Layout.setVerticalGroup(
                                jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                this.add(jPanel44, java.awt.BorderLayout.PAGE_END);

                jPanelCenter.setBackground(new java.awt.Color(0, 102, 102));
                jPanelCenter.setLayout(new java.awt.BorderLayout());

                jPanel45.setBackground(new java.awt.Color(0, 102, 102));
                jPanel45.setLayout(new java.awt.GridBagLayout());

                jPanel46.setBackground(new java.awt.Color(0, 102, 102));
                jPanel46.setLayout(new java.awt.BorderLayout());

                MeteoCentreIcon7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                MeteoCentreIcon7.setIcon(
                                new javax.swing.ImageIcon(HomeFrame.class.getResource("/Icons/pump.png"))); // NOI18N
                jPanel46.add(MeteoCentreIcon7, java.awt.BorderLayout.CENTER);

                jPanel47.setLayout(new java.awt.GridLayout(1, 0));

                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton1.setText("Activer");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                jPanel47.add(jButton1);

                jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton2.setText("Désactiver");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });
                jPanel47.add(jButton2);

                jPanel46.add(jPanel47, java.awt.BorderLayout.NORTH);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.ipadx = 68;
                gridBagConstraints.ipady = 24;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(35, 241, 107, 217);
                jPanel45.add(jPanel46, gridBagConstraints);

                jPanelCenter.add(jPanel45, java.awt.BorderLayout.CENTER);

                this.add(jPanelCenter, java.awt.BorderLayout.CENTER);

        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

                JOptionPane.showMessageDialog(this,
                                "Le ventilateur est activé avec succès. \nLa vitesse de retation: 5800 tr/min.",
                                "Activé",
                                JOptionPane.INFORMATION_MESSAGE);
        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

                JOptionPane.showMessageDialog(this,
                                "Le ventilateur est desactivé avec succès.",
                                "Désactivé",
                                JOptionPane.INFORMATION_MESSAGE);
        }
}
