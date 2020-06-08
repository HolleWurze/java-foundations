package interfaces.HWinterfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dog implements Walkable, Runnable, Swimable {
    @Override
    public void walk() {
        System.out.println("Я гуляю на четырех лапах и только с хозяином!");
    }

    @Override
    public void run() {
        System.out.println("Я очень выносливая!");
    }

    @Override
    public int maxRunDistance() {
        return 10;
    }

    @Override
    public void swim() {
        System.out.println("Я люблю плавать!");
    }

    @Override
    public double maxSwimSpeed() {
        return 3;
    }
}
