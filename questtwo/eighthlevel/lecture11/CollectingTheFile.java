package questtwo.eighthlevel.lecture11;

import java.io.*;
import java.util.*;


// Задача недоделана. Позже вернуться к ней.
// Ссылка на задачу: https://javarush.ru/tasks/com.javarush.task.task18.task1825#discussion

public class CollectingTheFile {
    public static void main(String[] args) throws Exception{

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = "";

        do {
            s = bufferedReader.readLine();


        } while (!s.equals("exit"));

    }
}
