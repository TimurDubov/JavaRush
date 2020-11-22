package questone.seventhlevel.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakingArrays {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] first = new int[20];
        for (int i = 0; i < first.length; i++) {
            int a = Integer.parseInt(reader.readLine());
            first[i] = a;
        }
        // создай и заполни массив
        return first;
    }

    public static int max(int[] array) {

        int second = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > second){
                second = array[i];
            }
        }
        // найди максимальное значение
        return second;
    }
}
