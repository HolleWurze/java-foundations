package collections.my_lists.arraylist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Woman extends Person {


    public Woman(String name, int age) {

        super(name, age, false);
    }

    @Override
    public boolean isMale() {
        return super.isMale();
    }
}
