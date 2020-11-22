package questtwo.thirdlevel.lecture11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadingAFile {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filename = reader.readLine();

        InputStream inputStream = new FileInputStream(filename);

        while (inputStream.available() > 0){
            System.out.print((char)inputStream.read());
        }

        inputStream.close();
        reader.close();
        // напишите тут ваш код
    }
}
