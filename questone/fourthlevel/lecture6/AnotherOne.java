package questone.fourthlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class AnotherOne {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(reader.readLine());

        while (a > 0){
            System.out.println(s);
            a--;
        }
        //напишите тут ваш код

    }
}

