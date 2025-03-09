package lesson_3.hometask.task3_additional;

public class Task3 {
    public static void main(String[] args) {
        multiplicationTable();
    }
    public static void multiplicationTable() {
        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int b = 1; b < 11; b++) {
                System.out.print(b * i + " ");
            }
        }
    }
}
