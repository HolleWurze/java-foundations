package oop.lombok;

import java.util.Scanner;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public void getArea() {
        System.err.println("\nВычисление площади прямоугольника - ");
        System.out.println("Введите значения сторон квадрата: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nside1 = ");
        double side1 = scan.nextInt();
        System.out.print("side2 = ");
        double side2 = scan.nextInt();
        double area = side1 * side2;
        System.out.println("Площадь прямоугольника = " + area);

    }

    public void getPerimeter() {
        System.err.println("\nВычисление периметра прямоугольника - ");
        System.out.println("Введите значения сторон квадрата: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nside1 = ");
        double side1 = scan.nextInt();
        System.out.print("side2 = ");
        double side2 = scan.nextInt();
        double perim = 2 * (side1 + side2);
        System.out.println("Периметр прямоугольника = " + perim);
    }
}