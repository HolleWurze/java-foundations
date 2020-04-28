package oop.lombok;

public class Runner {
    public static void main(String[] args) {
        Iron ironGeorge = new Iron("Blue");
        System.out.println("ironGeorge.getColor() = " + ironGeorge.getColor());
        ironGeorge.setColor("Green");
        System.out.println("ironGeorge.getColor() = " + ironGeorge.getColor());

        Bed bedGeorge = new Bed("Бук", "210х200");
        System.out.println("Размеры кровати, которые хотел: " + bedGeorge.getBedDimensions());
        System.out.println("Из дерева, которое хотел: " + bedGeorge.getTreeFromWhichItIsMade());
        bedGeorge.setBedDimensions("250x300");
        bedGeorge.setTreeFromWhichItIsMade("Сосна");
        System.out.println("Но получил кровать размером: " + bedGeorge.getBedDimensions());
        System.out.println("И не из того дерева: " + bedGeorge.getTreeFromWhichItIsMade());


        Shop shopGeorge = new Shop("Мвидео", "Электроника, девайсы");
        System.out.println("Магазин, в который хотел пойти: " + shopGeorge.getTitleShop());
        System.out.println("Который торгует: " + shopGeorge.getShopSpecialization());
        shopGeorge.setTitleShop("ВкусВилл");
        shopGeorge.setShopSpecialization("еда, продукты");
        System.out.println("Но заблудился и попал во: " + shopGeorge.getTitleShop());
        System.out.println("И не купил себе девайсов, а " + shopGeorge.getShopSpecialization());

        Telephone telephoneGeorge = new Telephone("Huawei", "8", "6,5");
        System.out.println("Телефон, который хотел купить: " + telephoneGeorge.getModelTelephone());
        System.out.println("Который имеет " + telephoneGeorge.getAmountOfMemory() + "Гб оперативной памяти");
        System.out.println("И диагональ экрана у него аж: " + telephoneGeorge.getDiagonalOfScreen());
        telephoneGeorge.setModelTelephone("Iphone");
        telephoneGeorge.setAmountOfMemory("4");
        telephoneGeorge.setDiagonalOfScreen("4,8");
        System.out.println("Но по ошибке купил себе: " + telephoneGeorge.getModelTelephone());
        System.out.println("И у него оперативной памяти " + telephoneGeorge.getAmountOfMemory());
        System.out.println("А диагональ и вовсе " + telephoneGeorge.getDiagonalOfScreen());

        Flower flowerGeorge = new Flower("Красный");
        System.out.println("Цветок, который я вижу: " + flowerGeorge.getColorOfFlower());
        flowerGeorge.setColorOfFlower("Синий");
        System.out.println("Но все почему-то говорят, что цветок: " + flowerGeorge.getColorOfFlower());

        Cow georgeCow = new Cow("Монбельярдская", "Рыжий");
        System.out.println("Корову, которую нашел: " + georgeCow.getNameBreed());
        System.out.println("Которая цвета " + georgeCow.getColor());
        georgeCow.setNameBreed("Костромская");
        georgeCow.setColor("Белый");
        System.out.println("Оказалось, порода ее: " + georgeCow.getNameBreed());
        System.out.println("Да и цвет у нее: " + georgeCow.getColor());

        Cup georgeCup = new Cup("30", "1500 мл.");
        System.out.println("На столе стояла чашка и радиус казалось у нее = " + georgeCup.getRadiusCup());
        System.out.println("А объем чашки я думал " + georgeCup.getVolumeCup());
        georgeCup.setRadiusCup("15");
        georgeCup.setVolumeCup("600");
        System.out.println("А радиус то: " + georgeCup.getRadiusCup());
        System.out.println("Да и объем: " + georgeCup.getVolumeCup());

        Notebook lenovo = new Notebook("Lenovo", "15.6");
        System.out.println("Хотел я как-то себе ноутбук: " + lenovo.getModelNotebook());
        System.out.println("У которого экран " + lenovo.getScreenDiagonal());
        lenovo.setModelNotebook("Asus");
        lenovo.setScreenDiagonal("14");
        System.out.println("Купил в итоге: " + lenovo.getModelNotebook());
        System.out.println("Диагональ у него: " + lenovo.getScreenDiagonal());

        Painting vanGogh = new Painting("Ван Гог", "эпохи Возрождения");
        System.out.println("Спорили мы насчет художника: " + vanGogh.getAuthorOfPainting());
        System.out.println("и думали что он  " + vanGogh.getEraOfCreation());
        vanGogh.setEraOfCreation("Новое время, промышленный переворот");
        System.out.println("На самом деле " + vanGogh.getAuthorOfPainting());
        System.out.println("Творил в эпоху " + vanGogh.getEraOfCreation());

        Man vas9 = new Man("Вася", "Русский");
        System.out.println("Был у нас друг: " + vas9.getNameMan());
        System.out.println("И болтали мы с ним на " + vas9.getLanguageMan());
        vas9.setNameMan("Ирина");
        vas9.setLanguageMan("Испанский");
        System.out.println("Теперь у нас друг: " + vas9.getNameMan());
        System.out.println("И разговаривает она на: " + vas9.getLanguageMan());
    }
}
