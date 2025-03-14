package hometasks.lesson4;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        detectArrayNumber(); removeFromArrays();
    }

// 0 Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том,
// входит ли заданное число в массив или нет. Пусть число для поиска задается с консоли (класс Scanner).

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

    // 1 Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
    // Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
    // В результате должен быть новый массив без указанного числа.

    public static void removeFromArrays() {
        int [] newArray = { 1, 3, 8, 7, 4, 9, 5};
        Scanner sc = new Scanner (System.in);
        System.out.println("Please, insert any integer number to check and if match remove that number from Array: ");
        int inp = sc.nextInt();
    }





}
