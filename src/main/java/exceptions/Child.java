package exceptions;

public class Child {
    private final String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        if ((age < 0) || (age > 18)) {
//            throw new myException("Некоректный возраст!");

        }
        this.age = age;
    }
}
