package questtwo.fourthlevel.lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Cats {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Cat> cats = new ArrayList<>();

        while (true){
            String a = reader.readLine();
            if (a.equals("")){
                break;
            } else {
                Cat cat = CatFactory.getCatByKey(a);
                cats.add(cat);
            }
        }
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }


        
        //напишите тут ваш код
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
