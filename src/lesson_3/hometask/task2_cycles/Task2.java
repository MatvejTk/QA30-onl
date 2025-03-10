package lesson_3.hometask.task2_cycles;

// 2. Необходимо вывести на экран числа от 5 до 1
// При решении используйте операцию декремента (--).

public class Task2 {

    public static void main(String[] args) {
        decrement5to1();
    }

    public static void decrement5to1() {
        for (int numb = 5; numb > 0; numb--) {
            System.out.println("Number " + numb);
        }
    }
}