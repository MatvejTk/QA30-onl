package hometasks.lesson8.Task1.Figures;

public class Triangle extends Figure {
    private final double a,b,c;

    public Triangle (double sideA, double sideB, double sideC) {
        this.a = sideA;
        this.b = sideB;
        this.c = sideC;
    }
    @Override
    public double getSquare() {
        return (a * b * c / 2);
    }

    @Override
    public double getPerimeter() {
        return (a + b + c);
    }
}
