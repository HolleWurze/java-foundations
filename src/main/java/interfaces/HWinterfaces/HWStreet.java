package interfaces.HWinterfaces;

public class HWStreet {
    public static void main(String[] args) {
//        Walkable george = new HWMan(); //можно вместо walkable(интерфейса) использовать и класс
//        Walkable nora = new Dog();
//        Flyable bird = new Bird();
//        Swimable fish = new Fish();
//        HWMan human = new HWMan();
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//
//        //птица
//        System.out.println("Птица");
//        System.out.println(bird.sing());
//        bird.fly();
//        //кошка
//        System.out.println("Кошка");
//        System.out.println(cat.maxRunDistance());
//        System.out.println(cat.maxSwimSpeed());
//        cat.swim();
//        cat.walk();
//        cat.run();
//        //рыба
//        System.out.println("Рыба");
//        System.out.println(fish.maxSwimSpeed());
//        fish.swim();
//        //собака
//        System.out.println("Собака");
//        dog.swim();
//        System.out.println(dog.maxSwimSpeed());
//        dog.walk();
//        dog.run();
//        System.out.println(dog.maxRunDistance());
//        //человек
//        System.out.println("Человек");
//        human.walk();
//        human.run();
//        System.out.println(human.maxRunDistance());
//        human.swim();
//        System.out.println(human.maxSwimSpeed());
//        System.out.println("Вывод с массивов:");
//
//        Walkable[] walkables = new Walkable[2];
//        walkables[0] = george;
//        walkables[1] = nora;
//
//        Swimable[] swimables = new Swimable[2];
//        swimables[0] = fish;
//        swimables[1] = dog;
//
//        printWalkables(walkables);
//        printSwimables(swimables);



    }
    public static void printSwimables(Swimable[] swimables){
        for (Swimable swimable : swimables) {
            System.out.println(swimable.maxSwimSpeed());
        }
    }

    public static void printWalkables(Walkable[] walkables) {
        for (Walkable walkable : walkables) {
            walkable.walk();
        }
    }
}
