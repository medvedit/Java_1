package Java_1.Lecture_5.ClassWork_Introduction_OOP.CatPablic;

public class Cat { // Класс Cat. В котором описаны методы, сущность котика.
    public String name; // Публичная переменная тип <строка>, <имя>.
    public int age; // Публичная переменная тип <целое число>, <возраст>

    public void info(){ // Метод печати в консоль.
        System.out.printf("Кот, его зовут %s. Его возраст %s годиков.\n", name, age);
    }
}
