package Training0806;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person implements Comparable<Person> {
    final private String name;
    final private String surname;
    private int age;

    @Override
    public String toString() {
        return "{" + name + " " + surname + " " + age + '}';
    }

    @Override
    public int compareTo(Person person) {
        if (name.compareTo(person.name) != 0) {
            return name.compareTo(person.name);
        }
        return 0;
    }
}

