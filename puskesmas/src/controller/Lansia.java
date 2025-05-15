package controller;
import orang.DataOrang;
import java.util.ArrayList;
import java.util.List;

public class Lansia extends DataOrang {

    public Lansia(int id, String nama, int usia) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
    }

    private List<Lansia> lansiaList = new ArrayList<>();
    private int idCounter = 1;

    @Override
    public void create() {
        // contoh input dummy karena abstract method gak ada parameter
        Lansia l = new Lansia(idCounter++, "Default Nama", 65);
        lansiaList.add(l);
        System.out.println("✅ Data lansia ditambahkan: " + l.nama);
    }

    @Override
    public void read() {
        System.out.println("📋 Data Lansia:");
        for (Lansia lansia : lansiaList) {
            System.out.println(lansia.id + ". " + lansia.nama + " - " + lansia.usia + " tahun");
        }
    }

    @Override
    public void update(int id) {
        for (Lansia lansia : lansiaList) {
            if (lansia.id == id) {
                lansia.nama = "Updated Name";
                lansia.usia = 99;
                System.out.println("✅ Data lansia ID " + id + " diperbarui ke default value.");
                return;
            }
        }
        System.out.println("❌ Lansia dengan ID " + id + " tidak ditemukan!");
    }

    public void update(int id, String nama, int usia) {
        for (Lansia lansia : lansiaList) {
            if (lansia.id == id) {
                lansia.nama = nama;
                lansia.usia = usia;
                System.out.println("✅ Data lansia diperbarui: " + nama);
                return;
            }
        }
        System.out.println("❌ Lansia dengan ID " + id + " tidak ditemukan!");
    }

    @Override
    public void delete(int id) {
        lansiaList.removeIf(lansia -> lansia.id == id);
        System.out.println("🗑 Data lansia dengan ID " + id + " telah dihapus.");
    }
}
