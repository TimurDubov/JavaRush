package questone.ninthlevel.lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormat {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat firstDate = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat secondDate = new SimpleDateFormat("MMM dd, yyyy");

        Date date = firstDate.parse(reader.readLine());
        System.out.println(secondDate.format(date).toUpperCase());
        //напишите тут ваш код
    }
}
