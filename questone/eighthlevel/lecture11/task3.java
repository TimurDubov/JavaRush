package questone.eighthlevel.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ITryingToFindMinimumNumberAgain {


    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        int a = Integer.MAX_VALUE;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < a){
                a = array.get(i);
            }
        }
        // Найти минимум тут
        return a;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integersList = new ArrayList<>();

        int quantity = Integer.parseInt(reader.readLine());

        for (int i = 0; i < quantity; i++) {
            integersList.add(Integer.parseInt(reader.readLine()));
        }
        // Создать и заполнить список тут
        return integersList;
    }
}

