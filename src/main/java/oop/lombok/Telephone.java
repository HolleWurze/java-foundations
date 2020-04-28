package oop.lombok;

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

}
