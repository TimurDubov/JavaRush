package questone.fifthlevel.lecture12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FindOutTheCurrentDate {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");

        String date1 = simpleDateFormat.format(date);
        System.out.println(date1);
    }
}
