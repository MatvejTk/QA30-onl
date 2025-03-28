package hometasks.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        incrementMultiArray();
        makeChessBoard();
        multiplicationArrays();
        sum2DArray();
        printArrayDiagonal();
        sort2DArray();
    }

// 0. Создать трехмерный массив из целых чисел.
// С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
// Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.

    public static void incrementMultiArray() {
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Please, insert size of 3D array: ");
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
        System.out.println("Randomly generated values for the array: ");
        System.out.println("Please, insert number on which we will increment all values of the array");
        int increment = sc.nextInt();
        System.out.println("Here are list of 3D array incremented by your inserted number: " + increment);
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                for (int z = 0; z < c; z++) {
                    multiArray[x][y][z] +=increment;
                    System.out.print(" " + multiArray[x][y][z] + " ");
                }
            }
            System.out.println();
        }
    }

// 1. Шахматная доска.
// Создать программу для раскраски шахматной доски с помощью цикла.
// Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам циклам значения B(Black) или W(White).
// Результат работы программы:
// W B W B W B W B
// B W B W B W B W
// W B W B W B W B
// B W B W B W B W
// W B W B W B W B
// B W B W B W B W
// W B W B W B W B
// B W B W B W B W

    public static void makeChessBoard() {
        String[][] chessBoard = new String[8][8];
        System.out.println("Here we print chess board with each cell colored in W or B letters");
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

// 2. Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы).
// Напишите программу для умножения двух матриц.
// Первый массив: {{1,0,0,0}, {0,1,0,0}, {0,0,0,0}}. Второй массив: {{1,2,3}, {1,1,1}, {0,0,0}, {2,1,0}}
// Ожидаемый результат: 1 2 3 1 1 1 0 0 0

    public static void multiplicationArrays() {
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] array3 = new int[array1.length][array2[0].length];
        for (int i = 0; i < array3[0].length; i++)
            for (int j = 0; j < array3.length; j++)
                for (int k = 0; k < array1[0].length; k++)
                    array3[i][j] = array3[i][j] + array1[i][k] * array2[k][j];

System.out.println(" Here we do multiplication between two 2D arrays and show results of the action: ");
        for (int[] multi : array3) {
            for (int j = 0; j < array3[0].length; j++) {
                System.out.print(" " + multi[j] + " ");
            }
            System.out.println();
        }
    }

// 3. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.

    public static void sum2DArray() {
        System.out.println("Here we make sum of all elements of 2D array");
        System.out.println("Our 2D array");
        int[][] array2D = new int[][]{{1, 3, 6}, {7, 5, 4, 2}, {0, 9}};
        int sum = 0;
        for (int[] val : array2D) {
            for (int num : val) {
                sum += num;
            }
        }
        for (int a=0; a<3;a++){
            for (int b=0;b<array2D[a].length;b++){
                System.out.print(array2D[a][b] + "\t");
            }

        }
        System.out.println();
        System.out.println("Sum of 2D array is: " + sum);
    }

// 4. Создайте двумерный массив. Выведите на консоль диагонали массива.

public static void printArrayDiagonal() {

    int a, b, c;
    int x = 3;
    int y = 3;
    int[][] array2D = {{8, 2, 4}, {7, 1, 9}, {5, 3, 6}};
    System.out.println("Here we print all diagonals of the 2D array: ");
    for (c = 0; c <= x - 1; c++) {
        a = c;
        b = 0;
        while (a >= 0) {
            System.out.print(array2D[a][b] + "\t");
            a = a - 1;
            b = b + 1;
        }
    }
    for (c = 1; c <= y - 1; c++) {
        a = x - 1;
        b = c;
        while (b <= y - 1) {

            System.out.print(array2D[a][b] + "\t");
            a = a - 1;
            b = b + 1;
        }
    }
}

// 5. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.

    public static void sort2DArray() {
        System.out.println();
        System.out.println("Here we make Bubble Sort for the 2D array: ");
        int[][] matrix = new int[][]{
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int swap;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix[k].length; l++) {
                        if (matrix[i][j] <= matrix[k][l]) {
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = swap;
                        }
                    }
                }
            }
        }
        for (int[] newMatrix : matrix) {
            for (int i : newMatrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        }
    }