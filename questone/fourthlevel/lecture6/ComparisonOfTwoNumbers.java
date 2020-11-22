package questone.fourthlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComparisonOfTwoNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        String sD = reader.readLine();

        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        int d = Integer.parseInt(sD);

        if (a >= b && a >= c && a >= d){
            System.out.println(a);
        } else if (b >= a && b >= c && b >= d){
            System.out.println(b);
        } else if (c >= a && c > b && c >= d){
             System.out.println(c);
        } else if (d >= a && d >= b && d >= c){
            System.out.println(d);
        }

    }
}
