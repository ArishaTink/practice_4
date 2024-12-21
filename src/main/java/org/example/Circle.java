package org.example;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new RuntimeException ("Радиус не может быть отрицательным. Вы ввели: " + radius);
        }
        this.radius = radius;
    }
    public double aria() {
        return 3.14*  (radius * radius);
    }

    public double perimeter(){
        return 2 * 3.14 * radius;
    }
}
