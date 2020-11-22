package questone.eighthlevel.lecture8;

import java.util.HashMap;
import java.util.Map;

public class PopulationCensus {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();

        map.put("Иванов", "Иван");
        map.put("Васильев", "Александр");
        map.put("Гришин", "Василий");
        map.put("Баранкин", "Дмитрий");
        map.put("Достов", "Константин");
        map.put("Егин", "Константин");
        map.put("Железнов", "Глеб");
        map.put("Зосимов", "Глеб");
        map.put("Ильченко", "Илларион");
        map.put("Костриков", "Алексей");
        //напишите тут ваш код
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countFirstName = 0;


        for (Map.Entry<String, String> pair :
                map.entrySet()) {
            if (pair.getValue().equals(name)){
                countFirstName++;
            }
        }
        return countFirstName;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countLastName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (pair.getKey().equals(lastName)){
              countLastName++;
            }
        }
        return countLastName;
        //напишите тут ваш код

    }

    public static void main(String[] args) {


    }
}
