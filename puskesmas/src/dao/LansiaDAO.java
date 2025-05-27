package dao;

import config.DatabaseConnection;
import model.Lansia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LansiaDAO {

    public void create(Lansia lansia) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO lansia (nama, usia, gula_darah, td_diastolik, td_sistolik, catatan) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, lansia.getNama());
            stmt.setInt(2, lansia.getUsia());
            stmt.setInt(3, lansia.getGulaDarah());
            stmt.setInt(4, lansia.getTdDiastolik());
            stmt.setInt(5, lansia.getTdSistolik());
            stmt.setString(6, lansia.getCatatan());
            stmt.executeUpdate();
            System.out.println("✅ Data lansia ditambahkan: " + lansia.getNama());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Lansia> read() {
        List<Lansia> lansiaList = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM lansia";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Lansia lansia = new Lansia(
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getInt("usia"),
                    rs.getInt("gula_darah"),
                    rs.getInt("td_diastolik"),
                    rs.getInt("td_sistolik"),
                    rs.getString("catatan")
                );
                lansiaList.add(lansia);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lansiaList;
    }

    public void update(Lansia lansia) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE lansia SET nama=?, usia=?, gula_darah=?, td_diastolik=?, td_sistolik=?, catatan=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, lansia.getNama());
            stmt.setInt(2, lansia.getUsia());
            stmt.setInt(3, lansia.getGulaDarah());
            stmt.setInt(4, lansia.getTdDiastolik());
            stmt.setInt(5, lansia.getTdSistolik());
            stmt.setString(6, lansia.getCatatan());
            stmt.setInt(7, lansia.getId());
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