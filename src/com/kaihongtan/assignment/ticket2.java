package com.kaihongtan.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ticket2 extends JFrame {
    JTextField dayField;
    JTextField ageField;
    JLabel cost;
    JLabel error;


    ticket2() {
        super("Golden Preedha Cinemas ENHANCED");
        setLayout(new FlowLayout());
        JLabel enter = new JLabel("Enter Day(Monday-Sunday):");
        add(enter);
        dayField = new JTextField(4);
        add(dayField);
        JLabel enterAge = new JLabel("Enter Age:");
        add(enterAge);
        ageField = new JTextField(2);
        add(ageField);
        JButton go = new JButton("Show Price");
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dayField.getText().isEmpty()) {
                    error.setText("Please enter a day");
                    error.setVisible(true);
                    cost.setVisible(false);
                    if (ageField.getText().isEmpty()) {
                        error.setText("Please enter day and age");
                        error.setVisible(true);
                        cost.setVisible(false);
                    }

                } else if (ageField.getText().isEmpty()) {
                    error.setText("Please enter age");
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
                        case "Thursday":
                        case "thursday":
                            int age = Integer.parseInt(ageField.getText());
                            if (age < 65) {
                                error.setVisible(false);
                                cost.setText("The Price is RM10");
                                cost.setVisible(true);
                                if (age < 10) {
                                    error.setVisible(false);
                                    cost.setText("The Price is FREE");
                                    cost.setVisible(true);
                                }
                            } else {
                                error.setVisible(false);
                                cost.setText("The Price is FREE");
                                cost.setVisible(true);
                            }
                            break;


                        case "Friday":
                        case "friday":
                        case "Sunday":
                        case "sunday":
                        case "Saturday":
                        case "saturday":
                            int ages = Integer.parseInt(ageField.getText());
                            if (ages < 65) {
                                error.setVisible(false);
                                cost.setText("The Price is RM20");
                                cost.setVisible(true);
                                if (ages < 10) {
                                    error.setVisible(false);
                                    cost.setText("The Price is RM10");
                                    cost.setVisible(true);
                                }
                            } else {
                                error.setVisible(false);
                                cost.setText("The Price is RM10");
                                cost.setVisible(true);
                            }
                            break;


                        default:
                            error.setText("Please enter the day and age correctly!");
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
        new ticket2();
    }


}
