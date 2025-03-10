package lesson_3.hometask.task2_cycles;

// 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
// При решении используйте операцию инкремента (++).

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