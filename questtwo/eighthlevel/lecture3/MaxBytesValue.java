package questtwo.eighthlevel.lecture3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MaxBytesValue {
    public static void main(String[] args) throws Exception{

        int a = 0;
        int b = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(s);

        while (fileInputStream.available() > 0){
            a = fileInputStream.read();
            if (a > b){
                b = a;
            }
        }


        System.out.println(b);
        fileInputStream.close();

    }
}