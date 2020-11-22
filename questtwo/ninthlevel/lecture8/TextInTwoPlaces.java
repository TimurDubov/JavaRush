package questtwo.ninthlevel.lecture8;

import java.io.*;

public class TextInTwoPlaces {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath1 = bufferedReader.readLine();

        OutputStream outputFile = new FileOutputStream(filePath1);




        PrintStream printStream = System.out;

        ByteArrayOutputStream outputStream1 = new ByteArrayOutputStream();

        PrintStream printStream1 = new PrintStream(outputFile);


        System.setOut(printStream1);

        outputStream1.writeTo(outputFile);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
