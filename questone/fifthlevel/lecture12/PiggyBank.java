package questone.fifthlevel.lecture12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PiggyBank {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        while (true){
            String sA = reader.readLine();
            int a;
            if (sA.equals("сумма")){
                break;
            } else {
                a = Integer.parseInt(sA);
                max = max + a;
            }

        }

        System.out.println(max);
    }
}
