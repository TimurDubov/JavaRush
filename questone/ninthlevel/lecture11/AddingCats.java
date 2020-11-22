package questone.ninthlevel.lecture11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AddingCats {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat(String.valueOf(i));
            map.put(String.valueOf(i),cat);
        }
        return map;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();

        for (int i = 0; i < map.size(); i++) {
            set.add(map.get(String.valueOf(i)));
        }
        return set;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

