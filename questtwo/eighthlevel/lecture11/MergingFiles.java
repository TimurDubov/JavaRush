package questtwo.eighthlevel.lecture11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MergingFiles {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);


        byte[] buffer1 = new byte[fileInputStream.available()];



        while (fileInputStream.available() > 0){
            fileInputStream.read(buffer1, 0, buffer1.length);
        }
        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);

        while (fileInputStream2.available() > 0){
            fileOutputStream.write(fileInputStream2.read());
        }

        fileOutputStream.write(buffer1);

        reader.close();
        fileInputStream2.close();
        fileOutputStream.close();


    }
}
