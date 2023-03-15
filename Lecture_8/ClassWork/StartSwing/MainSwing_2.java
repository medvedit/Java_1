package Java_1.Lecture_8.ClassWork.StartSwing;

import javax.swing.*;
import java.awt.*;

/**
 * Кнопки не адаптивны по окно. Что бы появилась адаптивность кнопок относительно размера окна нужно
 * использовать FlowLayout. (раскомментировать закомментированную строку и закомментировать предыдущую).
 * В цикле создали количество кнопок.
 */
public class MainSwing_2 extends JFrame {
    public MainSwing_2(){
        setTitle("Кнопки на основе BoxLayout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,400);
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
//        setLayout(new FlowLayout()); // тут параметры передавать не нужно.
        setLayout(new GridLayout()); // так-же, без параметров. Еще вариант визуализации кнопок.
        for (int i = 1; i < 11; i++) {
            add(new JButton("Кнопка " + i));
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new  MainSwing_2();
    }
}
