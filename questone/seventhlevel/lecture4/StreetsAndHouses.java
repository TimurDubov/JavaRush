package questone.seventhlevel.lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StreetsAndHouses {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[15];

        int even = 0;
        int odd = 0;

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());

            if (i % 2 == 0){
                even += ints[i];
            } else odd += ints[i];

        }

        if (even > odd){
            System.out.println("В домах с четными номерами проживает больше жителей.");

        } else System.out.println("В домах с нечетными номерами проживает больше жителей");



    }
}
