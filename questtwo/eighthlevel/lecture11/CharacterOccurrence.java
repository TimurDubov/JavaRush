package questtwo.eighthlevel.lecture11;

import java.io.FileInputStream;

public class CharacterOccurrence {
    public static void main(String[] args) throws Exception {

        int[] array = new int[256];
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        while (fileInputStream.available() > 0){
            int a = fileInputStream.read();
            array[a]++;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                System.out.println((char)i + " " + array[i]);
            }

        }
        fileInputStream.close();
    }
}
