package interfaces.HWinterfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Fish implements Swimable{


    @Override
    public void swim() {
        System.out.println("Я вообще живу в воде!");
    }

    @Override
    public double maxSwimSpeed() {
        return 15;
    }
}
