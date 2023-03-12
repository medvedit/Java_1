package Java_1.Lecture_6.HomeWork_Introduction2_OOP;

public abstract class Animal {
    public String name;
    public int age;
    private static int count = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public void info() {
        System.out.printf("""
                Имя животного: %s
                Возраст животного: %s
                                
                """, name, age);
    }

// public abstract void run(String name, final int distance); // Перенес в класс интерфейс.
// public abstract void swim(String name, final int distance); // Перенес в класс интерфейс.

    public static int getCount() {
        return count;
    }
}
