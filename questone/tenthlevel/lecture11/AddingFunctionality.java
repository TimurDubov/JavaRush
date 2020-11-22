package questone.tenthlevel.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class AddingFunctionality {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        HashMap<String,Integer> map = new HashMap<>();

        while (true){
            String s = reader.readLine();
            if (s.equals(""))  break;

            map.put(reader.readLine(),Integer.parseInt(s));

        }
        map.forEach((i,s) -> System.out.println(s + " " + i ));


    }
}