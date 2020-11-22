package questone.eighthlevel.lecture8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DeletingRepeats {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Дубов", "Тимур");
        map.put("Иванов", "Ваня");
        map.put("Достов", "Максим");
        map.put("Петров", "Василий");
        map.put("Волгин", "Тимур");
        map.put("Егин", "Тимур");
        map.put("Савосько", "Тимур");
        map.put("Горбачев", "Тимур");
        map.put("Крутилин", "Тимур");
        map.put("Черников", "Тимур");
        return map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String,String> copy = new HashMap<>(map);
        Set<String> set = new HashSet<>();

        for (String name : copy.values()){
            if (!set.add(name)){
                removeItemFromMapByValue(map, name);
            }
        }

        //напишите тут ваш код

    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        System.out.println(copy);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    /*
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String,String> copy = new HashMap<>(map);
        System.out.println(copy);
        for (Map.Entry<String, String> pair : copy.entrySet()){
            String value =pair.getValue();
            removeItemFromMapByValue(map,value);
        }

        //напишите тут ваш код

    }

     */

    public static void main(String[] args) {
        Map<String,String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}
