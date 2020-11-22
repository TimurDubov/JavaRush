package questtwo.eighthlevel.lecture11;

import java.io.*;
import java.util.Scanner;

public class FindingDataInFile {
    public static void main(String[] args) throws Exception{

        findingId(args[0]);

    }


    public static void findingId(String id) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = bufferedReader.readLine();



        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            if (s.startsWith(id + " ")){
                System.out.println(s);
            }
        }

        bufferedReader.close();
        scanner.close();
        fileReader.close();
    }
}
