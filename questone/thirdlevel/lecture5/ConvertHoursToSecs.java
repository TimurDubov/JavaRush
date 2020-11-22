package questone.thirdlevel.lecture5;

public class ConvertHoursToSecs {
    public static void main(String[] args) {

        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(7));



    }


    public static int convertToSeconds(int hour){
        int secs =hour * 3600;
        return secs;
    }
}
