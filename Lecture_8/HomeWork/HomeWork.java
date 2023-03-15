package Java_1.Lecture_8.HomeWork;

/**
 *   Доработать счетчик. Изменить тип отображаемого счетчика на TextField,
 *   и добавить возможность изменять значение счетчика.
 *   То есть выделив значение счетчика мышкой, ввести с клавиатуры желаемые цифры и далее, кнопками в окне,
 *   будет изменение числа от введенного с клавиатуры значения.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWork extends JFrame {
    private int counter;

    public HomeWork(int initialValue){
        setBounds(1360,30,300,150);
        setTitle("Simple counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font fontButton = new Font("Arial", Font.BOLD, 35);
        Font fontCounterValue = new Font("Arial", Font.BOLD, 52);

        JTextField counterValue = new JTextField();
        counterValue.setFont(fontCounterValue);
        counterValue.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValue,BorderLayout.CENTER);
        counter = initialValue;
        counterValue.setText(String.valueOf(counter));

        JButton increment = new JButton(">");
        increment.setFont(fontButton);
        add(increment, BorderLayout.EAST);

        JButton decrement = new JButton("<");
        decrement.setBackground(Color.cyan);
        decrement.setFont(fontButton);
        add(decrement, BorderLayout.WEST);

        counterValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = Integer.parseInt(counterValue.getText());
                counterValue.setText(String.valueOf(counter));
            }
        });

        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                if (counter > 0){
                    counterValue.setForeground(Color.GREEN);
                }else if(counter == 0){
                    counterValue.setForeground(Color.BLACK);
                }
                counterValue.setText(String.valueOf(counter));
            }
        });

        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                if (counter < 0){
                    counterValue.setForeground(Color.RED);
                }else if(counter == 0){
                    counterValue.setForeground(Color.BLACK);
                }
                counterValue.setText(String.valueOf(counter));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new HomeWork(0);
    }
}
