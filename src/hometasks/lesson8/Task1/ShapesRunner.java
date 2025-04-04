package hometasks.lesson8.Task1;

import hometasks.lesson8.Task1.Shapes.*;

public class ShapesRunner {
    static double perimeterSum;
    public static void main(String[] args) {
        Shape triangle = new Triangle (3,4,5);
        Shape tetragon = new Tetragon (5,10);
        Shape disk = new Disk (10);
        Shape [] shapes = new Shape[5];
        shapes [0] = new Triangle(3,4,5);
        shapes [1] = new Tetragon(5,10);
        shapes [2] = new Disk(10);
        shapes [3] = new Tetragon(10, 20);
        shapes [4] = new Disk(20);
         for (Shape shape : shapes) {
            perimeterSum += shape.getPerimeter();
        }

        System.out.println("Sum of perimeters of all shapes are : " + perimeterSum);
    }
}
