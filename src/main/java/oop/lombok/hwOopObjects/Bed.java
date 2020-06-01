package oop.lombok.hwOopObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class Bed {
    private String treeFromWhichItIsMade;
    private String bedDimensions;

    @Override
    public String toString() {
        return treeFromWhichItIsMade + " " + bedDimensions;
    }
}
