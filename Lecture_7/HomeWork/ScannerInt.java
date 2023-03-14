package Java_1.Lecture_7.HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;
public interface ScannerInt {

    static int scanner() { // Метод пополнения тарелки.
        int addFood = 0;
        while (addFood == 0) { // До тех пор, пока не введем число
            Scanner scanner = new Scanner(System.in); // Чтение ввода из консоли.
            System.out.print("Добавьте еду в тарелку: "); // Запрос на ввод числа.
            try {
                addFood = scanner.nextInt(); // Присвоение ввода из консоли в переменную addFood, с проверкой ввода ТОЛЬКО целого числа.
                if (addFood > 0) { // Если число не отрицательное. то..
                    return addFood; // Возвращаем результат из метода. Метод отработал.
                }
            } catch (InputMismatchException e) { // Обработка исключения.
                System.out.println("Вы ввели не целое, или не положительное число..."); // Вывод исключения и запуск метода с начала.
            }
        }
        System.out.println("Корм нужно добавить, а не убавить из тарелки...");
        return 0; // Ели пользователь ввел отрицательное число, то запускаем метод с начала.
    }

}
