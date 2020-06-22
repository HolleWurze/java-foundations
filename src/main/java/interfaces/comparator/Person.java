package interfaces.comparator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private String name;
    private String surName;
    private int age;

    @Override
    public int compareTo(Person person) {

        if (surName.compareTo(person.surName) != 0) {
            return surName.compareTo(person.surName);
        }
        if (name.compareTo(person.name) != 0) {
            return name.compareTo(person.name);
        }
        return age - person.age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "{" + surName + " " + name + " " + age + '}';
    }
}

