package dao;

import config.DatabaseConnection;
import model.Balita;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BalitaDAO {

    public void create(Balita balita) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO catatan_balita (nama, usia, berat_badan, tinggi_badan, catatan) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, balita.getNama());
            stmt.setInt(2, balita.getUsia());
            stmt.setInt(3, balita.getBeratBadan());
            stmt.setInt(4, balita.getTinggiBadan());
            stmt.setString(5, balita.getCatatan());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Balita> read() {
        List<Balita> balitaList = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM catatan_balita"; // Pastikan nama tabel benar
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Balita balita = new Balita(
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getInt("usia"),
                    rs.getInt("berat_badan"),
                    rs.getInt("tinggi_badan"),
                    rs.getString("catatan")
                );
                balitaList.add(balita);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return balitaList;
    }

    public void update(Balita balita) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE catatan_balita SET nama=?, usia=?, berat_badan=?, tinggi_badan=?, catatan=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, balita.getNama());
            stmt.setInt(2, balita.getUsia());
            stmt.setInt(3, balita.getBeratBadan()); 
            stmt.setInt(4, balita.getTinggiBadan()); 
            stmt.setString(5, balita.getCatatan());
            stmt.setInt(6, balita.getId());
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

    public void delete(int id) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM catatan_balita WHERE id=?"; // Pastikan nama tabel benar
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