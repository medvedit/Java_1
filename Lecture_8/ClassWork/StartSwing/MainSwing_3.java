package Java_1.Lecture_8.ClassWork.StartSwing;

import javax.swing.*;

/**
 *  Кнопа привязана к определенному месту.
 */
public class MainSwing_3 extends JFrame {

    public MainSwing_3(){
        setTitle("Кнопка привязанная к определенному месту");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(null); // setLayout пустой. Но если это не прописать, то кнопа будет во всё созданное поле.
        JButton button = new JButton("Кнопка"); // Создание новой кнопки button.
        button.setBounds(20, 60, 120, 40); // Координаты привязанной к определенному месту кнопки.
        add(button); // Добавление кнопки.
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainSwing_3();
    }
}
