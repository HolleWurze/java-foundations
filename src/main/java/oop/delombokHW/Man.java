package oop.delombokHW;

//4. Создать классы: Man, Shop, Cup, Telephone, Notebook, Painting, Bed, Flower
public class Man {
    private String nameMan;
    private String language;

    public Man(String nameMan, String language) { //конструктор (метод по созданию объекта)
        this.nameMan = nameMan; //ссылка на данный объект
        this.language = language;
    }

    public String getNameMan() {
        return nameMan;
    }

    public void setNameMan(String nameMan) {
        this.nameMan = nameMan;

    }
}
