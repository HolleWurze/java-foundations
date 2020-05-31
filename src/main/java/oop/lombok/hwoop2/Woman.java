package oop.lombok.hwoop2;

import lombok.Getter;

@Getter
    public class Woman extends Person {
        private String age;

        public Woman(String isMale, String age, String name) {
            super.isMan = false;
            System.out.println("Имя женщины: " + name);
            System.out.println(isMale);
        }
        public void printAge() {
            System.out.println("всегда 18");
        }
    }