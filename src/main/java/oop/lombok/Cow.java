package oop.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Cow {
    private String nameBreed;
    private String color;

//    public Cow(String nameBreed, String color) { //конструктор (метод по созданию объекта)
//        this.nameBreed = nameBreed; //ссылка на данный объект
//        this.color = color;
//
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//
//    }
//
//    //2. написать set и get для поля nameBreed
//    public String getNameBreed() {
//        return nameBreed;
//    }
//
//    public void setNameBreed(String nameBreed) {
//        this.nameBreed = nameBreed;
//    }
}