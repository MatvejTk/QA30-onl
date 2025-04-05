package hometasks.lesson8.Task1.Figures;

public class Rectangle extends Figure {
    private final double a,b;

    public Rectangle(double sideA, double sideB) {
        this.a = sideA;
        this.b = sideB;
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
