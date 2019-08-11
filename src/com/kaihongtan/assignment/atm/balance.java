package com.kaihongtan.assignment.atm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class balance extends JFrame{
    DecimalFormat fmt = new DecimalFormat("0.00");
    public static double bal = 1000;
    balance(){
        super("PreedhaKawanku");
        setLayout(new GridLayout(3,1));
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
        JLabel text = new JLabel("Your Balance is:");
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setFont(new Font("Serif", Font.PLAIN,32));
        add(text);
        JLabel bal = new JLabel("RM" + (fmt.format(balance.bal)));
        bal.setHorizontalAlignment(SwingConstants.CENTER);
        bal.setFont(new Font("Serif", Font.PLAIN,32));
        add(bal);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setVisible(true);

    }
}
