package questtwo.fifthlevel.lecture12.singletonagain;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = reader.readLine();
            if (s.equals(Planet.SUN)){
                thePlanet = Sun.getInstance();
            } else if (s.equals(Planet.MOON)){
                thePlanet = Moon.getInstance();
            } else if (s.equals(Planet.EARTH)){
                thePlanet = Earth.getInstance();
            } else thePlanet = null;
        } catch (IOException e){
            System.out.println(e);
        }


        // implement step #5 here - реализуйте задание №5 тут
    }
}

