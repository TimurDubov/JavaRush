package questone.seventhlevel.lecture6;

import java.util.ArrayList;

public class MakingArrayOfStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = String.valueOf(i);
            list.add(s);
        }
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}

