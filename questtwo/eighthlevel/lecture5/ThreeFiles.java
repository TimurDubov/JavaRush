package questtwo.eighthlevel.lecture5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class ThreeFiles {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filePath1 = reader.readLine();
        String filePath2 = reader.readLine();
        String filePath3 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(filePath1);

        FileOutputStream fileOutputStream = new FileOutputStream(filePath2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(filePath3);


        int countOfBytes = fileInputStream.available();

        if (countOfBytes/2 == 0){
            while (fileInputStream.available() > (countOfBytes/2)){
                fileOutputStream.write(fileInputStream.read());
            }

            while (fileInputStream.available() <= countOfBytes/2 && fileInputStream.available() > 0){
                fileOutputStream2.write(fileInputStream.read());
            }
        } else {
            while (fileInputStream.available() > ((countOfBytes/2))){
                fileOutputStream.write(fileInputStream.read());
            }

            while (fileInputStream.available() <= ((countOfBytes/2) + 1) && fileInputStream.available() > 0){
                fileOutputStream2.write(fileInputStream.read());
            }

        }


        fileInputStream.close();
        fileOutputStream.close();
        fileOutputStream2.close();
    }
}
