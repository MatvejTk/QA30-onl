package lesson_3.hometask.task1_control_sctructures;

import java.util.Scanner;

// 4. Для введенного числа t (температура на улице) вывести:
// Если t>–5, то вывести «Тепло».
// Если –5>= t > –20, то вывести «Нормально».
// Если –20>= t, то вывести «Холодно».

public class Task4 {

    public static void main(String[] args) {
        temperatureCondition();
    }

    public static void temperatureCondition() {
        Scanner input = new Scanner (System.in);
        System.out.println("Please insert temperature in Celcius: ");
        double temperature = input.nextDouble();
        if (temperature > -5) {
            System.out.println("Warm");
        }
        else if (temperature >=-20 && temperature <=-5) {
            System.out.println("Normal");
        }
        else if (temperature <-20) {
            System.out.println("Cold");
        }
        else {
             System.out.println("Please insert valid number");
            }

    }
}