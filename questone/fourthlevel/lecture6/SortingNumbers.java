package questone.fourthlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortingNumbers {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] array = new int[3];


        for (int i = 0; i < 3; i++) {
            String sA = reader.readLine();
            int a = Integer.parseInt(sA);
            array[i] = a;
        }

        for (int i = array.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]){
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        }

    }


