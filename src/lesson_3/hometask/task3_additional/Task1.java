package lesson_3.hometask.task3_additional;

public class Task1 {
    public static void main(String[] args) {
        fibonacciNumbers(11);
    }
    static void fibonacciNumbers(int n) {
        int f1 = 0, f2 = 1;

        System.out.print(f1 + " ");

        for (int i = 1; i < n; i++) {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }


}
