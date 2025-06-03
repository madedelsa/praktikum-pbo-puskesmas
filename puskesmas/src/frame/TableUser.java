package frame;

import controller.User; // Mengimpor kelas User dari package controller
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*; // Import AWT for layout and colors
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TableUser extends javax.swing.JFrame {
    User userController = new User(); // Instansiasi objek controller.User
    private int selectedId = -1; // Menyimpan ID user yang dipilih dari tabel

    // --- DEKLARASI KOMPONEN UI SEBAGAI ANGGOTA KELAS ---
    // Ini harus dideklarasikan di sini agar bisa diakses oleh semua method di kelas ini
    private JTextField jTextNama;
    private JTextField jTextUsia;
    private JTextField jTextUsername;
    private JPasswordField jPassword;
    private JTextField jTextEmail;
    private JTextField jTextTelepon;
    private JComboBox<String> jComboBoxRole; // Ini adalah JComboBox untuk memilih role

    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonKeluar;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1; // Judul "Manajemen Akun Pegawai"
    private javax.swing.JLabel jLabel2; // Label "Aksi"
    private javax.swing.JLabel jLabel3; // Label "Nama"
    private javax.swing.JLabel jLabel4; // Label "Usia"
    private javax.swing.JLabel jLabel6; // Label "Username"
    private javax.swing.JLabel jLabel7; // Label "Password"
    private javax.swing.JLabel jLabel8; // Label "Email"
    private javax.swing.JLabel jLabel9; // Label "Telepon"
    private javax.swing.JLabel jLabel10; // Label "Role"
    private javax.swing.JPanel jPanel1; // Panel utama
    private javax.swing.JPanel jPanel2; // Panel kedua (inside jPanel1)
    private javax.swing.JScrollPane jScrollPane2; // Scroll pane untuk tabel
    private javax.swing.JTable jTableUsers;

    public TableUser() {
        initComponents();
        loadTable(); // Memuat data pengguna ke tabel saat frame diinisialisasi
        clearInputFields(); // Bersihkan input fields saat pertama kali dibuka
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonTambah = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsers = new javax.swing.JTable();
        jButtonKeluar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextUsername = new javax.swing.JTextField();
        jTextTelepon = new javax.swing.JTextField();
        jTextNama = new javax.swing.JTextField();
        jTextUsia = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();

        // >>> PENTING: Inisialisasi JComboBox di sini <<<
        jComboBoxRole = new JComboBox<>(new String[]{"admin", "pegawai"});

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 242, 242));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 51, 107));
        jLabel1.setText("Manajemen Akun Pegawai"); // Judul yang benar

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 51, 107));
        jLabel2.setText("Aksi");

        jButtonTambah.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButtonTambah.setText("Tambah");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });

        jButtonUpdate.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButtonUpdate.setText("Ubah");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButtonDelete.setText("Hapus");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jTableUsers.setBackground(new java.awt.Color(169, 181, 223));
        jTableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nama", "Usia", "Username", "Password", "Email", "Telepon", "Role"
            }
        ));
        jTableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableUsers);

        jButtonKeluar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButtonKeluar.setText("Beranda");
        jButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeluarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama");

        jLabel4.setText("Usia");

        jLabel6.setText("Username");

        jLabel7.setText("Password");

        jLabel8.setText("Email");

        jLabel9.setText("Telepon");

        jLabel10.setText("Role");

        jTextUsername.setText("");
        jTextTelepon.setText("");
        jTextNama.setText("");
        jTextNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamaActionPerformed(evt);
            }
        });

        jTextUsia.setText("");
        jTextEmail.setText("");
        jPassword.setText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextUsername))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(29, 29, 29)
                                .addComponent(jTextTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNama, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(jTextEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(48, 48, 48)
                                .addComponent(jComboBoxRole, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)) // >>> Gunakan jComboBoxRole <<<
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(49, 49, 49)
                                .addComponent(jTextUsia, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jPassword)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonTambah, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonKeluar)))
                .addGap(391, 391, 391))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonKeluar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextUsia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))) // >>> Gunakan jComboBoxRole <<<
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>


    protected void loadTable() {
        DefaultTableModel model = new DefaultTableModel(
            new String[]{"ID", "Nama", "Usia", "Username", "Password", "Email", "Telepon", "Role"}, 0);
        try {
            List<User> userList = userController.getAllUsers();
            for (User user : userList) {
                Object[] row = {
                    user.id,
                    user.nama,
                    user.usia,
                    user.getUsername(),
                    user.getPassword(),
                    user.getEmail(),
                    user.getTelepon(),
                    user.getRole()
                };
                model.addRow(row);
            }
            jTableUsers.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal mengambil data user dari database: " + e.getMessage());
            e.printStackTrace();
        }
    }


    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {
        String nama = jTextNama.getText();
        String usiaText = jTextUsia.getText();
        String username = jTextUsername.getText();
        String password = String.valueOf(jPassword.getPassword());
        String email = jTextEmail.getText();
        String telepon = jTextTelepon.getText();
        String role = (String) jComboBoxRole.getSelectedItem(); // Gunakan jComboBoxRole

        if (nama.isEmpty() || usiaText.isEmpty() || username.isEmpty() || password.isEmpty() || email.isEmpty() || telepon.isEmpty() || role.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int usia = Integer.parseInt(usiaText);
            userController.create(nama, usia, username, password, email, telepon, role);
            JOptionPane.showMessageDialog(this, "Akun pegawai berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadTable();
            clearInputFields();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Usia harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        if (selectedId == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data user yang ingin diupdate!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String nama = jTextNama.getText();
        String usiaText = jTextUsia.getText();
        String username = jTextUsername.getText();
        String password = String.valueOf(jPassword.getPassword());
        String email = jTextEmail.getText();
        String telepon = jTextTelepon.getText();
        String role = (String) jComboBoxRole.getSelectedItem(); // Gunakan jComboBoxRole

        if (nama.isEmpty() || usiaText.isEmpty() || username.isEmpty() || password.isEmpty() || email.isEmpty() || telepon.isEmpty() || role.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int usia = Integer.parseInt(usiaText);
            userController.update(selectedId, nama, usia, username, password, email, telepon, role);
            JOptionPane.showMessageDialog(this, "Akun pegawai berhasil diupdate!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadTable();
            clearInputFields();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Usia harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        if (selectedId == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data user yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data user ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            userController.delete(selectedId);
            JOptionPane.showMessageDialog(this, "Data user berhasil dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadTable();
            clearInputFields();
        }
    }


    private void jTableUsersMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            int row = jTableUsers.getSelectedRow();
            if (row >= 0) {
                selectedId = (int) jTableUsers.getValueAt(row, 0);
                jTextNama.setText((String) jTableUsers.getValueAt(row, 1));
                jTextUsia.setText(String.valueOf(jTableUsers.getValueAt(row, 2)));
                jTextUsername.setText((String) jTableUsers.getValueAt(row, 3));
                jPassword.setText((String) jTableUsers.getValueAt(row, 4));
                jTextEmail.setText((String) jTableUsers.getValueAt(row, 5));
                jTextTelepon.setText((String) jTableUsers.getValueAt(row, 6));
                jComboBoxRole.setSelectedItem((String) jTableUsers.getValueAt(row, 7)); // Gunakan jComboBoxRole
            } else {
                clearInputFields();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal mengambil data dari tabel: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void jButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }

    private void jTextNamaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void clearInputFields() {
        selectedId = -1;
        jTextNama.setText("");
        jTextUsia.setText("");
        jTextUsername.setText("");
        jPassword.setText("");
        jTextEmail.setText("");
        jTextTelepon.setText("");
        if (jComboBoxRole.getItemCount() > 0) {
            jComboBoxRole.setSelectedIndex(0);
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    // Note: These need to be manually maintained if you are not using a GUI builder
    // that automatically generates them.
}