package Java_1.Lecture_7.HomeWork;


public class Cat {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) { // Конструктор.
        this.name = name;
        this.appetite = appetite;
    }
    public Cat() {}

    //<editor-fold desc="Геттеры">
    public String getName(){
        return name;
    }
    public int getAppetite() {
        return appetite;
    }
    //</editor-fold>

    public void eat(Plate food) { // Метод кормления кота, в который передается тарелка с едой,
        food.decreaseFood(appetite); // Метод вычисления оставшейся еды на основании аппетита кота.
    }
    public void catInfo(String inName, int inAppetite){ // Метод присвоения данных о коте, который в данный момент кушает.
        this.name = inName;
        this.appetite = inAppetite;

    }

}
