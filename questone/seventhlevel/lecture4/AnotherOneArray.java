package questone.seventhlevel.lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AnotherOneArray {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = ints.length - 1; i > -1 ; i--) {
            System.out.println(ints[i]);
        }
    }
}
