package controller;

import config.DatabaseConnection;
import orang.DataOrang;
import java.sql.*;

public class User extends DataOrang {
    
    private String username;
    private String password;
    private String email;
    private String telepon;
    private String role;

    @Override
    public void create() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO users (nama, usia, username, password, email, telepon, role) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Default User");
            stmt.setInt(2, 30);
            stmt.setString(3, "defaultuser");
            stmt.setString(4, "123456");
            stmt.setString(5, "default@example.com");
            stmt.setString(6, "081234567890");
            stmt.setString(7, "pegawai");
            stmt.executeUpdate();
            System.out.println("✅ User ditambahkan.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void create(String nama, int usia, String username, String password, String email, String telepon, String role) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO users (nama, usia, username, password, email, telepon, role) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nama);
            stmt.setInt(2, usia);
            stmt.setString(3, username);
            stmt.setString(4, password);
            stmt.setString(5, email);
            stmt.setString(6, telepon);
            stmt.setString(7, role);
            stmt.executeUpdate();
            System.out.println("✅ User " + username + " ditambahkan.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("📋 Data User:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ". " + rs.getString("nama") + " | role: " + rs.getString("role"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(int id) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE users SET nama=?, usia=?, username=?, password=?, email=?, telepon=?, role=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Updated Name");
            stmt.setInt(2, 25);
            stmt.setString(3, "updateduser");
            stmt.setString(4, "updatedpass");
            stmt.setString(5, "update@example.com");
            stmt.setString(6, "08999999999");
            stmt.setString(7, "admin");
            stmt.setInt(8, id);
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("✅ Data user diperbarui.");
            } else {
                System.out.println("❌ ID tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM users WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("🗑 Data user dihapus.");
            } else {
                System.out.println("❌ ID tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
