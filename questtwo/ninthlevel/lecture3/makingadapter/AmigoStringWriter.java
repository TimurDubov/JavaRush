package questtwo.ninthlevel.lecture3.makingadapter;

import java.io.IOException;

public interface AmigoStringWriter {
    void flush() throws IOException;

    void writeString(String s) throws IOException;

    void close() throws IOException;
}

