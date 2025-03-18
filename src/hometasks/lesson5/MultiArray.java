package hometasks.lesson5;

import java.util.Random;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        incrementMultiArray();
        makeChessBoard();
    }

    public static void incrementMultiArray() {
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Please, insert size of multi array: ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
        int[][][] multiArray = new int[a][b][c];
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                for (int z = 0; z < c; z++) {
                    multiArray[x][y][z] = r.nextInt(9);
                    System.out.print(multiArray[x][y][z] + "\t");
                }
            }
        }
        System.out.println();
        System.out.println("Please, insert number on which we will increment all values of the array");
        int increment = sc.nextInt();
        int d;
        int e;
        int f;
        for (d = 0; d < a; d++) {
            for (e = 0; e < b; e++) {
                for (f = 0; f < c; f++)
                    multiArray[d][e][f] += increment;
            }
        }
        System.out.println("Here are list of your multi array incremented by your inserted number: " + increment);
        System.out.print(multiArray[a][b][c]);
    }

    public static void makeChessBoard() {
        String[][] chessBoard = new String[8][8];
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++)
                if ((a + b) % 2 == 0)
                    chessBoard[a][b] = "W";
                else chessBoard[a][b] = "B";
        }
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 8; b++) {
                System.out.print(" " + chessBoard[a][b]);
            }
            System.out.println();
        }
    }
}
