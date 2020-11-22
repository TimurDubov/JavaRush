package questone.fourthlevel.lecture13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rectangle {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(reader.readLine());
        int x = Integer.parseInt(reader.readLine());

        for (int i = 0; i < x; i++) {
            System.out.println(" ");
            for (int j = 0; j < y; j++) {
                System.out.print(8);
            }

        }
        //напишите тут ваш код

    }
}
