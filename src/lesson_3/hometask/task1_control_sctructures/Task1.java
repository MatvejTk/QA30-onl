package lesson_3.hometask.task1_control_sctructures;

import java.util.Scanner;

// 1. Написать программу для вывода названия поры года по номеру месяца.
// При решении используйте оператор switch-case.

public class Task1 {

    public static void main(String[] args) {
        setMonth();
    }

    public static void setMonth() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter month number to determine Weather Season: ");
        String month = input.next();
        switch (month) {
            case "1":
                System.out.println("Winter");
                break;
            case "2":
                System.out.println("Winter");
                break;
            case "3":
                System.out.println("Spring");
                break;
            case "4":
                System.out.println("Spring");
                break;
            case "5":
                System.out.println("Spring");
                break;
            case "6":
                System.out.println("Summer");
                break;
            case "7":
                System.out.println("Summer");
                break;
            case "8":
                System.out.println("Summer");
                break;
            case "9":
                System.out.println("Autumn");
                break;
            case "10":
                System.out.println("Autumn");
                break;
            case "11":
                System.out.println("Autumn");
                break;
            case "12":
                System.out.println("Winter");
                break;
            default:
                System.out.println("You inserted wrong value");
        }
    }
}