package questone.thirdlevel.lecture8;

import java.io.BufferedReader;

import java.io.InputStreamReader;


public class NameAndYears {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String vasyaName = reader.readLine();
        String vasyaAge = reader.readLine();
        int nVasyaAge = Integer.parseInt(vasyaAge);

        System.out.println(vasyaName + " захватит мир через " + nVasyaAge + " лет. Му-ха-ха!");


    }
}
