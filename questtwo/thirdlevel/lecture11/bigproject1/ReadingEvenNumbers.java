package questtwo.thirdlevel.lecture11.bigproject1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ReadingEvenNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String mFilePath = bufferedReader.readLine();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(mFilePath)));

        ArrayList<Integer> mArrayList = new ArrayList<>();

        while (fileReader.ready()){
            int i = Integer.parseInt(fileReader.readLine());
            if (i % 2 == 0){
                mArrayList.add(i);
            }
        }

        Collections.sort(mArrayList);
        for (int i = 0; i < mArrayList.size(); i++) {
            System.out.println(mArrayList.get(i));
        }
        bufferedReader.close();
        fileReader.close();

    }
}
