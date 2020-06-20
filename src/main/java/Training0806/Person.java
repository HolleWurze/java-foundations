package Training0806;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person implements Comparable<Person>  {
    public String name;
    private String surname;
    public int age;

    @Override
    public int compareTo(Person person) {

           if (name.compareTo(person.name) != 0) {
               return name.compareTo(person.name);
           }
        return 0;
    }

    @Override
    public String toString() {
        return "{" + name + " " + surname + " " + age + '}';
    }
}
