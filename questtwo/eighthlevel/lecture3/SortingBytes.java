package questtwo.eighthlevel.lecture3;

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingBytes {
    public static void main(String[] args) throws Exception {

        List<Integer> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        FileInputStream inputStream = new FileInputStream(filePath);

        while (inputStream.available() > 0){
            arrayList.add(inputStream.read());
        }




        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {

                if (i != j){
                    if (arrayList.get(i).equals(arrayList.get(j))){
                        arrayList.remove(j);
                        j--;
                    }
                }

                }

            }

        Collections.sort(arrayList);

        for (Integer counter :
                arrayList) {
            System.out.print(counter + " ");
        }

        inputStream.close();

    }
}
