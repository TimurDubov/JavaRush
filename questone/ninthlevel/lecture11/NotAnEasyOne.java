package questone.ninthlevel.lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NotAnEasyOne {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            while (true){
                int a = Integer.parseInt(reader.readLine());
                arrayList.add(a);
            }
        } catch (Exception e){
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        }

        //напишите тут ваш код
    }
}
