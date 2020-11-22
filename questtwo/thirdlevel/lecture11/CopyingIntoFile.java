package questtwo.thirdlevel.lecture11;

import java.io.*;

public class CopyingIntoFile {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filePath = reader.readLine();

        String a = "";
        while (true){
            String temporary = reader.readLine();
            a += temporary + "\n";
            if (temporary.equals("exit")){
                break;
            }
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write(a);

        bufferedWriter.close();
        reader.close();
        // напишите тут ваш код
    }
}

