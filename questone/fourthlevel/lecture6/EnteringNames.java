package questone.fourthlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EnteringNames {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();

        if (sA.equals(sB)){
            System.out.println("Имена идентичны");
        } else if (sA.length() == sB.length()){
            System.out.println("Длины имен равны");
        }
    }
}
