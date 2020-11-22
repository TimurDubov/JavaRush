package questtwo.eighthlevel.lecture5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        while (true){
            String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
            FileInputStream fileInputStream = new FileInputStream(s);
            int a = fileInputStream.available();
            if (a < 1000){
                fileInputStream.close();
                throw new DownloadException();
            }
        }


    }

    public static class DownloadException extends Exception {

    }
}
