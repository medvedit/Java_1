package Java_1.Lecture_2;

public class HomeWorkTask {
    public static void main(String[] args) {
        System.out.println(resultInRange(3, 9));
        numberPositiveOrNegativePrint(-2);
        System.out.println(numberPositiveOrNegative(7));
        printWord("Word", 4);
        System.out.println(determineLeapYear(2000));


    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
     *    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     * @return
     */
    public static boolean  resultInRange(int a, int b){
        if (a + b > 10 && a +b <= 20){
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * 2. Написать метод, которому в качестве параметра передается целое число, метод должен
     *    напечатать в консоль, положительное ли число передали или отрицательное.
     *    Замечание: ноль считаем положительным числом.
     */
    public static void numberPositiveOrNegativePrint(int x){
        if (x >= 0){
            System.out.printf("Принятое на вход число %d -> Число положительное\n", x);
        }
        else {
            System.out.printf("Принятое на вход число %d -> Число отрицательное\n", x);
        }
    }
    /**
     * 3. Написать метод, которому в качестве параметра передается целое число. Метод должен
     * вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    public static boolean numberPositiveOrNegative(int y){
        if(y < 0){
            return false;
        }
        return true;
    }
    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
     *    отпечатать в консоль указанную строку, указанное количество раз;
     */
    public static void printWord(String f, int e){
        for (int i = 0; i < e; i++) {
            System.out.println(f);
        }
    }
    /**
     * 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
     *      (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
     *      100-го, при этом каждый 400-й – високосный.
     */
    public static boolean determineLeapYear(int g){

        return (g % 4 == 0 && (g % 100 != 0 || g % 400 == 0));
    }

}
