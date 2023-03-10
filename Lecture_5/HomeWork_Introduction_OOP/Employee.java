package Java_1.Lecture_5.HomeWork_Introduction_OOP;

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
 * консоль.
 * 4. Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * persArray[1] = new Person(...);
 * ...
 * persArray[4] = new Person(...);
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
public class Employee {
    private  String fullName;
    private  String position;
    private  String email;
    private  String phone;
    private  int salary;
    private  int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("""
                ФИО сотрудника: %s
                Должность : %s
                Электронная почта : %s
                Номер телефона : %s
                Заработная плата : %s
                Возраст : %s
                \n""", fullName, position, email, phone, salary, age);
    }
    public int getAge(){
        return age;
    }

}
