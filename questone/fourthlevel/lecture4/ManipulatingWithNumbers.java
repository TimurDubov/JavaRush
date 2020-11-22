package questone.fourthlevel.lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ManipulatingWithNumbers {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int a = Integer.parseInt(s);

        if (a > 0){
            System.out.println(a * 2);
        } else if (a < 0 ){
            System.out.println(a + 1);
        } else System.out.println(a);
    }
}
