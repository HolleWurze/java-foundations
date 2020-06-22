package Training0806;

import java.util.ArrayList;
import java.util.List;

public class Party {
    public static void main(String[] args) {
        Person linda = new Girl("Линда", "Люповски", 23);
        Person nadya = new Girl("Надя", "Иванова", 17);
        Person sasha = new Girl("Саша", "Красненко", 25);
        Person rita = new Girl("Рита", "Попова", 18);
        Person samanta = new Girl("Саманта", "Пирс", 24);
        Person luba = new Girl("Люба", "Прохорова", 22);

        Person frank = new Friend("Френк", "Люповски", 22);
        Person dany = new Friend("Дэни", "Мазевски", 17);
        Person greg = new Friend("Грэг", "Пинтович", 23);
        Person andrey = new Friend("Андрей", "Макаревич", 21);
        Person boris = new Friend("Борис", "Моисеев", 25);
        Person nubagbva = new Friend("Нубагбва", "Осшоиш", 18);

        List<Person> party = new ArrayList<>();
        party.add(linda);
        party.add(nadya);
        party.add(sasha);
        party.add(rita);
        party.add(samanta);
        party.add(luba);
        party.add(frank);
        party.add(dany);
        party.add(greg);
        party.add(andrey);
        party.add(boris);
        party.add(nubagbva);

        System.out.println(linda.toString());
        System.out.println(frank.toString());

        for (int i = 0; i < party.size(); i++) {
            if (party.get(i).getAge() < 18) {
                System.out.println("Ты еще мал " + party.get(i).getName() + ", тебе нельзя на тусовку");
            }
        }

        for (int i = 0; i < party.size(); i++) {
            if (!(party.get(i).getName().equals("Люба"))) {
                System.out.println("Добро пожаловать, " + party.get(i).getName());
            } else {
                System.out.println("Эта тусовка не для тебя " + party.get(i).getName());
            }
        }
        HWcomparator comparator = new HWcomparator();
        System.out.println("comparator.compare(linda,dany) = " + comparator.compare(linda, dany));
    }
}

