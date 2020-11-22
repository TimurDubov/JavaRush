package questone.fifthlevel.lecture12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfPasses = Integer.parseInt(reader.readLine());
        int max = 0;

        if (numberOfPasses > 0){
            max = Integer.parseInt(reader.readLine());
            for (int i = 0; i < numberOfPasses - 1; i++) {
                int a = Integer.parseInt(reader.readLine());
                if (a > max){
                    max = a;
                }
            }
            System.out.println(max);
        }


    }

}
