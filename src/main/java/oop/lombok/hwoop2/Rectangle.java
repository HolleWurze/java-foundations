package oop.lombok.hwoop2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Rectangle extends Figure {
    double side1;
    double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void getArea() {

        System.out.println("Вычисление площади прямоугольника: ");

        double area = side1 * side2;
        System.out.println("Площадь прямоугольника = " + area);

    }

    public void getPerimeter() {
        System.out.println("Вычисление периметра прямоугольника: ");
        double perim = 2 * (side1 + side2);
        System.out.println("Периметр прямоугольника = " + perim);
    }

    @Override
    public String toString() {
        return "\nСтороны прямоугольника {" + side1 + " " + side2 + "}";
    }
}