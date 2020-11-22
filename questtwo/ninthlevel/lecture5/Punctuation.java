package questtwo.ninthlevel.lecture5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Punctuation {
    public static void main(String[] args) throws IOException {

        Pattern pattern = Pattern.compile("\\p{P}");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String filePath1 = bufferedReader.readLine();
        String filePath2 = bufferedReader.readLine();

        bufferedReader.close();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filePath1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2));


        StringBuilder stringBuilder = new StringBuilder();
        while (bufferedReader1.ready()){
            stringBuilder.append((char) bufferedReader1.read());

        }

        String s = stringBuilder.toString();

        Matcher matcher = pattern.matcher(s);

        String result = matcher.toString();

        bufferedWriter.write(result);

        bufferedReader1.close();
        bufferedWriter.close();


    }
}
