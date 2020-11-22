package questtwo.eighthlevel.lecture11;

import java.io.*;

public class FilesAndExceptions {
    static String s = "";

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            do {
                s = bufferedReader.readLine();
                FileInputStream fileInputStream = new FileInputStream(s);
                fileInputStream.close();
            } while (true);

        } catch (FileNotFoundException e) {
            System.out.println(s);
        }

        bufferedReader.close();
    }
}
