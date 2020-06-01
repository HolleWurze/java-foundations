package oop.lombok.hwOopObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class Telephone {
    private String modelTelephone;
    private String amountOfMemory;
    private String diagonalOfScreen;

    @Override
    public String toString() {
        return modelTelephone + " " + amountOfMemory + " " + diagonalOfScreen;
    }
}
