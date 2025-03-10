package lesson_3.hometask.task2_cycles;

// 6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

public class Task6 {

    public static void main(String[] args){
        squareNumber();
    }

    public static void squareNumber() {
        int n = 10;
        do {
            System.out.println("Square numbers " + n * n );
        n++;
        } while (n < 21);
    }
}