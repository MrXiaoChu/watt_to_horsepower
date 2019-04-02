package watt_to_horsepower;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import watt_to_horsepower.ConvertFormula.*;

public class Watt_to_horsepower {

    public static void main(String[] args) {

        ConvertFormula convertFormula = new ConvertFormula();

        Runnable runner = new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Watt to Horse Power"
                    + "(Metric Horsepower)");
                JPanel inputPanel = new JPanel();
                JPanel outputPanel = new JPanel();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridLayout(1, 3, 10, 10));
                frame.setSize(700, 130);
                frame.setVisible(true);

                JLabel label_hint_input = new JLabel(
                    "<html><body><font size=5><p align=\"center\">Input the "
                    + "<br/>horse power:</p></font></body></html>"
                );

                JTextField field_watt = new JTextField();
                inputPanel.setLayout(new GridLayout(1, 2));
                inputPanel.add(label_hint_input);
                inputPanel.add(field_watt);

                JLabel label_hint_output = new JLabel("<html><body>"
                    + "<font size=5>"
                    + "<p align=\"left\">hp:</p>"
                    + "</font></body></html>\"");
                JLabel label_horse_power = new JLabel("wait");

                outputPanel.setLayout(new GridLayout(1, 2));
                outputPanel.add(label_hint_output);
                outputPanel.add(label_horse_power);

                final JButton button_convert = new JButton("Convert");
                button_convert.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label_horse_power.setText(convertFormula.
                            Metricwatt_to_horsepower(
                                Double.valueOf(field_watt.getText())).
                            toString());
                    }
                }
                );
                frame.add(inputPanel);
                frame.add(outputPanel);
                frame.add(button_convert);

            }
        };
        EventQueue.invokeLater(runner);
    }
}
