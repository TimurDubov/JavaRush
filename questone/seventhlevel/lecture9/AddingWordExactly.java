package questone.seventhlevel.lecture9;

import java.util.ArrayList;

public class AddingWordExactly {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        String s = "именно";
        arrayList.add("мама");
        arrayList.add("мыла");
        arrayList.add("раму");

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0){
                arrayList.add(i+1,s);
            }

        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
