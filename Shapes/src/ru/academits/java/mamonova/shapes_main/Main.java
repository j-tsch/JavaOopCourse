package ru.academits.java.mamonova.shapes_main;

import ru.academits.java.mamonova.shapes.*;

import java.util.Arrays;

public class Main {
    public static Shape getMaxAreaShape(Shape[] shapes) {
        Arrays.sort(shapes, new ShapesAreasComparator());

        return shapes[shapes.length - 1];
    }

    public static Shape getSecondPerimeterShape(Shape[] shapes) {
        Arrays.sort(shapes, new ShapesPerimetersComparator());

        return shapes[shapes.length - 2];
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Square(6);
        shapes[1] = new Triangle(3, 4, 8, 2, 9, 1);
        shapes[2] = new Square(10);
        shapes[3] = new Rectangle(2, 3);
        shapes[4] = new Circle(1);
        shapes[5] = new Triangle(1, 2, 6, 2, 1, 4);

        System.out.println("Фигура с максимальной площадью: " + "\n" + getMaxAreaShape(shapes) + "\n");
        System.out.println("Фигура со вторым по величине периметром: " + "\n" + getSecondPerimeterShape(shapes));
    }
}