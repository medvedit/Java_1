package Java_1.Lecture_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassWorkArray {
    public static void main(String[] args) {
        firstArray();
        minMaxElementArray();
        scannerIn();

    }
    public static void firstArray() {

        int[] y = new int[5]; // Создание массива длиной 5 элементов. Массив заполнен нолями по умолчанию.
        int[] x = {2, 4, 5, 7}; // Создание массива с конкретными значениями.
        int[][] k = {{2, 4, 5, 7}, {2, 4, 554, 7, 678, 44}, {2, 411, 5, 7}, {2, 4, 5, 7}};
        System.out.println(y.length); // вывод длинны массива y
        System.out.println(x.length); // вывод длины массива x
        System.out.println(k[1].length); // вывод длины вложенного массива с индексом 1

    }

    public static void minMaxElementArray() {
        int[] arr = {2, 45, 23, 5, 77, 45, 1, 55, 87, 4};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("max = %d ; min = %d\n", max, min);
    }

    public static void scannerIn() {
        int x;
        Scanner scanner = new Scanner(System.in); // чтение ввода из консоли
        System.out.print("Введите число: "); // запрос на ввод числа
        try {
            x = scanner.nextInt(); // присвоение ввода из консоли в переменную x
            System.out.println("Вы ввели число " + x); // вывод результата
        } catch (InputMismatchException e) { // обработка исключения
            System.out.println("Вы ввели не целое число..."); // вывод исключения
        }
    }
}


