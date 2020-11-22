package questone.fourthlevel.lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Довольно сложная задачка. Условие:

Работа светофора для пешеходов запрограммирована следующим образом:
        в начале каждого часа в течение трех минут горит зелёный сигнал,
        затем в течение одной минуты - жёлтый,
        а потом в течение одной минуты - красный,
        затем опять зелёный горит три минуты и т. д.
        Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
        Определить, сигнал какого цвета горит для пешеходов в этот момент.
        Результат вывести на экран в следующем виде:
        "зелёный" - если горит зелёный цвет,
        "жёлтый" - если горит жёлтый цвет,
        "красный" - если горит красный цвет.

        */

public class TrafficLight {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        double a = Double.parseDouble(sA);
        double b = a;
        for (double i = b; i >= 0 ; i -= 5) {
            a = a - 3;
            if (a < 0 ){
                System.out.println("зелёный");
                break;
            }
            a = a - 1;
            if (a < 0 ) {
                System.out.println("жёлтый");
                break;
            }
            a = a - 1;
                if (a < 0 ) {
                    System.out.println("красный");
                    break;
                }

        }



    }
}
