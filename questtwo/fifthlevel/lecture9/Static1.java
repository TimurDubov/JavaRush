package questtwo.fifthlevel.lecture9;

import java.util.HashMap;
import java.util.Map;

public class Static1 {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0,"one");
        labels.put(2.0,"two");
        labels.put(3.0,"three");
        labels.put(4.0,"four");
        labels.put(5.0,"five");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}

