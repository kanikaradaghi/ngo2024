/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.util.ArrayList;

/**
 *
 * @author User
 */
//  Klassen visar alla projekt en handläggare har blivit tilldelad, samt partners på dessa projekt.
public class Projekt extends javax.swing.JFrame {

    private InfDB idb;
    private String InloggadAnvandareH;
    private DefaultComboBoxModel<String> comboBoxModel;
    private DefaultComboBoxModel<String> comboBoxModel2;
    private ArrayList<String> partnerNamn;
    private ArrayList<String> nyaNamn;

    /**
     * Creates new form Projekt
     */
    public Projekt(InfDB idb, String InloggadAnvandareH) {
        this.idb = idb;
        this.InloggadAnvandareH = InloggadAnvandareH;
        comboBoxModel = new DefaultComboBoxModel<>();
        nyaNamn = ProjektBakgrund.listaProjektNamnHandlaggare(InloggadAnvandareH);
        comboBoxModel2 = new DefaultComboBoxModel<>();
        partnerNamn = new ArrayList<>();
        initComponents();
        lbEpostProjekt.setText(InloggadAnvandareH);
        cbMinaprojekt.setModel(comboBoxModel);
        for (String namn : nyaNamn) {
            System.out.println("Lägger till: " + namn);
            comboBoxModel.addElement(namn);
        }
        cbPartnersPaMina.setModel(comboBoxModel2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbProjekt = new javax.swing.JLabel();
        lbEpostProjekt = new javax.swing.JLabel();
        cbMinaprojekt = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblPid = new javax.swing.JLabel();
        lblProjektNamn = new javax.swing.JLabel();
        lblBeskrivning = new javax.swing.JLabel();
        lblStartDatum = new javax.swing.JLabel();
        lblSlutDatum = new javax.swing.JLabel();
        lblKostand = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblPrioritet = new javax.swing.JLabel();
        lblProjektChef = new javax.swing.JLabel();
        lblLand = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbPartnersPaMina = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblKontaktPerson = new javax.swing.JLabel();
        lblKontaktEpost = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblAdress = new javax.swing.JLabel();
        lblBranch = new javax.swing.JLabel();
        lblStad = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbProjekt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbProjekt.setText("Projekt");

        lbEpostProjekt.setText("jLabel1");

        cbMinaprojekt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMinaprojekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinaprojektActionPerformed(evt);
            }
        });

        jLabel1.setText("Pid:");

        jLabel2.setText("Projektnamn:");

        jLabel3.setText("Beskrivning");

        jLabel4.setText("Startdatum:");

        jLabel5.setText("Slutdatum:");

        jLabel6.setText("Kostand:");

        jLabel7.setText("Status:");

        jLabel8.setText("Prioritet:");

        jLabel9.setText("Projektchef:");

        jLabel10.setText("Land:");

        lblPid.setText("jLabel11");

        lblProjektNamn.setText("jLabel12");

        lblBeskrivning.setText("jLabel13");

        lblStartDatum.setText("jLabel14");

        lblSlutDatum.setText("jLabel15");

        lblKostand.setText("jLabel16");

        lblStatus.setText("jLabel17");

        lblPrioritet.setText("jLabel18");

        lblProjektChef.setText("jLabel19");

        lblLand.setText("jLabel20");

        jLabel11.setText("Mina projekt");

        cbPartnersPaMina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPartnersPaMina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPartnersPaMinaActionPerformed(evt);
            }
        });

        jLabel12.setText("Partners ");

        jLabel13.setText("Id:");

        jLabel14.setText("Namn:");

        jLabel15.setText("Kontaktperson:");

        jLabel16.setText("Kontaktepost:");

        jLabel17.setText("Telefon:");

        jLabel18.setText("Adress:");

        jLabel19.setText("Branch:");

        jLabel20.setText("Stad:");

        lblId.setText("jLabel21");

        lblNamn.setText("jLabel22");

        lblKontaktPerson.setText("jLabel23");

        lblKontaktEpost.setText("jLabel24");

        lblTelefon.setText("jLabel25");

        lblAdress.setText("jLabel26");

        lblBranch.setText("jLabel27");

        lblStad.setText("jLabel28");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProjektChef)
                            .addComponent(lblLand)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPrioritet, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKostand, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSlutDatum, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStartDatum, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBeskrivning, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProjektNamn, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPid, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel19))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel16))
                                    .addComponent(jLabel15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel13)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId)
                                    .addComponent(lblNamn)
                                    .addComponent(lblKontaktPerson)
                                    .addComponent(lblKontaktEpost)
                                    .addComponent(lblTelefon)
                                    .addComponent(lblAdress)
                                    .addComponent(lblBranch)
                                    .addComponent(lblStad)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(cbMinaprojekt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbPartnersPaMina, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbEpostProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(btnTillbaka)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbEpostProjekt))
                    .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(cbMinaprojekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(cbPartnersPaMina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblPid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblProjektNamn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblBeskrivning))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblStartDatum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblSlutDatum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblKostand))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblPrioritet)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lblId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblNamn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblKontaktPerson))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lblKontaktEpost))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(lblTelefon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lblAdress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lblBranch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(lblStad))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblProjektChef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblLand))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Combobox där man völjer sitt projekt, alla metoder för att hämta information från databasen sker i klassen
    // ProjektBakgrund, comboboxen för partner är utformad likadant.
    private void cbMinaprojektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinaprojektActionPerformed
        String valtObjekt = (String) cbMinaprojekt.getSelectedItem();
//        comboBoxModel2.removeAllElements();
         partnerNamn = ProjektBakgrund.getProjektPartners(valtObjekt);
        cbPartnersPaMina.setModel(comboBoxModel2);
        comboBoxModel2.removeAllElements();
        for (String partner : partnerNamn) {
            comboBoxModel2.addElement(partner);
        }

        lblPid.setText(ProjektBakgrund.getPid(valtObjekt));
        lblProjektNamn.setText(valtObjekt);
        lblBeskrivning.setText(ProjektBakgrund.getBeskrivning(valtObjekt));
        lblStartDatum.setText(ProjektBakgrund.getStartDatum(valtObjekt));
        lblSlutDatum.setText(ProjektBakgrund.getSlutDatum(valtObjekt));
        lblKostand.setText(ProjektBakgrund.getKostand(valtObjekt));
        lblStatus.setText(ProjektBakgrund.getStatus(valtObjekt));
        lblPrioritet.setText(ProjektBakgrund.getPrioritet(valtObjekt));
        lblProjektChef.setText(ProjektBakgrund.getProjektChef(valtObjekt));
        lblLand.setText(ProjektBakgrund.getLand(valtObjekt));

    }//GEN-LAST:event_cbMinaprojektActionPerformed

    private void cbPartnersPaMinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPartnersPaMinaActionPerformed
        String valtObjekt = (String) cbPartnersPaMina.getSelectedItem();

        lblId.setText(ProjektBakgrund.getId(valtObjekt));
        lblNamn.setText(valtObjekt);
        lblKontaktPerson.setText(ProjektBakgrund.getKontaktPerson(valtObjekt));
        lblKontaktEpost.setText(ProjektBakgrund.getKontaktEpost(valtObjekt));
        lblTelefon.setText(ProjektBakgrund.gettelefon(valtObjekt));
        lblAdress.setText(ProjektBakgrund.getAdress(valtObjekt));
        lblBranch.setText(ProjektBakgrund.getBranch(valtObjekt));
        lblStad.setText(ProjektBakgrund.getStad(valtObjekt));


    }//GEN-LAST:event_cbPartnersPaMinaActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new HandlaggarMeny(idb, InloggadAnvandareH).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTillbakaActionPerformed

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
            java.util.logging.Logger.getLogger(Projekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Projekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Projekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Projekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbMinaprojekt;
    private javax.swing.JComboBox<String> cbPartnersPaMina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbEpostProjekt;
    private javax.swing.JLabel lbProjekt;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblBeskrivning;
    private javax.swing.JLabel lblBranch;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblKontaktEpost;
    private javax.swing.JLabel lblKontaktPerson;
    private javax.swing.JLabel lblKostand;
    private javax.swing.JLabel lblLand;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPid;
    private javax.swing.JLabel lblPrioritet;
    private javax.swing.JLabel lblProjektChef;
    private javax.swing.JLabel lblProjektNamn;
    private javax.swing.JLabel lblSlutDatum;
    private javax.swing.JLabel lblStad;
    private javax.swing.JLabel lblStartDatum;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTelefon;
    // End of variables declaration//GEN-END:variables
}
