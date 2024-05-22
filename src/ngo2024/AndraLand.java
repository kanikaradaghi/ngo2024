/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;


/**
 *
 * @author walee
 */
public class AndraLand extends javax.swing.JFrame {
    private InfDB idb;
    private String InloggadAnvandare;
    

    /**
     * Creates new form AndraLand
     */
    public AndraLand(InfDB idb, String InloggadAnvandare) {
        this.idb = idb;
        this.InloggadAnvandare = InloggadAnvandare;
        initComponents();
        fyllComboBox();
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLVemInlogg = new javax.swing.JLabel();
        jCBValjLand = new javax.swing.JComboBox<>();
        jLLidLand = new javax.swing.JLabel();
        jLNamnLand = new javax.swing.JLabel();
        jLSprakLand = new javax.swing.JLabel();
        jLValutaLand = new javax.swing.JLabel();
        jLTidszonLand = new javax.swing.JLabel();
        jLPolitiskStrukturLand = new javax.swing.JLabel();
        jLEkonomiLand = new javax.swing.JLabel();
        jTFLidLand = new javax.swing.JTextField();
        jTFNamnLand = new javax.swing.JTextField();
        jTFSprakLand = new javax.swing.JTextField();
        jTFValutaLand = new javax.swing.JTextField();
        jTFTidszonLand = new javax.swing.JTextField();
        jTFPolitiskStrukturLand = new javax.swing.JTextField();
        jTFEkonomiLand = new javax.swing.JTextField();
        jBAndraLand = new javax.swing.JButton();
        jBAvbrytAndraLand = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ändra Land");

        jLVemInlogg.setText("jLabel2");

        jCBValjLand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBValjLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBValjLandActionPerformed(evt);
            }
        });

        jLLidLand.setText("Lid");

        jLNamnLand.setText("Namn");

        jLSprakLand.setText("Språk");

        jLValutaLand.setText("Valuta");

        jLTidszonLand.setText("Tidszon");

        jLPolitiskStrukturLand.setText("Politisk Struktur");

        jLEkonomiLand.setText("Ekonomi");

        jTFLidLand.setText("jTextField1");

        jTFNamnLand.setText("jTextField2");

        jTFSprakLand.setText("jTextField3");

        jTFValutaLand.setText("jTextField4");

        jTFTidszonLand.setText("jTextField5");

        jTFPolitiskStrukturLand.setText("jTextField6");

        jTFEkonomiLand.setText("jTextField7");

        jBAndraLand.setText("Ändra");
        jBAndraLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAndraLandActionPerformed(evt);
            }
        });

        jBAvbrytAndraLand.setText("Avbryt");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLVemInlogg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCBValjLand, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLLidLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLNamnLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLSprakLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLValutaLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLEkonomiLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLTidszonLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLPolitiskStrukturLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFLidLand)
                            .addComponent(jTFNamnLand)
                            .addComponent(jTFSprakLand)
                            .addComponent(jTFValutaLand)
                            .addComponent(jTFTidszonLand)
                            .addComponent(jTFPolitiskStrukturLand)
                            .addComponent(jTFEkonomiLand)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBAndraLand, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBAvbrytAndraLand, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLVemInlogg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBValjLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLidLand)
                    .addComponent(jTFLidLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNamnLand)
                    .addComponent(jTFNamnLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSprakLand)
                    .addComponent(jTFSprakLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLValutaLand)
                    .addComponent(jTFValutaLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTidszonLand)
                    .addComponent(jTFTidszonLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPolitiskStrukturLand)
                    .addComponent(jTFPolitiskStrukturLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEkonomiLand)
                    .addComponent(jTFEkonomiLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAndraLand)
                    .addComponent(jBAvbrytAndraLand))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     private void fyllComboBox() {
        jCBValjLand.removeAllItems();
    try {
        String sql = "SELECT namn FROM land";
        ArrayList<String> ettLand = idb.fetchColumn(sql);

        if (ettLand != null) {
            for (String land : ettLand) {
                jCBValjLand.addItem(land);
            }
        } else {
            System.out.println("Inga land hittades.");
        }
    } catch (InfException e) {
        System.out.println("Ett fel uppstod vid hämtning av landnamn.");
    }
}
    
    
    private void jBAndraLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAndraLandActionPerformed
    String lid = jTFLidLand.getText();
    String namn = jTFNamnLand.getText();
    String sprak = jTFSprakLand.getText();
    String valuta = jTFValutaLand.getText();
    String tidszon = jTFTidszonLand.getText();
    String politisk_struktur = jTFPolitiskStrukturLand.getText();
    String ekonomi = jTFEkonomiLand.getText();

    try {
        // Uppdatera databasen med de nya värdena
        String sqlAndring = "UPDATE land SET namn = '" + namn + "', sprak = '" + sprak + "', valuta = '" + valuta + "', tidszon = '" + tidszon + "', politisk_struktur = '" + politisk_struktur + "', ekonomi = '" + ekonomi + "' WHERE lid = '" + lid + "'";
        idb.update(sqlAndring);
        
        // Visa en bekräftelse att ändringarna har genomförts
        System.out.println("Ändringar har genomförts.");
    } catch (InfException e) {
        // Visa felmeddelande om något går fel vid uppdateringen
        System.out.println("Ett fel uppstod. Ändringar kunde inte genomföras.");
        e.printStackTrace();
    }
    }//GEN-LAST:event_jBAndraLandActionPerformed

    private void jCBValjLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBValjLandActionPerformed
        
         String valtLand = (String) jCBValjLand.getSelectedItem();
    if (valtLand != null) {
        try {
            String sql = "SELECT * FROM land WHERE namn = '" + valtLand + "'";
            HashMap<String, String> land = idb.fetchRow(sql);
            
            if (land != null) {
                jTFLidLand.setText(land.get("lid"));
                jTFNamnLand.setText(land.get("namn"));
                jTFSprakLand.setText(land.get("sprak"));
                jTFValutaLand.setText(land.get("valuta"));
                jTFTidszonLand.setText(land.get("tidszon"));
                jTFPolitiskStrukturLand.setText(land.get("politisk_struktur"));
                jTFEkonomiLand.setText(land.get("ekonomi"));
            } else {
                System.out.println("Kunde inte hitta land.");
            }
        } catch (InfException e) {
            System.out.println("Ett fel uppstod vid hämtning av landdetaljer.");
        }
    }
                
                
                
            
        
        
    }//GEN-LAST:event_jCBValjLandActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     new AdminProjekt(idb, InloggadAnvandare).setVisible(true);
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
            java.util.logging.Logger.getLogger(AndraLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AndraLand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAndraLand;
    private javax.swing.JButton jBAvbrytAndraLand;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBValjLand;
    private javax.swing.JLabel jLEkonomiLand;
    private javax.swing.JLabel jLLidLand;
    private javax.swing.JLabel jLNamnLand;
    private javax.swing.JLabel jLPolitiskStrukturLand;
    private javax.swing.JLabel jLSprakLand;
    private javax.swing.JLabel jLTidszonLand;
    private javax.swing.JLabel jLValutaLand;
    private javax.swing.JLabel jLVemInlogg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTFEkonomiLand;
    private javax.swing.JTextField jTFLidLand;
    private javax.swing.JTextField jTFNamnLand;
    private javax.swing.JTextField jTFPolitiskStrukturLand;
    private javax.swing.JTextField jTFSprakLand;
    private javax.swing.JTextField jTFTidszonLand;
    private javax.swing.JTextField jTFValutaLand;
    // End of variables declaration//GEN-END:variables
}
