package Java_1.Lecture_6.HomeWork_Introduction2_OOP;

public class Dog extends Animal implements Running, Swimming{
    private static int count = 0;
    final int RUN_DISTANCE = 500;
    final int SWIM_DISTANCE = 10;

    public Dog(String name, int age) {
        super(name, age);
        count++;
    }

    @Override
    public void run(String name, int distance){
        if(distance > RUN_DISTANCE){
            System.out.printf("""
                    %s не хочет бегать больше 500 метров, %s метров для него много..

                    """,name, distance);
        }else {
            System.out.printf("%s пробежал %s метров\n", name, distance);
        }
    }

    @Override
    public void swim(String name, int distance) {
        if(distance > SWIM_DISTANCE){
            System.out.printf("""
                    %s не плавает больше 10 метров. Ваше предложение проплыть %s метров, собаке интересно.
                    """, name, distance);
        }else {
            System.out.printf("%s проплыл %s метров\n", name, distance);
        }
    }

    @Override
    public void info() {
        System.out.printf("""
                Имя собаки: %s
                Возраст собаки: %s годика
                
                """,name,age);
    }

    public static int getCount(){
        return  count;
    }
}
