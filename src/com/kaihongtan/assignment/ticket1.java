package com.kaihongtan.assignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ticket1 extends JFrame {
    JTextField dayField;
    JLabel cost;
    JLabel error;


    ticket1() {
        super("Golden Preedha Cinemas");
        setLayout(new FlowLayout());
        JLabel enter = new JLabel("Enter Day(Monday-Sunday):");
        add(enter);
        dayField = new JTextField(4);
        add(dayField);
        JButton go = new JButton("Show Price");
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dayField.getText().isEmpty()) {
                    error.setText("Please enter a day");
                    error.setVisible(true);
                    cost.setVisible(false);
                } else {
                    switch (dayField.getText()) {
                        case "Monday":
                        case "monday":
                        case "Tuesday":
                        case "tuesday":
                        case "Wednesday":
                        case "wednesday":
                            error.setVisible(false);
                            cost.setText("The Price is RM5");
                            cost.setVisible(true);
                            break;

                        case "Thursday":
                        case "thursday":
                            error.setVisible(false);
                            cost.setText("The Price is RM10");
                            cost.setVisible(true);
                            break;
                        case "Friday":
                        case "friday":
                        case "Sunday":
                        case "sunday":
                            error.setVisible(false);
                            cost.setText("The Price is RM20");
                            cost.setVisible(true);
                            break;
                        case "Saturday":
                        case "saturday":
                            error.setVisible(false);
                            cost.setText("The Price is RM30");
                            cost.setVisible(true);
                            break;

                        default:
                            error.setText("Please enter the day correctly!");
                            error.setVisible(true);
                            cost.setText("null");
                            cost.setVisible(false);
                    }
                }

            }
        });
        add(go);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 150);
        setVisible(true);
        setLocation(960, 540);
        cost = new JLabel();
        add(cost);
        error = new JLabel();
        add(error);


    }

    public static void main(String[] args) {
        new ticket1();
    }


}
