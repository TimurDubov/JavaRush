package questtwo.ninthlevel.lecture5;

import java.io.*;
import java.util.ArrayList;

public class SignsReplacement {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String filePath1 = bufferedReader.readLine();
        String filePath2 = bufferedReader.readLine();

        String result = "";

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filePath1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2));

        result = bufferedReader1.readLine();

        String modifiedResult = result.replace('.', '!');

        bufferedWriter.write(modifiedResult);

        bufferedReader.close();
        bufferedReader1.close();
        bufferedWriter.close();

    }
}
