package questone.seventhlevel.lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlippingArray {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 8; i++) {
            strings[i] = reader.readLine();
        }
        for (int i = strings.length - 1; i > -1; i--) {
            System.out.println(strings[i]);
        }
    }
}
