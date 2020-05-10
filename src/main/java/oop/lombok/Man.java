package oop.lombok;

import lombok.Getter;

@Getter

public class Man extends Person {
    private String age;

    public Man(String isMale, String age, String name) {
        System.out.println("Имя мужчины: " + name);
        System.out.println(isMale);
        this.age = age;
    }
    public void printAge() {
        System.out.println(age);
    }
}
