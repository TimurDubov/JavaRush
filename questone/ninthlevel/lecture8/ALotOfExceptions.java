package questone.ninthlevel.lecture8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ALotOfExceptions {
    public static void main(String[] args) {
    }

    static class MyException extends IOException {
    }

    static class MyException2 extends FileNotFoundException {
    }

    static class MyException3 extends ArrayIndexOutOfBoundsException {
    }

    static class MyException4 extends IndexOutOfBoundsException {
    }
}

