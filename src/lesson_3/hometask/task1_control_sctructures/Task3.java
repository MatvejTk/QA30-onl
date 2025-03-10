package lesson_3.hometask.task1_control_sctructures;

import java.util.Scanner;

// 3. Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
// Для определения четности числа используйте операцию получения остатка от деления - операция выглядит так: '% 2').

public class Task3 {

    public static void main (String[] args){
evenOdd();
    }

    public static void evenOdd() {
        Scanner input = new Scanner (System.in);
        System.out.println("Please, enter integer number");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("You inserted Even number");
        }
        else {
            System.out.println("You inserted Odd number");
        }
        }
    }