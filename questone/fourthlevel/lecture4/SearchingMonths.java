package questone.fourthlevel.lecture4;

public class SearchingMonths {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {

        if (month == 12  || month > 0 & month < 3){
            System.out.println("зима");
        } else if (month > 2  & month <= 5 ){
            System.out.println("весна");
        } else if (month > 5  & month <= 8 ){
            System.out.println("лето");
        } else if (month > 8  & month < 12 ){
            System.out.println("осень");
        }
        //напишите тут ваш код

    }
}
