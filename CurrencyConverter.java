/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.currencyconverter;

/**
 *
 * @author RAHUL KUSHWAHA
 */
import javax.swing.*;
import java.awt.event.*;

public class CurrencyConverter extends JFrame implements ActionListener {

    JLabel lblAmount, lblFrom, lblTo, lblResult;
    JTextField txtAmount;
    JComboBox<String> cbFrom, cbTo;
    JButton btnConvert;

    String[] currencies = {"INR", "USD", "EUR", "GBP"};

    // Constructor
    CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Amount
        lblAmount = new JLabel("Amount:");
        lblAmount.setBounds(50, 30, 100, 30);
        add(lblAmount);

        txtAmount = new JTextField();
        txtAmount.setBounds(150, 30, 150, 30);
        add(txtAmount);

        // From Currency
        lblFrom = new JLabel("From:");
        lblFrom.setBounds(50, 80, 100, 30);
        add(lblFrom);

        cbFrom = new JComboBox<>(currencies);
        cbFrom.setBounds(150, 80, 150, 30);
        add(cbFrom);

        // To Currency
        lblTo = new JLabel("To:");
        lblTo.setBounds(50, 130, 100, 30);
        add(lblTo);

        cbTo = new JComboBox<>(currencies);
        cbTo.setBounds(150, 130, 150, 30);
        add(cbTo);

        // Button
        btnConvert = new JButton("Convert");
        btnConvert.setBounds(120, 180, 120, 30);
        add(btnConvert);

        // Result
        lblResult = new JLabel("Result: ");
        lblResult.setBounds(100, 220, 200, 30);
        add(lblResult);

        btnConvert.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Conversion Logic (Fixed Rates)
    public double getRate(String from, String to) {

        // Base: INR
        double inr = 1.0;
        double usd = 83.0;
        double eur = 90.0;
        double gbp = 100.0;

        double fromRate = 0, toRate = 0;

        if (from.equals("INR")) fromRate = inr;
        if (from.equals("USD")) fromRate = usd;
        if (from.equals("EUR")) fromRate = eur;
        if (from.equals("GBP")) fromRate = gbp;

        if (to.equals("INR")) toRate = inr;
        if (to.equals("USD")) toRate = usd;
        if (to.equals("EUR")) toRate = eur;
        if (to.equals("GBP")) toRate = gbp;

        return toRate / fromRate;
    }

    // Button Action
    public void actionPerformed(ActionEvent e) {
        try {
            double amount = Double.parseDouble(txtAmount.getText());
            String from = cbFrom.getSelectedItem().toString();
            String to = cbTo.getSelectedItem().toString();

            double rate = getRate(from, to);
            double result = amount * rate;

            lblResult.setText("Result: " + result + " " + to);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Enter valid amount!");
        }
    }

    // Main Method
    public static void main(String[] args) {
        new CurrencyConverter();
    }
}