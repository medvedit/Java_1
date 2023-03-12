package Java_1.Lecture_6.ClassWork_Introduction_2_OOP.ClassAbstractAnimal;

public class Bird extends Animal implements Flying, Swimming{ // Добавил две реализации интерфейсов -> implements Flying, Swimming,
                                                              // с обязательным переопределение методов.

    public Bird(String name, String color, int age){
        super(name, color, age);
    }

    @Override
    public void sleep() { // переопределил метод из Animal class
        System.out.println("Птица спит");
    }

    @Override
    public void Fly() { // Переопределил метод из интерфейса Flying
        System.out.println("Птица летает");
    }

    @Override
    public void swim() { // Переопределил метод из интерфейса Swimming
        System.out.println("Птица плавает");
    }
}
