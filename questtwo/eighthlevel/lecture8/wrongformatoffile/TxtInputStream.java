package questtwo.eighthlevel.lecture8.wrongformatoffile;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws UnsupportedFileNameException, FileNotFoundException, IOException{
        super(fileName);

        if (!fileName.endsWith(".txt")){
            super.close();
            throw new UnsupportedFileNameException();
        }

    }


    public static void main(String[] args) throws UnsupportedFileNameException, FileNotFoundException, IOException {
        TxtInputStream txtInputStream = new TxtInputStream("");
    }
}

