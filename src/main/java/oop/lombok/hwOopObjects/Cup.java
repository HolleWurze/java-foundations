package oop.lombok.hwOopObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class Cup {
    private String radiusCup;
    private String volumeCup;

    @Override
    public String toString() {
        return radiusCup + " " + volumeCup;
    }
}
