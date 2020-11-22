package questone.eighthlevel.lecture8;

import java.util.HashMap;
import java.util.Map;

public class NotForThePoorOnes {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 300);
        map.put("Петров", 500);
        map.put("Сидоров", 600);
        map.put("Александров", 400);
        map.put("Достов", 800);
        map.put("Егин", 1300);
        map.put("Еглин", 2300);
        map.put("Борумбей", 2300);
        map.put("Емельянов", 5300);
        map.put("Довгулев", 300);
        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        map.values().removeIf(v -> v < 500);
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        System.out.println(map);
        removeItemFromMap(map);
        System.out.println(map);

    }
}