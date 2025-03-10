package lesson_3.hometask.task3_additional;

// 1. Выведите на экран первые 11 членов последовательности Фибоначчи.

public class Task1 {

    public static void main(String[] args) {
        fibonacciSequence(11);
    }

    public static void fibonacciSequence(int n) {
        int f0 = 0, f1 = 1;
        System.out.print(f0 + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(f1 + " ");
            int next = f0 + f1;
            f0 = f1;
            f1 = next;
        }
    }
}