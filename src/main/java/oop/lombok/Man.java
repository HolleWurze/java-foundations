package oop.lombok;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
//4. Создать классы: Man, Shop, Cup, Telephone, Notebook, Painting, Bed, Flower
public class Man {
    private String nameMan;
    private String languageMan;

    public String getNameMan() {
        return this.nameMan;
    }

    public String getLanguageMan() {
        return this.languageMan;
    }

//    public Man(String nameMan, String language) { //конструктор (метод по созданию объекта)
//        this.nameMan = nameMan; //ссылка на данный объект
//        this.language = language;
//    }
//
//    public String getNameMan() {
//        return nameMan;
//    }
//
//    public void setNameMan(String nameMan) {
//        this.nameMan = nameMan;
//
//    }
//
//    public String getLanguage() {
//        return language;
//    }
//
//    public void setLanguage(String language) {
//        this.language = language;
//    }
}
