package oop.lombok.hwOopObjects;


public class RunnerHW3 {
    public static void main(String[] args) {
        Iron ironGeorge = new Iron("Blue");
        System.out.println("ironGeorge.toString() = " + ironGeorge.toString());

        Bed bedGeorge = new Bed("Бук", "210х200");
        System.out.println("bedGeorge.toString() = " + bedGeorge.toString());

        Shop shopGeorge = new Shop("Мвидео", "Электроника, девайсы");
        System.out.println("shopGeorge.toString() = " + shopGeorge.toString());

        Telephone telephoneGeorge = new Telephone("Huawei", "8", "6,5");
        System.out.println("telephoneGeorge.toString() = " + telephoneGeorge.toString());

        Flower flowerGeorge = new Flower("Красный");
        System.out.println("flowerGeorge.toString() = " + flowerGeorge.toString());

        Cow georgeCow = new Cow("Монбельярдская", "Рыжий");
        System.out.println("georgeCow.toString() = " + georgeCow.toString());

        Cup georgeCup = new Cup("30", "1500 мл.");
        System.out.println("georgeCup.toString() = " + georgeCup.toString());

        Notebook lenovo = new Notebook("Lenovo", "15.6");
        System.out.println("lenovo.toString() = " + lenovo.toString());

        Painting vanGogh = new Painting("Ван Гог", "эпохи Возрождения");
        System.out.println("vanGogh.toString() = " + vanGogh.toString());

        Man vas9 = new Man("Вася", "Русский");
        System.out.println("vas9.toString() = " + vas9.toString());

        wolfOfWallStreet toni = new wolfOfWallStreet("89994442211");
        

    }
}
