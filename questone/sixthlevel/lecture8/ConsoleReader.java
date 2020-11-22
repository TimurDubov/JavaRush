package questone.sixthlevel.lecture8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
        //напишите тут ваш код

    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);
        return a;
        //напишите тут ваш код

    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        double a = Double.parseDouble(sA);
        return a;
        //напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        boolean a = Boolean.parseBoolean(sA);
        return a;
        //напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {
        System.out.println(readBoolean());

    }
}