/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author nambi
 */
public class Wayoftravel1 extends javax.swing.JFrame {

    /**
     * Creates new form Wayoftravel1
     */
    public Wayoftravel1() {
        initComponents();
        this.getContentPane().setBackground(Color.YELLOW);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Domesticbtn = new javax.swing.JRadioButton();
        Intbtn = new javax.swing.JRadioButton();
        Proceedbtn = new javax.swing.JButton();
        Cancelbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("CHOOSE ONE OPTION BELOW:");

        Domesticbtn.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        Domesticbtn.setForeground(new java.awt.Color(153, 0, 0));
        Domesticbtn.setText("DOMESTIC");

        Intbtn.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        Intbtn.setForeground(new java.awt.Color(153, 0, 0));
        Intbtn.setText("INTERNATIONAL");

        Proceedbtn.setText("PROCEED");
        Proceedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedbtnActionPerformed(evt);
            }
        });

        Cancelbtn.setText("CANCEL");
        Cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Proceedbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Intbtn)
                            .addComponent(Domesticbtn))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(Domesticbtn)
                .addGap(39, 39, 39)
                .addComponent(Intbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Proceedbtn)
                    .addComponent(Cancelbtn))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbtnActionPerformed
        // TODO add your handling code here:
        new Wayoftravel().setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelbtnActionPerformed

    private void ProceedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedbtnActionPerformed
        // TODO add your handling code here:
        if(Domesticbtn.isSelected() && Intbtn.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Both domestic and international has been selected!");
        }
        else if(Domesticbtn.isSelected())
        {
            new Flight().setVisible(true);
            dispose();
        }
        else if(Intbtn.isSelected())
        {
            new FlightInt().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ProceedbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Wayoftravel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wayoftravel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wayoftravel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wayoftravel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wayoftravel1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelbtn;
    public static javax.swing.JRadioButton Domesticbtn;
    public static javax.swing.JRadioButton Intbtn;
    private javax.swing.JButton Proceedbtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
