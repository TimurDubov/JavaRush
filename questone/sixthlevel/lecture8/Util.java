package questone.sixthlevel.lecture8;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double a = ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
        a = Math.sqrt(a);
        return a;
        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
