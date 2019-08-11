package com.kaihongtan.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class bmi extends JFrame {
    JTextField heightField;
    JTextField weightField;
    DecimalFormat fmt = new DecimalFormat("0.00");
    JLabel result;
    JLabel bmiResult;
    JLabel error;
    JLabel showbmi;
    JLabel interpret;

    bmi() {
        super("BMI Calculamatron 2000");
        setLayout(new FlowLayout());
        JLabel height = new JLabel("Height(inches):");
        add(height);
        heightField = new JTextField(4);
        add(heightField);
        JLabel weight = new JLabel("Weight(pounds):");
        add(weight);
        weightField = new JTextField(4);
        add(weightField);
        JButton calculate = new JButton("Calculate");
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (heightField.getText().isEmpty()) {
                    error.setText("Please insert value!");
                    error.setVisible(true);
                    showbmi.setText("Your BMI is ");
                    showbmi.setVisible(false);
                    interpret.setText(" which is ");
                    interpret.setVisible(false);
                    bmiResult.setText("NULL");
                    result.setText("NULL");
                    result.setVisible(false);
                    bmiResult.setVisible(false);
                } else if (weightField.getText().isEmpty()) {
                    error.setText("Please insert value!");
                    error.setVisible(true);
                    showbmi.setText("Your BMI is ");
                    showbmi.setVisible(false);
                    interpret.setText(" which is ");
                    interpret.setVisible(false);
                    bmiResult.setText("NULL");
                    result.setText("NULL");
                    result.setVisible(false);
                    bmiResult.setVisible(false);
                } else {
                    double heightMeters = (Double.parseDouble(heightField.getText()) * 0.0254);
                    double weightKilos = (Double.parseDouble(weightField.getText()) * 0.45359237);
                    double bmino = weightKilos / (heightMeters * heightMeters);
                    bmiResult.setText(String.valueOf(fmt.format(bmino)));
                    bmiResult.setVisible(true);
                    if (bmino < 30) {
                        result.setText("Overweight");
                        result.setVisible(true);
                        showbmi.setText("Your BMI is ");
                        showbmi.setVisible(true);
                        interpret.setText(" which is ");
                        interpret.setVisible(true);
                        error.setVisible(false);
                        if (bmino < 25) {
                            result.setText("Normal");
                            result.setVisible(true);
                            showbmi.setText("Your BMI is ");
                            showbmi.setVisible(true);
                            interpret.setText(" which is ");
                            interpret.setVisible(true);
                            error.setVisible(false);
                            if (bmino < 18.5) {
                                result.setText("Underweight");
                                result.setVisible(true);
                                showbmi.setText("Your BMI is ");
                                showbmi.setVisible(true);
                                interpret.setText(" which is ");
                                interpret.setVisible(true);
                                error.setVisible(false);
                            }
                        }
                    } else {
                        result.setText("Obese");
                        result.setVisible(true);
                        error.setVisible(false);
                    }
                }

            }
        });
        add(calculate);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 150);
        setVisible(true);
        setLocation(960, 540);
        showbmi = new JLabel();
        add(showbmi);
        bmiResult = new JLabel();
        add(bmiResult);
        interpret = new JLabel();
        add(interpret);
        result = new JLabel();
        add(result);
        error = new JLabel();
        add(error);


    }

    public static void main(String[] args) {
        new bmi();


    }
}
