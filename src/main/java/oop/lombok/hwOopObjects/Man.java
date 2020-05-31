package oop.lombok.hwOopObjects;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Man {
    private String nameMan;
    private String language;

    public Man(String nameMan, String language) { //конструктор (метод по созданию объекта)
        this.nameMan = nameMan; //ссылка на данный объект
        this.language = language;
    }

    @Override
    public String toString() {
        return nameMan + " " + language;
    }

    public String getNameMan() {
        return nameMan;
    }

    public void setNameMan(String nameMan) {
        this.nameMan = nameMan;

    }
}
