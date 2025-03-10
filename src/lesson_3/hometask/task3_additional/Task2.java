package lesson_3.hometask.task3_additional;
import java.util.Scanner;

// 2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
// Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
// А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
// Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.

public class Task2 {

    public static void main(String[] args) {
        bankInterest();
    }

    public static void bankInterest() {
        float rate = 0.07F;
    Scanner input = new Scanner (System.in);
    System.out.println("Please, enter amount: ");
    float amount = input.nextFloat();
    System.out.println("Please enter number of months: ");
    int time = input.nextInt();
        float newAmount = amount + (rate * time * amount);
        System.out.print("This is your deposit sum with interest rates per period: " + newAmount);
    }
}