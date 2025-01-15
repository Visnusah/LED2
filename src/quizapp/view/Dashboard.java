package quizapp.view;

import javax.swing.ButtonGroup;

public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        
        // Create button group for radio buttons
        ButtonGroup gameGroup = new ButtonGroup();
        gameGroup.add(MCQGameBtn);
        gameGroup.add(OtherGame);
        gameGroup.add(OtherGame1);
        
        // Add action listener for Select button
        SectctBtn.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (getMCQGameBtn().isSelected()) {
                    new McqTest().setVisible(true);
                    dispose();
                } else if (getOtherGame().isSelected()) {
                    new Synonyms().setVisible(true);
                    dispose();
                } else if (getOtherGame1().isSelected()) {
                    new Antonyms().setVisible(true);
                    dispose();
                }
            }
        });
        
        // Add action listener for Back button
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose(); // Close current window
                new LoginForm().setVisible(true); // Show login form
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SectctBtn = new javax.swing.JButton();
        MCQGameBtn = new javax.swing.JRadioButton();
        OtherGame = new javax.swing.JRadioButton();
        BackBtn = new javax.swing.JButton();
        OtherGame1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select To Play"));

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Game");
        jLabel1.setToolTipText("");

        SectctBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        SectctBtn.setText("Select");

        MCQGameBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        MCQGameBtn.setText("MCQ");
        MCQGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCQGameBtnActionPerformed(evt);
            }
        });

        OtherGame.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        OtherGame.setText("Synonyms");

        BackBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        OtherGame1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        OtherGame1.setText("Antonyms");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MCQGameBtn)
                            .addComponent(OtherGame)
                            .addComponent(OtherGame1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(SectctBtn)
                        .addGap(41, 41, 41)
                        .addComponent(BackBtn)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(MCQGameBtn)
                .addGap(18, 18, 18)
                .addComponent(OtherGame)
                .addGap(18, 18, 18)
                .addComponent(OtherGame1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SectctBtn)
                    .addComponent(BackBtn))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BackBtn, SectctBtn});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MCQGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCQGameBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MCQGameBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JRadioButton MCQGameBtn;
    private javax.swing.JRadioButton OtherGame;
    private javax.swing.JRadioButton OtherGame1;
    private javax.swing.JButton SectctBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the ExitBtn
     */
    public javax.swing.JButton getExitBtn() {
        return BackBtn;
    }

    /**
     * @param ExitBtn the ExitBtn to set
     */
    public void setExitBtn(javax.swing.JButton ExitBtn) {
        this.BackBtn = ExitBtn;
    }

    /**
     * @return the MCQGameBtn
     */
    public javax.swing.JRadioButton getMCQGameBtn() {
        return MCQGameBtn;
    }

    /**
     * @param MCQGameBtn the MCQGameBtn to set
     */
    public void setMCQGameBtn(javax.swing.JRadioButton MCQGameBtn) {
        this.MCQGameBtn = MCQGameBtn;
    }

    /**
     * @return the OtherGame
     */
    public javax.swing.JRadioButton getOtherGame() {
        return OtherGame;
    }

    /**
     * @param OtherGame the OtherGame to set
     */
    public void setOtherGame(javax.swing.JRadioButton OtherGame) {
        this.OtherGame = OtherGame;
    }

    /**
     * @return the OtherGame1
     */
    public javax.swing.JRadioButton getOtherGame1() {
        return OtherGame1;
    }

    /**
     * @param OtherGame1 the OtherGame1 to set
     */
    public void setOtherGame1(javax.swing.JRadioButton OtherGame1) {
        this.OtherGame1 = OtherGame1;
    }

    /**
     * @return the SectctBtn
     */
    public javax.swing.JButton getSectctBtn() {
        return SectctBtn;
    }

    /**
     * @param SectctBtn the SectctBtn to set
     */
    public void setSectctBtn(javax.swing.JButton SectctBtn) {
        this.SectctBtn = SectctBtn;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }
}
