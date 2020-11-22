package questone.seventhlevel.lecture9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MakingDoubles {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        // Считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> result = doubleValues(list);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list2) {

        for (int i = 0; i < list2.size(); i+=2) {
            list2.add(i+1,list2.get(i));
        }
        //напишите тут ваш код
        return list2;
    }
}
