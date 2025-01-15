package quizapp.view;

import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        // Add placeholders
        EmailField.setText("Enter Email");
        PasswordField.setText("Enter Password");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EmailField = new javax.swing.JTextField();
        GameLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        SigninBtn = new javax.swing.JButton();
        SignupBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        LoginBackground = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setSize(new java.awt.Dimension(250, 150));

        EmailField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        GameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        GameLabel.setForeground(new java.awt.Color(255, 255, 255));
        GameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameLabel.setText("Game");
        GameLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        SigninBtn.setText("Signin");
        SigninBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SigninBtnMouseClicked(evt);
            }
        });

        SignupBtn.setText("Signup");
        SignupBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupBtnMouseClicked(evt);
            }
        });

        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SigninBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(SignupBtn))
                            .addComponent(EmailField)
                            .addComponent(PasswordField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(GameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(ExitBtn)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GameLabel)
                .addGap(42, 42, 42)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SigninBtn)
                    .addComponent(SignupBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitBtn)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        LoginBackground.setBackground(new java.awt.Color(109, 66, 214));

        javax.swing.GroupLayout LoginBackgroundLayout = new javax.swing.GroupLayout(LoginBackground);
        LoginBackground.setLayout(LoginBackgroundLayout);
        LoginBackgroundLayout.setHorizontalGroup(
            LoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );
        LoginBackgroundLayout.setVerticalGroup(
            LoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void SigninBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SigninBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SigninBtnMouseClicked

    private void SignupBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupBtnMouseClicked
        SignupForm signup = new SignupForm();
        signup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignupBtnMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailField;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel GameLabel;
    private javax.swing.JPanel LoginBackground;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton SigninBtn;
    private javax.swing.JButton SignupBtn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
