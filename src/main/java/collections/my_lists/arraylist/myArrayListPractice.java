package collections.my_lists.arraylist;

public class myArrayListPractice {
    public static void main(String[] args) {

        myArrayList myList = new myArrayList();
        System.out.println("myList.isEmpty() = " + myList.isEmpty());
        System.out.println("myList.size() = " + myList.size());
        myList.add("A1");
        myList.add("A2");
        myList.add("A3");

        System.out.println("myList.contains(\"A3\") = " + myList.contains("A3"));
        System.out.println("myList.contains(\"A4\") = " + myList.contains("A4"));

        myList.add("A4");
        myList.add("A5");
        myList.add("A6");
        myList.add("A7");
        myList.add("A8");
        myList.add("A9");
        myList.add("A10");
        myList.add("A11");
        myList.add("A12");

        myList.add(0, "A0");
        myList.add(5, "A-A");

        System.out.println(myList);

        myList.remove("A-A");
        myList.remove(0);
        System.out.println(myList);

        myList.clear();
        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        myList.add("A1");
        System.out.println(myList);
        myList.lastIndexOf("A5");
        myList.lastIndexOf("A1");

        myList.add("A2");
        myList.add("A3");
        myList.add("A4");
        myList.add("A5");
        myList.add("A6");
        myList.add("A7");
        myList.add("A8");
        myList.add("A9");
        myList.add("A10");
        System.out.println(myList.subList(2, 6));


    }
}

