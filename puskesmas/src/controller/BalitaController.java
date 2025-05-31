package controller;

import config.DatabaseConnection;
import orang.DataOrang;
import java.sql.*;
import dao.BalitaDAO;
import model.Balita;

public class BalitaController extends DataOrang {

    private int beratBadan;
    private int tinggiBadan;
    private String catatan;
    public final BalitaDAO balitaDAO;
    public BalitaController() {
        this.balitaDAO = new BalitaDAO();
    }

    
    public void create() {
        Balita balita = new Balita("Default Balita", 5, 100, 20, "Tidak ada catatan");
        balitaDAO.create(balita);
    }

    public void create(String nama, int usia, int berat, int tinggi, String catatan) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO catatan_balita (nama, usia, berat_badan, tinggi_badan, catatan) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nama);
            stmt.setInt(2, usia);
            stmt.setInt(3, berat);
            stmt.setInt(4, tinggi);
            stmt.setString(5, catatan);
            stmt.executeUpdate();
            System.out.println("✅ Data balita ditambahkan: " + nama);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        System.out.println("📋 Data Lansia:");
        for (Balita balita : balitaDAO.read()) {
            System.out.println(balita);
        }
    }

    @Override
    public void update(int id) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE catatan_balita SET nama=?, usia=?, berat_badan=?, tinggi_badan=?, catatan=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Updated Balita");
            stmt.setInt(2, 3);
            stmt.setInt(3, 12);
            stmt.setInt(4, 85);
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
    
    public void update(int id, String nama, int usia, int tinggiBadan, int beratBadan, String catatan) {
        Balita balita = new Balita(id, nama, usia, beratBadan, tinggiBadan, catatan);
        balitaDAO.update(balita);
    }
    
    public void update(int id, String nama, int usia) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM catatan_balita WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Balita balita = new Balita(
                    id,
                    nama,
                    usia,
                    rs.getInt("tinggi_badan"),
                    rs.getInt("berat_badan"),
                    rs.getString("catatan")
                );
                balitaDAO.update(balita);
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
            String sql = "DELETE FROM catatan_balita WHERE id=?";
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