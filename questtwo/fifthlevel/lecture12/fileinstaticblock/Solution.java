package questtwo.fifthlevel.lecture12.fileinstaticblock;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/*
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        File file = new File(Statics.FILE_NAME);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
