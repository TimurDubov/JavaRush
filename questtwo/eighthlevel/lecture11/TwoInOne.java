package questtwo.eighthlevel.lecture11;

import java.io.*;

public class TwoInOne {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();



        FileInputStream fileInputStream = new FileInputStream(fileName2);
        FileInputStream fileInputStream2 = new FileInputStream(fileName3);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);

        while (fileInputStream.available() > 0){
            int a = fileInputStream.read();
            fileOutputStream.write(a);
        }

        while (fileInputStream2.available() > 0){
            int a = fileInputStream2.read();
            fileOutputStream.write(a);
        }

        reader.close();
        fileInputStream.close();
        fileInputStream2.close();
        fileOutputStream.close();

    }
}
