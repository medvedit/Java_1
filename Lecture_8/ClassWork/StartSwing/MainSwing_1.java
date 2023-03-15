package Java_1.Lecture_8.ClassWork.StartSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainSwing_1 extends JFrame { // Создаем класс и наследуем его от JFrame.
    public int count;
        public MainSwing_1(int initialValue){ // Конструктор.
            count = initialValue;

            setTitle("Тестовое окошко :-)"); //  setTitle - создали окошко, с заголовком("Test Window)
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Метод(что делать при нажатии на красный крестик) в него передали(Закрыть)
            setBounds(1360,30,300,150); // Задали границы окна.
            Font fontButton = new Font("Arial", Font.BOLD, 42);
            Font fontCounterValue = new Font("Arial", Font.BOLD, 62);

            JLabel counterValue = new JLabel(String.valueOf(count));
            JButton button1 = new JButton("+"); // Создали объект кнопка button1, на которой будет текст "+" .
            JButton button2 = new JButton("-"); // Создали объект кнопка button2, на которой будет текст "-" .

            counterValue.setFont(fontCounterValue);
            button1.setFont(fontButton);
            button2.setFont(fontButton);

            counterValue.setHorizontalAlignment(SwingConstants.CENTER);

            add(counterValue, BorderLayout.CENTER);
            add(button1, BorderLayout.EAST); // add - добавили кнопку button1 на восток относительно центра окна.
            add(button2, BorderLayout.WEST); // add - добавили кнопку button1 на запад относительно центра окна.


            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(e.paramString());
                    count++;
                    if (count > 0){
                        counterValue.setForeground(Color.GREEN);
                    }else if(count == 0){
                        counterValue.setForeground(Color.BLACK);
                    }
                    counterValue.setText(String.valueOf(count));
                }
            });
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(e.paramString());
                    count--;
                    if(count < 0){
                        counterValue.setForeground(Color.RED);
                    }else if(count == 0) {
                        counterValue.setForeground(Color.BLACK);
                    }
                    counterValue.setText(String.valueOf(count));
                }
            });

            setVisible(true); // Команда активации окна. Создает видимость созданного окна.
        }


    public static void main(String[] args) {
         new MainSwing_1(0); // Для запуска созданного выше конструктора.
    }

}
