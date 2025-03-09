package lesson_3.hometask.task2_cycles;
//Done
public class Task5 {

public static void main(String[] args) {
    printSubsequence(10);
}
public static void printSubsequence(int n) {
    int f1 = 0;
    for (int i = 0; i < n; i++) {
        System.out.print(f1 + " ");
        f1 -=5;
    }
}
}