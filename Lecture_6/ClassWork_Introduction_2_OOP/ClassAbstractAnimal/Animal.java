package Java_1.Lecture_6.ClassWork_Introduction_2_OOP.ClassAbstractAnimal;

public abstract class Animal { // Создали !!! abstract !!! Animal класс.

    public String name; // Определили переменные в классе. Переменные публичные. Могут быть: public
    //                                                                                       protected
    //                                                                                       default/package (Модификатор отсутствует / по умолчанию)
    //                                                                                       private
    //                               Более подробно можно почитать Java 1 / Презентация 6
    public String color; // Определили переменные в классе
    public int age; // Определили переменные в классе

    public Animal(String name, String color, int age){ // Создание конструктора.
                                                       // Отличительная черта конструктора -> Конструктор,
                                                       // как и класс, в котором написан конструктор называются одинаково.
                                                       // Имя конструктора с большой буквы.
        this.name = name; // Имя переданное из метода main присваивается в переменную public name
        this.color = color; // Имя переданное из метода main присваивается в переменную public color
        this.age = age; // Имя переданное из метода main присваивается в переменную public age
    }

    public abstract void sleep(); // Разрешается в abstract классах, создавать abstract методы. Созданный метод может
                                  // быть без реализации. Но, при этом создании все созданные классы наследники
                                  // попросят сделать переопределение этого созданного метода внутри
                                  // своего класса(внутри класса наследника)

    public void info(){ // Метод печати в консоль
        System.out.printf("""
                Имя животного: %s;
                Окрас животного: %s;
                Возраст животного: %s годиков

                """, name, color, age);
    }

}

