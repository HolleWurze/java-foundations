package oop.lombok.hwoop2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square extends Figure {
    double side1;

    public Square(double side1) {
        this.side1 = side1;
    }

    public void getArea() {
        System.out.println("Вычисление площади квадрата: ");
        double area = Math.pow(side1, 2);
        System.out.println("Площадь квадрата = " + area);
    }

    public void getPerimeter() {
        System.out.println("Вычисление периметра квадрата: ");
        double perim = 4 * side1;
        System.out.println("Периметр квадрата = " + perim);

    }

    @Override
    public String toString() {
        return "\nСтороны квадрата {4 * " + side1 + "}";
    }
}