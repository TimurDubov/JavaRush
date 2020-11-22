package questone.thirdlevel.lecture8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KolyaSalary {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();

        int number1 = Integer.parseInt(sNumber1);
        int number2 = Integer.parseInt(sNumber2);

        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");

    }
}
