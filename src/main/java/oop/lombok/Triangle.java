package oop.lombok;

import java.util.Scanner;

public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {

    }

    public void getArea() {
        System.err.println("\nВычисление площади треугольника - ");
        System.out.println("Введите значения сторон треугольника: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nside1 = ");
        double side1 = scan.nextInt();
        System.out.print("side2 = ");
        double side2 = scan.nextInt();
        System.out.print("side3 = ");
        double side3 = scan.nextInt();
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
        System.err.println("\nВычисление периметра треугольника - ");
        System.out.println("Введите значения сторон треугольника: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nside1 = ");
        double side1 = scan.nextInt();
        System.out.print("side2 = ");
        double side2 = scan.nextInt();
        System.out.print("side3 = ");
        double side3 = scan.nextInt();
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            System.err.println("Эти стороны не образуют треугольника, периметр не посчитать");
//                System.exit(0);
        } else {
            double perim = side1 + side2 + side3;
            System.out.println("Периметр фигуры = " + perim);
        }
    }
}