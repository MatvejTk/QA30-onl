package lesson_3.hometask.task2_cycles;
//Done
// лучше переделать, прописать math.pow

public class Task6 {
    public static void main(String[] args){
        squareNumber();
    }
    public static void squareNumber() {
        int n = 10;
        do {
            System.out.println("Square numbers " + n * n );
        n++;
        } while (n < 21);
    }
}
