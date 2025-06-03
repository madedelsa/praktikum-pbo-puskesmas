package frame;

import com.raven.main.Main;
import javax.swing.JOptionPane;
import util.SessionManager;


public class Dashboard extends javax.swing.JFrame {
    

    public Dashboard() {
        initComponents();
        configureDashboardBasedOnRole();
    }

    private void configureDashboardBasedOnRole() {
        String role = SessionManager.getLoggedInRole();
        if (role == null) {
            // Should not happen if navigated from successful login, but good for safety
            JOptionPane.showMessageDialog(this, "User not logged in.", "Error", JOptionPane.ERROR_MESSAGE);
            new Main().setVisible(true); // Go back to login
            this.dispose();
            return;
        }

        if (role.equalsIgnoreCase("admin")) {
            jButtonBalita.setVisible(false); // Hide Balita data for admin
            jButtonLansia.setVisible(false); // Hide Lansia data for admin
            jButtonManageUsers.setVisible(true); // Show Manage Users for admin
            header.setText("Aplikasi Posyandu (Admin)");
        } else if (role.equalsIgnoreCase("pegawai")) {
            jButtonBalita.setVisible(true); // Show Balita data for pegawai
            jButtonLansia.setVisible(true); // Show Lansia data for pegawai
            jButtonManageUsers.setVisible(false); // Hide Manage Users for pegawai
            header.setText("Aplikasi Posyandu (Pegawai)");
        } else {
            // Handle other roles or unknown roles
            JOptionPane.showMessageDialog(this, "Unknown user role: " + role, "Error", JOptionPane.ERROR_MESSAGE);
            new Main().setVisible(true); // Go back to login
            this.dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        jButtonBalita = new javax.swing.JButton();
        jButtonLansia = new javax.swing.JButton();
        jButtonKeluar = new javax.swing.JButton();
        jButtonManageUsers = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(120, 134, 199));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setFont(new java.awt.Font("Palatino Linotype", 1, 30)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Aplikasi Posyandu Puskesmas Tambak Bayan");

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setText("Menu");

        jButtonBalita.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jButtonBalita.setForeground(new java.awt.Color(120, 134, 199));
        jButtonBalita.setText("Data Balita");
        jButtonBalita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBalita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBalitaActionPerformed(evt);
            }
        });

        jButtonLansia.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jButtonLansia.setForeground(new java.awt.Color(120, 134, 199));
        jButtonLansia.setText("Data Lansia");
        jButtonLansia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLansia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLansiaActionPerformed(evt);
            }
        });

        jButtonKeluar.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jButtonKeluar.setForeground(new java.awt.Color(255, 102, 102));
        jButtonKeluar.setText("Keluar");
        jButtonKeluar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeluarActionPerformed(evt);
            }
        });

        jButtonManageUsers.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jButtonManageUsers.setForeground(new java.awt.Color(120, 134, 199));
        jButtonManageUsers.setText("Kelola Pengguna");
        jButtonManageUsers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonManageUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBalita, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLansia, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(235, 235, 235))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(header)
                .addGap(51, 51, 51)
                .addComponent(menu)
                .addGap(18, 18, 18)
                .addComponent(jButtonBalita)
                .addGap(34, 34, 34)
                .addComponent(jButtonLansia)
                .addGap(18, 18, 18)
                .addComponent(jButtonManageUsers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButtonKeluar)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    private void jButtonBalitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBalitaActionPerformed
        TableBalita tableBalita = new TableBalita();
        tableBalita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBalitaActionPerformed

    private void jButtonLansiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLansiaActionPerformed
        TableLansia tableLansia = new TableLansia();
        tableLansia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonLansiaActionPerformed

    private void jButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeluarActionPerformed
        int pilihan = JOptionPane.showConfirmDialog(
            this,
            "Apakah Anda yakin akan keluar?",
            "Konfirmasi Keluar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (pilihan == JOptionPane.YES_OPTION) {
            new com.raven.main.Main().setVisible(true);  // Tampilkan form login
            this.dispose();  // Tutup form saat ini
        }
    }//GEN-LAST:event_jButtonKeluarActionPerformed

    private void jButtonManageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageUsersActionPerformed
        TableUser tableUser = new TableUser(); 
        tableUser.setVisible(true); 
        this.dispose();     
    }//GEN-LAST:event_jButtonManageUsersActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel header;
    private javax.swing.JButton jButtonBalita;
    private javax.swing.JButton jButtonKeluar;
    private javax.swing.JButton jButtonLansia;
    private javax.swing.JButton jButtonManageUsers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel menu;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
