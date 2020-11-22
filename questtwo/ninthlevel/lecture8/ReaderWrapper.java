package questtwo.ninthlevel.lecture8;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ReaderWrapper {
    public static TestString testString = new TestString();



    public static void main(String[] args) {

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream myStream = new PrintStream(byteArrayOutputStream);

        System.setOut(myStream);

        testString.printSomething();

        String result = byteArrayOutputStream.toString().toUpperCase();
        System.setOut(consoleStream);

        System.out.println(result);



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
