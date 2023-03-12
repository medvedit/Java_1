package Java_1.Lecture_6.ClassWork_Introduction_2_OOP.ClassAnimal;

public class Cat extends Animal { // Создали класс Cat, который наследуется (extends) от класса Animal


    public Cat(String name, String color, int age) { // Создали конструктор для метода Cat
        super(name, color, age); // Приставка super не требует присвоения имен переменных через this.
                                 // Приставка super - вызов к конструктору базового класса.
                                 // Конструктор созданный в наследуемом классе обращается с присвоением имен к классу
                                 // родителю, по переданным нами переменным.
    }
    public Cat(String name, int age){ // Можно создать второй конструктор, с меньшим количеством передаваемых
                                      // и соответственно в базовом классе создать конструктор для двух переменных.
        super(name, age);
    }
    @Override // Указание на переопределение метода.
    public void info(){ // Это называется переопределение методов,
                        // когда в классе наследнике есть такая же сигнатура и имя, как и в классе родителе.
        System.out.printf("Cat name: %s;\nColor of the animal: %s;\nAge of the animal: %s годиков.\n\n", name, color, age);
    }
}
