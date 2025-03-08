package lesson_3.hometask.task1_control_sctructures;
import java.util.Scanner;

public class WeatherSeason {
    public static void main (String[] args) {
        setMonth();
        monthNumber();
    }
    public static void setMonth(){
        Scanner input = new Scanner (System.in);
        System.out.println("Please, enter month number to determine Weather Season:");
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
        public static void monthNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter month number to determine Weather Season: ");
        int month = input.nextInt();
        if (month >= 1 && month < 3) {
            System.out.println("Winter");
        }
        else if (month >= 12 && month <13 ) {
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


