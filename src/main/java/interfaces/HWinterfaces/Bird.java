package interfaces.HWinterfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("я умею летать!!");
    }

    @Override
    public String sing() {
      return "Фить-фить-фить";
    }
}
