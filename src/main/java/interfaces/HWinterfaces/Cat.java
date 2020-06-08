package interfaces.HWinterfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cat implements Runnable, Swimable, Walkable {
    @Override
    public void run() {
        System.out.println("Я очень юркая!");
    }

    @Override
    public int maxRunDistance() {
        return 10;
    }

    @Override
    public void swim() {
        System.out.println("Ненавижу плавать");
    }

    @Override
    public double maxSwimSpeed() {
        return 0;
    }

    @Override
    public void walk() {
        System.out.println("Я гуляю на четырех лапах и сама по себе");
    }
}
