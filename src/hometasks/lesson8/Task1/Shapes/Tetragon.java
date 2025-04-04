package hometasks.lesson8.Task1.Shapes;

public class Tetragon extends Shape{
    private final double a,b;

    public Tetragon (double a, double b) {
        this.a = a;
        this.b = b;
            }
    @Override
    public double getSquare(){
        return (a * b / 2);
    }
    @Override
    public double getPerimeter(){
        return (2 * (a + b));
    }
}
