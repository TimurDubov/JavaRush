package questone.fourthlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PositiveAndNegativeNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (a > 0){
                ++countPositive;
            } else if (a < 0){
                ++countNegative;
            }

        }
        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
    }
}
