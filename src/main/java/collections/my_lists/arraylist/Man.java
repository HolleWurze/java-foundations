package collections.my_lists.arraylist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Man extends Person {

    public Man(String name, int age) {
        super(name, age, true);
    }

    @Override
    public boolean isMale() {
        return super.isMale();
    }
}
