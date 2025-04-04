package hometasks.lesson8.Task1.Shapes;

public class Disk extends Shape {
    private final double radius;


    public Disk(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare(){
        return (Math.PI * radius * radius);
    }
    @Override
    public double getPerimeter(){
        return (Math.PI * 2 * radius);
    }
}
