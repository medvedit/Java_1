package Java_1.Lecture_6.ClassWork_Introduction_2_OOP.ClassAbstractAnimal;

public class Main {
    public static void main(String[] args) {
// В этом варианте, в отличии, от пакета ClassAnimal исчезло присвоение значений переменных для самого класса Animal,
// т.к. класс Animal стал abstract класс, и в этом случае создание объекта для Animal будет не "законно".
// Остались присвоения для двух классов наследников.
        Cat cat = new Cat("Барсик", "серый",6);
        Dog dog = new Dog("Аргон","чапрачный",12);
        Bird bird = new Bird("Чайка", "белый",2);

        cat.info(); // вывод в консоль.
        System.out.println(cat.name + "\n"); // вывод отдельных переменных мимо класса Animal, если имена переменных public
        dog.info(); // вывод в консоль.
        System.out.println(dog.color + "\n"); // вывод отдельных переменных мимо класса Animal, если имена переменных public
        System.out.println(dog.age + "\n"); // вывод отдельных переменных мимо класса Animal, если имена переменных public
        bird.info();

        dog.sleep(); // Вызов переопределенного метода из класса Dog
        dog.sleep(6); // Вызов перегруженного метода из класса Dog
        bird.Fly();

    }

}
