package questone.eighthlevel.lecture11;

import java.util.HashMap;
import java.util.Map;

public class SameNamesAndSurnames {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Дубов","Тимур");
        map.put("Волгин","Тимур");
        map.put("Достов","Тимур");
        map.put("Волгин","Александр");
        map.put("Егин","Алексей");
        map.put("Достов","Максим");
        map.put("Проворотов","Константин");
        map.put("Костин","Евгений");
        map.put("Иванов","Иван");
        //напишите тут ваш код

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

