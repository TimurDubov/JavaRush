package questtwo.fifthlevel.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigDecimal bigDecimal = BigDecimal.valueOf(1);
        String s = "";

        if (n > 0 && n < 151){
            for (int i = 2; i <= n; i++) {
                bigDecimal = bigDecimal.multiply(BigDecimal.valueOf(i));
            }
            s = bigDecimal.toString();
        } else if ( n < 0){
            s = "0";
        } else if (n == 0){
            s = "1";
        }
        //add your code here


        return s;
    }
}
