package Java_1.Lecture_6.ClassWork_Introduction_2_OOP.ClassAnimal;

public class Animal { // Создали публичный класс Animal
    public String name; // Определили переменные в классе
    public String color; // Определили переменные в классе
    public int age; // Определили переменные в классе

    public Animal(String name, String color, int age){ // Создание конструктора. Отличительная черта конструктора -> Конструктор,
                                                       // как и класс, в котором написан конструктор называются одинаково.
                                                       // Имя конструктора с большой буквы.
        this.name = name; // Имя переданное из метода main присваивается в переменную public name
        this.color = color; // Имя переданное из метода main присваивается в переменную public color
        this.age = age; // Имя переданное из метода main присваивается в переменную public age
    }
    public Animal(String name, int age){ // Второй конструктор для класса Cat.
        this.name = name;
        this.age = age;
    }

    public void info(){ // Метод печати в консоль
        System.out.printf("""
                Animal  name: %s;
                Color of the animal: %s;
                Age of the animal: %s годиков.

                """, name, color, age);
    }
}
