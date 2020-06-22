package Training0806;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Girls extends Person {
    private String name;
    private String surname;
    private int age;

    @Override
    public String toString() {
        return name + " - подожди, мне нужно накраситься!";
    }

//    @Override
//    public int compare(Person o1, Person o2) {
//        return o1.compareTo(o2);
//    }
}
