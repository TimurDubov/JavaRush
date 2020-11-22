package questtwo.fourthlevel.lecture8;

import java.util.ArrayList;
import java.util.List;

public class ALotOfExceptions {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        exceptions.add(new RuntimeException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ClassCastException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new IllegalThreadStateException());
        //напишите тут ваш код

    }
}
