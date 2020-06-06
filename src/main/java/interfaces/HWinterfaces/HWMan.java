package interfaces.HWinterfaces;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class HWMan implements Walkable, Runnable, Swimable {

    @Override
    public void walk() {
        System.out.println("Я гуляю на двух ногах!");
    }

    @Override
    public void run() {
        System.out.println("Я спортсмен");
    }

    @Override
    public int maxRunDistance() {
        return 50;
    }

    @Override
    public void swim() {
        System.out.println("А я еще и плавец!");
    }

    @Override
    public double maxSwimSpeed() {
        return 50;
    }

    public static int age;

    public HWMan( int age, String name) {
        System.out.println("Имя мужчины: " + name);
        HWMan.age = age;
    }
    public void printAge() {
        System.out.println(age);
    }

}
