package questone.eighthlevel.lecture11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkingWithDate {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("D");
        int x = Integer.parseInt(simpleDateFormat.format(date1));
        return x % 2 != 0;
    }
}

