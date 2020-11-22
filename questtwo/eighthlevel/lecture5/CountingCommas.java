package questtwo.eighthlevel.lecture5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountingCommas {
    public static void main(String[] args) throws Exception{

        List<Integer> arrayList = new ArrayList<>();
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream fileInputStream = new FileInputStream(s);

        while (fileInputStream.available() > 0){
            arrayList.add(fileInputStream.read());
        }

        int commas = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(44)){
                commas++;
            }
        }

        System.out.println(commas);
        fileInputStream.close();
    }
}
