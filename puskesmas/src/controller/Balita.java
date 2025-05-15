package controller;

import config.DatabaseConnection;
import orang.DataOrang;
import java.sql.*;

public class Balita extends DataOrang {

    private double beratBadan;
    private double tinggiBadan;
    private String catatan;

    @Override
    public void create() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO balita (nama, usia, berat_badan, tinggi_badan, catatan) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Default Balita");
            stmt.setInt(2, 2);
            stmt.setDouble(3, 10.0);
            stmt.setDouble(4, 80.0);
            stmt.setString(5, "Catatan default");
            stmt.executeUpdate();
            System.out.println("✅ Data balita ditambahkan.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void create(String nama, int usia, double berat, double tinggi, String catatan) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO balita (nama, usia, berat_badan, tinggi_badan, catatan) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nama);
            stmt.setInt(2, usia);
            stmt.setDouble(3, berat);
            stmt.setDouble(4, tinggi);
            stmt.setString(5, catatan);
            stmt.executeUpdate();
            System.out.println("✅ Data balita ditambahkan: " + nama);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM balita";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("📋 Data Balita:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ". " + rs.getString("nama") + " | usia: " + rs.getInt("usia") +
                        " tahun | berat: " + rs.getDouble("berat_badan") + " kg | tinggi: " +
                        rs.getDouble("tinggi_badan") + " cm | catatan: " + rs.getString("catatan"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(int id) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE balita SET nama=?, usia=?, berat_badan=?, tinggi_badan=?, catatan=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Updated Balita");
            stmt.setInt(2, 3);
            stmt.setDouble(3, 12.0);
            stmt.setDouble(4, 85.0);
            stmt.setString(5, "Updated catatan");
            stmt.setInt(6, id);
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("✅ Data balita diperbarui.");
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
            String sql = "DELETE FROM balita WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("🗑 Data balita dihapus.");
            } else {
                System.out.println("❌ ID tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
