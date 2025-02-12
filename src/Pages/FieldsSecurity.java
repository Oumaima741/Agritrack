package Pages;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Graphic.Radar;

public class FieldsSecurity extends JPanel {

        JPanel SecurityNordPanel3 = new javax.swing.JPanel();
        JPanel jPanel43Security = new javax.swing.JPanel();
        JLabel jLabel17Security = new javax.swing.JLabel();
        JPanel jPanel44Security = new javax.swing.JPanel();
        JPanel SecurityPanel = new javax.swing.JPanel();
        JPanel jPanel45Security = new javax.swing.JPanel();
        java.awt.GridBagConstraints gridBagConstraints;

        public FieldsSecurity() {
                super();
                // Security View

                this.setBackground(new java.awt.Color(0, 102, 102));
                this.setLayout(new java.awt.BorderLayout());

                SecurityNordPanel3.setLayout(
                                new javax.swing.BoxLayout(SecurityNordPanel3, javax.swing.BoxLayout.LINE_AXIS));

                jPanel43Security.setBackground(new java.awt.Color(153, 153, 153));

                jLabel17Security.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel17Security.setText("Sécurité");

                javax.swing.GroupLayout jPanel43SecurityLayout = new javax.swing.GroupLayout(jPanel43Security);
                jPanel43Security.setLayout(jPanel43SecurityLayout);
                jPanel43SecurityLayout.setHorizontalGroup(
                                jPanel43SecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel43SecurityLayout.createSequentialGroup()
                                                                .addGap(120, 120, 120)
                                                                .addComponent(jLabel17Security)
                                                                .addContainerGap(803, Short.MAX_VALUE)));
                jPanel43SecurityLayout.setVerticalGroup(
                                jPanel43SecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel43SecurityLayout.createSequentialGroup()
                                                                                .addContainerGap(20, Short.MAX_VALUE)
                                                                                .addComponent(jLabel17Security)
                                                                                .addGap(20, 20, 20)));

                SecurityNordPanel3.add(jPanel43Security);

                this.add(SecurityNordPanel3, java.awt.BorderLayout.PAGE_START);

                javax.swing.GroupLayout jPanel44SecurityLayout = new javax.swing.GroupLayout(jPanel44Security);
                jPanel44Security.setLayout(jPanel44SecurityLayout);
                jPanel44SecurityLayout.setHorizontalGroup(
                                jPanel44SecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 1027, Short.MAX_VALUE));
                jPanel44SecurityLayout.setVerticalGroup(
                                jPanel44SecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                this.add(jPanel44Security, java.awt.BorderLayout.PAGE_END);

                SecurityPanel.setBackground(new java.awt.Color(0, 102, 102));
                SecurityPanel.setLayout(new java.awt.BorderLayout());

                jPanel45Security.setBackground(new java.awt.Color(0, 102, 102));
                jPanel45Security.setLayout(new java.awt.GridBagLayout());

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.ipadx = 68;
                gridBagConstraints.ipady = 24;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(35, 241, 107, 217);

                jPanel45Security.add(new Radar());

                SecurityPanel.add(jPanel45Security, java.awt.BorderLayout.CENTER);

                this.add(SecurityPanel, java.awt.BorderLayout.CENTER);

        }

}
