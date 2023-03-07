package Java_1.Lecture_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkArray {
    public static void main(String[] args) {
        replaceArrayElements();
        fillArrayWithNumbersInOrder();
        arrayOfNumbersLessThanSixTimesTwo();
        fillTheDiagonalsOfTwo_dimensionalArray();
        arraySpiral();
        creatingArrayInputData();
        arraySearchMinMaxValue(createArray());
        System.out.println(comparisonOfSumsInPartsOfAnArray(createArray()));
        shiftElementsInAnArray(createArray(), -2);

    }

    public static int[] createArray() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-3, 3);
        }
        return array;
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void replaceArrayElements() {
        Random random = new Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println("Начальный массив -> " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("Массив на выходе, после замены 0 на 1 и 1 на 0 -> " + Arrays.toString(arr) + "\n");
    }

    /**
     * 2. Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void fillArrayWithNumbersInOrder() {
        int[] arr = new int[20];
        int num = 44;
        arr[0] = num;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 1;
        }
        System.out.println("Заполненный массив числами по порядку с числа " + num + " = ↴\n"
                + Arrays.toString(arr) + "\n");
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
     * умножить на 2;
     */
    public static void arrayOfNumbersLessThanSixTimesTwo() {
        Random random = new Random();
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2, 8);
        }
        System.out.println("Начальный массив -> " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Измененный массив с условием, что каждый элемент начального массива, \n" +
                " который < 6, мы умножаем на 2 -> " + Arrays.toString(arr) + "\n");
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
     * одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     * (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
     * диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
     * [1][1], [2][2], …, [n][n];
     */
    public static void fillTheDiagonalsOfTwo_dimensionalArray() {
        char[][] arr = new char[6][6];
        for (int i = 0; i < arr.length; i++) { // заполнение массива по периферии "#", а внутри "*"
            for (int j = 0; j < arr.length; j++) {
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr.length - 1) {
                    arr[i][j] = '#';
                } else {
                    arr[i][j] = '*';
                }
                System.out.print((arr[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {  // заполнение массива по диагоналям "*", в остальных позициях "-"
            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = (i == j) || (i + j == arr.length - 1) ? 1 : 0; // альтернатива вместо if else (ниже по коду)
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = '*';
                } else {
                    arr[i][j] = '-';
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    /**
     * 5. * Заполнение двумерного массива по спирали. От периферии к центру.
     */
    public static void arraySpiral() {
        int row = 5, col = 7;
        int[][] array = new int[row][col];
        int minRow = 0, maxRow = row - 1, minCol = 0, maxCol = col - 1;
        int count = 1;
        int maxAmount = row * col;
        while (count < maxAmount) {
            for (int i = minCol; i <= maxCol; i++) {
                array[minRow][i] = count;
                count++;
            }
            minRow = minRow + 1;
            for (int i = minRow; i <= maxRow; i++) {
                array[i][maxCol] = count;
                count++;
            }
            maxCol = maxCol - 1;
            for (int i = maxCol; i >= minCol; i--) {
                array[maxRow][i] = count;
                count++;
            }
            maxRow = maxRow - 1;
            for (int i = maxRow; i >= minRow; i--) {
                array[i][minCol] = count;
                count++;
            }
            minCol = minCol + 1;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d ", array[i][j]); // цифра 3 - отступ между цифрами при выводе в консоль
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * 6. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
     * одномерный массив длиной len, каждая ячейка которого равна initialValue;
     */
    public static void creatingArrayInputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int len = scanner.nextInt();
        System.out.print("Введите один символ для заполнения массива: ");
        char initialValue = scanner.next().charAt(0); // считается только элемент с index [0]

        char[] array = new char[len];
        for (char i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.printf("%s\n", Arrays.toString(array));
    }

    /**
     * 7. * Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */
    public static void arraySearchMinMaxValue(int[] array) {
        System.out.printf("Заданный начальный массив -> %s\n", Arrays.toString(array));

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.printf("max value = %s ; min value = %s\n", max, min);
    }

    /**
     * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив.
     * Метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
     * массива равны.
     * Примеры:
     * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
     * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     * Граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
     */
    public static boolean comparisonOfSumsInPartsOfAnArray(int[] arr) {
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {

            int leftSum = 0;
            int rightSum = 0;
            int leftCount = 0;
            int rightCount = 0;
            int sumArray;


            for (int j = 0; j <= i; j++) {
                leftSum += arr[j];
                leftCount += 1;
            }
            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
                rightCount += 1;
            }
            sumArray = leftSum + rightSum;
            if (leftSum == rightSum) {
                System.out.printf("Сумма первых %s элементов равной %s == сумме следующих %s элементов равной %s. " +
                        "Общая сумма массива равна %s\n", leftCount, leftSum, rightCount, rightSum, sumArray);
                return true;
            }

        }
        System.out.println("Нет равных сумм значений массива");
        return false;
    }

    /**
     * 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть
     * положительным, или отрицательным), при этом метод должен сместить все элементы массива
     * на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
     * вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5,
     * 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг, можете
     * выбирать сами.
     */
    public static void shiftElementsInAnArray(int[] arr, int shift) {
        System.out.printf("Начальный массив -> %s\n", Arrays.toString(arr));

        if (shift < 0) { // Если сдвиг на отрицательное количество шагов. Сдвиг влево.
            for (int i = 0; i < Math.abs(shift); i++) { // Math.abs - получаем модуль числа, положительное число.
                                                        // Совершаем количество шагов на число сдвига.
                int buffer = arr[0]; // переменная для временного хранения, кладем в него первый элемент, index[0].
                for (int j = 0; j < arr.length; j++) { // движение в цикле до последнего индекса в массиве.
                    if ((j + 1) < arr.length) { // пока это условие верно,
                        arr[j] = arr[j + 1]; // перезаписываем стоящий впереди элемент на позицию,
                                             // на которой находимся в цикле.
                    } else { // сработает когда цикл if станет false, то есть j находится на последнем элементе и..
                        arr[j] = buffer; // первый элемент, сохраненный ранее, перезаписываем на последнюю позицию.
            // Совершили сдвиг вех элементов на одну позицию !!!
            // Если в условии на сдвиг, в вашем случае, больше -1, то
            // возвращаемся к первому циклу for и повторяется весть процесс повторно, полностью,
            // по выше указанному комментарию.
                    }
                }
            }
        } else if (shift > 0) { // Если сдвиг на положительное количество шагов. Сдвиг вправо.
            for (int j = 0; j < shift; j++) { // Совершаем количество шагов на число сдвига.
                int buffer = arr[arr.length - 1]; // переменная для временного хранения, кладем в него
                                                  // последний элемент, index[arr.length - 1].
                for (int i = arr.length - 1; i > 0; i--) { // Двигаемся от последнего индекса до первого.
                                                           // Справа на лево по массиву.
                    arr[i] = arr[i - 1]; // Перезаписываем элемент предыдущего индекса (предыдущий по номеру индекса)
                                         // на индекс, на котором находимся во втором цикле for.
                }
                arr[0] = buffer; // Сработает, когда во втором цикле for дойдем до index[0].
                                 // Перезапишем ранее сохраненный элемент с последнего индекса на index[0].
            // Совершили сдвиг вех элементов на одну позицию !!!
            // Если в условии на сдвиг, в вашем случае, больше 1, то
            // возвращаемся к первому циклу for и повторяется весть процесс повторно, полностью,
            // по выше указанному комментарию.
            }
        }
        System.out.printf("Массив со сдвигом на %s элемента -> %s", shift, Arrays.toString(arr));
    }
}
