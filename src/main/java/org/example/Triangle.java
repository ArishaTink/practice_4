package org.example;

public class Triangle {
    double first_side;
    double second_side;
    double third_side;

    public Triangle(double first_side, double second_side, double third_side) {
        if (first_side < 0 || second_side < 0 || third_side < 0) {
            throw new RuntimeException("Сторона не может быть отрицательной. Вы ввели: " + first_side + second_side + third_side);
        } else if ((third_side + second_side < first_side) || (third_side + first_side < second_side) || (second_side + first_side < third_side)) {
            throw new RuntimeException("Треугольника с такими сторонами не существует");
        } else {
            this.first_side = first_side;
            this.second_side = second_side;
            this.third_side = third_side;
        }
    }

    public double perimeter() {
        return first_side + second_side + third_side;
    }

    public double aria() {
        double half_p = perimeter()/2;
        return Math.sqrt(half_p * (half_p - first_side) * (half_p - second_side) * (half_p - third_side));
    }
}
