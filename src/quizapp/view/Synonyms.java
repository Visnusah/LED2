package quizapp.view;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Synonyms extends javax.swing.JFrame {

    private int currentQuestion = 1;
    private final int TOTAL_QUESTIONS = 5;
    private ButtonGroup choicesGroup;

    public Synonyms() {
        // Initialize button group before components
        choicesGroup = new ButtonGroup();
        
        initComponents();
        setupQuestion(currentQuestion);
        
        // Add action listener for Next/Submit button
        NextBtn.addActionListener((var evt) -> {
            if (choicesGroup.getSelection() == null) {
                JOptionPane.showMessageDialog(null, "Please select an answer!");
                return;
            }
            
            if (currentQuestion < TOTAL_QUESTIONS) {
                currentQuestion++;
                setupQuestion(currentQuestion);
                if (currentQuestion == TOTAL_QUESTIONS) {
                    NextBtn.setText("Submit");
                }
            } else {
                // Handle submission
                dispose();
                new Dashboard().setVisible(true);
            }
        });
    }

    private void setupQuestion(int questionNum) {
        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("Question " + questionNum));
        choicesGroup.clearSelection();
        
        // Clear previous radio buttons
        jScrollPane1.getViewport().removeAll();
        
        // Create panel for radio buttons
        javax.swing.JPanel choicesPanel = new javax.swing.JPanel();
        choicesPanel.setLayout(new java.awt.GridLayout(4, 1));
        
        // Add radio buttons with choices
        String[] choices = getChoicesForQuestion(questionNum);
        for (String choice : choices) {
            JRadioButton radioBtn = new JRadioButton(choice);
            choicesGroup.add(radioBtn);
            choicesPanel.add(radioBtn);
        }
        
        jScrollPane1.setViewportView(choicesPanel);
    }
    
    private String[] getChoicesForQuestion(int questionNum) {
        // This would ideally come from a database or question bank
        return switch (questionNum) {
            case 1 -> new String[]{"Happy - Joyful", "Happy - Sad", "Happy - Angry", "Happy - Tired"};
            case 2 -> new String[]{"Big - Large", "Big - Small", "Big - Tiny", "Big - Short"};
            case 3 -> new String[]{"Fast - Quick", "Fast - Slow", "Fast - Steady", "Fast - Medium"};
            case 4 -> new String[]{"Cold - Chilly", "Cold - Hot", "Cold - Warm", "Cold - Mild"};
            case 5 -> new String[]{"Smart - Intelligent", "Smart - Dumb", "Smart - Average", "Smart - Normal"};
            default -> new String[]{"Choice 1", "Choice 2", "Choice 3", "Choice 4"};
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        NextBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Synonyms");

        BackBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("Question 1"));
        jList1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        NextBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        NextBtn.setText("Next");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NextBtn))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
        new Dashboard().setVisible(true);
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
            java.util.logging.Logger.getLogger(Synonyms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Synonyms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Synonyms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Synonyms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Synonyms().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton NextBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
