package questone.fourthlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenAndOddNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());

        if ((a < 0) && (a % 2 == 0)){
            System.out.println("отрицательное четное число");
        } else if ((a > 0) && (a % 2 == 0)) {
            System.out.println("положительное четное число");
        } else if ((a < 0) && (a % 2 != 0)){
            System.out.println("отрицательное нечетное число");
        } else if ((a > 0) && (a % 2 != 0)) {
            System.out.println("положительное четное число");
        } else System.out.println("ноль");
    }
}
