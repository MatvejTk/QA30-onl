package hometasks.lesson3;

import java.util.Scanner;

public class HomeTask1 {

    public static void main(String[] args) {
        returnSeasonCase();
        returnSeasonIf();
        returnEvenOdd();
        calculateTemperatureCondition();
        returnRainbowColor();
    }

// 1. Написать программу для вывода названия поры года по номеру месяца.
// При решении используйте оператор switch-case.

    public static void returnSeasonCase() {

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Please, enter month number to determine Weather Season by using case system: ");
        String month = input.next();
        switch (month) {
            case "1", "12":
                System.out.println("Winter");
                break;
            case "3", "4", "5":
                System.out.println("Spring");
                break;
            case "6", "7", "8":
                System.out.println("Summer");
                break;
            case "9", "10", "11":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("You inserted wrong value");
                break;
        }
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
    }

// 2. Написать программу для вывода названия поры года по номеру месяца.
// При решении используйте оператор if-else-if.

public static void returnSeasonIf(){

    Scanner input = new Scanner(System.in);
    System.out.println("Please, enter month number to determine Weather Season by using if-else-if system: ");
    int month = input.nextInt();
    if (month >= 1 && month < 3 || month == 12) {
        System.out.println("Winter");
    }
    else if (month >=3 && month <6) {
        System.out.println("Spring");
    }
    else if (month>=6 && month <9) {
        System.out.println("Summer");
    }
    else if (month>=9 && month <12) {
        System.out.println("Autumn");
    }
    else {
        System.out.println("You entered wrong data");
    }
    System.out.println();
    System.out.println("----------------------------------------------");
    System.out.println();
}

// 3. Напишите программу, которая принимает на вход число и на выход будет выводить сообщение четное число или нет.
//Для определения четности числа используйте операцию получения остатка от деления - операция выглядит так: '% 2').

    public static void returnEvenOdd() {

    Scanner input = new Scanner (System.in);
    System.out.println("Please, enter integer number");
    int number = input.nextInt();
    if (number % 2 == 0) {
        System.out.println("You inserted Even number");
    }
    else {
        System.out.println("You inserted Odd number");
    }
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
}

//  4. Для введенного числа t (температура на улице) вывести
// Если t>–5, то вывести «Тепло».
// Если –5>= t > –20, то вывести «Нормально».
// Если –20>= t, то вывести «Холодно».

public static void calculateTemperatureCondition() {

    Scanner input = new Scanner (System.in);
    System.out.println("Please insert temperature in Celcius: ");
    double temperature = input.nextDouble();
    if (temperature > -5) {
        System.out.println("Temperature is Warm");
    }
    else if (temperature >-20) {
        System.out.println("Temperature is Normal");
    }
    else if (temperature <=-20) {
        System.out.println("Temperature is Cold");
    }
    else {
        System.out.println("Please insert valid number");
    }
    System.out.println();
    System.out.println("----------------------------------------------");
    System.out.println();
}

// 5. По введенному номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.).

    public static void returnRainbowColor() {

    Scanner input = new Scanner(System.in);
    System.out.println("Please, insert number from 1 to 7 to determine color of rainbow");
    String color = input.next();
    switch (color) {
        case "1":
            System.out.println("Red");
            break;
        case "2":
            System.out.println("Orange");
            break;
        case "3":
            System.out.println("Yellow");
            break;
        case "4":
            System.out.println("Green");
        case "5":
            System.out.println("Cyan");
            break;
        case "6":
            System.out.println("Blue");
            break;
        case "7":
            System.out.println("Violet");
            break;
        default:
            System.out.println("You inserted wrong value");
            break;
    }
    }
}