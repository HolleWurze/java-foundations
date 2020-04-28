package oop.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Flower {
    private String colorOfFlower;

//    public Flower(String colorOfFlower) {
//        this.colorOfFlower = colorOfFlower;
//    }
//
//    public String getColorOfFlower() {
//        return colorOfFlower;
//    }
//
//    public void setColorOfFlower(String colorOfFlower) {
//        this.colorOfFlower = colorOfFlower;
//
//    }
}
