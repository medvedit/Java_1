package Java_1.Lecture_6.ClassWork_Introduction_2_OOP.ClassAbstractAnimal;

public class Dog extends Animal { // Создали класс Dog, который наследуется (extends) от класса Animal
    public Dog(String name, String color, int age) { // Создали конструктор для метода Cat
        super(name, color, age);// Приставка super не требует присвоения имен переменных через this.
        // Конструктор созданный в наследуемом классе обращается с присвоением имен к классу
        // родителю, по переданным нами переменным.
    }

    @Override // Переопределили метод, для созданного метода sleep из класса родителя(Animal).
    public void sleep() {
        System.out.println("Собаки спит");
    }
    public void sleep(int time){ // Перегрузка метода sleep. Отличается от переопределенного метода sleep только
                                 // разными сигнатурами и тем, что в классе Animal его нет, он создан только тут.
        System.out.printf("Собака спит примерно %s в день\n", time);
    }

    @Override
    public void   info(){
        System.out.printf("""
                Имя собаки: %s;
                Окрас собаки: %s;
                Возраст собаки: %s годиков

                """, name, color, age);
    }
}
