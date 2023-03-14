package Java_1.Lecture_7.ClassWork;

import java.nio.charset.StandardCharsets;

/**
 * Класс String позволяет хранить текстовую информацию и представляет собой
 * ссылочный тип данных (все классы это ссылочные типы данных).
 * .
 * Строки можно создавать вот так: String str = "Java";
 * .
 * Строки являются иммутабельными, то есть после создания объекта типа String его
 * невозможно изменить. Если написать: str += "1";
 * то с одной стороны в str будет лежать Java1, с другой стороны это противоречит
 * утверждению выше. Дело в том, что строку Java мы и не меняли, мы создали новую
 * строку Java1 и ссылку на нее записали в str. То есть при любой модификации
 * объектов строк в памяти будут создаваться новые объекты. Это очень важно
 * помнить.
 * Методы String:
 * int length() -> Получение длины строки.
 * char charAt(int pos) -> Извлечение из строки символа, находящегося на позиции pos,
 *                         индексация символов начинается с нуля.
 * char[] toCharArray() -> Преобразование строки в массив символов.
 * boolean equals(Object obj) -> Посимвольное сравнение строк.
 * boolean equalsIgnoreCase(Object obj) -> Сравнение строк без учета регистра.
 * String concat(String obj) -> Объединение двух строк в одну. Этот метод создает новый строковый
 *                              объект, содержащий вызываемую строку, в конце которой добавляется
 *                              содержимое параметра строка. Метод выполняет то же действие, что и
 *                              операция +.
 * String toLowerCase() -> Преобразование всех символов строки в нижний регистр.
 * String toUpperCase() -> Преобразование всех символов строки в верхний регистр.
 */
public class ClassString_StringBuilder {

    public static void main(String[] args) {

/*
 * Наглядный пример работы со String.
 * Создали пустой объект класса String и через цикл дописали к каждой вновь созданной строке
 * символ "х". Общее количество итераций 512_000 раз.
 */
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 512_000; i++) {
            str += "x"; // создается новая стоки и перезаписывается ссылка на объект.
        }
        long endTime = System.currentTimeMillis();
        long speed = endTime - startTime;
        System.out.printf("Общее количество затраченного время на выполнение задачи при работе со String = %s ms\n", speed);
        // Вывод: Общее количество затраченного время на выполнение задачи при работе со String = 17631 ms
        // При этом потребление памяти приложением: ~700 MB
/*
 * Подобный наглядный пример, с одинаковым количеством итераций и с добавлением символов,
 * но уже через StringBuilder, и через append.
 */
        long startTime2 = System.currentTimeMillis();
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 512_000; i++) { //
            strBuilder.append("x");
        }
        long endTime2 = System.currentTimeMillis();
        long speed2 = endTime2 - startTime2;
        System.out.printf("Общее количество затраченного время на выполнение задачи при работе со StringBuilder = %s ms\n", speed2);
        // Вывод: Общее количество затраченного время на выполнение задачи при работе со StringBuilder = 10 ms
        // При этом потребление памяти приложением: ~1 MB

        //Вывод: Если при решении задачи есть необходимость часто изменять исходные данные,
        //       объект в работе изменяемый, то пользуются StringBuilder.
        //
        //       С НЕизменяемыми объектами используют String.
        //       Иммутабельность удобно использовать для вычисления хешкода,
        //       большая база встроенных методов для работы со String, работа с многопоточностью.

        String s1 = "Java"; // Java
        String s2 = new String("Java"); // Java
        String s3 = new String(s2); // Java
        String s4 = s3; // Java
        String s5 = new String(new char[] {'A','B','C'}); // ABC
        String s6 = new String(new byte[] {65, 66, 67}); // ABC
        String s7 = new String(new byte[] {0, 65, 0, 66, 0, 67}, StandardCharsets.UTF_16); // ABC
        String s8 = new String("JAVA"); // JAVA

        System.out.printf("%s %s %s %s %s %s %s %s", s1,s2,s3,s4,s5,s6,s7,s8);
        System.out.println(s1.length()); // 4
        System.out.println(s1.charAt(0)); // J
        char[] ch = s1.toCharArray();
        for (char item : ch) {
            System.out.println(item); // Вывод в массив char слово Java
        }

        System.out.println();

        System.out.println(s1.concat(s5)); // JavaABC
        System.out.println(s1 + s5); // JavaABC

        System.out.println();

        System.out.println(s1.toLowerCase()); // java
        System.out.println(s1.toUpperCase()); // JAVA

        System.out.println();

        System.out.println(s1.equals(s2)); // сравнивает значения s1 и s2 -> true
        System.out.println(s1 == s2); // сравнивает ссылки на строки -> false
        System.out.println(s4 == s3); // сравнивает ссылки на объект -> true
        System.out.println(s1.equalsIgnoreCase(s8)); // сравнивает значение без учета регистра -> true

        System.out.println();

        StringBuilder stringBuilder = new StringBuilder("String Builder Java");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Other way ");
        stringBuilder2.append("String ");
        stringBuilder2.append("Builder ");
        stringBuilder2.append("Java ");
        System.out.println(stringBuilder); // String Builder Java
        System.out.println(stringBuilder2); // Other way String Builder Java

    }
}
