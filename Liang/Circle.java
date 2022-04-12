package Liang;

public class Circle {
    private double radius;
    private final double pi = 3.14159;

    Circle() {
        this.radius = 0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }
}
