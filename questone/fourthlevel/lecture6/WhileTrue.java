package questone.fourthlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WhileTrue {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sumOfAlNumbers = 0;

        while (true){
            int a = Integer.parseInt(reader.readLine());
            if (a == -1){
                break;
            } else sumOfAlNumbers += a;
        }



        System.out.println(sumOfAlNumbers - 1);
    }
}
