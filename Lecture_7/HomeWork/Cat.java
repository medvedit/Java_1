package Java_1.Lecture_7.HomeWork;

import org.jetbrains.annotations.NotNull;

public class Cat {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
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

    public void eat(@NotNull Plate food) {
        food.decreaseFood(appetite);
    }
    public void catInfo(String inName, int inAppetite){
        this.name = inName;
        this.appetite = inAppetite;

    }

}
