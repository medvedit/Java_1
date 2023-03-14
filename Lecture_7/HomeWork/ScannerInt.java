package Java_1.Lecture_7.HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;
public interface ScannerInt {

    static int scanner() {
        int addFood = 0;
        while (addFood == 0) {
            Scanner scanner = new Scanner(System.in); // чтение ввода из консоли
            System.out.print("Добавьте еду в тарелку: "); // запрос на ввод числа
            try {
                addFood = scanner.nextInt(); // присвоение ввода из консоли в переменную x
                if (addFood > 0) {
                    return addFood;
                }
            } catch (InputMismatchException e) { // обработка исключения
                System.out.println("Вы ввели не целое, или не положительное число..."); // вывод исключения
            }
        }
        System.out.println("Корм нужно добавить, а не убавить из тарелки...");
        return 0;
    }

}
