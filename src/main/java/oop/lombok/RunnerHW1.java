package oop.lombok;

import java.util.Arrays;
import java.util.List;

public class RunnerHW1 {
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
        Person Vas9 = new Man("Мужчина", "34", "Вася");
        Person Marina = new Woman("Женщина", "28", "Марина");
        Person Tom = new Man("Мужчина", "22", "Том");
        Person Mery = new Woman("Женщина", "80", "Мери");
        Person Jhon = new Man("Мужчина", "8", "Джон");
        Person Scott = new Man("Мужчина", "45", "Скотт");
        Person Linda = new Woman("Женщина", "8", "Линда");
        Person Samanta = new Woman("Женщина", "35", "Саманта");

        //3. Создать массив типа Person, добавить туда всех Man и Woman
// и напечатать их возраст

        List<Person> visitors = Arrays.asList(Vas9, Marina, Tom, Mery, Jhon, Scott, Linda, Samanta);
        for (Person p : visitors) {
            p.printAge();
        }


        //4. Иерархия Фигур
//Фигура, Треугольник, Прямоугольник, Квадрат
//определить методы вычисления площади и периметра в фигуре
        Figure triangle = new Triangle();
        triangle.getPerimeter();
        triangle.getArea();
        Figure rectangle = new Rectangle();
        rectangle.getArea();
        rectangle.getPerimeter();
        Figure square = new Square();
        square.getPerimeter();
        square.getArea();
    }
}
