package questone.seventhlevel.lecture9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GoingHigher {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();
        String test = "";
        int count = 0;
        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() > test.length()){
                test = arrayList.get(i);
                count++;
            } else if (arrayList.get(i).length() <= test.length()){
                System.out.println(count);
                break;
            }
        }
    }
}
