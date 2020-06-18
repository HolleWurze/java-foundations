package Training0806;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Friends extends Person {
    private final String name;
    private String surname;
    public int age;

    public Friends(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - погнали мужики!";
    }

}
