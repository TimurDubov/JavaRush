package questone.seventhlevel.lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ThisIsTheEnd {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();

        while (true){
            String s = reader.readLine();
            if (s.equals("end")){
                break;
            } arrayList.add(s);
                Thread.sleep(100);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //напишите тут ваш код
    }
}