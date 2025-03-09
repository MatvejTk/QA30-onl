package lesson_3.hometask.task2_cycles;
import java.util.Scanner;

import static java.lang.Long.sum;

public class Task3 {
    public static void main(String[] args) {
        countNumbers();
    }
    public static void countNumbers() {
        Scanner input = new Scanner (System.in);
        System.out.println("Please insert any positive integer number: ");
        int number = input.nextInt();
        for (int a = 1; a < number; a++);
        if (number > 0) {
            System.out.println("This is sum of numbers from 1 to your inserted number: " + number);
        }
        else {
            System.out.println("You inserted incorrect number. Should be 1+");
        }
    }
}
