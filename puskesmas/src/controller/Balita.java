package controller;

import orang.DataOrang;
import java.util.ArrayList;
import java.util.List;

public class Balita extends DataOrang {

    private double beratBadan;
    private double tinggiBadan;
    private String catatan;

    public Balita(int id, String nama, int usia, double beratBadan, double tinggiBadan, String catatan) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
        this.catatan = catatan;
    }

    private List<Balita> balitaList = new ArrayList<>();
    private int idCounter = 1;

    @Override
    public void create() {
        Balita b = new Balita(idCounter++, "Default Balita", 1, 10.5, 75.0, "Sehat");
        balitaList.add(b);
        System.out.println("✅ Data balita ditambahkan: " + b.nama);
    }

    public void create(String nama, int usia, double berat, double tinggi, String catatan) {
        Balita b = new Balita(idCounter++, nama, usia, berat, tinggi, catatan);
        balitaList.add(b);
        System.out.println("✅ Data balita ditambahkan: " + nama);
    }

    @Override
    public void read() {
        System.out.println("📋 Data Balita:");
        for (Balita b : balitaList) {
            System.out.println(b.id + ". " + b.nama + " - " + b.usia + " tahun, Berat: " + b.beratBadan + "kg, Tinggi: " + b.tinggiBadan + "cm, Catatan: " + b.catatan);
        }
    }

    @Override
    public void update(int id) {
        for (Balita b : balitaList) {
            if (b.id == id) {
                b.nama = "Updated Balita";
                b.usia = 2;
                b.beratBadan = 11.0;
                b.tinggiBadan = 80.0;
                b.catatan = "Catatan diperbarui";
                System.out.println("✅ Data balita ID " + id + " diperbarui.");
                return;
            }
        }
        System.out.println("❌ Balita dengan ID " + id + " tidak ditemukan!");
    }

    public void update(int id, String nama, int usia, double berat, double tinggi, String catatan) {
        for (Balita b : balitaList) {
            if (b.id == id) {
                b.nama = nama;
                b.usia = usia;
                b.beratBadan = berat;
                b.tinggiBadan = tinggi;
                b.catatan = catatan;
                System.out.println("✅ Data balita diperbarui: " + nama);
                return;
            }
        }
        System.out.println("❌ Balita dengan ID " + id + " tidak ditemukan!");
    }

    @Override
    public void delete(int id) {
        balitaList.removeIf(b -> b.id == id);
        System.out.println("🗑 Data balita dengan ID " + id + " telah dihapus.");
    }
}
