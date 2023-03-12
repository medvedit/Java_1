package Java_1.Lecture_6.ClassWork_Introduction_2_OOP.ClassAnimal;

public class Dog extends Animal { // Создали класс Dog, который наследуется (extends) от класса Animal

    public Dog(String name, String color, int age) { // Создали конструктор для метода Cat
        super(name, color, age);// Приставка super не требует присвоения имен переменных через this.
                                // Конструктор созданный в наследуемом классе обращается с присвоением имен к классу
                                // родителю, по переданным нами переменным.
    }
    @Override
    public void   info(){
        System.out.printf("Cat name: %s;\nColor of the animal: %s;\nAge of the animal: %s годиков.\n\n", name, color, age);
    }
}
