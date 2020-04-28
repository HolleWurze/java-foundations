package oop.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Cup {
    private String radiusCup;
    private String volumeCup;

//    public Cup(String radiusCup, String volumeCup) {
//        this.radiusCup = radiusCup;
//        this.volumeCup = volumeCup;
//    }
//
//    public String getRadiusCup() {
//        return radiusCup;
//    }
//
//    public void setRadiusCup(String radiusCup) {
//        this.radiusCup = radiusCup;
//
//    }
//
//    public String getVolumeCup() {
//        return volumeCup;
//    }
//
//    public void setVolumeCup(String volumeCup) {
//        this.volumeCup = volumeCup;
//
//    }
}
