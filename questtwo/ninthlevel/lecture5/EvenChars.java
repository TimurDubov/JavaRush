package questtwo.ninthlevel.lecture5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EvenChars {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String filePath1 = bufferedReader.readLine();
        String filePath2 = bufferedReader.readLine();

        bufferedReader.close();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filePath1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2));

        while (bufferedReader1.read() > 0){
            for (int i = 0; i < 1; i++) {
                bufferedReader1.skip(1);
            }
            bufferedReader1.skip(1);
            bufferedWriter.write(bufferedReader1.read());
        }


        bufferedReader1.close();
        bufferedWriter.close();


    }
}
