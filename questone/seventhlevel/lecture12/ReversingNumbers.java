package questone.seventhlevel.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ReversingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = arrayList.size() - 1; i > -1; i--) {
            System.out.println(arrayList.get(i));
        }
        //напишите тут ваш код
    }
}
