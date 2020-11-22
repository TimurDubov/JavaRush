package questone.fourthlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsAgeCorrect {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();

        int a = Integer.parseInt(sB);

        if (a < 18){
            System.out.println("Подрасти еще");
        }
    }
}
