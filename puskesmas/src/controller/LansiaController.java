package controller;

import config.DatabaseConnection;
import dao.LansiaDAO;
import model.Lansia;
import orang.DataOrang;
import java.sql.*;

public class LansiaController extends DataOrang {
    private final LansiaDAO lansiaDAO;

    public LansiaController() {
        this.lansiaDAO = new LansiaDAO();
    }

    @Override
    public void create() {
        // Default values for dummy data
        Lansia lansia = new Lansia("Default Lansia", 70, 120, 80, 120, "Tidak ada catatan");
        lansiaDAO.create(lansia);
    }

   
    public void create(String nama, int usia) {
        // Use default values for new fields
        Lansia lansia = new Lansia(nama, usia, 120, 80, 120, "Tidak ada catatan");
        lansiaDAO.create(lansia);
    }

    public void create(String nama, int usia, int gulaDarah, int tdDiastolik, int tdSistolik, String catatan) {
        Lansia lansia = new Lansia(nama, usia, gulaDarah, tdDiastolik, tdSistolik, catatan);
        lansiaDAO.create(lansia);
    }

    @Override
    public void read() {
        System.out.println("📋 Data Lansia:");
        for (Lansia lansia : lansiaDAO.read()) {
            System.out.println(lansia);
        }
    }

    @Override
    public void update(int id) {
        // Default values for update
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM lansia WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Lansia lansia = new Lansia(
                    id,
                    "Updated Lansia",
                    99,
                    rs.getInt("gula_darah"),
                    rs.getInt("td_diastolik"),
                    rs.getInt("td_sistolik"),
                    rs.getString("catatan")
                );
                lansiaDAO.update(lansia);
            } else {
                System.out.println("❌ ID tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, String nama, int usia, int gulaDarah, int tdDiastolik, int tdSistolik, String catatan) {
        Lansia lansia = new Lansia(id, nama, usia, gulaDarah, tdDiastolik, tdSistolik, catatan);
        lansiaDAO.update(lansia);
    }

   
    public void update(int id, String nama, int usia) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM lansia WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Lansia lansia = new Lansia(
                    id,
                    nama,
                    usia,
                    rs.getInt("gula_darah"),
                    rs.getInt("td_diastolik"),
                    rs.getInt("td_sistolik"),
                    rs.getString("catatan")
                );
                lansiaDAO.update(lansia);
            } else {
                System.out.println("❌ ID tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        lansiaDAO.delete(id);
    }
}