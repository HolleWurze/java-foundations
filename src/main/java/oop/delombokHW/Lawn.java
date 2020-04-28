package oop.delombokHW;

public class Lawn {
    public static void main(String[] args) {
        //тип имя объекта(знак присваивания (=)) оператор new (оператор выделения памяти) конструктор
//        Cow murka = new Cow("Голштинская", "Молочный");
//        Cow zhurka = new Cow("Симментальская", "Коричневый");
//
//        System.out.println("Цвет Мурки: " + murka.getColor());
//        System.out.println("Цвет Журки: " + zhurka.getColor());
//
//        murka.setColor("Черный");
//
//        System.out.println("Цвет Мурки после окрашивания: " + murka.getColor());
//
//        murka.setColor("Белый");
//
//        System.out.println("Цвет Мурки после окрашивания -\n(присваивание объекту нового состояния: " + murka.getColor());
//_______________________________________________________

        //1. создать пять коров, у 3ех их них поменять цвет
        Cow byr9 = new Cow("Англерская", "Черный");
        Cow marfa = new Cow("Монбельярдская", "Рыже-белый");
        Cow burena = new Cow("Черно-пестрая", "Бело-коричневый");
        Cow rima = new Cow("Костромская", "Персиковый");
        Cow tima = new Cow("Бестужевская", "Пегая");

        System.out.println("Цвет Бури: " + byr9.getColor());
        byr9.setColor("Базальтовый");
        System.out.println("Цвет Бури после окрашивания: " + byr9.getColor());

        System.out.println("Цвет Марфы: " + marfa.getColor());
        marfa.setColor("Кирпичный");
        System.out.println("Цвет Марфы после окрашивания: " +marfa.getColor());

        System.out.println("Цвет Бурены: " + burena.getColor());
        burena.setColor("Арбузный");
        System.out.println("Цвет Бурены после окрашивания: " + burena.getColor());

        //3. в методе main сменить породу и вывести на экран

        System.out.println("Порода коровы Марфы была: " + marfa.getNameBreed());
        marfa.setNameBreed("Герефордская");
        System.out.println("Порода коровы Марфы стала: " + marfa.getNameBreed());

        Flower rosa = new Flower("Красный");
        System.out.println("rosa.getColorOfFlower() = " + rosa.getColorOfFlower());
        Cup boss = new Cup("20", "400");
        System.out.println("boss.getRadiusCup() = " + boss.getRadiusCup()+"\nboss.volumeCup() = "+boss.getVolumeCup());
        Man vas9 = new Man("Вася", "Русский");
        Notebook lenovo = new Notebook("Lenovo", "15.6");
        Painting vanGogh = new Painting("Ван Гог", "Новое время, промышленный переворот");
        Shop mvideo = new Shop("Мвидео", "Электроника, девайсы");
        Telephone p30 = new Telephone("Huawei", "8", "6,5");



    }
}


//4. Создать классы: Man, Shop, Cup, Telephone, Notebook и 3 своих
//5. Создать классы для запуска
//6. Создать set и get для всех полей
//7. создать конструкторы от разного числа параметров