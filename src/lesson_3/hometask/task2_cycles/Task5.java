package lesson_3.hometask.task2_cycles;

public class Task5 {
    public static void main(String[] args) {
        increment(10);
    }
    public static void increment(int n) {
        int numbers = 0;
        while (numbers < 100) {
            System.out.println(numbers);
            numbers += 7;
        }
    }
}
/*
    public static void main(String[] args) {
        printSubsequence(10);
    }
    static void printSubsequence(int n) {
        int f1 = 0, f2 = -5;
        System.out.print(f1 + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }
}
 */