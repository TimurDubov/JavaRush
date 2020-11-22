package questone.fourthlevel.lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WhatYearIsItNow {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int a = Integer.parseInt(s);
        int leapYear = 366;
        int notALeapYear = 365;

        if (a % 400 == 0){
            System.out.println("количество дней в году: " + leapYear);
        } else if ((a % 100 != 0) && (a % 4 == 0)){
            System.out.println("количество дней в году: " + leapYear);
        } else System.out.println("количество дней в году: " + notALeapYear);
        //напишите тут ваш код

    }
}
