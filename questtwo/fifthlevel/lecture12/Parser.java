package questtwo.fifthlevel.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Parser {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String s = reader.readLine();
        String[] words1 = s.split("\\?");

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(words1[1]);


        while (true){
            if (arrayList.get(1).contains("&")){

            } else break;
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(1);
            System.out.println(arrayList.get(i));
        }


        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
