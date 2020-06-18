package Training0806;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Girls extends Person {
    private String name;
    private String surname;
    public int age;

    public Girls(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - подожди, мне нужно накраситься!";
    }
}
