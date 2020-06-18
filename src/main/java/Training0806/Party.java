package Training0806;

import java.util.ArrayList;
import java.util.List;

public class Party {
    public static void main(String[] args) {
        Girls linda = new Girls("Линда", "Люповски", 23);
        Girls nadya = new Girls("Надя", "Иванова", 17);
        Girls sasha = new Girls("Саша", "Красненко", 25);
        Girls rita = new Girls("Рита", "Попова", 18);
        Girls samanta = new Girls("Саманта", "Пирс", 24);
        Girls luba = new Girls("Люба", "Прохорова", 22);

        Friends frank = new Friends("Френк", "Люповски", 22);
        Friends dany = new Friends("Дэни", "Мазевски", 17);
        Friends greg = new Friends("Грэг", "Пинтович", 23);
        Friends andrey = new Friends("Андрей", "Макаревич", 21);
        Friends boris = new Friends("Борис", "Моисеев", 25);
        Friends nubagbva = new Friends("Нубагбва", "Осшоиш", 18);

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

    }
}

