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

//    public Telephone(String modelTelephone, String amountOfMemory, String diagonalOfScreen) {
//        this.modelTelephone = modelTelephone;
//        this.amountOfMemory = amountOfMemory;
//        this.diagonalOfScreen = diagonalOfScreen;
//    }
//
//    public String getModelTelephone() {
//        return modelTelephone;
//    }
//
//    public void setModelTelephone(String modelTelephone) {
//        this.modelTelephone = modelTelephone;
//
//    }
//
//    public String getAmountOfMemory() {
//        return amountOfMemory;
//    }
//
//    public void setAmountOfMemory(String amountOfMemory) {
//        this.amountOfMemory = amountOfMemory;
//
//    }
//
//    public String getDiagonalOfScreen() {
//        return diagonalOfScreen;
//    }
//
//    public void setDiagonalOfScreen(String diagonalOfScreen) {
//        this.diagonalOfScreen = diagonalOfScreen;
//
//    }
}
