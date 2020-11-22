package questtwo.ninthlevel.lecture5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HighlightingNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String filePath1 = bufferedReader.readLine();
        String filePath2 = bufferedReader.readLine();

        String content = "";

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filePath1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2));

        content = bufferedReader1.readLine();

        String[] arrayContent = content.split("\\s+");

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arrayContent.length; i++) {
            try {
                int a = Integer.parseInt(arrayContent[i]);
                arrayList.add(a);

            } catch (Exception e){

            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            bufferedWriter.write(arrayList.get(i) + " ");
        }

        bufferedReader.close();
        bufferedReader1.close();
        bufferedWriter.close();
    }
}
