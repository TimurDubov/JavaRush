package questone.fourthlevel.lecture4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfTheWeek {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        int a = Integer.parseInt(s);

        switch (a){
            case (1):
                System.out.println("Понедельник");
                break;
            case (2):
                System.out.println("Вторник");
                break;
            case (3):
                System.out.println("Среда");
                break;
            case (4):
                System.out.println("Четверг");
                break;
            case (5):
                System.out.println("Пятница");
                break;
            case (6):
                System.out.println("Суббота");
                break;
            case (7):
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("такого дня не существует");
                break;


        }

    }
}
