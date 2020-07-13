package collections.my_lists.arraylist;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    public String name;
    public int age;
    final boolean isMale;
}
