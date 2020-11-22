package questone.sixthlevel.lecture11;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiveNumbersSorted {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            int a = Integer.parseInt(reader.readLine());
            array[i] = a;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int b;
                if (array[j] > array[j+1]){
                    b = array[j+1];
                    array[j+1] = array[j];
                    array[j] = b;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //напишите тут ваш код
    }
}
