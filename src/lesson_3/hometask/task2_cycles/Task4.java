package lesson_3.hometask.task2_cycles;

// 4. Необходимо, чтоб программа выводила на экран вот такую последовательность:
// 7 14 21 28 35 42 49 56 63 70 77 84 91 98
// В решении используйте цикл while.

public class Task4 {

    public static void main(String[] args) {
        increment();
    }

    public static void increment() {
        int numbers = 7;
        while (numbers < 100) {
            System.out.println(numbers);
            numbers += 7;
        }
    }
}

