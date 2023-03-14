package Java_1.Lecture_7.HomeWork;

public class Plate extends Cat implements ScannerInt{
    private int food;
    private int count = 0;
//    private boolean catHungry = false;

    public Plate(int food){
        this.food = food;
    }

    public void info() {
        if (count == 0) {
            System.out.printf("Общее количество корма в тарелке: %s\n", food);
        } else {
            System.out.printf("Корма осталось: %s\n", food);
        }
    }

    public void decreaseFood(int inAppetite) {
        boolean catHungry = false;
        while (!catHungry) {
            if (food < inAppetite) {
                System.out.printf("Коту не хватит еды. В тарелке еды %s, а %s хочет съесть %s \n", food, getName(), getAppetite());
                count++;
                int inFood = ScannerInt.scanner();
                food += inFood;
            } else {
                food -= inAppetite;
                count++;
                System.out.printf("%s сыт. Мур-мур...\n", getName());
                catHungry = true;
            }
        }
    }
}
