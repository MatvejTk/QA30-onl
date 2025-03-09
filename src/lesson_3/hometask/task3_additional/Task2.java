package lesson_3.hometask.task3_additional;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        bankInterest();
    }
    public static void bankInterest() {
        float rate = 1.07F;
    Scanner input = new Scanner (System.in);
    System.out.println("Please, enter amount: ");
    float amount = input.nextFloat();
    System.out.println("Please enter number of months: ");
    int time = input.nextInt();
        for (int i = 1; i <= time; i++) {
            float newAmount = amount + (rate * time * amount) - (amount * time);
            System.out.print(newAmount + " ");
        }
    }
}
