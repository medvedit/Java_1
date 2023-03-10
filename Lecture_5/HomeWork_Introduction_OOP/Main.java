package Java_1.Lecture_5.HomeWork_Introduction_OOP;


public class Main {
    public static void main(String[] args) {
        Employee person1 = new Employee("Сироткин Василий Николаевич","дворник",
                                        "boss@mail.ru","+7(922)834-23-11",23000,48);
        Employee person2 = new Employee("Ковальков Егор Олегович","водитель",
                                        "gasBrake@mail.ru","+7(912)883-47-23",87000, 42);
        Employee person3 = new Employee("Рогов Генадий Викторович","швейцар",
                                        "shuba@mail.ru","+7(912)883-29-99",43000,56);
        Employee person4 = new Employee("Глазастая Виалета Никифоровна","секретарь",
                                        "teaCoffee@mail.ru","+7(999)333-33-00",55000,25);
        Employee person5 = new Employee("Бурланов Сергей Сергеевич","брокер",
                                        "fullDep@mail.ru","+7(945)555-43-21",1000,27);
        Employee person6 = new Employee("Знающий Глеб Геннадьевич","директор",
                                        "IKnowEverything@mail.eu","+7(945)555-55-55",132000,35);
        System.out.println("""

                Вывод всех данных: **********************************************
                """);
        person1.info();
        person2.info();
        person3.info();
        person4.info();
        person5.info();
        person6.info();

        System.out.println("Вывод данных по условию if: " + "**********************************************\n");

        Employee[] persArray = new Employee[6];
        persArray[0] = new Employee("Сироткин Василий Николаевич","дворник",
                "boss@mail.ru","+7(922)834-23-11",23000,48);
        persArray[1] = new Employee("Шумахер Егор Олегович","водитель",
                "gasBrake@mail.ru","+7(912)883-47-23",87000, 42);
        persArray[2] = new Employee("Внимательный Генадий Викторович","швейцар",
                "shuba@mail.ru","+7(912)883-29-99",43000,56);
        persArray[3] = new Employee("Глазастая Виалета Никифоровна","секретарь",
                "teaCoffee@mail.ru","+7(999)333-33-00",55000,25);
        persArray[4] = new Employee("Бурланов Сергей Сергеевич","брокер",
                "fullDep@mail.ru","+7(945)555-43-21",1000,27);
        persArray[5] = new Employee("Знающий Глеб Геннадьевич","директор",
                "IKnowEverything@mail.eu","+7(945)555-55-55",132000,35);


        for (Employee item : persArray) { // функция вывода данных по условию возраст > 40 лет.
            if(item.getAge() > 40){ // проверка условия, полученных данных из метода getAge.
                item.info(); // вызов метода на печать.
            }
        }
    }

}
