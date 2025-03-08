package lesson_3.hometask.task1_control_sctructures;
import java.util.Scanner;

public class Temperature {
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
