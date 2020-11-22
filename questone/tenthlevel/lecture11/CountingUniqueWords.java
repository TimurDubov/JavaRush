package questone.tenthlevel.lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountingUniqueWords {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();


        for (int i = 0; i < list.size(); i++) {
            int counter = 0;
            String a = list.get(i);
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    counter++;
                }

            }
            if (!result.containsKey(list.get(i))) {
                result.put(list.get(i), counter);
            }

            //напишите тут ваш код



        }
        return result;
    }
}