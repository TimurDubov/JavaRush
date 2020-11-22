package questone.seventhlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AVeryVeryDifficultOne {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        int shortString = 0;
        int longString = 0;

        String test = "";
        String test2 = "";

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
            test2 = list.get(i);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > test.length()){
                test = list.get(i);
                longString = i;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < test2.length()){
                test2 = list.get(i);
                shortString = i;
            }
        }

        if (longString < shortString){
            System.out.println(test);
        } else System.out.println(test2);

    }
}
