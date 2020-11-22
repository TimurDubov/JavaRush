package questone.seventhlevel.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AnotherOneTask {
     public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         ArrayList<String> arrayList = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

         for (int i = 0; i < n; i++) {
             arrayList.add(reader.readLine());
         }

         for (int i = 0; i < m; i++) {
             String s = arrayList.get(0);
             arrayList.remove(0);
             arrayList.add(arrayList.size(),s);
         }

         for (int i = 0; i < arrayList.size(); i++) {
             System.out.println(arrayList.get(i));
         }
        //напишите тут ваш код
    }
}
