package questone.tenthlevel.lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class AVeryVeryHardOne {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');


        // Ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        ArrayList<Character> list1 = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            char[] word = list.get(j).toCharArray();
            for (int a = 0; a < word.length; a++) {
                list1.add(word[a]);
            }
        }
        Map<String, Integer> map=new LinkedHashMap<>();
        int count = 0;

        for (int i = 0; i < alphabet.size(); i++) {
            String str= String.valueOf(alphabet.get(i));
            for (int k = 0; k < list1.size(); k++) {
                if (list1.get(k).equals( alphabet.get(i))) {
                    count += 1;
                }
            }
            map.put(str,count);
            count=0;
        }
        for(Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey()+" "+ pair.getValue());
        }
    }
}






















    /*
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 1; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            char[] charArray = element.toCharArray();
            for (int j = 0; j < alphabet.size(); j++) {
                int count = 0;
                for (int k = 0; k < charArray.length; k++) {
                    if (alphabet.get(j) == charArray[k]){
                        count++;
                        System.out.println(count);

                    }
                    arrayList.add(count);
                    map.put(alphabet.get(j),arrayList.get(i));
                }
            }
        }
        System.out.println(map);

        // напишите тут ваш код
    }
}
*/
