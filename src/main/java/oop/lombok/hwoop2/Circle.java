package oop.lombok.hwoop2;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Circle extends Figure {
    private static final double CONSTANT_PI = 3.141592653589793238462643383279502884197169399375105820974944;
    double R;

    public Circle(double R) {
        this.R = R;
    }

    static double square(double R) {
        double result = R * R;
        return result;
    }

    public void getArea() {
        System.out.println("Вычисление площади круга: ");
        double area = CONSTANT_PI * square(R);
        System.out.println("Площадь круга = " + area);

    }

    public void getPerimeter() {
        System.out.println("Вычисление периметра круга: ");
        double perim = 2 * CONSTANT_PI * R;
        System.out.println("Периметр круга = " + perim);
    }

    @Override
    public String toString() {
        return "\nРадиус круга {" + R + "}";
    }
}
