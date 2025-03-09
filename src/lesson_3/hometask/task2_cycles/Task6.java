public class Task6 {
    public static void main(String[] args) {
        printSubsequence(10);
    }
    static void printSubsequence(int n) {
        int f1 = 0, f2 = -5;

        System.out.print(f1 + " ");

        for (int i = 0; i < n; i++) {
            System.out.print(f2 + " ");
           f2 -=5;
        }
    }
}