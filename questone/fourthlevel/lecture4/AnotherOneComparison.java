package questone.fourthlevel.lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AnotherOneComparison {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();

        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);

        if (a == b && a == c){
            System.out.println(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else if (a == c) {
            System.out.println(a + " " + c);
        }


    }
}
