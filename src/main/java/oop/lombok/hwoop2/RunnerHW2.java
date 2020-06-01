package oop.lombok.hwoop2;

import java.util.Scanner;

public class RunnerHW2 {
    public static void main(String[] args) {
        //1. Lion Cat Panther. Определить метод sayMeow() для Cat
// и переопределить его для Panther
        Cat lion = new Lion();
        System.out.println("Лев мурчит как кошка:");
        lion.sayMeow();
        Cat panter = new Panter();
        System.out.println("А пантера мурчит как большая кошка:");
        panter.sayMeow();

        //2. Person Woman Man.
//Person поля: isMale , name, age. Метод printAge() 'напечатать возраст'.
//Woman Man. Поменять поле isMale в зависимости от класса.
//Для woman переопределить метод printAge() и напечатать 'всегда 18'
        Person vas9 = new Man("Мужчина", "34", "Вася");
        Person marina = new Woman("Женщина", "28", "Марина");
        Person tom = new Man("Мужчина", "22", "Том");
        Person mery = new Woman("Женщина", "80", "Мери");
        Person jhon = new Man("Мужчина", "8", "Джон");
        Person scott = new Man("Мужчина", "45", "Скотт");
        Person linda = new Woman("Женщина", "8", "Линда");
        Person samanta = new Woman("Женщина", "35", "Саманта");

        //3. Создать массив типа Person, добавить туда всех Man и Woman
// и напечатать их возраст

Person[] visitors = new Person[]{vas9,marina,tom,mery,jhon,scott,linda,samanta};

        for (int i = 0; i < visitors.length; i++) {
            visitors[i].printAge();
        }

        //4. Иерархия Фигур
//Фигура, Треугольник, Прямоугольник, Квадрат
//определить методы вычисления площади и периметра в фигуре

        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите длину стороны1 = ");
        double side1 = scan.nextInt();
        System.out.print("Введите длину стороны2 = ");
        double side2 = scan.nextInt();
        System.out.print("Введите длину стороны3 = ");
        double side3 = scan.nextInt();
        System.out.print("Введите радиус = ");
        double R = scan.nextInt();



        Figure triangle = new Triangle(side1, side2, side3);
        System.out.println(triangle.toString());
        triangle.getPerimeter();
        triangle.getArea();

        Figure rectangle = new Rectangle(side1, side2);
        System.out.println(rectangle.toString());
        rectangle.getArea();
        rectangle.getPerimeter();

        Figure square = new Square(side1);
        System.out.println(square.toString());
        square.getPerimeter();
        square.getArea();

        Figure circle = new Circle(R);
        System.out.println(circle.toString());
        circle.getArea();
        circle.getPerimeter();

    }
}
