package questtwo.eighthlevel.lecture3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;



// Нерабочая версия, с использованием коллекций

public class TheMostCommonBytes {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathFile = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(pathFile);
        while (fileInputStream.available() > 0){
            arrayList.add(fileInputStream.read());
        }



        arrayList2 = arrayList;

        for (int i = 0; i < arrayList.size(); i++) {
            int a = 0;
            for (int j = 0; j < arrayList2.size(); j++) {
                if (arrayList.get(i).equals(arrayList2.get(j))){
                    a++;
                    arrayList3.add(i, a);
                }
            }

        }

        int b = 0;


        for (int i = 1; i < arrayList3.size(); i++) {
            if (arrayList3.get(i-1) < arrayList3.get(i)){

                b = arrayList3.get(i);
            }

        }

        ArrayList<Integer> arrayList4 = new ArrayList<>();

        for (int i = 0; i < arrayList3.size(); i++) {
            if (arrayList3.get(i).equals(b)){
                arrayList4.add(i);
            }
        }


        for (int i = 0; i < arrayList4.size(); i++) {
            System.out.println(arrayList.get(arrayList.get(i)) + " ");
        }
        fileInputStream.close();

    }
}
