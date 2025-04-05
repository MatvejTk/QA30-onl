package hometasks.lesson8.Task1;
// 1. Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
// Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
// Создать массив из 5 фигур.
// Вывести на экран сумму периметра всех фигур в массиве.

import hometasks.lesson8.Task1.Figures.*;

public class FigureRunner {
    static double perimeterSum;
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures [0] = new Triangle(3,4,5);
        figures [1] = new Rectangle(5,10);
        figures [2] = new Disk(10);
        figures [3] = new Rectangle(10, 20);
        figures [4] = new Disk(20);
         for (Figure shape : figures) {
            perimeterSum += shape.getPerimeter();
        }
        System.out.println("Sum of perimeters of all figures are : " + perimeterSum);
    }
}
