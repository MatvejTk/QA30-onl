package lesson_3.hometask.task2_cycles;

public class Task1 {
    public static void main(String[] args) {
        allEvenNumbers();
    }
    public static void allEvenNumbers() {
        for (int numb = 1; numb < 100; numb++) {
            if (numb % 2 == 1) {
                System.out.print(numb + " ");
            }
        }
    }
}