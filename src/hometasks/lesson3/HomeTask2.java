package hometasks.lesson3;

import java.util.Scanner;

public class HomeTask2 {

    public static void main(String[] args) {
        printOddNumbers();
        returnDecrement();
        countNumbers();
        incrementSubsequence();
        printSubsequence(10);
        squareNumber();
    }

// 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
// При решении используйте операцию инкремента (++).

    public static void printOddNumbers() {
        System.out.println();
        System.out.println("Here we show all Odd numbers from 1 to 99");
        for (int numb = 1; numb < 100; numb++) {
            if (numb % 2 == 1) {
                System.out.print(numb + " ");
            }
          }
        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
    }

//  2. Необходимо вывести на экран числа от 5 до 1.
// При решении используйте операцию декремента (--).

    public static void returnDecrement() {
        System.out.println("Here we show decrement from 5 to 1");
        for (int numb = 5; numb > 0; numb--) {
            System.out.println("Number " + numb);
        }
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
    }

// 3. Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.
// Для ввода числа воспользуйтесь классом Scanner.

    public static void countNumbers() {
        System.out.println("Here we will count sum of numbers from 1 to your inserted number: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert any positive integer number: ");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        if (number > 0) {
            System.out.println("This is sum of numbers from 1 to your inserted number: " + sum);
        } else {
            System.out.println("You inserted incorrect number. Please, insert 1+");
        }
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
    }

// 4. Необходимо, чтоб программа выводила на экран вот такую последовательность:
// 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
// В решении используйте цикл while.

    public static void incrementSubsequence() {
        System.out.println("Here we show subsequence of numbers from 7 to 100 incremented by 7: ");
        int numbers = 7;
        while (numbers < 100) {
            System.out.print(numbers + " ");
            numbers += 7;
        }
        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
    }

//  5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..

    public static void printSubsequence(int n) {
        System.out.println("Here we show first 10 numbers of subsequence from 0 decremented by 5: ");
        int f1 = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(f1 + " ");
            f1 -= 5;
        }
        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
    }

// 6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

    public static void squareNumber() {
        System.out.println("Here we show squares of numbers from 10 to 20: ");
        int n = 10;
        do {
            System.out.print(n * n + " ");
            n++;
        } while (n < 21);
        System.out.println();
    }
}