package hometasks;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(1);
        int [] newList = new ArrayList ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert any integer number to check and if match remove that number from Array: ");
        int inp = sc.nextInt();
        for (int x : list) {
            if (x == inp) {
                list.remove(Integer.valueOf(inp)); // Remove by object
            }
            else {
                System.out.println("Inserted value is not in array");
                break;
            }
        }
        System.out.println(list);
    }
}