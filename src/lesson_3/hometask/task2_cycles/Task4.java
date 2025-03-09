package lesson_3.hometask.task2_cycles;
//Done
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

