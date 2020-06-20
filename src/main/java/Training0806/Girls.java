package Training0806;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@AllArgsConstructor
@Setter
@Getter

public class Girls extends Person implements Comparator<Person> {
    public String name;
    private String surname;
    public int age;

    @Override
    public String toString() {
        return name + " - подожди, мне нужно накраситься!";
    }




    @Override
    public int compare(Person o1, Person o2) {
        return o1.compareTo(o2);
    }


}
