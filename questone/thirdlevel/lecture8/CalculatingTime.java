package questone.thirdlevel.lecture8;

public class CalculatingTime {
    public static void main(String[] args) {
        int secondsAfter15 = 0;

        int minutes = 30;
        int secondsInOneMinute = 60;

        secondsAfter15 = minutes * secondsInOneMinute;

        System.out.println(secondsAfter15);
    }
}
