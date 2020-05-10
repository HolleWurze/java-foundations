package oop.lombok;

import java.util.Scanner;

public class Square extends Figure {
    private double side1;

    public void getArea() {
        System.err.println("\nВычисление площади квадрата - ");
        System.out.println("Введите значения сторон квадрата: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nside1 = ");
        double side1 = scan.nextInt();
        double area = Math.pow(side1, 2);
        System.out.println("Площадь квадрата = ");
    }

    public void getPerimeter() {
        System.err.println("\nВычисление периметра квадрата - ");
        System.out.println("Введите значения сторон квадрата: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nside1 = ");
        double side1 = scan.nextInt();
        double perim = 4 * side1;
        System.out.println("Периметр квадрата = ");

    }
}