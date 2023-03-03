package Java_1.Lecture_1;

public class ClassWorkTypeData {

    public static void main(String[] args) {
        int a = 10;
        float d = 2.5F;
        double f = 54.954;
        long s = 20L;

        double result = d + f;
        double result1 = (double) a / d;

        System.out.println(result);  // 57.454
        System.out.println(result1);  // 4.0
        System.out.println(a + s); // 30
        System.out.println(f - d); // 52.454

        printCat();
        printCat();
        printCat();
    }
    public static void printCat(){
        System.out.println("""
                           _..---...,""-._     ,/}/)
                        .''       ,       ``..'(/-<
                       /    _    {      )          \\
                      ;    _ `.   `.    <         a(
                    ,'    ( \\ )     `.   \\ __.._  .: y
                   (  <\\_-) )'-.____...\\   `._   //-'
                    `.  `-' /-._)))      `-._)))
                      `...'          \
                """);
    }
}
