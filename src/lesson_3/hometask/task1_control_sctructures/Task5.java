package lesson_3.hometask.task1_control_sctructures;
import java.util.Scanner;
public class Task5 {
    public static void main (String[] args) {
        rainbowColorNumber();
    }
        public static void rainbowColorNumber() {
            Scanner input = new Scanner (System.in);
            System.out.println ("Please, insert number from 1 to 7 to determine color of rainbow");
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


            }

        }
    }
