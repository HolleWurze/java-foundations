package oop.lombok.hwOopObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter


public class Shop {
    private String titleShop;
    private String shopSpecialization;

    @Override
    public String toString() {
        return titleShop + " " + shopSpecialization;
    }
}
