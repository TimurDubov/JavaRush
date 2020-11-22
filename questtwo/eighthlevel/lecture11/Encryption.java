package questtwo.eighthlevel.lecture11;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Encryption {
    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);

        if (args[0].equals("-e")) {
            while (fileInputStream.available() > 0) {
                byte input = (byte) fileInputStream.read();
                fileOutputStream.write(input + 1);
            }
        } else if (args[0].equals("-d")) {
            while (fileInputStream.available() > 0) {
                byte input = (byte) fileInputStream.read();
                fileOutputStream.write(input - 1);
            }
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
