package questtwo.eighthlevel.lecture3;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinBytesValue {
    public static void main(String[] args) throws Exception{

        int a = 0;
        int b = Integer.MAX_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            String s = reader.readLine();


        FileInputStream fileInputStream = new FileInputStream(s);

        while (fileInputStream.available() > 0){
            a = fileInputStream.read();
            if (a < b){
                b = a;
            }
        }


        System.out.println(b);
        fileInputStream.close();

    }
}
