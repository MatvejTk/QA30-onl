package lesson_3.hometask.task1_control_sctructures;
import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        monthNumber();
    }
    public static void monthNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter month number to determine Weather Season: ");
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
    }
}