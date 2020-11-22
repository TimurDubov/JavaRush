package questtwo.eighthlevel.lecture5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReversingTheFile {
    public static void main(String[] args) throws Exception {

        List<Integer> arrayList = new ArrayList<>();

        String filePath1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String filePath2 = new BufferedReader(new InputStreamReader(System.in)).readLine();

        FileInputStream fileInputStream = new FileInputStream(filePath1);
        FileOutputStream fileOutputStream = new FileOutputStream(filePath2);

        while (fileInputStream.available() > 0){
            arrayList.add(fileInputStream.read());
        }

        for (int i = arrayList.size()-1; i >= 0; i--) {
            fileOutputStream.write(arrayList.get(i));
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
