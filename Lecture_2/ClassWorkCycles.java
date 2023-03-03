package Java_1.Lecture_2;

import java.util.Arrays;

public class ClassWorkCycles {
    public static void main(String[] args) {
        checkNumber();
        printIterator();
        twoCyclesFor();
        twoCyclesFor2();
        cyclesForEach();
        ternaryOperator();
        cyclesWhile();
        multiplicationTable();
        sumOfCubesOfNumbers();

    }

    /**
     * Оператор switch
     * Оператор switch позволяет делать выбор между несколькими вариантами дальнейшего выполнения
     * программы. Выражение последовательно сравнивается со списком значений оператора switch. При
     * совпадении выполняется набор операторов, связанных с этим условием. Если совпадений не было,
     * выполняется блок default (блок default является необязательной частью оператора switch). Оператор
     * break останавливает выполнение блока case, если break убрать – выполнение кода продолжится
     * дальше.
     */
    private static void checkNumber() {
        int a = 166;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            default:
                System.out.println("a = ...");
        }
    }

    public static void printIterator() {
        for (double i = 0.3; i <= 10; i += 1.5) {
            System.out.print("i = " + i + "; ");
        }
        System.out.println("\nEnd");
    }

    public static void twoCyclesFor() {
        for (int i = 0; i < 3; i++) {
            for (int j = 10; j > 6; j--) {
                System.out.print("i = " + i + " -> " + "j = " + j + "; \n");

            }
        }
        System.out.println();
    }

    public static void twoCyclesFor2() {
        for (int i = 1, j = 9; i <= 9 && j >= 0; i++, j--) {
            System.out.print("i = " + i + " -> " + "j = " + j + "; \n");
        }
        System.out.println();
    }

    public static void cyclesForEach() {
        int[] array = {1, 3, 5, 6, 45, 665, 8};
//        int[] k = new int [array.length];
        System.out.print("{ ");
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("}");
        System.out.println();
    }
    public static void ternaryOperator(){
        int x = 5;
        System.out.println(x == 5 ? "x = 5" : "x != 5"); // тернарый оператор - это
                     // если условие x == 5 выполняется, то вывод первая часть (слева от двоеточия) иначе
                     //  на вывод правая часть от двоеточия
        System.out.println();
    }

    /**
     * Выполняется следующим образом (по шагам):
     * Вычисляем Логическое условие, следующее в скобках за while.
     * Если логическое условие истинно, то выполняются операторы в теле цикла,
     * после выполнения последнего оператора в теле цикла, переходим на шаг 1
     * Если логическое условие ложно, то переходим к первому оператору за пределами цикла while.
     */
    public static void cyclesWhile(){
        int number = 3; // Возводимое в степень число
        int result = 1; // Результат возведения в степень
        int power = 1; // Начальный показатель степени
        while(power <= 10) { // условие входа в цикл
            result = result * number;
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
        }
//        int number1 = 3; // Возводимое в степень число
//        int result1 = 1; // Результат возведения в степень
//        int power1 = 1; // Начальный показатель степени
//        while(true) {
//            result = result1 * number1;
//            System.out.println(number + " в степени " + power + " = " + result);
//            power1++;
//            if (power1>10)
//                break; // выход из цикла
        System.out.println();
    }
    public static void multiplicationTable(){
        // Выводим значения второго множителя в строке
        System.out.println("    2  3  4  5  6  7  8  9");
        int i = 2;      // первый множитель, присваиваем стартовое значение
        while(i<10) {   // Первый цикл, выполняем пока первый множитель меньше 10
            System.out.print(i + " | ");// Выводим первый множитель в начало строки
            int j = 2;                  // второй множитель, стартовое значение
            while (j<10) { // Второй цикл, выполняем пока второй множитель меньше 10
                int mul=i*j; // Считаем произведение множителей
                if (mul<10)  // Если содержит одну цифру-после него выводим два пробела
                    System.out.print(mul + "  ");
                else   // иначе выводим произведение и после него - один пробел
                    System.out.print(mul + " ");
                j++;     // Увеличиваем на единицу второй множитель,
            }            // Переходим к началу второго цикла (while (j<10 ).... )
            System.out.println(); // Перейдем на следующую строку вывода
            i++;                  // Увеличиваем на единицу первый множитель,
        }
        System.out.println();
    }
    public static void sumOfCubesOfNumbers(){
        int sum = 0;    // итоговая сумма
        int i = 0;      // стартовое число ряда
        int count = 20; // количество чисел
        while(i<=count) {
            i++;        // берем очередное число, i++ эквивалентно i=i+1
            if (i*i<=count)  // если квадрат числа меньше
                continue;   // количества чисел - сумму не считаем
            // переходим к следующему числу в цикле
            sum += i*i*i; // иначе считаем сумму кубов чисел
        } // sum += i*i*i - форма записи, аналогичная sum = sum + i*i*i
        System.out.println(sum);// печатаем результат
    }
}
