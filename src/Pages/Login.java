package Pages;

import java.awt.CardLayout;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

import DB.DB;

import javax.swing.JPasswordField;

import javax.swing.JButton;

public class Login extends JPanel {

        // JPanel ProfilPanel = new javax.swing.JPanel();
        JPanel jPanel51 = new javax.swing.JPanel();
        JPanel jPanel48 = new javax.swing.JPanel();
        JLabel LoginViewIcon = new javax.swing.JLabel();

        JLabel jLabel23 = new javax.swing.JLabel();

        JLabel userNameLabel = new javax.swing.JLabel();

        JTextField userNameInputField = new javax.swing.JTextField();

        JPasswordField jPasswordField1 = new javax.swing.JPasswordField();

        JPanel LoginViewCentrePanel = new javax.swing.JPanel();

        JPanel LoginViewCentrePanelCard = new javax.swing.JPanel();

        JPanel jPanel49 = new javax.swing.JPanel();

        JPanel jPanel56 = new javax.swing.JPanel();

        JPanel jPanel57 = new javax.swing.JPanel();

        JPanel jPanel58 = new javax.swing.JPanel();

        JPanel jPanel59 = new javax.swing.JPanel();

        JPanel jPanel60 = new javax.swing.JPanel();

        JPanel jPanel61 = new javax.swing.JPanel();

        JPanel jPanel63 = new javax.swing.JPanel();

        JPanel jPanel64 = new javax.swing.JPanel();

        JPanel jPanel67 = new javax.swing.JPanel();

        JPanel jPanel66 = new javax.swing.JPanel();

        JPanel jPanel68 = new javax.swing.JPanel();

        JPanel jPanel69 = new javax.swing.JPanel();

        JPanel jPanel70 = new javax.swing.JPanel();

        JPanel jPanel71 = new javax.swing.JPanel();

        Profile profilPanel;

        JLabel jLabel24 = new javax.swing.JLabel();

        JButton jButton3 = new javax.swing.JButton();

        JButton jButton4 = new javax.swing.JButton();

        JButton jButton5 = new javax.swing.JButton();

        JLabel passWordLabel = new javax.swing.JLabel();

        CardLayout cardLayoutLoginViewCrad;

        CardLayout cardLayoutForPanelRoot;

        JPanel signUpViewCentrePanel;

        JPanel jPanelRoot;

        java.awt.GridBagConstraints gridBagConstraints;

        public Login() {
                super();
                // jPanelLogin.setLayout(new java.awt.GridLayout(1, 0));

                // Login Form

                jPanel49.setBackground(new java.awt.Color(0, 102, 102));
                jPanel49.setLayout(new java.awt.GridLayout(0, 1));

                jPanel56.setMinimumSize(new java.awt.Dimension(10, 23));
                jPanel56.setOpaque(false);
                jPanel56.setLayout(new java.awt.GridBagLayout());

                jPanel57.setBackground(new java.awt.Color(0, 102, 102));
                jPanel57.setMaximumSize(new java.awt.Dimension(50000, 50000));
                jPanel57.setOpaque(false);
                jPanel57.setPreferredSize(new java.awt.Dimension(763, 75));
                jPanel57.setLayout(new java.awt.GridBagLayout());

                jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel23.setText("Bonjour! Veuillez vous connecter");
                jPanel57.add(jLabel23, new java.awt.GridBagConstraints());

                jPanel56.add(jPanel57, new java.awt.GridBagConstraints());

                jPanel49.add(jPanel56);

                jPanel58.setBackground(new java.awt.Color(0, 102, 102));
                jPanel58.setOpaque(false);
                jPanel58.setLayout(new java.awt.GridBagLayout());

                jPanel59.setBackground(new java.awt.Color(0, 102, 102));
                jPanel59.setMaximumSize(new java.awt.Dimension(50000, 50000));
                jPanel59.setOpaque(false);
                jPanel59.setPreferredSize(new java.awt.Dimension(763, 75));
                jPanel59.setLayout(new java.awt.GridBagLayout());

                jPanel60.setOpaque(false);
                jPanel60.setPreferredSize(new java.awt.Dimension(400, 75));

                userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                userNameLabel.setText("Nom d'utilisateur");

                userNameInputField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                userNameInputField.setToolTipText("11");
                userNameInputField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                // userNameInputFieldActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
                jPanel60.setLayout(jPanel60Layout);
                jPanel60Layout.setHorizontalGroup(
                                jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel60Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(userNameLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(userNameInputField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                159,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(29, Short.MAX_VALUE)));
                jPanel60Layout.setVerticalGroup(
                                jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel60Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(userNameLabel)
                                                                                .addComponent(userNameInputField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(26, 26, 26)));

                jPanel59.add(jPanel60, new java.awt.GridBagConstraints());

                jPanel58.add(jPanel59, new java.awt.GridBagConstraints());

                jPanel49.add(jPanel58);

                jPanel61.setBackground(new java.awt.Color(0, 102, 102));
                jPanel61.setOpaque(false);
                jPanel61.setLayout(new java.awt.GridBagLayout());

                jPanel63.setOpaque(false);
                jPanel63.setPreferredSize(new java.awt.Dimension(400, 75));

                passWordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                passWordLabel.setText("Mot de passe");

                javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
                jPanel63.setLayout(jPanel63Layout);
                jPanel63Layout.setHorizontalGroup(
                                jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel63Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(passWordLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPasswordField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                159,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(29, Short.MAX_VALUE)));
                jPanel63Layout.setVerticalGroup(
                                jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel63Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel63Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(passWordLabel)
                                                                                .addComponent(jPasswordField1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(26, 26, 26)));

                jPanel61.add(jPanel63, new java.awt.GridBagConstraints());

                jPanel49.add(jPanel61);

                jPanel64.setBackground(new java.awt.Color(255, 255, 51));
                jPanel64.setOpaque(false);
                jPanel64.setLayout(new java.awt.GridBagLayout());

                jPanel66.setOpaque(false);
                jPanel66.setPreferredSize(new java.awt.Dimension(400, 75));

                jButton3.setText("Se connecter");

                jButton4.setLabel("Reinitialiser");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed();
                        }
                });

                javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
                jPanel66.setLayout(jPanel66Layout);
                jPanel66Layout.setHorizontalGroup(
                                jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel66Layout.createSequentialGroup()
                                                                .addContainerGap(55, Short.MAX_VALUE)
                                                                .addComponent(jButton3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                130,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jButton4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                130,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(55, Short.MAX_VALUE)));
                jPanel66Layout.setVerticalGroup(
                                jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout
                                                                .createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addGroup(jPanel66Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(20, 20, 20)));

                jPanel64.add(jPanel66, new java.awt.GridBagConstraints());

                jPanel49.add(jPanel64);

                jPanel67.setBackground(new java.awt.Color(0, 102, 102));
                jPanel67.setMinimumSize(new java.awt.Dimension(10, 23));
                jPanel67.setOpaque(false);
                jPanel67.setLayout(new java.awt.GridBagLayout());

                jPanel68.setBackground(new java.awt.Color(0, 102, 102));
                jPanel68.setMaximumSize(new java.awt.Dimension(50000, 50000));
                jPanel68.setOpaque(false);
                jPanel68.setPreferredSize(new java.awt.Dimension(763, 75));
                jPanel68.setLayout(new java.awt.GridBagLayout());

                jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel24.setText("Vous n'avez pas encore de compte ? Veuillez vous inscrire");
                jPanel68.add(jLabel24, new java.awt.GridBagConstraints());

                jPanel67.add(jPanel68, new java.awt.GridBagConstraints());

                jPanel49.add(jPanel67);

                jPanel69.setBackground(new java.awt.Color(0, 102, 102));
                jPanel69.setOpaque(false);
                jPanel69.setLayout(new java.awt.GridBagLayout());

                jPanel70.setBackground(new java.awt.Color(102, 255, 102));
                jPanel70.setMaximumSize(new java.awt.Dimension(50000, 50000));
                jPanel70.setOpaque(false);
                jPanel70.setPreferredSize(new java.awt.Dimension(763, 75));
                jPanel70.setLayout(new java.awt.GridBagLayout());

                jPanel71.setOpaque(false);
                jPanel71.setPreferredSize(new java.awt.Dimension(400, 75));

                jButton5.setLabel("S'inscrire");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
                jPanel71.setLayout(jPanel71Layout);
                jPanel71Layout.setHorizontalGroup(
                                jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel71Layout.createSequentialGroup()
                                                                .addContainerGap(120, Short.MAX_VALUE)
                                                                .addComponent(jButton5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                160,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(120, Short.MAX_VALUE)));
                jPanel71Layout.setVerticalGroup(
                                jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel71Layout.createSequentialGroup()
                                                                .addComponent(jButton5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));

                jPanel70.add(jPanel71, new java.awt.GridBagConstraints());

                jPanel69.add(jPanel70, new java.awt.GridBagConstraints());

                jPanel49.add(jPanel69);

                this.add(jPanel49);
        }

        private void jButton4ActionPerformed() {
                userNameInputField.setText("");

                jPasswordField1.setText("");
        }

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

                this.cardLayoutLoginViewCrad.show(this.signUpViewCentrePanel, "Sign Up");
        }

        public void setCardLayoutLoginViewCard(CardLayout c) {
                this.cardLayoutLoginViewCrad = c;
        }

        public void setSignUpViewCentrePanel(JPanel p) {
                this.signUpViewCentrePanel = p;
        }

        public void setCardLayoutForPanelRoot(CardLayout c) {
                this.cardLayoutForPanelRoot = c;
        }

        public void setProfilPanel(Profile p) {
                this.profilPanel = p;
        }

        public void setJPanelRoot(JPanel p) {
                this.jPanelRoot = p;
        }

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
            String username = userNameInputField.getText();
            String password = new String(jPasswordField1.getPassword());

            // Regex patterns for username and password
            String usernamePattern = "^[a-zA-Z0-9_]+$";
            String passwordPattern = "^[a-zA-Z0-9]+$";

            try {
                if (!username.matches(usernamePattern) || !password.matches(passwordPattern)) {
                	JOptionPane.showMessageDialog(this,
                            "Le nom d'utilisateur et le mot de passe doivent contenir uniquement des lettres, des chiffres et des underscores.",
                            "Format invalide",
                            JOptionPane.ERROR_MESSAGE);
                    throw new IllegalArgumentException("Le nom d'utilisateur et le mot de passe doivent contenir uniquement des lettres, des chiffres et des underscores.");
                    
                }
            
                // Assume getCurrentUser may throw a checked exception (SQLException for example)
                if (DB.getCurrentUser(username) != null && DB.getCurrentUser(username).getPassword().equals(password)) {
                    // Successful login
                    this.profilPanel.updateUserInformations(DB.getCurrentUser(username));
                    cardLayoutForPanelRoot.show(this.jPanelRoot, "Main View");
                    System.out.println("Login successful");
                } else {
                	JOptionPane.showMessageDialog(this,
                            "Échec de la connexion. Vérifiez votre nom d'utilisateur et votre mot de passe.",
                            "Échec de la connexion",
                            JOptionPane.ERROR_MESSAGE);
                    // Incorrect username or password
                    System.out.println(DB.getCurrentUser(username));
                    throw new RuntimeException("Échec de la connexion. Vérifiez votre nom d'utilisateur et votre mot de passe.");
                    
                }
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage(),
                        "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
            // The catch block for RuntimeException is missing here, so any checked exception from getCurrentUser won't be caught.
        }
}
