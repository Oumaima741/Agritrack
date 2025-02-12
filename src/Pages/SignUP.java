package Pages;

import java.awt.CardLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

import DB.DB;

import javax.swing.JPasswordField;

import javax.swing.JButton;

public class SignUP extends JPanel {

        JPanel jPanel51 = new javax.swing.JPanel();

        JLabel jLabel23 = new javax.swing.JLabel();

        JLabel userNameLabel = new javax.swing.JLabel();

        JTextField userNameInputField = new javax.swing.JTextField();

        JPasswordField jPasswordField1 = new javax.swing.JPasswordField();

        JPanel jPanel49SignUP = new javax.swing.JPanel();
        JPanel jPanel56SignUP = new javax.swing.JPanel();
        JPanel jPanel57SignUP = new javax.swing.JPanel();
        JLabel jLabel23SignUP = new javax.swing.JLabel();

        JPanel jPanel59SignUP = new javax.swing.JPanel();
        JPanel jPanel60SignUP = new javax.swing.JPanel();
        JLabel userNameLabelSignUP = new javax.swing.JLabel();

        JTextField userNameInputFieldSignUP = new javax.swing.JTextField();

        JPanel jPanel61SignUP = new javax.swing.JPanel();
        JPanel jPanel63SignUP = new javax.swing.JPanel();
        JLabel passWordLabelSignUP = new javax.swing.JLabel();

        JPanel jPanel67SignUP = new javax.swing.JPanel();
        JPanel jPanel69SignUP = new javax.swing.JPanel();
        JPanel jPanel70SignUP = new javax.swing.JPanel();
        JPanel jPanel71SignUP = new javax.swing.JPanel();

        JButton jButton5SignUP = new javax.swing.JButton();

        JPasswordField jPasswordField1SignUP = new javax.swing.JPasswordField();
        JTextField jInputField1SignUPGSM = new javax.swing.JTextField();

        JPanel jPanel61SignUPGSM = new javax.swing.JPanel();
        JPanel jPanel63SignUPGSM = new javax.swing.JPanel();
        JLabel passWordLabelSignUPGSM = new javax.swing.JLabel();

        JTextField jInputField1SignUPCIN = new javax.swing.JTextField();

        JPanel jPanel61SignUPCIN = new javax.swing.JPanel();
        JPanel jPanel63SignUPCIN = new javax.swing.JPanel();
        JLabel passWordLabelSignUPCIN = new javax.swing.JLabel();

        JTextField jInputField1SignUPName = new javax.swing.JTextField();

        JPanel jPanel61SignUPName = new javax.swing.JPanel();

        JPanel jPanel63SignUPName = new javax.swing.JPanel();

        JLabel passWordLabelSignUPName = new javax.swing.JLabel();

        JTextField jInputField1SignUPAdress = new javax.swing.JTextField();

        JPanel jPanel61SignUPAdress = new javax.swing.JPanel();

        JPanel jPanel63SignUPAdress = new javax.swing.JPanel();

        JLabel passWordLabelSignUPAdress = new javax.swing.JLabel();

        JTextField jInputField1SignUPDateOfBirth = new javax.swing.JTextField();

        JPanel jPanel61SignUPDateOfBirth = new javax.swing.JPanel();

        JPanel jPanel63SignUPDateOfBirth = new javax.swing.JPanel();

        JLabel passWordLabelSignUPDateOfBirth = new javax.swing.JLabel();

        CardLayout cardLayoutLoginViewCrad;

        JPanel loginViewCentrePanel;

        java.awt.GridBagConstraints gridBagConstraints;

        public SignUP() {
                super();
                // jPanelLogin.setLayout(new java.awt.GridLayout(1, 0));

                // SignUP Form

                this.setBackground(new java.awt.Color(0, 102, 102));

                jPanel49SignUP.setBackground(new java.awt.Color(0, 102, 102));
                jPanel49SignUP.setLayout(new java.awt.GridLayout(0, 1));

                jPanel56SignUP.setMinimumSize(new java.awt.Dimension(10, 23));
                jPanel56SignUP.setOpaque(false);
                jPanel56SignUP.setLayout(new java.awt.GridBagLayout());

                jPanel57SignUP.setBackground(new java.awt.Color(0, 102, 102));
                jPanel57SignUP.setMaximumSize(new java.awt.Dimension(50000, 50000));
                jPanel57SignUP.setOpaque(false);
                jPanel57SignUP.setPreferredSize(new java.awt.Dimension(763, 75));
                jPanel57SignUP.setLayout(new java.awt.GridBagLayout());

                jLabel23SignUP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel23SignUP.setText("Sign UP");
                jPanel57SignUP.add(jLabel23SignUP, new java.awt.GridBagConstraints());

                jPanel56SignUP.add(jPanel57SignUP, new java.awt.GridBagConstraints());

                jPanel49SignUP.add(jPanel56SignUP);

                jPanel59SignUP.setBackground(new java.awt.Color(0, 102, 102));
                jPanel59SignUP.setOpaque(false);
                jPanel59SignUP.setLayout(new java.awt.GridBagLayout());

                jPanel60SignUP.setOpaque(false);
                jPanel60SignUP.setPreferredSize(new java.awt.Dimension(400, 75));

                userNameLabelSignUP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                userNameLabelSignUP.setText("Nom d'utilisateur");

                javax.swing.GroupLayout jPanel60LayoutSignUP = new javax.swing.GroupLayout(jPanel60SignUP);
                jPanel60SignUP.setLayout(jPanel60LayoutSignUP);
                jPanel60LayoutSignUP.setHorizontalGroup(
                                jPanel60LayoutSignUP.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel60LayoutSignUP.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(userNameLabelSignUP,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(userNameInputFieldSignUP,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                159,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(29, Short.MAX_VALUE)));
                jPanel60LayoutSignUP.setVerticalGroup(
                                jPanel60LayoutSignUP.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel60LayoutSignUP
                                                                                .createSequentialGroup()
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel60LayoutSignUP
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(userNameLabelSignUP)
                                                                                                .addComponent(userNameInputFieldSignUP,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(26, 26, 26)));

                jPanel59SignUP.add(jPanel60SignUP, new java.awt.GridBagConstraints());

                jPanel49SignUP.add(jPanel59SignUP);

                jPanel61SignUP.setBackground(new java.awt.Color(0, 102, 102));
                jPanel61SignUP.setOpaque(false);
                jPanel61SignUP.setLayout(new java.awt.GridBagLayout());

                jPanel63SignUP.setOpaque(false);
                jPanel63SignUP.setPreferredSize(new java.awt.Dimension(400, 75));

                passWordLabelSignUP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                passWordLabelSignUP.setText("Mot de passe");

                javax.swing.GroupLayout jPanel63LayoutSignUP = new javax.swing.GroupLayout(jPanel63SignUP);
                jPanel63SignUP.setLayout(jPanel63LayoutSignUP);
                jPanel63LayoutSignUP.setHorizontalGroup(
                                jPanel63LayoutSignUP.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel63LayoutSignUP.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(passWordLabelSignUP,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPasswordField1SignUP,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                159,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(29, Short.MAX_VALUE)));
                jPanel63LayoutSignUP.setVerticalGroup(
                                jPanel63LayoutSignUP.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel63LayoutSignUP
                                                                                .createSequentialGroup()
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel63LayoutSignUP
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(passWordLabelSignUP)
                                                                                                .addComponent(jPasswordField1SignUP,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(26, 26, 26)));

                jPanel61SignUP.add(jPanel63SignUP, new java.awt.GridBagConstraints());

                jPanel49SignUP.add(jPanel61SignUP);

                jPanel61SignUPGSM.setBackground(new java.awt.Color(0, 102, 102));
                jPanel61SignUPGSM.setOpaque(false);
                jPanel61SignUPGSM.setLayout(new java.awt.GridBagLayout());

                jPanel63SignUPGSM.setOpaque(false);
                jPanel63SignUPGSM.setPreferredSize(new java.awt.Dimension(400, 75));

                passWordLabelSignUPGSM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                passWordLabelSignUPGSM.setText("GSM");

                javax.swing.GroupLayout jPanel63LayoutSignUPGSM = new javax.swing.GroupLayout(jPanel63SignUPGSM);
                jPanel63SignUPGSM.setLayout(jPanel63LayoutSignUPGSM);
                jPanel63LayoutSignUPGSM.setHorizontalGroup(
                                jPanel63LayoutSignUPGSM.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel63LayoutSignUPGSM.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(passWordLabelSignUPGSM,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jInputField1SignUPGSM,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                159,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(29, Short.MAX_VALUE)));
                jPanel63LayoutSignUPGSM.setVerticalGroup(
                                jPanel63LayoutSignUPGSM.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel63LayoutSignUPGSM
                                                                                .createSequentialGroup()
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel63LayoutSignUPGSM
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(passWordLabelSignUPGSM)
                                                                                                .addComponent(jInputField1SignUPGSM,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(26, 26, 26)));

                jPanel61SignUPGSM.add(jPanel63SignUPGSM, new java.awt.GridBagConstraints());

                jPanel49SignUP.add(jPanel61SignUPGSM);

                jPanel61SignUPCIN.setBackground(new java.awt.Color(0, 102, 102));
                jPanel61SignUPCIN.setOpaque(false);
                jPanel61SignUPCIN.setLayout(new java.awt.GridBagLayout());

                jPanel63SignUPCIN.setOpaque(false);
                jPanel63SignUPCIN.setPreferredSize(new java.awt.Dimension(400, 75));

                passWordLabelSignUPCIN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                passWordLabelSignUPCIN.setText("CIN");

                javax.swing.GroupLayout jPanel63LayoutSignUPCIN = new javax.swing.GroupLayout(jPanel63SignUPCIN);
                jPanel63SignUPCIN.setLayout(jPanel63LayoutSignUPCIN);
                jPanel63LayoutSignUPCIN.setHorizontalGroup(
                                jPanel63LayoutSignUPCIN
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel63LayoutSignUPCIN.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(passWordLabelSignUPCIN,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jInputField1SignUPCIN,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                159,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(29, Short.MAX_VALUE)));
                jPanel63LayoutSignUPCIN.setVerticalGroup(
                                jPanel63LayoutSignUPCIN.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel63LayoutSignUPCIN
                                                                                .createSequentialGroup()
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel63LayoutSignUPCIN
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(passWordLabelSignUPCIN)
                                                                                                .addComponent(jInputField1SignUPCIN,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(26, 26, 26)));

                jPanel61SignUPCIN.add(jPanel63SignUPCIN, new java.awt.GridBagConstraints());

                jPanel49SignUP.add(jPanel61SignUPCIN);

                jPanel61SignUPName.setBackground(new java.awt.Color(0, 102, 102));
                jPanel61SignUPName.setOpaque(false);
                jPanel61SignUPName.setLayout(new java.awt.GridBagLayout());

                jPanel63SignUPName.setOpaque(false);
                jPanel63SignUPName.setPreferredSize(new java.awt.Dimension(400, 75));

                passWordLabelSignUPName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                passWordLabelSignUPName.setText("Nom");

                javax.swing.GroupLayout jPanel63LayoutSignUPName = new javax.swing.GroupLayout(jPanel63SignUPName);
                jPanel63SignUPName.setLayout(jPanel63LayoutSignUPName);
                jPanel63LayoutSignUPName.setHorizontalGroup(
                                jPanel63LayoutSignUPName
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel63LayoutSignUPName.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(passWordLabelSignUPName,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jInputField1SignUPName,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                159,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(29, Short.MAX_VALUE)));
                jPanel63LayoutSignUPName.setVerticalGroup(
                                jPanel63LayoutSignUPName.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel63LayoutSignUPName
                                                                                .createSequentialGroup()
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel63LayoutSignUPName
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(passWordLabelSignUPName)
                                                                                                .addComponent(jInputField1SignUPName,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(26, 26, 26)));

                jPanel61SignUPName.add(jPanel63SignUPName, new java.awt.GridBagConstraints());

                jPanel49SignUP.add(jPanel61SignUPName);

                jPanel61SignUPAdress.setBackground(new java.awt.Color(0, 102, 102));
                jPanel61SignUPAdress.setOpaque(false);
                jPanel61SignUPAdress.setLayout(new java.awt.GridBagLayout());

                jPanel63SignUPAdress.setOpaque(false);
                jPanel63SignUPAdress.setPreferredSize(new java.awt.Dimension(400, 75));

                passWordLabelSignUPAdress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                passWordLabelSignUPAdress.setText("Adresse");

                javax.swing.GroupLayout jPanel63LayoutSignUPAdress = new javax.swing.GroupLayout(jPanel63SignUPAdress);
                jPanel63SignUPAdress.setLayout(jPanel63LayoutSignUPAdress);
                jPanel63LayoutSignUPAdress.setHorizontalGroup(
                                jPanel63LayoutSignUPAdress
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel63LayoutSignUPAdress.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(passWordLabelSignUPAdress,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jInputField1SignUPAdress,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                159,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(29, Short.MAX_VALUE)));
                jPanel63LayoutSignUPAdress.setVerticalGroup(
                                jPanel63LayoutSignUPAdress
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel63LayoutSignUPAdress
                                                                                .createSequentialGroup()
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel63LayoutSignUPAdress
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(passWordLabelSignUPAdress)
                                                                                                .addComponent(jInputField1SignUPAdress,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(26, 26, 26)));

                jPanel61SignUPAdress.add(jPanel63SignUPAdress, new java.awt.GridBagConstraints());

                jPanel49SignUP.add(jPanel61SignUPAdress);

                jPanel61SignUPDateOfBirth.setBackground(new java.awt.Color(0, 102, 102));
                jPanel61SignUPDateOfBirth.setOpaque(false);
                jPanel61SignUPDateOfBirth.setLayout(new java.awt.GridBagLayout());

                jPanel63SignUPDateOfBirth.setOpaque(false);
                jPanel63SignUPDateOfBirth.setPreferredSize(new java.awt.Dimension(400, 75));

                passWordLabelSignUPDateOfBirth.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                passWordLabelSignUPDateOfBirth.setText("Date de Naissance");

                javax.swing.GroupLayout jPanel63LayoutSignUPDateOfBirth = new javax.swing.GroupLayout(
                                jPanel63SignUPDateOfBirth);
                jPanel63SignUPDateOfBirth.setLayout(jPanel63LayoutSignUPDateOfBirth);
                jPanel63LayoutSignUPDateOfBirth.setHorizontalGroup(
                                jPanel63LayoutSignUPDateOfBirth
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel63LayoutSignUPDateOfBirth.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(passWordLabelSignUPDateOfBirth,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jInputField1SignUPDateOfBirth,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                159,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(29, Short.MAX_VALUE)));
                jPanel63LayoutSignUPDateOfBirth.setVerticalGroup(
                                jPanel63LayoutSignUPDateOfBirth
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel63LayoutSignUPDateOfBirth
                                                                                .createSequentialGroup()
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel63LayoutSignUPDateOfBirth
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(passWordLabelSignUPDateOfBirth)
                                                                                                .addComponent(jInputField1SignUPDateOfBirth,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(26, 26, 26)));

                jPanel61SignUPDateOfBirth.add(jPanel63SignUPDateOfBirth, new java.awt.GridBagConstraints());

                jPanel49SignUP.add(jPanel61SignUPDateOfBirth);

                jPanel67SignUP.setBackground(new java.awt.Color(0, 102, 102));
                jPanel67SignUP.setMinimumSize(new java.awt.Dimension(10, 23));
                jPanel67SignUP.setOpaque(false);
                jPanel67SignUP.setLayout(new java.awt.GridBagLayout());

                jPanel69SignUP.setBackground(new java.awt.Color(0, 102, 102));
                jPanel69SignUP.setOpaque(false);
                jPanel69SignUP.setLayout(new java.awt.GridBagLayout());

                jPanel70SignUP.setBackground(new java.awt.Color(102, 255, 102));
                jPanel70SignUP.setMaximumSize(new java.awt.Dimension(50000, 50000));
                jPanel70SignUP.setOpaque(false);
                jPanel70SignUP.setPreferredSize(new java.awt.Dimension(763, 75));
                jPanel70SignUP.setLayout(new java.awt.GridBagLayout());

                jPanel71SignUP.setOpaque(false);
                jPanel71SignUP.setPreferredSize(new java.awt.Dimension(400, 75));

                jButton5SignUP.setLabel("S'inscrire");
                jButton5SignUP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5SignUPActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel71LayoutSignUP = new javax.swing.GroupLayout(jPanel71SignUP);
                jPanel71SignUP.setLayout(jPanel71LayoutSignUP);
                jPanel71LayoutSignUP.setHorizontalGroup(
                                jPanel71LayoutSignUP.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel71LayoutSignUP.createSequentialGroup()
                                                                .addContainerGap(120, Short.MAX_VALUE)
                                                                .addComponent(jButton5SignUP,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                160,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(120, Short.MAX_VALUE)));
                jPanel71LayoutSignUP.setVerticalGroup(
                                jPanel71LayoutSignUP.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel71LayoutSignUP.createSequentialGroup()
                                                                .addComponent(jButton5SignUP,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));

                jPanel70SignUP.add(jPanel71SignUP, new java.awt.GridBagConstraints());

                jPanel69SignUP.add(jPanel70SignUP, new java.awt.GridBagConstraints());

                jPanel49SignUP.add(jPanel69SignUP);
                // jPanel49.add(jPanel69);

                this.add(jPanel49SignUP);

        }

        public void setCardLayoutLoginViewCard(CardLayout c) {
                this.cardLayoutLoginViewCrad = c;
        }

        public void setLoginViewCentrePanel(JPanel l) {
                this.loginViewCentrePanel = l;
        }

        private void jButton5SignUPActionPerformed(java.awt.event.ActionEvent evt) {

                String gsm = jInputField1SignUPGSM.getText();
                String name = jInputField1SignUPName.getText();
                String userName = userNameInputFieldSignUP.getText();
                String password = new String(jPasswordField1SignUP.getPassword());
                String cin = jInputField1SignUPCIN.getText();
                String adress = jInputField1SignUPAdress.getText();
                String dateOfBirth = jInputField1SignUPDateOfBirth.getText();

                boolean userAdded = DB.addNewUser(gsm, name, userName, password, cin, adress, dateOfBirth);
                if (userAdded) {
                        JOptionPane.showMessageDialog(this,
                                        "Votre compte est enregistré avec succès.",
                                        "Succès",
                                        JOptionPane.INFORMATION_MESSAGE);
                        cardLayoutLoginViewCrad.show(loginViewCentrePanel, "Login");
                } else {
                        JOptionPane.showMessageDialog(this,
                                        "Les données sont invalides!!",
                                        "Ups",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }
}
