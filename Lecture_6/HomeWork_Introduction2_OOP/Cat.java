package Java_1.Lecture_6.HomeWork_Introduction2_OOP;

public class Cat extends Animal implements Running, Swimming {
    private static int count = 0;
    private final int RUN_DISTANCE = 200;
    public Cat(String name, int age) {
        super(name, age);
        count++;
    }

    @Override
    public void run(String name, int distance) {
        if (distance > RUN_DISTANCE) {
            System.out.printf("%s не бегает больше 200 метров. " +
                    "%s метров это перебор)))\n", name, distance);
        } else {
            System.out.printf("%s пробежал %s метров\n", name, distance);
        }

    }

    @Override
    public void swim(String name, int distance) {
        System.out.printf("""
                Вы что то напутали, коты плавать не будут... А Вы захотели, что бы %s проплыл %s метров.
                """, name, distance);
    }

    @Override
    public void info() {
        System.out.printf("""
                Имя кота: %s
                Возраст кота: %s годика
                                
                """, name, age);
    }
    public static int getCount(){
        return count;
    }
}
