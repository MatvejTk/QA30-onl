package lesson_3.hometask.task2_cycles;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        countNumbers();
    }
    public static void countNumbers() {
        Scanner input = new Scanner (System.in);
        System.out.println("Please insert any positive integer number: ");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        if (number > 0) {
            System.out.println("This is sum of numbers from 1 to your inserted number: " + sum);
        }
        else {
            System.out.println("You inserted incorrect number. Please, insert 1+");
        }
    }
}