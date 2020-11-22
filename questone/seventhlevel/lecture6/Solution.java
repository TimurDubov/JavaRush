package questone.seventhlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String test = "";

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > test.length() ){
                test = strings.get(i);
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (test.length() == strings.get(i).length()){
                System.out.println(strings.get(i));
            }
        }

        //напишите тут ваш код
    }
}
