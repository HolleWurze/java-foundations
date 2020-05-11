package oop.lombok;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Triangle extends Figure {

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void getArea() {
        System.err.println("\nВычисление площади треугольника: ");
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            System.err.println("Эти стороны не образуют треугольника, площадь не посчитать");
//                System.exit(0);
        } else {
            double perim = side1 + side2 + side3;
            double area = Math.sqrt(perim * (perim - side1) * (perim - side2) * (perim - side3));
            System.out.println("Площадь фигуры = " + area);
        }
    }

    public void getPerimeter() {
        System.err.println("\nВычисление периметра треугольника: ");

        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            System.err.println("Эти стороны не образуют треугольника, периметр не посчитать");
//                System.exit(0);
        } else {
            double perim = side1 + side2 + side3;
            System.out.println("Периметр фигуры = " + perim);
        }
    }
}