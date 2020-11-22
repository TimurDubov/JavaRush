package questtwo.fourthlevel.lecture8.makingmovies;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = null;
        Movie movie = null;
        while ((key = reader.readLine()).equals("soapOpera") || key.equals("thriller") || key.equals("cartoon"))
        {
            movie = MovieFactory.getMovie(key);
            System.out.println(movie.getClass().getSimpleName());
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

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }else if ("thriller".equals(key)) {
                movie = new Thriller();
            }else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
