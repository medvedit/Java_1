package Java_1.Lecture_6.ClassWork_Introduction_2_OOP.ClassAnimal;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Пуфик","бежевый", 8);
        Cat cat = new Cat("Барсик", "серый",6);
        Cat cat1 = new Cat("Пушистик", 2);
        Dog dog = new Dog("Аргон","чапрачный",12);

        animal.info();
        cat.info();
        cat1.info();
        dog.info();
    }

}
