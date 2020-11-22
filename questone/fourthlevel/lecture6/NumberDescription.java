package questone.fourthlevel.lecture6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberDescription {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        int a = Integer.parseInt(sA);
if (a > 0 && a < 1000){
    if (sA.length() == 1){
        if (a % 2 == 0){
            System.out.println("четное однозначное число");
        } else System.out.println("нечетное однозначное число");
    } else if (sA.length() == 2){
        if (a % 2 == 0){
            System.out.println("четное двузначное число");
        } else System.out.println("нечетное двузначное число");

    } else if (sA.length() == 3){
        if (a % 2 == 0){
            System.out.println("четное трехзначное число");
        } else System.out.println("нечетное трехзначное число");

    }



}

    }
}
