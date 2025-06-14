/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import controller.LansiaController;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class UpdateLansia extends javax.swing.JFrame {

    /**
     * Creates new form UpdateLansia
     */
    private int lansiaId;
    private TableLansia tableLansia;
    LansiaController controller = new LansiaController();
    public UpdateLansia(TableLansia tableLansia) {
        initComponents();
         this.tableLansia = tableLansia;
    }
     public UpdateLansia() { // Default constructor
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jTextNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextUsia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextGulaDarah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextTDDiastolik = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextTDSistolik = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextCatatan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 242, 242));

        jTextNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 51, 107));
        jLabel2.setText("Nama");

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 51, 107));
        jLabel1.setText("Update Data Lansia");

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 51, 107));
        jLabel3.setText("Usia");

        jTextUsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsiaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 51, 107));
        jLabel4.setText("Gula Darah");

        jTextGulaDarah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGulaDarahActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 51, 107));
        jLabel5.setText("Tekanan Darah Diastolik");

        jTextTDDiastolik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTDDiastolikActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 51, 107));
        jLabel6.setText("Tekanan Darah Sistolik");

        jTextTDSistolik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTDSistolikActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(45, 51, 107));
        jLabel7.setText("Catatan");

        jTextCatatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCatatanActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jTextNama, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextUsia, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextGulaDarah, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextCatatan)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jTextTDDiastolik, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jTextTDSistolik, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(3, 3, 3)))))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(294, 294, 294))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextUsia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextGulaDarah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextTDSistolik, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTDDiastolik, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNamaActionPerformed

    private void jTextUsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsiaActionPerformed

    private void jTextGulaDarahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGulaDarahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGulaDarahActionPerformed

    private void jTextTDDiastolikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTDDiastolikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTDDiastolikActionPerformed

    private void jTextTDSistolikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTDSistolikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTDSistolikActionPerformed

    private void jTextCatatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCatatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCatatanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nama = jTextNama.getText();
        String usiaText = jTextUsia.getText();
        String gulaDarahText = jTextGulaDarah.getText();
        String tdDiastolikText = jTextTDDiastolik.getText();
        String tdSistolikText = jTextTDSistolik.getText();
        String catatan = jTextCatatan.getText();

        // Basic input validation (add more robust validation as needed)
        if (nama.isEmpty() || usiaText.isEmpty() || gulaDarahText.isEmpty() || tdDiastolikText.isEmpty() || tdSistolikText.isEmpty() || catatan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
            return;
        }

        try {
            int usia = Integer.parseInt(usiaText);
            int gulaDarah = Integer.parseInt(gulaDarahText);
            int tdDiastolik = Integer.parseInt(tdDiastolikText);
            int tdSistolik = Integer.parseInt(tdSistolikText);

            controller.update(lansiaId, nama, usia, gulaDarah, tdDiastolik, tdSistolik, catatan);
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");

            if (tableLansia != null) {
                tableLansia.loadTable(); // Refresh the table
                tableLansia.setVisible(true); // Show TableLansia again
            } else {
                TableLansia newTableFrame = new TableLansia();
                newTableFrame.setVisible(true);
            }
            this.dispose(); // Close UpdateLansia
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Input usia, gula darah, tekanan darah harus berupa angka!");
        }
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
            java.util.logging.Logger.getLogger(UpdateLansia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateLansia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateLansia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateLansia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateLansia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCatatan;
    private javax.swing.JTextField jTextGulaDarah;
    private javax.swing.JTextField jTextNama;
    private javax.swing.JTextField jTextTDDiastolik;
    private javax.swing.JTextField jTextTDSistolik;
    private javax.swing.JTextField jTextUsia;
    // End of variables declaration//GEN-END:variables

    public void setData(int id, String nama, int usia, int gulaDarah, int tdDiastolik, int tdSistolik, String catatan) {
    lansiaId = id;
    jTextNama.setText(nama);
    jTextUsia.setText(String.valueOf(usia)); // Convert int to String
    jTextGulaDarah.setText(String.valueOf(gulaDarah));
    jTextTDDiastolik.setText(String.valueOf(tdDiastolik));
    jTextTDSistolik.setText(String.valueOf(tdSistolik));
    jTextCatatan.setText(catatan);
    }
}
