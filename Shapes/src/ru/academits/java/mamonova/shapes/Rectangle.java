package ru.academits.java.mamonova.shapes;

public class Rectangle implements Shape {
    private double sideLengthA;
    private double sideLengthB;

    public Rectangle(double a, double b) {
        this.sideLengthA = a;
        this.sideLengthB = b;
    }

    public double getSideLengthA() {
        return sideLengthA;
    }

    public void setSideLengthA(double a) {
        this.sideLengthA = a;
    }

    public double getSideLengthB() {
        return sideLengthB;
    }

    public void setSideLengthB(double b) {
        this.sideLengthB = b;
    }

    @Override
    public double getWidth() {
        return sideLengthA;
    }

    @Override
    public double getHeight() {
        return sideLengthB;
    }

    @Override
    public double getArea() {
        return sideLengthA * sideLengthB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideLengthA + sideLengthB);
    }

    @Override
    public String toString() {
        return "прямоугольник; площадь: " + getArea() + "; периметр: " + getPerimeter();
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;

        hash = prime * hash + Double.hashCode(sideLengthA);
        hash = prime * hash + Double.hashCode(sideLengthB);

        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) o;

        return sideLengthA == rectangle.sideLengthA && sideLengthB == rectangle.sideLengthB;
    }
}