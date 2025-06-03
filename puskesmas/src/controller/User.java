package controller;

import config.DatabaseConnection;
import orang.DataOrang;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class User extends DataOrang {
    
    private String username;
    private String password;
    private String email;
    private String telepon;
    private String role;

    // Getter and setter for role (added for user management)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    // Constructor to set all properties
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

    // Default constructor (important for instantiation)
    public User() {
        // Default constructor
    }


    @Override
    public void create() {
        // This default create might not be used directly if you always use the overloaded one
        System.out.println("Using default create method for User (not recommended).");
    }

    public void create(String nama, int usia, String username, String password, String email, String telepon, String role) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO users (nama, usia, username, password, email, telepon, role) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nama);
            stmt.setInt(2, usia);
            stmt.setString(3, username);
            stmt.setString(4, password);
            stmt.setString(5, email);
            stmt.setString(6, telepon);
            stmt.setString(7, role);
            stmt.executeUpdate();
            System.out.println("✅ User " + username + " ditambahkan.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding user: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Modified authenticateUser to return role
    public String authenticateUser(String username, String password) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT role FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("role"); // Return the role if authenticated
            }
            return null; // Return null if not authenticated
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error during authentication: " + e.getMessage(), "Authentication Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    // Method to read all users (for Admin Table)
    @Override
    public void read() {
        // This read method might not be used directly as we'll fetch a list of User objects
    }

    public java.util.List<User> getAllUsers() {
        java.util.List<User> userList = new java.util.ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT id, nama, usia, username, password, email, telepon, role FROM users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                userList.add(new User(
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getInt("usia"),
                    rs.getString("username"),
                    rs.getString("password"), // Be careful with exposing password, consider hashing
                    rs.getString("email"),
                    rs.getString("telepon"),
                    rs.getString("role")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading users: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return userList;
    }

    // Method to get a single user by ID
    public User getUserById(int id) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT id, nama, usia, username, password, email, telepon, role FROM users WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new User(
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getInt("usia"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("email"),
                    rs.getString("telepon"),
                    rs.getString("role")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error getting user by ID: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }


    @Override
    public void update(int id) {
        // This default update might not be used directly if you always use the overloaded one
        System.out.println("Using default update method for User (not recommended).");
    }

    public void update(int id, String nama, int usia, String username, String password, String email, String telepon, String role) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE users SET nama=?, usia=?, username=?, password=?, email=?, telepon=?, role=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nama);
            stmt.setInt(2, usia);
            stmt.setString(3, username);
            stmt.setString(4, password);
            stmt.setString(5, email);
            stmt.setString(6, telepon);
            stmt.setString(7, role);
            stmt.setInt(8, id);
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("✅ Data user ID " + id + " diperbarui.");
            } else {
                System.out.println("❌ ID user tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating user: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(int id) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM users WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("🗑 Data user ID " + id + " dihapus.");
            } else {
                System.out.println("❌ ID user tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error deleting user: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}