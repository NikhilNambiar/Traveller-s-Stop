/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author nambi
 */
public class Wayoftravel extends javax.swing.JFrame {

    /**
     * Creates new form Wayoftravel
     */
    @Override
    public Container getContentPane() {
        return super.getContentPane(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Wayoftravel() {
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

        Waylbl = new javax.swing.JLabel();
        Flghtbookbtn = new javax.swing.JButton();
        Trnbookbtn = new javax.swing.JButton();
        Cabbookbtn = new javax.swing.JButton();
        Hotbookbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Waylbl.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        Waylbl.setForeground(new java.awt.Color(153, 0, 0));
        Waylbl.setText("CHOOSE AN OPTION BELOW:");

        Flghtbookbtn.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        Flghtbookbtn.setForeground(new java.awt.Color(153, 0, 0));
        Flghtbookbtn.setText("FLIGHT BOOKING");
        Flghtbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlghtbookbtnActionPerformed(evt);
            }
        });

        Trnbookbtn.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        Trnbookbtn.setForeground(new java.awt.Color(153, 0, 0));
        Trnbookbtn.setText("TRAIN BOOKING");
        Trnbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrnbookbtnActionPerformed(evt);
            }
        });

        Cabbookbtn.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        Cabbookbtn.setForeground(new java.awt.Color(153, 0, 0));
        Cabbookbtn.setText("CAB BOOKING FOR TOURING");
        Cabbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CabbookbtnActionPerformed(evt);
            }
        });

        Hotbookbtn.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        Hotbookbtn.setForeground(new java.awt.Color(153, 0, 0));
        Hotbookbtn.setText("HOTEL BOOKING");
        Hotbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotbookbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Trnbookbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Flghtbookbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(Hotbookbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Waylbl)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Cabbookbtn)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Waylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Flghtbookbtn)
                .addGap(46, 46, 46)
                .addComponent(Trnbookbtn)
                .addGap(53, 53, 53)
                .addComponent(Hotbookbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(Cabbookbtn)
                .addGap(46, 46, 46))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FlghtbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlghtbookbtnActionPerformed
        // TODO add your handling code here:
        new Wayoftravel1().setVisible(true);
        dispose();
    }//GEN-LAST:event_FlghtbookbtnActionPerformed

    private void TrnbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrnbookbtnActionPerformed
        // TODO add your handling code here:
        new Train().setVisible(true);
        dispose();
    }//GEN-LAST:event_TrnbookbtnActionPerformed

    private void HotbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotbookbtnActionPerformed
        // TODO add your handling code here:
        new Hotel().setVisible(true);
        dispose();
    }//GEN-LAST:event_HotbookbtnActionPerformed

    private void CabbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CabbookbtnActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini1","root","(Hello123)");
            String sql="Select * from hotel_final_details";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()==false)
            {
                JOptionPane.showMessageDialog(null, "Please book a hotel room to proceed to this step.");
            }
            else
            {
                new Cab().setVisible(true);
                dispose();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_CabbookbtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Wayoftravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wayoftravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wayoftravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wayoftravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wayoftravel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Cabbookbtn;
    public static javax.swing.JButton Flghtbookbtn;
    public static javax.swing.JButton Hotbookbtn;
    public static javax.swing.JButton Trnbookbtn;
    private javax.swing.JLabel Waylbl;
    // End of variables declaration//GEN-END:variables
}