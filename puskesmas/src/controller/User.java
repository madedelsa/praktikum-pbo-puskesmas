package controller;

import orang.DataOrang;
import java.util.ArrayList;
import java.util.List;

public class User extends DataOrang {

    private String username;
    private String password;
    private String email;
    private String telepon;
    private String role; // "admin" atau "pegawai"

    public User(int id, String nama, int usia, String username, String password, String email, String telepon, String role) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.username = username;
        this.password = password;
        this.email = email;
        this.telepon = telepon;
        this.role = role;
    }

    private List<User> userList = new ArrayList<>();
    private int idCounter = 1;

    @Override
    public void create() {
        User u = new User(idCounter++, "Default User", 30, "default", "1234", "default@mail.com", "0800000000", "pegawai");
        userList.add(u);
        System.out.println("✅ User ditambahkan: " + u.nama);
    }

    public void create(String nama, int usia, String username, String password, String email, String telepon, String role) {
        User u = new User(idCounter++, nama, usia, username, password, email, telepon, role);
        userList.add(u);
        System.out.println("✅ User ditambahkan: " + nama);
    }

    @Override
    public void read() {
        System.out.println("📋 Data User:");
        for (User u : userList) {
            System.out.println(u.id + ". " + u.nama + " | Role: " + u.role + " | Username: " + u.username);
        }
    }

    @Override
    public void update(int id) {
        for (User u : userList) {
            if (u.id == id) {
                u.nama = "Updated User";
                u.usia = 99;
                u.username = "updated";
                u.password = "0000";
                u.email = "updated@mail.com";
                u.telepon = "0811111111";
                u.role = "pegawai";
                System.out.println("✅ User ID " + id + " diperbarui.");
                return;
            }
        }
        System.out.println("❌ User dengan ID " + id + " tidak ditemukan!");
    }

    public void update(int id, String nama, int usia, String username, String password, String email, String telepon, String role) {
        for (User u : userList) {
            if (u.id == id) {
                u.nama = nama;
                u.usia = usia;
                u.username = username;
                u.password = password;
                u.email = email;
                u.telepon = telepon;
                u.role = role;
                System.out.println("✅ User diperbarui: " + nama);
                return;
            }
        }
        System.out.println("❌ User dengan ID " + id + " tidak ditemukan!");
    }

    @Override
    public void delete(int id) {
        userList.removeIf(u -> u.id == id);
        System.out.println("🗑 User dengan ID " + id + " telah dihapus.");
    }
}
