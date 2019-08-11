package com.kaihongtan.assignment.atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener.*;
import java.awt.event.*;

public class deposit extends JFrame {
    JLabel message;

    deposit() {
        super("PreedhaKawanku");
        setLayout(new GridLayout(4, 1));
        JButton back = new JButton("Back to Main Menu");
        back.setFont(new Font("Serif", Font.PLAIN,32));
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new mainMenu();
                setVisible(false);

            }
        });
        JTextField money = new JTextField(5);
        money.setFont(new Font("Serif", Font.PLAIN,32));
        money.setHorizontalAlignment(SwingConstants.CENTER);
        add(money);
        JButton go = new JButton("Deposit");
        go.setFont(new Font("Serif", Font.PLAIN,32));
        add(go);
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (money.getText().isEmpty()) {
                    message.setText("Please insert amount to deposit!");
                    message.setHorizontalAlignment(SwingConstants.CENTER);
                    message.setFont(new Font("Serif", Font.PLAIN, 32));
                    message.setForeground(new Color(0xFF0000));
                    message.setVisible(true);
                } else if (Double.parseDouble(money.getText()) > 0) {
                    balance.bal = balance.bal + Double.parseDouble(money.getText());
                    message.setText("Deposit Successful!");
                    message.setHorizontalAlignment(SwingConstants.CENTER);
                    message.setFont(new Font("Serif", Font.PLAIN, 32));
                    message.setForeground(new Color(0x00FF00));
                    message.setVisible(true);

                } else {
                    message.setText("Please insert amount properly!");
                    message.setHorizontalAlignment(SwingConstants.CENTER);
                    message.setFont(new Font("Serif", Font.PLAIN, 32));
                    message.setForeground(new Color(0xFF0000));
                    message.setVisible(true);
                }
            }
        });
        message = new JLabel();
        add(message);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }
}
