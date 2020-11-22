package questtwo.eighthlevel.lecture8.expandingamigooutputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream{

    public AmigoOutputStream component;

    QuestionFileOutputStream(AmigoOutputStream amigoOutputStream){
        this.component = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        component.flush();
    }

    @Override
    public void write(int b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        component.write(b, off, len);
    }

    @Override
    public void close() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Вы действительно хотите закрыть поток? Д/Н");

        String s = bufferedReader.readLine();
        if (s.equals("Д")){
            component.close();
        }

    }
}
