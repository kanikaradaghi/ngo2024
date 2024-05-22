/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;
import oru.inf.InfDB;
import oru.inf.InfException;
import ngo2024.AdminProjektHantera;

/**
 *
 * @author Ägaren
 */
public class AdminProjekt extends javax.swing.JFrame {
      private InfDB idb;
    private String InloggadAnvandare;


    /**
     * Creates new form AdminProjekt
     */
    public AdminProjekt(InfDB idb, String InloggadAnvandare) {
        this.idb = idb;
        this.InloggadAnvandare = InloggadAnvandare;
        initComponents();
        jLVemInlogg.setText(InloggadAnvandare);
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
        JbtnPartner = new javax.swing.JButton();
        JbtnLand = new javax.swing.JButton();
        JbtnHanteraProjekt = new javax.swing.JButton();
        jLVemInlogg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Projekt ");

        JbtnPartner.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JbtnPartner.setText("Partner");
        JbtnPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnPartnerActionPerformed(evt);
            }
        });

        JbtnLand.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JbtnLand.setText("Land");
        JbtnLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnLandActionPerformed(evt);
            }
        });

        JbtnHanteraProjekt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JbtnHanteraProjekt.setText("Hantera projekt");
        JbtnHanteraProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnHanteraProjektActionPerformed(evt);
            }
        });

        jLVemInlogg.setText("jLabel2");

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JbtnHanteraProjekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JbtnLand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JbtnPartner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLVemInlogg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLVemInlogg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(JbtnHanteraProjekt)
                .addGap(29, 29, 29)
                .addComponent(JbtnPartner)
                .addGap(34, 34, 34)
                .addComponent(JbtnLand)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbtnPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnPartnerActionPerformed
        new AdminHanteraPartner(idb, InloggadAnvandare).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JbtnPartnerActionPerformed

    private void JbtnLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnLandActionPerformed
        new AdminLand(idb, InloggadAnvandare).setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_JbtnLandActionPerformed

    private void JbtnHanteraProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnHanteraProjektActionPerformed
        new AdminHanteraProjekt2(idb, InloggadAnvandare).setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_JbtnHanteraProjektActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new AdminMeny(idb, InloggadAnvandare).setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminProjekt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnHanteraProjekt;
    private javax.swing.JButton JbtnLand;
    private javax.swing.JButton JbtnPartner;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLVemInlogg;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
