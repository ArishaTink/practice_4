package org.example;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width < 0) {
            throw new RuntimeException("Ширина не может быть отрицательной. Вы ввели: " + width);
        } else if (height < 0) {
            throw new RuntimeException("Высота не может быть отрицательной. Вы ввели: " + height);
        }
        this.width = width;
        this.height = height;
    }

    public double perimeter() {
        return (width * 2) + (height * 2);
    }

    public double area(){
       return width * height;
    }
}
