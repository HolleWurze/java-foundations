package oop.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Shop {
    private String titleShop;
    private String shopSpecialization;

//    public Shop(String titleShop, String hopSpecialization) {
//        this.titleShop = titleShop;
//        this.shopSpecialization = shopSpecialization;
//    }
//
//    public String getTitleShop() {
//        return titleShop;
//    }
//
//    public void setTitleShop(String titleShop) {
//        this.titleShop = titleShop;
//
//    }
//
//    public String getShopSpecialization() {
//        return shopSpecialization;
//    }
//
//    public void setShopSpecialization(String shopSpecialization) {
//        this.shopSpecialization = shopSpecialization;
//
//    }
}
