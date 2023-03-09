package Java_1.Lecture_4;
//
//import java.awt.image.ImageProducer;
//
//public class HomeWork_Tic_Tac_Toe {
//
//    /**
//     *  1. Переделать проверку победы, чтобы она не была реализована просто набором условий,
//     *     например, с использованием циклов.
//     *     Можно заменить метод в class ClassWork_tic_tac_toe/public static boolean checkWin(char sing) на
//     *     одноименный метод написанный ниже.
//     */
//    public static boolean checkWin(char sing) {
//        for (int i = 0; i < SIZE; i++) {
//            if ((map[i][0] == sing && map[i][1] == sing &&
//                    map[i][2] == sing) ||
//                    (map[0][i] == sing && map[1][i] == sing &&
//                            map[2][i] == sing))
//                return true;
//        }
//        if ((map[0][0] == sing && map[1][1] == sing &&
//                map[2][2] == sing) ||
//                (map[2][0] == sing && map[1][1] == sing &&
//                        map[0][2] == sing)) {
//            return true;
//        }
//        return false;
//    }
//
//}
