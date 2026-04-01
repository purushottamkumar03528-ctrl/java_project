/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginform;

/**
 *
 * @author RAHUL KUSHWAHA
 */
import javax.swing.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {

    // Components
    JLabel lblUser, lblPass;
    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin;

    // Constructor
    LoginForm() {
        setTitle("Login Form");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Username Label
        lblUser = new JLabel("Username:");
        lblUser.setBounds(50, 30, 80, 25);
        add(lblUser);

        // Username TextField
        txtUser = new JTextField();
        txtUser.setBounds(150, 30, 120, 25);
        add(txtUser);

        // Password Label
        lblPass = new JLabel("Password:");
        lblPass.setBounds(50, 70, 80, 25);
        add(lblPass);

        // Password Field
        txtPass = new JPasswordField();
        txtPass.setBounds(150, 70, 120, 25);
        add(txtPass);

        // Login Button
        btnLogin = new JButton("Login");
        btnLogin.setBounds(120, 110, 100, 30);
        add(btnLogin);

        // Action Listener
        btnLogin.addActionListener(this);

        setLocationRelativeTo(null); // Center screen
        setVisible(true);
    }

    // Action Event
    public void actionPerformed(ActionEvent e) {
        String username = txtUser.getText();
        String password = new String(txtPass.getPassword());

        // Simple validation
        if (username.equals("amrasraj") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password");
        }
    }

    // Main Method
    public static void main(String[] args) {
        new LoginForm();
    }
}