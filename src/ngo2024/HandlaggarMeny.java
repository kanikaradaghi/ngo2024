/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author User
 */

// Klass för handlaggaremeny där en handläggare ser sina uppgifter samt kan gå vidare till mina projekt, och min avdelning
// är du projektledare kommer även allternativet att öpnna upp sidan för projektledare
public class HandlaggarMeny extends javax.swing.JFrame {

    private InfDB idb;
    private String InloggadAnvandareH;
    private AnstallBakgrund anstalldInfo;
    private ProjektBakgrund projektInfo;
    private DefaultListModel<String> listModel;
    private ArrayList<String> namnPaMal;
    private boolean projektLedare;

    /**
     * Creates new form HandlaggarMeny
     */
    
    public HandlaggarMeny(InfDB idb, String InloggadAnvandareH) {
        this.idb = idb;
        this.InloggadAnvandareH = InloggadAnvandareH;
        anstalldInfo = new AnstallBakgrund(idb);
        projektInfo = new ProjektBakgrund(idb);
        initComponents();
        lblAndringMeddelande.setVisible(false);
        listModel = new DefaultListModel<>();
        namnPaMal = ProjektBakgrund.getHallbarHetsMal();
        tfmittAid.setText(AnstallBakgrund.getAId(InloggadAnvandareH));
        tfforNamn.setText(AnstallBakgrund.getFornamn(InloggadAnvandareH));
        tfefterNamn.setText(AnstallBakgrund.getEfterNamn(InloggadAnvandareH));
        tfAdress.setText(AnstallBakgrund.getAdress(InloggadAnvandareH));
        tfTelefonNmr.setText(AnstallBakgrund.getTelefon(InloggadAnvandareH));
        tfAnstallningsDatum.setText(AnstallBakgrund.getAnstallningsDatum(InloggadAnvandareH));
        tfAvdelning.setText(AnstallBakgrund.getAvdelning(InloggadAnvandareH));
        projektLedare = AnstallBakgrund.isProjektLedare(InloggadAnvandareH);
        tfEpost.setText(InloggadAnvandareH);
        btnProjektLedarKnapp.setVisible(false);
        jList1.setModel(listModel);
        for (String mal : namnPaMal) {
            listModel.addElement(mal);
        }
        if (projektLedare) {
            btnProjektLedarKnapp.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblinloggadAnvandareH = new javax.swing.JLabel();
        hB1 = new javax.swing.JButton();
        hB2 = new javax.swing.JButton();
        txthandlaggarmeny = new javax.swing.JLabel();
        tfmittAid = new javax.swing.JTextField();
        tfforNamn = new javax.swing.JTextField();
        tfefterNamn = new javax.swing.JTextField();
        tfAdress = new javax.swing.JTextField();
        tfTelefonNmr = new javax.swing.JTextField();
        tfAnstallningsDatum = new javax.swing.JTextField();
        tfAvdelning = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAndraNamn = new javax.swing.JButton();
        btnAndraEfterNamn = new javax.swing.JButton();
        btnAndraAdress = new javax.swing.JButton();
        btnAndraNmr = new javax.swing.JButton();
        lblAndringMeddelande = new javax.swing.JLabel();
        btnAndraEpost = new javax.swing.JButton();
        tfEpost = new javax.swing.JTextField();
        btnLoggaUt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btnProjektLedarKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblinloggadAnvandareH.setText("Inloggad med");

        hB1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hB1.setText("Mina projekt");
        hB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hB1ActionPerformed(evt);
            }
        });

        hB2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hB2.setText("Min avdelning");
        hB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hB2ActionPerformed(evt);
            }
        });

        txthandlaggarmeny.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txthandlaggarmeny.setText("Handläggarmeny");

        tfmittAid.setText("jTextField1");
        tfmittAid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmittAidActionPerformed(evt);
            }
        });

        tfforNamn.setText("jTextField1");

        tfefterNamn.setText("jTextField1");

        tfAdress.setText("jTextField1");

        tfTelefonNmr.setText("jTextField1");

        tfAnstallningsDatum.setText("jTextField2");

        tfAvdelning.setText("jTextField1");

        jLabel2.setText("ID");

        jLabel3.setText("Förnamn");

        jLabel4.setText("Efternamn");

        jLabel5.setText("Adress");

        jLabel6.setText("Telefonnummer");

        jLabel7.setText("Anställningsdatum");

        jLabel8.setText("Avdelning");

        btnAndraNamn.setText("Ändra");
        btnAndraNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraNamnActionPerformed(evt);
            }
        });

        btnAndraEfterNamn.setText("Ändra");
        btnAndraEfterNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraEfterNamnActionPerformed(evt);
            }
        });

        btnAndraAdress.setText("Ändra");
        btnAndraAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAdressActionPerformed(evt);
            }
        });

        btnAndraNmr.setText("Ändra");
        btnAndraNmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraNmrActionPerformed(evt);
            }
        });

        lblAndringMeddelande.setText("testtext");

        btnAndraEpost.setText("Ändra epost");
        btnAndraEpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraEpostActionPerformed(evt);
            }
        });

        tfEpost.setText("jTextField1");

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Hållbarhetsmål");

        btnProjektLedarKnapp.setText("Projektchef meny");
        btnProjektLedarKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjektLedarKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hB2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(hB1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(btnProjektLedarKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblinloggadAnvandareH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAndringMeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfefterNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(tfmittAid)
                    .addComponent(tfforNamn)
                    .addComponent(tfAdress)
                    .addComponent(tfTelefonNmr)
                    .addComponent(tfAnstallningsDatum)
                    .addComponent(tfAvdelning)
                    .addComponent(tfEpost))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAndraEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAndraNamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAndraEfterNamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAndraAdress)
                            .addComponent(btnAndraNmr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(25, 25, 25))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(txthandlaggarmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoggaUt))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txthandlaggarmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(hB1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hB2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProjektLedarKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLoggaUt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblinloggadAnvandareH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAndraEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(tfmittAid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfforNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addComponent(btnAndraNamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAndraEfterNamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfefterNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(btnAndraAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfTelefonNmr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(btnAndraNmr, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAndringMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hB1ActionPerformed
        
        new Projekt(idb, InloggadAnvandareH).setVisible(true);
        this.setVisible(false);        
        

    }//GEN-LAST:event_hB1ActionPerformed

    private void hB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hB2ActionPerformed
        new AvdelningHandlaggare(idb, InloggadAnvandareH).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_hB2ActionPerformed

    private void tfmittAidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmittAidActionPerformed
        
    }//GEN-LAST:event_tfmittAidActionPerformed
//Knapp för att spara ändringar du harv skrivit i textboxen in till datasbasen, alla knappar följer samma koncept.
    private void btnAndraNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraNamnActionPerformed
        
        boolean klart = false;
        if (Validering.textFaltHarVarde(tfforNamn)) {
            String namnAndring = tfforNamn.getText();
            klart = AnstallBakgrund.andraForNamn(namnAndring, InloggadAnvandareH);
            
            if (klart = true) {
                lblAndringMeddelande.setText("Du har nu ändrat ditt namn");
                lblAndringMeddelande.setVisible(true);
            } else {
                lblAndringMeddelande.setText("Det gick inte att ändra ditt namn");
                lblAndringMeddelande.setVisible(true);                
            }
        }

    }//GEN-LAST:event_btnAndraNamnActionPerformed

    private void btnAndraEfterNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraEfterNamnActionPerformed
        
        boolean klart = false;
        if (Validering.textFaltHarVarde(tfefterNamn)) {
            String namnAndring = tfefterNamn.getText();
            klart = AnstallBakgrund.andraEfterNamn(namnAndring, InloggadAnvandareH);
            
            if (klart = true) {
                lblAndringMeddelande.setText("Du har nu ändrat ditt efternamn");
                lblAndringMeddelande.setVisible(true);
            } else {
                lblAndringMeddelande.setText("Det gick inte att ändra ditt efternamn");
                lblAndringMeddelande.setVisible(true);                
            }
        }
    }//GEN-LAST:event_btnAndraEfterNamnActionPerformed

    private void btnAndraAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAdressActionPerformed
        boolean klart = false;
        if (Validering.textFaltHarVarde(tfAdress)) {
            String adressAndring = tfAdress.getText();
            klart = AnstallBakgrund.andraAdress(adressAndring, InloggadAnvandareH);
            
            if (klart = true) {
                lblAndringMeddelande.setText("Du har nu ändrat din adress");
                lblAndringMeddelande.setVisible(true);
            } else {
                lblAndringMeddelande.setText("Det gick inte att ändra din adress");
                lblAndringMeddelande.setVisible(true);                
            }
        }
    }//GEN-LAST:event_btnAndraAdressActionPerformed

    private void btnAndraNmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraNmrActionPerformed
        
        boolean klart = false;
        if (Validering.textFaltHarVarde(tfTelefonNmr) && Validering.isHelTal(tfTelefonNmr)) {
            String nmrAndring = tfTelefonNmr.getText();
            klart = AnstallBakgrund.andraNmr(nmrAndring, InloggadAnvandareH);
            
            if (klart = true) {
                lblAndringMeddelande.setText("Du har nu ändrat dit telefonnummer");
                lblAndringMeddelande.setVisible(true);
            } else {
                lblAndringMeddelande.setText("Det gick inte att ändra dit telefonnummer");
                lblAndringMeddelande.setVisible(true);                
            }
        }
    }//GEN-LAST:event_btnAndraNmrActionPerformed

    private void btnAndraEpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraEpostActionPerformed
        boolean klart = false;
        String aid = tfmittAid.getText();
        if (Validering.textFaltHarVarde(tfEpost) && Validering.isValidEpost(tfEpost)) {
            String epostAndring = tfEpost.getText();
            klart = AnstallBakgrund.andraEpost(epostAndring, aid);
            
            if (klart = true) {
                lblAndringMeddelande.setText("Du har nu ändrat din epost");
                lblAndringMeddelande.setVisible(true);
            } else {
                lblAndringMeddelande.setText("Det gick inte att ändra din epost");
                lblAndringMeddelande.setVisible(true);                
            }
        }
        
    }//GEN-LAST:event_btnAndraEpostActionPerformed
//knapp för att logga ut till första sidan.
    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        new Inlogg(idb).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoggaUtActionPerformed
// Knapp för att gå vidare till projektledar sidan.
    private void btnProjektLedarKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjektLedarKnappActionPerformed
        new Projektledare(idb, InloggadAnvandareH).setVisible(true);        
        this.setVisible(false);
    }//GEN-LAST:event_btnProjektLedarKnappActionPerformed

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
            java.util.logging.Logger.getLogger(HandlaggarMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HandlaggarMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HandlaggarMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HandlaggarMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraAdress;
    private javax.swing.JButton btnAndraEfterNamn;
    private javax.swing.JButton btnAndraEpost;
    private javax.swing.JButton btnAndraNamn;
    private javax.swing.JButton btnAndraNmr;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnProjektLedarKnapp;
    private javax.swing.JButton hB1;
    private javax.swing.JButton hB2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAndringMeddelande;
    private javax.swing.JLabel lblinloggadAnvandareH;
    private javax.swing.JTextField tfAdress;
    private javax.swing.JTextField tfAnstallningsDatum;
    private javax.swing.JTextField tfAvdelning;
    private javax.swing.JTextField tfEpost;
    private javax.swing.JTextField tfTelefonNmr;
    private javax.swing.JTextField tfefterNamn;
    private javax.swing.JTextField tfforNamn;
    private javax.swing.JTextField tfmittAid;
    private javax.swing.JLabel txthandlaggarmeny;
    // End of variables declaration//GEN-END:variables
}
