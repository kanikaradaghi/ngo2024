/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
public class Projektledare extends javax.swing.JFrame {

    private InfDB idb;
    private String InloggadAnvandareH;
    private DefaultComboBoxModel<String> comboBoxModel;
    private DefaultComboBoxModel<String> comboBoxModel2;
    private DefaultComboBoxModel<String> comboBoxModel3;
    private ArrayList<String> minaProjekt;
    private ArrayList<String> minaPartners;
    private ArrayList<String> minaHandlaggare;
    private String projektNamn;
    int totalKostnad = 0;

    /**
     * Creates new form Projektledare
     */
    public Projektledare(InfDB idb, String InloggadAnvandareH) {
        this.idb = idb;
        this.InloggadAnvandareH = InloggadAnvandareH;
        initComponents();
        lbEpostProjektledare.setText(InloggadAnvandareH);
        comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel2 = new DefaultComboBoxModel<>();
        comboBoxModel3 = new DefaultComboBoxModel<>();
        minaProjekt = ProjektBakgrund.getProjektNamnForLedarel(AnstallBakgrund.getAId(InloggadAnvandareH));
        minaHandlaggareBox.setModel(comboBoxModel3);
        lblMeddelande.setVisible(false);

        minaChefFor.setModel(comboBoxModel);

        for (String namn : minaProjekt) {
            comboBoxModel.addElement(namn);
        }

        for (String namn : minaProjekt) {
            minaPartners = ProjektBakgrund.getProjektPartners(namn);
        }
        for (String partner : minaPartners) {
            comboBoxModel2.addElement(partner);
        }

        partnersPaMina.setModel(comboBoxModel2);

        for (String namn : minaProjekt) {
            int kostnad = (int) Double.parseDouble(ProjektBakgrund.getKostand(namn));
            totalKostnad = totalKostnad + kostnad;

        }
        lblstats.setText("Totalkostand för alla:" + totalKostnad);
        System.out.print(ProjektBakgrund.getKostand(projektNamn));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lbProjektledare = new javax.swing.JLabel();
        lbEpostProjektledare = new javax.swing.JLabel();
        minaChefFor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tftProjektNamn = new javax.swing.JTextField();
        tftProjektBeskrivning = new javax.swing.JTextField();
        tftStartDatum = new javax.swing.JTextField();
        tftSlutDatum = new javax.swing.JTextField();
        tftKostnad = new javax.swing.JTextField();
        tftStatus = new javax.swing.JTextField();
        tftPrio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        partnersPaMina = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnSparaAndringar = new javax.swing.JButton();
        lblMeddelande = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();
        btnLaggTill = new javax.swing.JButton();
        tftVadlPartner = new javax.swing.JTextField();
        minaHandlaggareBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        tftHandlaggarRuta = new javax.swing.JTextField();
        btnTabortHandlaggare = new javax.swing.JButton();
        btnLaggTillHandLaggare = new javax.swing.JButton();
        lblstats = new javax.swing.JLabel();
        lblPid = new javax.swing.JLabel();
        lblLand = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbProjektledare.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbProjektledare.setText("Projektledare Meny");

        lbEpostProjektledare.setText("jLabel1");

        minaChefFor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        minaChefFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minaChefForActionPerformed(evt);
            }
        });

        jLabel1.setText("Projekt jag är chef för");

        jLabel2.setText("Pid:");

        jLabel3.setText("Namn:");

        jLabel4.setText("Beskrivning:");

        jLabel5.setText("Startdatum:");

        jLabel6.setText("Slutdatum:");

        jLabel7.setText("Kostnad:");

        jLabel8.setText("Status.");

        jLabel9.setText("Prioritet:");

        tftProjektNamn.setText("jTextField2");

        tftProjektBeskrivning.setText("jTextField3");

        tftStartDatum.setText("jTextField4");

        tftSlutDatum.setText("jTextField5");

        tftKostnad.setText("jTextField6");

        tftStatus.setText("jTextField7");

        tftPrio.setText("jTextField8");

        jLabel10.setText("Land:");

        partnersPaMina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        partnersPaMina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partnersPaMinaActionPerformed(evt);
            }
        });

        jLabel11.setText("Partners");

        btnSparaAndringar.setText("Spara ändringar");
        btnSparaAndringar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaAndringarActionPerformed(evt);
            }
        });

        lblMeddelande.setText("Dina ändringar sparades");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnTaBort.setText("Ta bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        btnLaggTill.setText("Lägg till");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
            }
        });

        tftVadlPartner.setText("Här kommer partner visas");

        minaHandlaggareBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        minaHandlaggareBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minaHandlaggareBoxActionPerformed(evt);
            }
        });

        jLabel12.setText("Handläggare");

        tftHandlaggarRuta.setText("Här kommer handläggare ");
        tftHandlaggarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftHandlaggarRutaActionPerformed(evt);
            }
        });

        btnTabortHandlaggare.setText("Ta bort");
        btnTabortHandlaggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabortHandlaggareActionPerformed(evt);
            }
        });

        btnLaggTillHandLaggare.setText("Lägg till");
        btnLaggTillHandLaggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillHandLaggareActionPerformed(evt);
            }
        });

        lblstats.setText("jLabel13");

        lblPid.setText("jLabel13");

        lblLand.setText("jLabel13");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbProjektledare, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbEpostProjektledare, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnSparaAndringar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tftProjektNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel6)
                                                            .addComponent(jLabel7)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tftProjektBeskrivning)
                                                    .addComponent(tftStartDatum)
                                                    .addComponent(tftSlutDatum)
                                                    .addComponent(tftKostnad)
                                                    .addComponent(tftStatus)
                                                    .addComponent(tftPrio)
                                                    .addComponent(lblLand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMeddelande)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(minaHandlaggareBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(minaChefFor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(partnersPaMina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnTaBort)
                                .addGap(18, 18, 18)
                                .addComponent(btnLaggTill))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblstats, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tftVadlPartner, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tftHandlaggarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(btnTabortHandlaggare)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLaggTillHandLaggare)))
                                .addGap(0, 1, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProjektledare, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTillbaka))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEpostProjektledare)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minaChefFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partnersPaMina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tftVadlPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnLaggTill)
                    .addComponent(btnTaBort)
                    .addComponent(lblPid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tftProjektNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tftProjektBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minaHandlaggareBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tftHandlaggarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tftStartDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTabortHandlaggare)
                    .addComponent(btnLaggTillHandLaggare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tftSlutDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tftKostnad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tftStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tftPrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(lblLand, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblstats)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSparaAndringar)
                    .addComponent(lblMeddelande))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minaChefForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minaChefForActionPerformed
        String valtObjekt = (String) comboBoxModel.getSelectedItem();

        uppdateraProjektNamn(valtObjekt);

        lblPid.setText(ProjektBakgrund.getPid(valtObjekt));
        tftProjektNamn.setText(valtObjekt);
        tftProjektBeskrivning.setText(ProjektBakgrund.getBeskrivning(valtObjekt));
        tftStartDatum.setText(ProjektBakgrund.getStartDatum(valtObjekt));
        tftSlutDatum.setText(ProjektBakgrund.getSlutDatum(valtObjekt));
        tftSlutDatum.setText(ProjektBakgrund.getSlutDatum(valtObjekt));
        tftKostnad.setText(ProjektBakgrund.getKostand(valtObjekt));
        tftStatus.setText(ProjektBakgrund.getStatus(valtObjekt));
        tftPrio.setText(ProjektBakgrund.getPrioritet(valtObjekt));
        lblLand.setText(ProjektBakgrund.getLand(valtObjekt));

        minaHandlaggare = ProjektBakgrund.getAllaHandlaggare(projektNamn);
        for (String handLaggare : minaHandlaggare) {
            comboBoxModel3.addElement(handLaggare);
            System.out.println("Lägger till: " + handLaggare);
        }

    }//GEN-LAST:event_minaChefForActionPerformed
    private void uppdateraProjektNamn(String namn) {

        projektNamn = namn;
    }
    private void btnSparaAndringarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaAndringarActionPerformed

        String pid = ProjektBakgrund.getPid(projektNamn);

        if (Validering.textFaltHarVarde(tftProjektNamn)) {
            ProjektBakgrund.andraProjektNamn(pid, tftProjektNamn.getText());
            uppdateraProjektNamn(tftProjektNamn.getText());

        }
        if (Validering.textFaltHarVarde(tftProjektBeskrivning)) {
            ProjektBakgrund.andraBeskrivning(pid, tftProjektBeskrivning.getText());
        }
        if (Validering.textFaltHarVarde(tftStartDatum) && Validering.isValidDate(tftStartDatum)) {
            ProjektBakgrund.andraStartDatum(pid, tftStartDatum.getText());
        }
        if (Validering.textFaltHarVarde(tftSlutDatum) && Validering.isValidDate(tftSlutDatum)) {
            ProjektBakgrund.andraSlutDatum(pid, tftSlutDatum.getText());
        }
        if (Validering.textFaltHarVarde(tftKostnad));
        {
            ProjektBakgrund.andraKostand(pid, tftKostnad.getText());
        }
        if (Validering.textFaltHarVarde(tftStatus)) {
            ProjektBakgrund.andraStatus(pid, tftStatus.getText());
        }
        if (Validering.textFaltHarVarde(tftPrio)) {
            ProjektBakgrund.andraPrio(pid, tftPrio.getText());
        }
        lblMeddelande.setVisible(true);


    }//GEN-LAST:event_btnSparaAndringarActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new HandlaggarMeny(idb, InloggadAnvandareH).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTillbakaActionPerformed
// metoden tar in antingen ett id på en partner eller ett namn på en partner och lägger till det på ett projekt
    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed
        String partner = tftVadlPartner.getText();
        ArrayList<String> allaPartners = ProjektBakgrund.getAllaPartnersNamn();
        ArrayList<String> allaId = ProjektBakgrund.getAllaPartnerId();

        if (allaPartners.contains(partner)) {
            String partnerId = ProjektBakgrund.getId(partner);
            String projektId = ProjektBakgrund.getPid(projektNamn);

            ProjektBakgrund.laggTillPartner(projektId, partnerId);
        }
        if (allaId.contains(partner)) {
            String projektId = ProjektBakgrund.getPid(projektNamn);

            ProjektBakgrund.laggTillPartner(projektId, partner);
        }
    }//GEN-LAST:event_btnLaggTillActionPerformed

    private void partnersPaMinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partnersPaMinaActionPerformed
        String valtObjekt = (String) comboBoxModel2.getSelectedItem();

        tftVadlPartner.setText(valtObjekt);
    }//GEN-LAST:event_partnersPaMinaActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed

        String partner = tftVadlPartner.getText();
        ArrayList<String> allaPartners = ProjektBakgrund.getAllaPartnersNamn();
        ArrayList<String> allaId = ProjektBakgrund.getAllaPartnerId();

        if (allaPartners.contains(partner)) {
            String partnerId = ProjektBakgrund.getId(partner);
            String projektId = ProjektBakgrund.getPid(projektNamn);

            ProjektBakgrund.taBortPartner(projektId, partnerId);

        }
        if (allaId.contains(partner)) {
            String projektId = ProjektBakgrund.getPid(projektNamn);

            ProjektBakgrund.taBortPartner(projektId, partner);
        }


    }//GEN-LAST:event_btnTaBortActionPerformed

    private void tftHandlaggarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftHandlaggarRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftHandlaggarRutaActionPerformed

    private void btnTabortHandlaggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabortHandlaggareActionPerformed
        String anstalld = tftHandlaggarRuta.getText();
        ArrayList<String> allaFornamn = AnstallBakgrund.getAnstallda();
        ArrayList<String> allaId = AnstallBakgrund.getAllaAid();
        boolean andring = false;
        if (!allaFornamn.contains(anstalld) || AnstallBakgrund.getAntalforNamn(anstalld) > 1) {
            tftHandlaggarRuta.setText("Misslyckades, Använd id istället");

        } else {

            String pid = ProjektBakgrund.getPid(projektNamn);
            String aid = AnstallBakgrund.getAidMedForNamn(anstalld);

            ProjektBakgrund.taBortHandlaggare(pid, aid);

            System.out.println("Försöker ta bort: " + pid + " " + aid);
            andring = true;

        }
        if (allaId.contains(anstalld)) {
            String pid = ProjektBakgrund.getPid(projektNamn);
            String aid = anstalld;

            ProjektBakgrund.taBortHandlaggare(pid, aid);
            andring = true;

        }
        if (andring) {
            tftHandlaggarRuta.setText("Ändring sparad");
        }


    }//GEN-LAST:event_btnTabortHandlaggareActionPerformed

    private void minaHandlaggareBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minaHandlaggareBoxActionPerformed
        String valtObjekt = (String) comboBoxModel3.getSelectedItem();
        tftHandlaggarRuta.setText(valtObjekt);
    }//GEN-LAST:event_minaHandlaggareBoxActionPerformed

    private void btnLaggTillHandLaggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillHandLaggareActionPerformed
        String anstalld = tftHandlaggarRuta.getText();
        ArrayList<String> allaFornamn = AnstallBakgrund.getAnstallda();
        ArrayList<String> allaId = AnstallBakgrund.getAllaAid();

        if (!allaFornamn.contains(anstalld) || AnstallBakgrund.getAntalforNamn(anstalld) > 1) {
            tftHandlaggarRuta.setText("Misslyckades, andvänd aid");
        } else {

            String pid = ProjektBakgrund.getPid(projektNamn);
            String aid = AnstallBakgrund.getAidMedForNamn(anstalld);

            ProjektBakgrund.laggTillHandlaggare(pid, aid);
        }
        if (allaId.contains(anstalld)) {

            String pid = ProjektBakgrund.getPid(projektNamn);
            String aid = anstalld;

            ProjektBakgrund.laggTillHandlaggare(pid, aid);

        }

    }//GEN-LAST:event_btnLaggTillHandLaggareActionPerformed

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
            java.util.logging.Logger.getLogger(Projektledare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Projektledare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Projektledare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Projektledare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JButton btnLaggTillHandLaggare;
    private javax.swing.JButton btnSparaAndringar;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTabortHandlaggare;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbEpostProjektledare;
    private javax.swing.JLabel lbProjektledare;
    private javax.swing.JLabel lblLand;
    private javax.swing.JLabel lblMeddelande;
    private javax.swing.JLabel lblPid;
    private javax.swing.JLabel lblstats;
    private javax.swing.JComboBox<String> minaChefFor;
    private javax.swing.JComboBox<String> minaHandlaggareBox;
    private javax.swing.JComboBox<String> partnersPaMina;
    private javax.swing.JTextField tftHandlaggarRuta;
    private javax.swing.JTextField tftKostnad;
    private javax.swing.JTextField tftPrio;
    private javax.swing.JTextField tftProjektBeskrivning;
    private javax.swing.JTextField tftProjektNamn;
    private javax.swing.JTextField tftSlutDatum;
    private javax.swing.JTextField tftStartDatum;
    private javax.swing.JTextField tftStatus;
    private javax.swing.JTextField tftVadlPartner;
    // End of variables declaration//GEN-END:variables
}
