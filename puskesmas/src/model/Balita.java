package model;

public class Balita {
    private int id;
    private String nama;
    private int usia;
    private int beratBadan;
    private int tinggiBadan;
    private String catatan;

    // Constructor untuk tambah data baru (tanpa ID)
    public Balita(String nama, int usia, int beratBadan, int tinggiBadan, String catatan) {
        this.nama = nama;
        this.usia = usia;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
        this.catatan = catatan;
    }

    // Constructor untuk ambil data dari database (dengan ID)
    public Balita(int id, String nama, int usia, int beratBadan, int tinggiBadan, String catatan) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
        this.catatan = catatan;
    }

    // Getters dan Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getUsia() { return usia; }
    public void setUsia(int usia) { this.usia = usia; }

    public int getBeratBadan() { return beratBadan; }
    public void setBeratBadan(int beratBadan) { this.beratBadan = beratBadan; }

    public int getTinggiBadan() { return tinggiBadan; }
    public void setTinggiBadan(int tinggiBadan) { this.tinggiBadan = tinggiBadan; }

    public String getCatatan() { return catatan; }
    public void setCatatan(String catatan) { this.catatan = catatan; }

    @Override
    public String toString() {
        return "Balita{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", usia=" + usia +
                ", beratBadan=" + beratBadan +
                ", tinggiBadan=" + tinggiBadan +
                ", catatan='" + catatan + '\'' +
                '}';
    }
}