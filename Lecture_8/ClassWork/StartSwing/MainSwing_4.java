package Java_1.Lecture_8.ClassWork.StartSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSwing_4 extends JFrame {

    public MainSwing_4(){
        setTitle("*");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JTextField textField = new JTextField();
        JButton button = new JButton("Нажми на меня...");
        button.setBackground(Color.cyan);
        add(button, BorderLayout.NORTH);
        add(textField, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Урааа... На меня нажали!");
            }
        });
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Привет. Не сразу, видимо, ты решил нажать на Enter...");
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainSwing_4();
    }
}
