package interfaces.HWinterfaces;

public class Vodka {
    private String name;
    private int volume;
//конструкторы
    public Vodka() {
    }

    public Vodka(String name) {
        this.name = name;
    }
//методы
    public void drinkTooMuch() {
    }

    public void drinkTooSoMuch() {
        System.out.println("Vooooodka!");
    }

    public void drinkTooMuch(String owner, int volume) {
        System.out.println("Братишка" + owner + "выпил уже " + volume);
    }


    public void drinkTooMuch(int age) {
        if (age <= 18) {
            System.out.println("Тебе нельзя много пить");
        } else {
            System.out.println("Выпей еще братишка!");
        }
    }

    public void drinkTooMuch(String str) {
        str = "Ты уже много выпил!";
        System.out.println(str);
    }


}

//    HWMan vas9 = new HWMan(25,"Вася");
//    HWMan danila = new HWMan(15,"Данила");
//
//    ArrayList<HWMan> list = new ArrayList<>();
//        list.add(vas9);
//                list.add(danila);
//                vas9.drinkTooMuch(25);
//                vas9.drinkTooMuch();

