package Training0806;

import java.util.Comparator;

public class HWcomparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        return p1.compareTo(p2);
    }
}

