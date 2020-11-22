package questtwo.ninthlevel.lecture11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class ReversingInput {
    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = bufferedReader.readLine();

        bufferedReader.close();
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filePath));

        List<Character> arrayList = new ArrayList<>();

        while (bufferedReader1.ready()){
            String s = bufferedReader1.readLine();

            System.out.println(s);
            char[] chars = s.toCharArray();

            for (int i = chars.length - 1; i >= 0; i--) {
                System.out.print(chars[i]);
            }

        }

    }

}
