package questone.fifthlevel.lecture5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AverageNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;

        while (true){
            int a = Integer.parseInt(reader.readLine());

            if (a != -1){
                sum +=a;
                count++;
            } else {
                System.out.println(sum / count);
                break;
            }
        }
    }
}
