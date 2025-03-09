public class Task6 {
    public static void main(String[] args) {
        printSubsequence(10);
    }
    static void printSubsequence(int n) {
        int f1 = 0, f2 = -5;

        System.out.print(f1 + " ");

        for (int i = 1; i < n; i++) {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }


}