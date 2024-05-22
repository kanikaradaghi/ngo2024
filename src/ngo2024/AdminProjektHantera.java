/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

public class AdminProjektHantera extends javax.swing.JFrame {

    private InfDB idb;
    private String InloggadAnvandare;

    /**
     * Creates new form AdminProjektHantera
     */
    public AdminProjektHantera(InfDB idb, String InloggadAnvandare) {
        this.idb = idb;
        this.InloggadAnvandare = InloggadAnvandare;
        initComponents();
        fyllLandComboBox();
        fyllProjektchefComboBox();

    }

    private void fyllLandComboBox() {

        try {
            String query = "SELECT lid FROM land";
            ArrayList<String> landList = idb.fetchColumn(query);

            if (landList != null) {
                JcbLand.removeAllItems();
                for (String land : landList) {
                    JcbLand.addItem(land);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Inga länder hittades.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(this, "Ett fel uppstod vid hämtning av länder: " + e.getMessage(), "Fel", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void fyllProjektchefComboBox() {

        try {
            String query = "SELECT aid FROM anstalld";
            ArrayList<String> anstalldList = idb.fetchColumn(query);

            if (anstalldList != null) {
                JcbProjektchef.removeAllItems();
                for (String anstalld : anstalldList) {
                    JcbProjektchef.addItem(anstalld);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Inga projektchefer hittades.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(this, "Ett fel uppstod vid hämtning av projektchefer: " + e.getMessage(), "Fel", JOptionPane.INFORMATION_MESSAGE);
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

        jLabel1 = new javax.swing.JLabel();
        JlbProjektnamn = new javax.swing.JLabel();
        JlbBeskrivning = new javax.swing.JLabel();
        JlbStartdatum = new javax.swing.JLabel();
        JlbSlutdatum = new javax.swing.JLabel();
        JlbKostnad = new javax.swing.JLabel();
        JlbStatus = new javax.swing.JLabel();
        JtxtProjektnamn = new javax.swing.JTextField();
        JtxtBeskrivning = new javax.swing.JTextField();
        JtxtStartdatum = new javax.swing.JTextField();
        JtxtSlutdatum = new javax.swing.JTextField();
        JtxtKostnad = new javax.swing.JTextField();
        JtxtStatus = new javax.swing.JTextField();
        JbtnLäggTillProjekt = new javax.swing.JButton();
        JlbPrioritet = new javax.swing.JLabel();
        JtxtPrioritet = new javax.swing.JTextField();
        JlbProjektchef = new javax.swing.JLabel();
        JlbLand = new javax.swing.JLabel();
        JcbLand = new javax.swing.JComboBox<>();
        JcbProjektchef = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lägg Till Projekt");

        JlbProjektnamn.setText("Projektnamn:");

        JlbBeskrivning.setText("Beskrivning:");

        JlbStartdatum.setText("Startdatum:");

        JlbSlutdatum.setText("Slutdatum:");

        JlbKostnad.setText("Kostnad:");

        JlbStatus.setText("Status:");

        JbtnLäggTillProjekt.setText("Lägg till projekt");
        JbtnLäggTillProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnLäggTillProjektActionPerformed(evt);
            }
        });

        JlbPrioritet.setText("Prioritet:");

        JlbProjektchef.setText("Projektchef:");

        JlbLand.setText("Land:");

        JcbLand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JcbProjektchef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                .addGap(154, 154, 154)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JlbBeskrivning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlbProjektnamn, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(JlbStartdatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlbSlutdatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlbKostnad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlbPrioritet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlbProjektchef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlbLand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JtxtBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtxtProjektnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtxtStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtxtSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JtxtKostnad)
                                .addComponent(JtxtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(JtxtPrioritet))
                            .addComponent(JcbLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JcbProjektchef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbtnLäggTillProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlbProjektnamn)
                    .addComponent(JtxtProjektnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlbBeskrivning)
                    .addComponent(JtxtBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlbStartdatum, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JtxtStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlbSlutdatum)
                    .addComponent(JtxtSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtxtKostnad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlbKostnad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtxtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlbStatus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlbPrioritet)
                    .addComponent(JtxtPrioritet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlbProjektchef)
                    .addComponent(JcbProjektchef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlbLand)
                    .addComponent(JcbLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbtnLäggTillProjekt)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbtnLäggTillProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnLäggTillProjektActionPerformed
        // TODO add your handling code here:                                                    
        String projektnamn = JtxtProjektnamn.getText();
        String beskrivning = JtxtBeskrivning.getText();
        String startdatum = JtxtStartdatum.getText();
        String slutdatum = JtxtSlutdatum.getText();
        String kostnad = JtxtKostnad.getText();
        String status = JtxtStatus.getText();
        String prioritet = JtxtPrioritet.getText();

        int newPid = 1;

        try {
            String maxPidQuery = "SELECT MAX(pid) FROM projekt";
            String maxPidStr = idb.fetchSingle(maxPidQuery);

            if (maxPidStr != null && !maxPidStr.isEmpty()) {
                newPid = Integer.parseInt(maxPidStr) + 1;
            }

            String sql = "INSERT INTO projekt (pid, projektnamn, beskrivning, startdatum, slutdatum, kostnad, status, prioritet, projektchef, land) VALUES (" + newPid + ", '"
                    + projektnamn + "', '" + beskrivning + "', '" + startdatum + "', '" + slutdatum + "', '" + kostnad + "', '" + status + "', '" + prioritet + "', '" + JcbProjektchef.getSelectedItem().toString() + "', '" + JcbLand.getSelectedItem().toString() + "')";

            idb.insert(sql);

            JOptionPane.showMessageDialog(this, "Projekt har lagts till.");

            // Återställ fälten efter att projektet har lagts till
            JtxtProjektnamn.setText("");
            JtxtBeskrivning.setText("");
            JtxtStartdatum.setText("");
            JtxtSlutdatum.setText("");
            JtxtKostnad.setText("");
            JtxtStatus.setText("");
            JtxtPrioritet.setText("");

        } catch (InfException e) {
            JOptionPane.showMessageDialog(this, "Ett fel uppstod: " + e.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_JbtnLäggTillProjektActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AdminHanteraProjekt2(idb, InloggadAnvandare).setVisible(true);
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
            java.util.logging.Logger.getLogger(AdminProjektHantera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProjektHantera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProjektHantera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProjektHantera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminProjektHantera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnLäggTillProjekt;
    private javax.swing.JComboBox<String> JcbLand;
    private javax.swing.JComboBox<String> JcbProjektchef;
    private javax.swing.JLabel JlbBeskrivning;
    private javax.swing.JLabel JlbKostnad;
    private javax.swing.JLabel JlbLand;
    private javax.swing.JLabel JlbPrioritet;
    private javax.swing.JLabel JlbProjektchef;
    private javax.swing.JLabel JlbProjektnamn;
    private javax.swing.JLabel JlbSlutdatum;
    private javax.swing.JLabel JlbStartdatum;
    private javax.swing.JLabel JlbStatus;
    private javax.swing.JTextField JtxtBeskrivning;
    private javax.swing.JTextField JtxtKostnad;
    private javax.swing.JTextField JtxtPrioritet;
    private javax.swing.JTextField JtxtProjektnamn;
    private javax.swing.JTextField JtxtSlutdatum;
    private javax.swing.JTextField JtxtStartdatum;
    private javax.swing.JTextField JtxtStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
