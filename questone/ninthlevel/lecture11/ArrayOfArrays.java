package questone.ninthlevel.lecture11;

import java.util.ArrayList;

public class ArrayOfArrays {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] a = {1,2,3,4,5};
        int[] b = {1,2};
        int[] c = {1,2,3,4};
        int[] d = {1,2,3,4,5,6,7};
        int[] e = new int [0];

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        return list;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
