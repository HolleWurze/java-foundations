package interfaces.comparator;

import java.util.Arrays;

public class TableShop {
    public static void main(String[] args) throws CloneNotSupportedException {
        Table woodTable = new Table(0.5, 1.0, 0.5, "wood");
        Table steelTable = new Table(0.5, 0.5, 0.5, "steel");
        Table plasticTable = new Table(1.0, 1.0, 1.0, "plastic");


        Table[] tables = new Table[]{woodTable, steelTable, plasticTable};

        Arrays.sort(tables);

        System.out.println("Arrays.toString(tables) = " + Arrays.toString(tables));

        Person vasilii = new Person("Василий", "Васильев", 16);
        Person marina = new Person("Марина", "Андреева", 19);
        Person vladimir = new Person("Владимир", "Дмитриев", 20);
        Person dmitrii = new Person("Дмитрий", "Витальев", 25);
        Person andrei = new Person("Андрей", "Примаков", 14);
        Person vitalii = new Person("Виталий", "Васильков", 20);
        Person george = new Person("Георгий", "Елизаров", 24);
        Person anna = new Person("Анна", "Абрасимова", 31);
        Person anna2 = new Person("Анна", "Абрасимова", 30);


        Person[] people = new Person[]{vasilii, marina, vladimir, dmitrii, andrei, vitalii, george, anna, anna2};

        System.out.println(vasilii.compareTo(marina));
        System.out.println(marina.compareTo(vasilii));
        System.out.println(george.compareTo(vitalii));
        System.out.println(vitalii.compareTo(george));

        System.out.println("Arrays.toString(people) до сортировки = " + Arrays.toString(people));

        Arrays.sort(people);

        System.out.println("Arrays.toString(people) после сортировки = " + Arrays.toString(people));

        Person cloneDmitrii = (Person) dmitrii.clone();
        System.out.println(cloneDmitrii);


    }
}
