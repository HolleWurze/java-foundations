package oop.lombok.hwOopObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class Flower {
    private String colorOfFlower;

    @Override
    public String toString() {
        return colorOfFlower;
    }
}
