package com.company;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorPanel {
    public JFrame window = new JFrame("Calculator");
    public JTextField imput = new JTextField();

    public CalculatorPanel() {
        window.setSize(290, 405);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.white);
        window.setLayout(null);
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        ButtonArea();
        Buttons();
        window.setVisible(true);
    }

    private void ButtonArea() {
        imput.setFont(new Font("Arial", Font.BOLD, 24));
        imput.setBounds(16, 10, 248, 36);
        imput.setBackground(Color.white);
        imput.setHorizontalAlignment(JTextField.RIGHT);
        window.add(imput);
    }

    private void Buttons() {
        int num = 0;
        String arr[] = {"1", "2", "3", "С", "4", "5", "6", "*", "7", "8", "9", "-", "0", ".", "+", "/", "(", ")", "="};
        JButton[] jbutton = new JButton[arr.length];

        for (int e = 0; e < 5; e++) {
            for (int r = 0; r < 4; r++) {
                jbutton[num] = new JButton();
                jbutton[num].setFont(new Font("Arial", Font.PLAIN, 36));
                jbutton[num].setText(arr[num]);
                jbutton[num].setMargin(new Insets(0, 0, 0, 0));
                if (num < arr.length - 1) {
                    jbutton[num].setBounds(16 + r * 62, 55 + e * 62, 60, 60);
                } else {
                    jbutton[num].setBounds(16 + r * 62, 55 + e * 62, 122, 60);
                }
                jbutton[num].setFocusable(false);

                window.add(jbutton[num]);

                ActionListener num_button = new ButtonListener();
                jbutton[num].addActionListener(num_button);

                if (num < arr.length - 1) {
                    num++;
                } else {
                    break;
                }
            }
        }
    }
    private void result() {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        try {
            imput.setText("" + engine.eval(imput.getText()));
        } catch (ScriptException e1) {
            //...
        }
    }
    public class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton) e.getSource()).getText();
            if (name == "=" || name == "С") {
                if (name == "=") {
                    result();
                }
                if (name == "С") {
                    imput.setText("");
                }
            } else {
                imput.setText(imput.getText() + name);
            }

            window.repaint();
        }
    }
}
