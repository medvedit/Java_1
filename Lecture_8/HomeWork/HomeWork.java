package Java_1.Lecture_8.HomeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWork extends JFrame {

    /**
     *   Доработать счетчик. Изменить тип отображаемого счетчика на TextField,
     *   и добавить возможность изменять значение счетчика.
     *   То есть выделив значение счетчика мышкой, ввести с клавиатуры желаемые цифры и далее, кнопками в окне,
     *   будет изменение числа от введенного с клавиатуры значения.
     */

    private int counter;

    public HomeWork(int initialValue){
        setBounds(1180, 110,400, 180);
        setTitle("Simple counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font fontCounterValue = new Font("Arial", Font.BOLD, 84);
        Font fontButton = new Font("Arial", Font.BOLD, 42);

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
