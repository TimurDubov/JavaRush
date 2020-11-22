package questone.ninthlevel.lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


// Очень сложная задачка. Нужно посидеть еще и подумать, как она работает, так как я до сих пор не разобрался
public class MakingAlgorithm {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {

        ArrayList<Integer> listChislo = new ArrayList<>();
        ArrayList<Integer> listStroka = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                listChislo.add(i);
            } else listStroka.add(i);
        }

        for (int c = listStroka.size(); c >= 0; c--) {
            for (int i = 1; i < c; i++) {
                if (isGreaterThan(array[listStroka.get(i - 1)], array[listStroka.get(i)])) {
                    String b = array[listStroka.get(i - 1)];
                    array[listStroka.get(i - 1)] = array[listStroka.get(i)];
                    array[listStroka.get(i)] = b;
                }
            }
        }

        for (int c = listChislo.size(); c >=0 ; c--) {
            for (int i = 1; i < c; i++) {
                if (Integer.parseInt(array[listChislo.get(i)]) > Integer.parseInt(array[listChislo.get(i - 1)])) {
                    String b = array[listChislo.get(i)];
                    array[listChislo.get(i)] = array[listChislo.get(i - 1)];
                    array[listChislo.get(i - 1)] = b;
                }
            }
        }
        // напишите тут ваш код
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
