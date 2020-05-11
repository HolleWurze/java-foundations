package oop.lombok;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square extends Figure {

    public Square(double side1) {
        this.side1 = side1;
    }

    public void getArea() {
        System.err.println("\nВычисление площади квадрата: ");
        double area = Math.pow(side1, 2);
        System.out.println("Площадь квадрата = " + area);
    }

    public void getPerimeter() {
        System.err.println("\nВычисление периметра квадрата: ");
        double perim = 4 * side1;
        System.out.println("Периметр квадрата = " + perim);

    }
}