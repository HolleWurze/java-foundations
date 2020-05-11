package oop.lombok;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Person {
    protected boolean isMan = true;
    private String isMale;
    private String name;
    private String age;

    public void male() {
        if (isMan) {
            System.out.println("Мужчина");
        } else {
            System.out.println("Женщина");
        }
    }
    public void printAge() {
        System.out.println(age);
    }
}
