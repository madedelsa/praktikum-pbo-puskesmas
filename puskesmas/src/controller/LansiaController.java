package controller;

import config.DatabaseConnection;
import orang.DataOrang;
import java.sql.*;

public class Lansia extends DataOrang {

    @Override
    public void create() {
        // contoh data dummy
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO lansia (nama, usia) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Default Lansia");
            stmt.setInt(2, 70);
            stmt.executeUpdate();
            System.out.println("✅ Data lansia ditambahkan ke database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void create(String nama, int usia) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO lansia (nama, usia) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nama);
            stmt.setInt(2, usia);
            stmt.executeUpdate();
            System.out.println("✅ Data lansia ditambahkan: " + nama);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM lansia";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("📋 Data Lansia:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ". " + rs.getString("nama") + " - " + rs.getInt("usia") + " tahun");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(int id) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE lansia SET nama=?, usia=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Updated Lansia");
            stmt.setInt(2, 99);
            stmt.setInt(3, id);
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("✅ Data lansia diperbarui.");
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
            String sql = "DELETE FROM lansia WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("🗑 Data lansia dihapus.");
            } else {
                System.out.println("❌ ID tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
