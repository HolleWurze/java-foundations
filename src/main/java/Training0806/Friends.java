package Training0806;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Friends extends Person {
    private String name;
    private String surname;
    public int age;

    public Friends(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static String toString(String name) {
        return name + "Погнали мужики!";
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }

}
