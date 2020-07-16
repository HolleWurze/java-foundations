package collections.my_lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println("linkedList.size() = " + linkedList.size());
        linkedList.add("George");
        System.out.println("linkedList.toString() = " + linkedList.toString());
        linkedList.add("Maxim");
        System.out.println(linkedList.toString());
        linkedList.add("Frank");
        System.out.println(linkedList.toString());

        //System.out.println("linkedList.remove(\"Maxim\") = " + linkedList.remove("Maxim"));
        linkedList.remove("Maxim");
        System.out.println("After remove Maxim " + linkedList.toString());
        System.out.println("linkedList.remove(\"Frank\") = " + linkedList.remove("Frank"));
        System.out.println("After remove Frank " + linkedList.toString());
        System.out.println("linkedList.remove(\"George\") = " + linkedList.remove("George"));
        System.out.println("After remove George " + linkedList.toString());
//        linkedList.clear();
//        System.out.println("linkedList.isEmpty() = " + linkedList.isEmpty());
//        System.out.println("linkedList.size() = " + linkedList.size());
//        System.out.println("linkedList = " + linkedList);
//        System.out.println(linkedList.toString());
//        System.out.println(linkedList.contains("Frank"));


        linkedList.add("George");
        System.out.println(linkedList.toString());
        linkedList.add("Maxim");
        System.out.println(linkedList);
//        linkedList.add("Frank");
        System.out.println(linkedList);
        linkedList.add("Glafira");
        System.out.println(linkedList);
        linkedList.add("Paul");

        System.out.println(linkedList);
//        System.out.println("linkedList.size() = " + linkedList.size());
//        System.out.println("linkedList = " + linkedList.toString());
//        linkedList.remove(0);
//        System.out.println("linkedList = " + linkedList.toString());
//        linkedList.remove(1);
////        linkedList.remove(2);
//        System.out.println("linkedList = " + linkedList);
////        System.out.println(linkedList.toString());
////        linkedList.set(4,"Diablo")

//        MyLinkedList linkedList = new MyLinkedList();
//        linkedList.add("1");
//        linkedList.add("2");
//        linkedList.add("3");
//        linkedList.add("4");
//
//
//        linkedList.remove("2");
//
//       // linkedList.clear();
//
//        System.out.println("after remove 4 linkedList = " + linkedList + linkedList.size());
//        linkedList.remove("4");
//        System.out.println("after remove 1 linkedList = " + linkedList + linkedList.size());


    }
}
