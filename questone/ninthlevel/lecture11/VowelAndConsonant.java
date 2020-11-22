package questone.ninthlevel.lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VowelAndConsonant {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> arrayList = new ArrayList<>();
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();

        String s = reader.readLine();

        for (int i = 0; i < s.length(); i++) {
            arrayList.add(s.charAt(i));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (isVowel(arrayList.get(i)) == true){
                vowels.add(arrayList.get(i));
            } else if (isVowel(arrayList.get(i)) == false && arrayList.get(i) != ' '){
                consonants.add((arrayList.get(i)));
            }
        }

        for (int i = 0; i < vowels.size(); i++) {
            System.out.print(vowels.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < consonants.size(); i++) {
            System.out.print(consonants.get(i) + " ");
        }
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}