package collections.my_lists.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);

        System.out.println(myList.get(0));

        myList.add(0, 2);

        System.out.println("myList.get(0) = " + myList.get(0));

        myList.add(0, 7);
        myList.add(1, -1);
        myList.add(4, 3);

        System.out.print("MyList{ ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println("} ");

        printList(myList);

        System.out.println("\nmyList.contains(2) = " + myList.contains(2));

        System.out.println("Проверка на существование элемента (2) в List");
        if (myList.contains(2)) {
            System.out.println("Такой элемент есть");
        } else {
            System.out.println("Такого элемента нет");
        }

        myList.remove(0);

        printList(myList);
        System.out.println();
        myList.remove(Integer.valueOf(3));
        System.out.println("After remove element = 3");
        printList(myList);


        myList.add(1);
        myList.add(1);
        myList.add(1);
        System.out.println("After adding 3 element of 1");
        printList(myList);
        System.out.println("\nmyList.indexOf(1) = " + myList.indexOf(1));
        System.out.println("myList.lastIndexOf(1) = " + myList.lastIndexOf(1));

        System.out.println("After set: myList.set(1,5)");
        myList.set(1, 5);
        printList(myList);

        myList.set(myList.size() - 1, 10);
        System.out.println();
        printList(myList);


//        Списки:
//        0. Содание списков: (Используя конструктор)
//        а). Создать пустой список
//        б). Создать список размером 20

        List<Integer> myListHW = new ArrayList<>(20);
//
//        1. Получить элемент по индексу:
//        а). Получить первый элемент
//        б). Получить последний элемент


        myListHW.add(1);
        myListHW.add(2);
        myListHW.add(3);
        myListHW.add(4);
        myListHW.add(5);
        myListHW.add(6);
        myListHW.add(7);
        myListHW.add(8);
        myListHW.add(9);
        myListHW.add(10);
        myListHW.add(11);
        myListHW.add(12);
        myListHW.add(13);
        myListHW.add(14);
        myListHW.add(15);
        myListHW.add(16);
        myListHW.add(17);
        myListHW.add(18);
        myListHW.add(19);
        myListHW.add(20);

        System.out.println("myListHW.indexOf(0) = " + myListHW.indexOf(0));
        System.out.println("myListHW.get(myListHW.size()-1) = " + myListHW.get(myListHW.size() - 1));
//
//        2. Задачи на вставку элемента:
//        а) Добавить подряд 5 элементов.
//        б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
//        в) Записать в новый список все элементы предыдущего списка.

        for (int i = 0; i < 4; i++) {
            myListHW.add(i, 1);
        }
        printList(myListHW);
        myListHW.add(1, myListHW.get(5));
        myListHW.remove(6);
        myListHW.add(0, myListHW.get(6));
        myListHW.remove(7);
        System.out.println();
        printList(myListHW);
//
//        3. Задачи на удаление элементов: (Используя методы)
//        а) Удалить элемент по значению
//        б) Удалить элемент по индексу

        myListHW.remove(3);
        myListHW.remove(myListHW.indexOf(1));
        System.out.println();
        printList(myListHW);
//
//        4. Проверить наличие элемента

        System.out.println("\nmyListHW.contains(4) = " + myListHW.contains(4));
        System.out.println("myListHW.contains(-1) = " + myListHW.contains(-1));
        printList(myListHW);
//
//        5. Вывод списка:
//        а) Вывести список на экран в формате: List: {"First";"Second";"Third"}

        List<String> myListHwStr = new ArrayList<>(20);

        myListHwStr.add(0,"Австралия");
        myListHwStr.add(1,"Аргентина");
        myListHwStr.add(2,"Бразилия");
        myListHwStr.add(3,"Великобритания");
        myListHwStr.add(4,"Германия");
        myListHwStr.add(5,"Индия");
        myListHwStr.add(6,"Индонезия");
        myListHwStr.add(7,"Италия");
        myListHwStr.add(8,"Канада");
        myListHwStr.add(9,"Китай");
        myListHwStr.add(10,"Мексика");
        myListHwStr.add(11,"Россия");
        myListHwStr.add(12,"Саудовская Аравия");
        myListHwStr.add(13,"США");
        myListHwStr.add(14,"Турция");
        myListHwStr.add(15,"Франция");



        System.out.print("\nMyListHW{ ");
        for (int i = 0; i < myListHW.size(); i++) {
            System.out.print("'" + myListHW.get(i) + "'; ");
        }
        System.out.println("} ");
//
//        6. Отфильтровать список вернуть записи по некоторому условию:
//        а) Условие на индекс: Индекс делится на 3
//        б) Условие на значение: Вернуть количество элементов, которые равны "***"

        System.out.print("Все элементы индекс которых делится на 3 { ");
        for (int i = 0; i < myListHW.size(); i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("}");
        System.out.println();
//        б) Условие на значение: Вернуть количество элементов, которые равны "***"
        for (int i = 0; i < myListHwStr.size(); i++) {
            if (myListHwStr.get(i).length() == 3) {
                System.out.println(myListHwStr.get(i) + " в массиве с индексом: " + i + " - подходит");
            }
        }
//
//        7. Пропустить несколько первых элементов
//        а) Пропустить первые 3 элемента в списке.
        System.out.print("Все элементы массива, кроме первых трех { ");
        for (int i = 3; i < myListHwStr.size(); i++) {
            System.out.print(myListHwStr.get(i) + " ");
        }
        System.out.print("}");

//        6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
//        а) Пропустить первые 2 элемента, которые равные "*****"
        System.out.print("\nВсе элементы массива, кроме двух первых с 5 символами { ");
        for (int i = 0; i < myListHwStr.size(); i++) {
            if (myListHwStr.get(i).length() == 5) {
                i++;
            }
            System.out.print(myListHwStr.get(i) + " ");
        }
        System.out.print("}");


//        8. Вернуть первый подходящий элемент:
//        а) Возращаем Первый элемент Делящийся на 3.


        System.out.print("\n{ ");
        for (int i = 0; i < myListHW.size(); i++) {
            System.out.print("'" + myListHW.get(i) + "'; ");
        }
        System.out.println("} ");
        System.out.print("Возращаем первый элемент Делящийся на 3 { ");
        for (int i = 0; i < myListHW.size(); i++) {
            if (myListHW.get(i) % 3 == 0 && myListHW.get(i) != 3) { //убрал 3 чтобы проверить другие
                System.out.print(myListHW.get(i) + " ");
                break;
            }
        }
        System.out.print("}");

//
//        9. Возвращаем все элементы удовлетворяющие условию:
//        а) Возвращаем все элементы делящиеся на 3
        System.out.print("\nВозвращаем все элементы делящиеся на 3 { ");
        for (int i = 0; i < myListHW.size(); i++) {
            if (myListHW.get(i) % 3 == 0) {
                System.out.print(myListHW.get(i) + " ");
            }
        }
        System.out.print("}");
//
//        10. Создать класс Person.
//                Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на Н
//        Person vas9 = new Man("Вася",25);
//        Person denis = new Man("Денис",24);
//        Person dan9 = new Man("Даня",18);
//        Person serezha = new Man("Сережа",17);
        Person nikolay = new Man("Nikolay",27);
        Person nikita = new Man("Nikita",20);
        Person len9 = new Man("Lenya",15);
        Person marina = new Woman("Marina",25);
        Person lena = new Woman("Lena",23);
        Person luda = new Woman("Luda",21);
        Person agafia = new Woman("Agafia",16);
        Person veronika = new Woman("Veronika",34);

        List<Person> myList10 = new ArrayList();


        myList10.add(nikolay);
        myList10.add(nikita);
        myList10.add(len9);
        myList10.add(marina);
        myList10.add(lena);
        myList10.add(luda);
        myList10.add(agafia);
        myList10.add(veronika);

        System.out.print("\nВернуть всех военнообязанных мужчин имя которых начинается на Н: ");
        for (int i = 0; i < myList10.size(); i++) {
            if (myList10.get(i).isMale()) {
                if (myList10.get(i).getAge() >= 18 && myList10.get(i).getAge() < 27) {
                    if (myList10.get(i).getName().charAt(0) == 'N') {
                        System.out.print(myList10.get(i).getName() + " ");
                    }
                }
            }
        }

        System.out.print("\nСредний возраст женщин: ");
        int qantWoman = 0;
        double sumAge = 0;
        for (Person person : myList10) {
            if (!person.isMale()) {
                sumAge += person.getAge();
                qantWoman++;
            }
        }
        System.out.println(sumAge / qantWoman);






//        11. Найти средний возраст всех женщин.

    }

    private static void printList(List<Integer> myList) {
        for (Integer element : myList) {
            System.out.print(element + " ");
        }
    }
}
