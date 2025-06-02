package frame;
import controller.BalitaController;
import javax.swing.JOptionPane;

public class AddBalita extends javax.swing.JFrame {
    private BalitaController controller = new BalitaController(); // Instansiasi objek controller
    private TableBalita tableBalita;
    
    public AddBalita() {
        initComponents();
         // Menambahkan listener agar klik pada label memindahkan fokus ke input
        jLabelNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextNama.requestFocus();
            }
        });

        jLabelUsia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextUsia.requestFocus();
            }
        });

        jLabelTinggiBadan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextTinggiBadan.requestFocus();
            }
        });

        jLabelBeratBadan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextBeratBadan.requestFocus();
            }
        });

        jLabelCatatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextCatatan.requestFocus();
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();
        jTextNama = new javax.swing.JTextField();
        jLabelUsia = new javax.swing.JLabel();
        jTextUsia = new javax.swing.JTextField();
        jLabelTinggiBadan = new javax.swing.JLabel();
        jTextTinggiBadan = new javax.swing.JTextField();
        jLabelBeratBadan = new javax.swing.JLabel();
        jTextBeratBadan = new javax.swing.JTextField();
        jLabelCatatan = new javax.swing.JLabel();
        jTextCatatan = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 51, 107));
        setPreferredSize(new java.awt.Dimension(668, 558));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 51, 107));

        header.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 242, 242));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Tambah Data Balita");

        jLabelNama.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabelNama.setForeground(new java.awt.Color(255, 242, 242));
        jLabelNama.setText("Nama");

        jTextNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamaActionPerformed(evt);
            }
        });

        jLabelUsia.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabelUsia.setForeground(new java.awt.Color(255, 242, 242));
        jLabelUsia.setText("Usia (Bulan)");

        jTextUsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsiaActionPerformed(evt);
            }
        });

        jLabelTinggiBadan.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabelTinggiBadan.setForeground(new java.awt.Color(255, 242, 242));
        jLabelTinggiBadan.setText("Tinggi Badan (cm)");

        jTextTinggiBadan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTinggiBadanActionPerformed(evt);
            }
        });

        jLabelBeratBadan.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabelBeratBadan.setForeground(new java.awt.Color(255, 242, 242));
        jLabelBeratBadan.setText("Berat Badan (kg)");

        jTextBeratBadan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBeratBadanActionPerformed(evt);
            }
        });

        jLabelCatatan.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabelCatatan.setForeground(new java.awt.Color(255, 242, 242));
        jLabelCatatan.setText("Catatan");

        jTextCatatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCatatanActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 51, 51));
        jButtonCancel.setText("Batal");
        jButtonCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancel.setVerifyInputWhenFocusTarget(false);
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseClicked(evt);
            }
        });
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonSimpan.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButtonSimpan.setForeground(new java.awt.Color(45, 51, 107));
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSimpan.setVerifyInputWhenFocusTarget(false);
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNama)
                            .addComponent(jTextNama, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUsia)
                            .addComponent(jTextUsia, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTinggiBadan)
                                    .addComponent(jTextTinggiBadan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBeratBadan)
                                    .addComponent(jTextBeratBadan, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelCatatan, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonSimpan)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(header)
                .addGap(18, 18, 18)
                .addComponent(jLabelNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabelUsia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextUsia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTinggiBadan)
                    .addComponent(jLabelBeratBadan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextBeratBadan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTinggiBadan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelCatatan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSimpan)
                    .addComponent(jButtonCancel))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNamaActionPerformed

    private void jTextUsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsiaActionPerformed

    private void jTextTinggiBadanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTinggiBadanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTinggiBadanActionPerformed

    private void jTextBeratBadanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBeratBadanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBeratBadanActionPerformed

    private void jTextCatatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCatatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCatatanActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        int pilihan = JOptionPane.showConfirmDialog(
           this,
           "Data yang sudah anda isi tidak akan disimpan.\nApakah Anda yakin untuk membatalkannya?",
           "Konfirmasi Pembatalan",
           JOptionPane.YES_NO_OPTION,
           JOptionPane.WARNING_MESSAGE
        );

        if (pilihan == JOptionPane.YES_OPTION) {
           // Arahkan ke TableBalita.java
           TableBalita tableBalita = new TableBalita();
           tableBalita.setVisible(true);
           this.dispose(); // Menutup form AddBalita
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        String nama = jTextNama.getText();
        String usiaText = jTextUsia.getText();
        String tinggiBadanText = jTextTinggiBadan.getText();
        String beratBadanText = jTextBeratBadan.getText();
        String catatan = jTextCatatan.getText();

        // Basic input validation (add more robust validation as needed)
        if (nama.isEmpty() || usiaText.isEmpty() || tinggiBadanText.isEmpty() || beratBadanText.isEmpty() || catatan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
            return;
        }

        try {
            int usia = Integer.parseInt(usiaText);
            int tinggiBadan = Integer.parseInt(tinggiBadanText);
            int beratBadan = Integer.parseInt(beratBadanText);

            controller.create(nama, usia, beratBadan, tinggiBadan, catatan);
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");

            if (tableBalita != null) {
                tableBalita.loadTable(); // Refresh the table in TableLansia
                tableBalita.setVisible(true); // Menampilkan table balita
            } else {
                TableBalita newTableFrame = new TableBalita();
                newTableFrame.setVisible(true);
            }
            this.dispose(); // Menutup AddBalita
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Input usia, tinggi badan, dan berat badan harus berupa angka!");
        }
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked
        
    }//GEN-LAST:event_jButtonCancelMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBalita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel header;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JLabel jLabelBeratBadan;
    private javax.swing.JLabel jLabelCatatan;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelTinggiBadan;
    private javax.swing.JLabel jLabelUsia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextBeratBadan;
    private javax.swing.JTextField jTextCatatan;
    private javax.swing.JTextField jTextNama;
    private javax.swing.JTextField jTextTinggiBadan;
    private javax.swing.JTextField jTextUsia;
    // End of variables declaration//GEN-END:variables
}
