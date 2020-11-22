package questone.eighthlevel.lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiveWinners {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int a = array[j];
                if ( array[j] < array[j+1]){
                    array[j] = array[j+1];
                    array[j+1] = a;
                }
            }
        }
        //напишите тут ваш код
    }
}
