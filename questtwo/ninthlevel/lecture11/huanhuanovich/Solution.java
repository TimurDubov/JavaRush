package questtwo.ninthlevel.lecture11.huanhuanovich;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));

        while (bufferedReader.ready()){
            String s = bufferedReader.readLine();

            String name = s.replaceAll("\\d", "").trim();
            String date = s.replace(name, "").trim();


            PEOPLE.add(new Person(name, simpleDateFormat.parse(date)));



        }

        bufferedReader.close();


    }
}
