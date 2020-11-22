package questtwo.fourthlevel.lecture8.makingmovies;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();

        Movie movie = null;
        while (true){
            String s = reader.readLine();
            if (s.equals("soapOpera") || s.equals("cartoon") || s.equals("thriller")){
                arrayList.add(s);
            } else {
                break;
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(MovieFactory.getMovie(arrayList.get(i)).getClass().getSimpleName());
        }


        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if("cartoon".equals(key)){
                movie = new Cartoon();
            } else if ("thriller".equals(key)){
                movie = new Thriller();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{

    }

    static class Thriller extends Movie{

    }

    //Напишите тут ваши классы, пункт 3
}

