/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.security.SecureRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author walee
 */
public class LaggTillAnstalld extends javax.swing.JFrame {

    private InfDB idb;
    private String InloggadAnvandare;

    /**
     * Creates new form LaggTillAnstalld
     */
    public LaggTillAnstalld(InfDB idb, String InloggadAnvandare) {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLLaggTillAnstalld = new javax.swing.JLabel();
        jLFornamn = new javax.swing.JLabel();
        jTFFornamn = new javax.swing.JTextField();
        jLEfternamn = new javax.swing.JLabel();
        jTFEfternamn = new javax.swing.JTextField();
        jLAdress = new javax.swing.JLabel();
        jTFAdress = new javax.swing.JTextField();
        jLEpost = new javax.swing.JLabel();
        jTFEpost = new javax.swing.JTextField();
        jLTelefon = new javax.swing.JLabel();
        jTFTelefon = new javax.swing.JTextField();
        jLAnstallningsDatum = new javax.swing.JLabel();
        jTFAnstallningsDatum = new javax.swing.JTextField();
        jLAvdelning = new javax.swing.JLabel();
        jTFAvdelning = new javax.swing.JTextField();
        jBLaggTill = new javax.swing.JButton();
        jLVemInlogg = new javax.swing.JLabel();
        jRBHandlaggare = new javax.swing.JRadioButton();
        jRBAdmin = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLLaggTillAnstalld.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLLaggTillAnstalld.setText("Lägg Till Anställd");

        jLFornamn.setText("Förnamn");

        jTFFornamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFornamnActionPerformed(evt);
            }
        });

        jLEfternamn.setText("Efternamn");

        jLAdress.setText("Adress");

        jLEpost.setText("E-Post");

        jLTelefon.setText("Telefon");

        jLAnstallningsDatum.setText("Anställdningsdatum");

        jTFAnstallningsDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAnstallningsDatumActionPerformed(evt);
            }
        });

        jLAvdelning.setText("Avdelning");

        jBLaggTill.setText("Lägg Till");
        jBLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLaggTillActionPerformed(evt);
            }
        });

        jLVemInlogg.setText("jLabel1");

        buttonGroup2.add(jRBHandlaggare);
        jRBHandlaggare.setText("Handläggare");
        jRBHandlaggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBHandlaggareActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRBAdmin);
        jRBAdmin.setText("Administratör");

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
                        .addGap(121, 121, 121)
                        .addComponent(jLLaggTillAnstalld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLVemInlogg, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLAnstallningsDatum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRBHandlaggare, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTFEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTFAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLEfternamn)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTFEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTFTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRBAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jBLaggTill, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLaggTillAnstalld)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLVemInlogg)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFornamn)
                    .addComponent(jTFFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEfternamn)
                    .addComponent(jTFEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAdress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEpost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefon))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBHandlaggare)
                    .addComponent(jRBAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAnstallningsDatum)
                    .addComponent(jTFAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAvdelning))
                .addGap(18, 18, 18)
                .addComponent(jBLaggTill)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLaggTillActionPerformed

        if (Validering.textFaltHarVarde(jTFFornamn) && Validering.textFaltHarVarde(jTFEfternamn) && Validering.textFaltHarVarde(jTFAdress) && Validering.textFaltHarVarde(jTFEpost) && Validering.textFaltHarVarde(jTFTelefon) && Validering.textFaltHarVarde(jTFAnstallningsDatum) && Validering.textFaltHarVarde(jTFAvdelning) && Validering.isValidDate(jTFAnstallningsDatum) && Validering.isHelTal(jTFTelefon) && Validering.isValidEpost(jTFEpost)) {

//Lägger till en ny ansttälld.
            String fornamn = jTFFornamn.getText();
            String efternamn = jTFEfternamn.getText();
            String adress = jTFAdress.getText();
            String epost = jTFEpost.getText();
            String telefon = jTFTelefon.getText();
            String anstallningsDatum = jTFAnstallningsDatum.getText();
            String avdelning = jTFAvdelning.getText();
            boolean arAdmin = jRBAdmin.isSelected();
            boolean arHandlaggare = jRBHandlaggare.isSelected();
//            ger ett id till den nya anställd.
            int newAid = 1;

            try {
                String maxAidSql = "SELECT MAX(aid) FROM anstalld";
                String maxAidStr = idb.fetchSingle(maxAidSql);

                if (maxAidStr != null && !maxAidStr.isEmpty()) {
                    newAid = Integer.parseInt(maxAidStr) + 1;
                }
//                Slumpar lösenordet.
                SecureRandom slumpLosenord = new SecureRandom();
                String bokstaverSiffror = "abcdefghijklmnopqrstuvwxyz0123456789";
                StringBuilder losenord = new StringBuilder("password");
                boolean anvand = slumpLosenord.nextBoolean();
                for (int i = 0; i < 3; i++) {
                    if (anvand) {
                        losenord.append(bokstaverSiffror.charAt(slumpLosenord.nextInt(26)));
                    } else {
                        losenord.append(bokstaverSiffror.charAt(26 + slumpLosenord.nextInt(10)));

                    }

                }

                String sql = "INSERT INTO anstalld (aid, fornamn, efternamn, adress, epost, telefon, anstallningsdatum, avdelning, losenord) VALUES ("
                        + newAid + ", '" + fornamn + "', '" + efternamn + "', '" + adress + "', '" + epost + "', '" + telefon + "', '" + anstallningsDatum + "', '" + avdelning + "', '" + losenord.toString() + "')";

                idb.insert(sql);
                System.out.println("Anställd har lagts till.");
//                kontrollerar om det är admin eller handläggare.
                if (arAdmin) {
                    String sqlAdmin = "INSERT INTO admin (aid, behorighetsniva) VALUES (" + newAid + ", 1)";
                    idb.insert(sqlAdmin);
                }

                if (arHandlaggare) {
                    String sqlHandlaggare = "INSERT INTO handlaggare (aid) VALUES (" + newAid + ")";
                    idb.insert(sqlHandlaggare);
                }

                JOptionPane.showMessageDialog(this, "Lösenord: " + losenord.toString(), "Nytt Lösenord", JOptionPane.INFORMATION_MESSAGE);

                jTFFornamn.setText("");
                jTFEfternamn.setText("");
                jTFAdress.setText("");
                jTFEpost.setText("");
                jTFTelefon.setText("");
                jTFAnstallningsDatum.setText("");
                jTFAvdelning.setText("");
                jRBAdmin.setSelected(false);
                jRBHandlaggare.setSelected(false);

            } catch (InfException e) {
                System.out.println("Ett fel uppstod:" + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Ett fel uppstod: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jBLaggTillActionPerformed

    private void jTFFornamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFornamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFornamnActionPerformed

    private void jTFAnstallningsDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAnstallningsDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAnstallningsDatumActionPerformed

    private void jRBHandlaggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBHandlaggareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBHandlaggareActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Anstallda(idb, InloggadAnvandare).setVisible(true);
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
            java.util.logging.Logger.getLogger(LaggTillAnstalld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggTillAnstalld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggTillAnstalld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggTillAnstalld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LaggTillAnstalld().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBLaggTill;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLAdress;
    private javax.swing.JLabel jLAnstallningsDatum;
    private javax.swing.JLabel jLAvdelning;
    private javax.swing.JLabel jLEfternamn;
    private javax.swing.JLabel jLEpost;
    private javax.swing.JLabel jLFornamn;
    private javax.swing.JLabel jLLaggTillAnstalld;
    private javax.swing.JLabel jLTelefon;
    private javax.swing.JLabel jLVemInlogg;
    private javax.swing.JRadioButton jRBAdmin;
    private javax.swing.JRadioButton jRBHandlaggare;
    private javax.swing.JTextField jTFAdress;
    private javax.swing.JTextField jTFAnstallningsDatum;
    private javax.swing.JTextField jTFAvdelning;
    private javax.swing.JTextField jTFEfternamn;
    private javax.swing.JTextField jTFEpost;
    private javax.swing.JTextField jTFFornamn;
    private javax.swing.JTextField jTFTelefon;
    // End of variables declaration//GEN-END:variables
}
