package com.kaihongtan.assignment.atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener.*;
import java.awt.event.*;

public class mainMenu extends JFrame {
    mainMenu() {
        super("PreedhaKawanku");
        setLayout(new GridLayout(2, 2));
        JButton balance = new JButton("Check Balance");
        balance.setFont(new Font("Serif", Font.PLAIN,32));
        JButton withdraw = new JButton("Withdraw Funds");
        withdraw.setFont(new Font("Serif", Font.PLAIN,32));
        JButton deposit = new JButton("Deposit Funds");
        deposit.setFont(new Font("Serif", Font.PLAIN,32));
        JButton exit = new JButton("Exit");
        exit.setFont(new Font("Serif", Font.PLAIN,32));
        add(balance);
        balance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new balance();
                setVisible(false);
            }
        });
        add(withdraw);
        withdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new withdraw();
                setVisible(false);
            }
        });
        add(deposit);
        deposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new deposit();
                setVisible(false);
            }
        });
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);


    }

    public static void main(String[] args) {
        new mainMenu();


    }


}
