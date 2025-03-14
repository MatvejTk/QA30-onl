package hometasks.lesson4;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        detectArrayNumber();
    }

    public static void detectArrayNumber() {
        int[] initialArray = new int[5];
        initialArray[0] = 12;
        initialArray[1] = 33;
        initialArray[2] = 30;
        initialArray[3] = 2;
        initialArray[4] = 26;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert positive integer number to find it in array: ");
        int arr = sc.nextInt();
        boolean exists = false;
        for (int x : initialArray) {
            if (x == arr) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("The array contains the value '" + arr + "'.");
        } else {
            System.out.println("The array does not contain the value '" + arr + "'.");
        }
    }
}
