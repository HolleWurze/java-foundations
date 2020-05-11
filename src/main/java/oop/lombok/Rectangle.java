package oop.lombok;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Rectangle extends Figure {

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void getArea() {
        System.err.println("\nВычисление площади прямоугольника: ");
        double area = side1 * side2;
        System.out.println("Площадь прямоугольника = " + area);

    }

    public void getPerimeter() {
        System.err.println("\nВычисление периметра прямоугольника: ");
        double perim = 2 * (side1 + side2);
        System.out.println("Периметр прямоугольника = " + perim);
    }
}