package questone.eighthlevel.lecture8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BirthdayInSummer {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Уокер", dateFormat.parse("JANUARY 1 2012"));
        map.put("Уиллис", dateFormat.parse("AUGUST 1 2012"));
        map.put("ДиКаприо", dateFormat.parse("MAY 1 2012"));
        map.put("Круз", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Питт", dateFormat.parse("MAY 1 2012"));
        map.put("Стейтем", dateFormat.parse("MAY 1 2012"));
        map.put("Джонсон", dateFormat.parse("MAY 1 2012"));
        map.put("Бандерас", dateFormat.parse("MAY 1 2012"));
        map.put("Гибсон", dateFormat.parse("MAY 1 2012"));

        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Date> pair = iterator.next();
            int month = pair.getValue().getMonth();

            if (month >= 5 && month <= 7){
                iterator.remove();
            }
        }
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}