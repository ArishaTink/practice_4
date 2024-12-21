package org.example;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(4,3,2);
        Rectangle rectangle = new Rectangle(4,5);
        Circle circle = new Circle(4);

        System.out.println(circle.perimeter());
        System.out.println(circle.aria());

        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());

        System.out.println(triangle1.perimeter());
        System.out.println(triangle1.aria());
    }
}