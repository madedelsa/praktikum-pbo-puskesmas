package com.raven.component;

import com.raven.swing.Button;
import com.raven.swing.MyPasswordField;
import com.raven.swing.MyTextField;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import controller.User; // Import the User controller
import frame.Dashboard; // Import the Dashboard frame
import javax.swing.JOptionPane; // For displaying messages
import javax.swing.SwingUtilities; // To get the window ancestor
import util.SessionManager; // Import SessionManager

public class PanelLoginAndRegister extends javax.swing.JLayeredPane {

    private User userController = new User(); // Instantiate the User controller

    public PanelLoginAndRegister() {
        initComponents();
        initRegister();
        initLogin();
        login.setVisible(false);
        register.setVisible(true);
        // Tombol close untuk register
        JButton closeButtonRegister = new JButton("X");
        closeButtonRegister.setForeground(new Color(45, 51, 107));
        closeButtonRegister.setFont(new Font("SansSerif", Font.BOLD, 16));
        closeButtonRegister.setContentAreaFilled(false);
        closeButtonRegister.setBorderPainted(false);
        closeButtonRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
        closeButtonRegister.addActionListener(e -> System.exit(0));
        register.add(closeButtonRegister, "pos 94% 1%");

        // Tombol close untuk login
        JButton closeButtonLogin = new JButton("X");
        closeButtonLogin.setForeground(new Color(45, 51, 107));
        closeButtonLogin.setFont(new Font("SansSerif", Font.BOLD, 16));
        closeButtonLogin.setContentAreaFilled(false);
        closeButtonLogin.setBorderPainted(false);
        closeButtonLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        closeButtonLogin.addActionListener(e -> System.exit(0));
        login.add(closeButtonLogin, "pos 94% 1%");
        
    }

    private void initRegister() {
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Create Account");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(45, 51, 107));
        register.add(label);
        MyTextField txtName = new MyTextField(); // Renamed to txtName for clarity for registration name
        txtName.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/user.png")));
        txtName.setHint("Name");
        register.add(txtName, "w 60%");
        MyTextField txtUsernameRegister = new MyTextField(); // Renamed for registration username
        txtUsernameRegister.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/mail.png")));
        txtUsernameRegister.setHint("Username");
        register.add(txtUsernameRegister, "w 60%");
        MyPasswordField txtPassRegister = new MyPasswordField(); // Renamed for registration password
        txtPassRegister.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/pass.png")));
        txtPassRegister.setHint("Password");
        register.add(txtPassRegister, "w 60%");
        Button cmdRegister = new Button(); // Renamed button for clarity
        cmdRegister.setBackground(new Color(45, 51, 107));
        cmdRegister.setForeground(new Color(169, 181, 223));
        cmdRegister.setText("SIGN UP");
        cmdRegister.addActionListener(e -> {
            String name = txtName.getText();
            String username = txtUsernameRegister.getText();
            String password = String.valueOf(txtPassRegister.getPassword());

            if (name.isEmpty() || username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled for registration.", "Registration Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Provide default/dummy values for the missing parameters (usia, email, telepon, role)
            // For simplicity, new registrations will default to 'pegawai'
            int usia = 0; // You might want to add a field for age in the UI
            String email = username + "@example.com"; // A simple default email
            String telepon = ""; // You might want to add a field for phone number
            String role = "pegawai"; // Default role for new registrations

            userController.create(name, usia, username, password, email, telepon, role); // Pass all required parameters
            JOptionPane.showMessageDialog(this, "Registration successful! You can now log in.", "Registration Success", JOptionPane.INFORMATION_MESSAGE);
            // Optionally, switch to login panel after successful registration
            showRegister(false); // Show login panel
        });
        register.add(cmdRegister, "w 40%, h 40");
    }

    private void initLogin() {
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Sign In");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(169, 181, 223));
        login.add(label);
        MyTextField txtUsernameLogin = new MyTextField(); // Renamed for login username
        txtUsernameLogin.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/mail.png")));
        txtUsernameLogin.setHint("Username");
        login.add(txtUsernameLogin, "w 60%");
        MyPasswordField txtPassLogin = new MyPasswordField(); // Renamed for login password
        txtPassLogin.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/pass.png")));
        txtPassLogin.setHint("Password");
        login.add(txtPassLogin, "w 60%");
        JButton cmdForget = new JButton("Forgot your password ?");
        cmdForget.setForeground(new Color(100, 100, 100));
        cmdForget.setFont(new Font("sansserif", 1, 12));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdForget);
        Button cmdLogin = new Button(); // Renamed button for clarity
        cmdLogin.setBackground(new Color(45, 51, 107));
        cmdLogin.setForeground(new Color(250, 250, 250));
        cmdLogin.setText("SIGN IN");
        cmdLogin.addActionListener(e -> {
            String username = txtUsernameLogin.getText();
            String password = String.valueOf(txtPassLogin.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username and password cannot be empty.", "Login Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String role = userController.authenticateUser(username, password);
            if (role != null) {
                JOptionPane.showMessageDialog(this, "Login successful as " + role + "!", "Login Success", JOptionPane.INFORMATION_MESSAGE);
                // Store session information
                SessionManager.setLoggedInUser(username, role);

                // Navigate to Dashboard
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);
                // Close the current login frame
                SwingUtilities.getWindowAncestor(this).dispose(); 
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        });
        login.add(cmdLogin, "w 40%, h 40");
    }

    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(true);
            login.setVisible(false);
        } else {
            register.setVisible(false);
            login.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
