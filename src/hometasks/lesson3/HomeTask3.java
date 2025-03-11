package hometasks.lesson3;

import java.util.Scanner;

public class HomeTask3 {

    public static void main(String[] args) {
        printFibonacci(11);
        printInterest();
        printMultiplicationTable();
    }

// 1. Выведите на экран первые 11 членов последовательности Фибоначчи.

    public static void printFibonacci(int n) {
        int f0 = 0, f1 = 1;
        System.out.println();
        System.out.println("Here are first 11 Fibonacci numbers from sequence");
        System.out.print(f0 + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(f1 + " ");
            int next = f0 + f1;
            f0 = f1;
            f1 = next;
        }
        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
    }

// 2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
// Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
// А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.

    public static void printInterest() {
        float rate = 0.07F;
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter amount: ");
        float amount = input.nextFloat();
        System.out.println("Please enter number of months: ");
        int time = input.nextInt();
        float newAmount = amount + (rate * time * amount);
        System.out.println("This is your deposit sum with interest rates per period: " + newAmount);
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
    }

// 3. Напишите программу, которая выводит на консоль таблицу умножения.

    public static void printMultiplicationTable() {
        System.out.println("Here are Multiplication Table");
        for (int x = 1; x < 11; x++) {
            System.out.println();
            for (int y = 1; y < 11; y++) {
                System.out.print(x * y + " ");
            }
        }
        System.out.println();
    }
}