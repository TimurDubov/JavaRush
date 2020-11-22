package questone.seventhlevel.lecture9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortingNumbersToArrays {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList4 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrayList1.add(Integer.parseInt(reader.readLine()));
        }


        for (int i = 0; i < arrayList1.size(); i++) {
            if (arrayList1.get(i) % 2 == 0 && arrayList1.get(i) % 3 == 0){
                arrayList2.add(arrayList1.get(i));
                arrayList3.add(arrayList1.get(i));
            } else if (arrayList1.get(i) % 2 == 0 && arrayList1.get(i) % 3 != 0){
                arrayList2.add(arrayList1.get(i));
            } else if (arrayList1.get(i) % 2 != 0 && arrayList1.get(i) % 3 == 0){
                arrayList3.add(arrayList1.get(i));
            } else arrayList4.add(arrayList1.get(i));
        }

        printList(arrayList3);
        printList(arrayList2);
        printList(arrayList4);
        //напишите тут ваш код
    }

    public static void printList(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
