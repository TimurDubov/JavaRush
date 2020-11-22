package questone.sixthlevel.lecture5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculatingEvenAndOddNumbers {

    public static int even;
    public static int odd;


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        int a = Integer.parseInt(sA);

        for (int i = 0; i < sA.length(); i++) {
            if(a % 2 == 0){
                even++;
            } else odd++;
            a = a /10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);

    }
}
