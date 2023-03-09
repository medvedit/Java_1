package Java_1.Lecture_4;

import java.util.Random;
import java.util.Scanner;

public class ClassWork_tic_tac_toe {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = SIZE;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искусственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isValidCell(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return true;
        }
        if (map[y][x] == DOT_EMPTY) {
            return false;
        }
        return true;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y\n: -> ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (isValidCell(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (isValidCell(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

//        public static boolean checkWin(char sing) {
//        if (map[0][0] == sing && map[0][1] == sing && map[0][2] == sing) return true;
//        if (map[1][0] == sing && map[1][1] == sing && map[1][2] == sing) return true;
//        if (map[2][0] == sing && map[2][1] == sing && map[2][2] == sing) return true;
//        if (map[0][0] == sing && map[1][0] == sing && map[2][0] == sing) return true;
//        if (map[0][1] == sing && map[1][1] == sing && map[2][1] == sing) return true;
//        if (map[0][2] == sing && map[1][2] == sing && map[2][2] == sing) return true;
//        if (map[0][0] == sing && map[1][1] == sing && map[2][2] == sing) return true;
//        if (map[2][0] == sing && map[1][1] == sing && map[0][2] == sing) return true;
//        return false;
//    }
    public static boolean checkWin(char sing){
        for (int i = 0; i < SIZE; i++) {
            int column = 0;
            int row = 0;
            int diagonal = 0;
            int reverseDiagonal = 0;
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == sing) {
                    column++;
                }
                if(map[j][i] == sing){
                    row++;
                }
                if(map[j][j] == 0){
                    diagonal++;
                }
                if(map[j][SIZE - 1 - j] == 0){
                    reverseDiagonal++;
                }
                if(column == DOTS_TO_WIN ||
                   row == DOTS_TO_WIN ||
                   diagonal == DOTS_TO_WIN ||
                   reverseDiagonal == DOTS_TO_WIN){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
