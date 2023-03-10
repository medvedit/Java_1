package Java_1.Lecture_5.ClassWork_Introduction_OOP.CatPrivate;


public class Cat {
    private String name;
    private  int age;

    public Cat(String name, int age){ // Создание конструктора. Отличительная черта конструктора -> Конструктор,
                                      // как и класс, в котором написан конструктор называются одинаково.
                                      // Имя конструктора с большой буквы.
        this.name = name; // Имя переданное из метода main присваивается в переменную private name
        this.age = age; // Возраст переданный из метода main присваивается в переменную private age
    }
    public void setName(String inName){ // Создан сеттер(public), который принимает на вход String inName,
                                        // и переписывает любое ранее созданное name на входящее inName.
            this.name = inName;
        }

    public void setNameIf(String inName){ // Создан сеттер(public), который принимает на вход String inName,
                                          // и переписывает ранее созданную сущность с name == "Васька",
                                          // на любое другое значение. Остальные, другие сущности, НЕ "Васька" останутся
                                          // без изменения.
        if(name.equals("Васька")){
            this.name = inName;
        }
    }

    public int getAge(){
        return age;
    }
    public int getAgeIf() {
        if (age > 1 && age < 4) {
            return age;
        }
        return 0;
    }

    public void info(){
        System.out.printf("Кот, его зовут %s. Его возраст %s годиков.\n", name, age);
    }
}
