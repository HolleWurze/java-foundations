package oop.lombok.hwOopObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class Cow {
    private String nameBreed;
    private String color;

    @Override
    public String toString() {
        return nameBreed + " " + color;
    }
}