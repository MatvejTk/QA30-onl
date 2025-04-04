package hometasks.lesson8.Task1.Shapes;

public class Triangle extends Shape {
    private final double a,b,c;

    public Triangle (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
