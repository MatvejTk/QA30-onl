package hometasks.lesson4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class OneDArray {
    public static void main(String[] args) {
        detectArrayNumber();
        removeFromArrays();
        createRandomArray();
        twoArrays();
        replaceArray();
        printToString();
        sortArrayNames();
        bubbleSort();
    }

// 0. + Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том,
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

// 1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
// Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
// В результате должен быть новый массив без указанного числа.

    public static void removeFromArrays() {
        int[] array = {1, 3, 8, 7, 4, 9, 5};
        int[] newArray = new int[array.length - 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert any integer number to check and if match remove that number from Array: ");
        int inp = sc.nextInt();
        for (int i=0, j=0; i<array.length; i++) {
            if (array[i] != inp)
                newArray[j++] = array[i];
            }
        System.out.println("\nYour new array is: ");
        for (int el : newArray){
            System.out.print(el + "\t");
        }
        System.out.println();
    }

// 2. + Создайте и заполните массив случайным числами и выведет максимальное, минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random().
// Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.

    public static void createRandomArray() {
        Random randVal = new Random();
        double avg;
        System.out.println("Please enter length of the array: ");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int arrCapacity = sc.nextInt();
        int[] randArr = new int[arrCapacity];
        int l = randArr.length;
        for (int index = 0; index < l; index++) {
            randArr[index] = randVal.nextInt(0, 99);
            sum += randArr[index];
        }
        avg = (double) sum / l;
        System.out.println("Medium value of array is : " + avg);
        int min = randArr[0];
        int max = randArr[0];
        for (int num : randArr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.println("Max value of the array is: " + max);
        System.out.println("Min value of the array is: " + min);
    }

// 3. + Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
// Посчитайте среднее арифметическое элементов каждого массива и сообщите,
// для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

    public static void twoArrays() {
        int[] arrayOne = {29, 16, 29, 3, 9};
        int[] arrayTwo = {27, 6, 19, 2, 25};
        System.out.print("First array: ");
        for (int el : arrayOne) {
            System.out.print(el + "\t");
        }
        System.out.println();
        System.out.print("Second array: ");
        for (int el : arrayTwo) {
            System.out.print(el + "\t");
        }
        System.out.println();
        double averageOne, averageTwo;
        double sumOne = 0;
        double sumTwo = 0;
        for (int a : arrayOne) {
            sumOne += a;
        }
        averageOne = sumOne / arrayOne.length;
        for (int b : arrayTwo) {
            sumTwo += b;
        }
        averageTwo = sumTwo / arrayTwo.length;
        if (averageOne > averageTwo) {
            System.out.println("Arithmetic mean of array 1 is bigger than array 2");
        } else if (averageTwo > averageOne) {
            System.out.println("Arithmetic mean of array 2 is bigger than array 1");
        } else {
            System.out.println("Both array has equal arithmetic mean");
        }
    }

// 4. Создайте массив из n случайных целых чисел и выведите его на экран.
// Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10
// Если n не удовлетворяет условию - выведите сообщение об этом.
// Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
// Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

    public static void replaceArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert size of an array:");
        int n = 0;
        while (n < 6 || n > 10) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n < 6 || n > 10) {
                    System.out.println("Inserted value should be more than 5 and less or equal to 10. Please, repeat:");
                }
            }
        }
        int[] newArray = new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            newArray[i] = (int) (Math.random() * (n + 1));
            if (newArray[i] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println(Arrays.toString(newArray));
        int[] finalArray = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (newArray[i] % 2 == 0) {
                finalArray[index] = newArray[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(finalArray));
    }

// 5. + Создайте массив и заполните массив. Выведите массив на экран в строку.
// Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

public static void printToString() {
    // integer array
    int[] array = {1, 2, 3, 4, 5};

    // Printing integer array using toString() Method
    System.out.println(Arrays.toString(array));
    for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 == 1) {
            array[i] = 0;
        }
    }
    System.out.println(Arrays.toString(array));
}
// 6. + Создайте массив строк. Заполните его произвольными именами людей.
// Отсортируйте массив. Результат выведите на консоль.

public static void sortArrayNames() {
    String[] beatles = new String[]{
            "Ringo Starr",
            "John Lennon",
            "Paul McCartney",
            "George Harrison",
    };
    Arrays.sort(beatles);
    for (String name : beatles){
        System.out.println(name);
    }
}

// 7. + Реализуйте алгоритм сортировки пузырьком.

    public static void bubbleSort() {
        int[] array = {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
                }
            }
        System.out.println("Array after bubble sort: ");
        for (int el : array){
            System.out.print(el + "\t");
        }
    }
}