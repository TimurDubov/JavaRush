package questone.seventhlevel.lecture9;

import java.util.ArrayList;
/*
Тоже довольно сложная задачка, можно попозже к ней вернуться, подумать, как она работает. Так как я ее еще не доделал.
 */

public class DeletingRAndAddingL {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            if ((strings.get(i).contains("р")) && (!strings.get(i).contains("л"))){
                strings.remove(i);
                i--;
            } else if (!(strings.get(i).contains("р")) && (strings.get(i).contains("л"))){
                strings.add(i + 1, strings.get(i));
                i++;
            }
        }
        return strings;




        /*
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("р")&&!strings.get(i).contains("л")){
                strings.remove(i);
                i--;
            } else if (!strings.get(i).contains("р") && strings.get(i).contains("л")){
                strings.add(i + 1,strings.get(i++));
                i++;
            }
        }
        //напишите тут ваш код
        return strings; */
    }
}


/*

if (strings.get(i).contains("р") && strings.get(i).contains("л")){

            } else
 */