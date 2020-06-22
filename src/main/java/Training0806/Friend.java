package Training0806;

public class Friend extends Person {

    public Friend(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public String toString() {
        return super.getName() + " - погнали мужики!";
    }
}
