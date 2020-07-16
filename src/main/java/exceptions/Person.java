package exceptions;

public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) throws hwMyException {
        this.name = name;
        if ((age < 10) || (age > 20)) {
            throw new hwMyException("Некоректный возраст!");
        }
        this.age = age;

    }
}
