package questone.seventhlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AddingElementsToTheEnd {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 9; i > -1; i--) {
            list.add(0,reader.readLine());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
