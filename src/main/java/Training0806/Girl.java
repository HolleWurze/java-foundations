package Training0806;

public class Girl extends Person {

    public Girl(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public String toString() {
        return super.getName() + " - подожди, мне нужно накраситься!";
    }
}
