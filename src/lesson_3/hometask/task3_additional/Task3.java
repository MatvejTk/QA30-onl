package lesson_3.hometask.task3_additional;

// 3. Напишите программу, которая выводит на консоль таблицу умножения.

public class Task3 {

    public static void main(String[] args) {
        multiplicationTable();
    }

    public static void multiplicationTable() {
        for (int x = 1; x < 11; x++) {
            System.out.println();
            for (int y = 1; y < 11; y++) {
                System.out.print(x * y + " ");
            }
        }
    }
}