package Java_1.Lecture_6.HomeWork_Introduction2_OOP;

/*
      1. Создать классы Собака и Кот с наследованием от класса Животное.
      2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
         препятствия. Результатом выполнения действия будет печать в консоль. (Например,
         dogBobik.run(150); -> 'Бобик пробежал 150 м.');
      3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
         кот не умеет плавать, собака 10 м.).
      4. * Добавить подсчет созданных котов, собак и животных.
     */
public class Main {
    public static int x;

    public static void main(String[] args) {


        Cat firstCat = new Cat("Васька", 3);
        Dog firstDog = new Dog("Бобик", 4);
        Cat secondCat = new Cat("Тихон", 2);
        Cat thirCat = new Cat("Хвостик", 4);
        Dog secondDog = new Dog("Аргон", 5);
        Dog thirDog = new Dog("Шарик", 8);
        Dog fourthDog = new Dog("Пират", 11);
        Dog fifthDog = new Dog("Берт", 2);


        firstCat.run(firstCat.name, 210);
        firstDog.run(firstDog.name, 450);
        secondCat.swim(secondCat.name, 3);
        thirCat.run(thirCat.name, 180);
        secondDog.swim(secondDog.name, 8);
        thirDog.run(thirDog.name, 330);
        fourthDog.run(fourthDog.name, 12);
        fifthDog.swim(fifthDog.name, 11);

        System.out.printf("Всего котов %s\n", Cat.getCount());
        System.out.printf("Всего собак %s\n", Dog.getCount());
        System.out.printf("Всего животных %s\n", Animal.getCount());

    }
}
