package questtwo.fifthlevel.lecture2;

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }


    public static class LuxuriousCar{
        protected void printlnDesire(){
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }

    }

    public static class CheapCar{
        protected void printlnDesire(){
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }


    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
            //add your code here
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
            //add your code here
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
}