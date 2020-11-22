package questone.secondlevel.lecture8;

public class MinimumOfFourNumbers {
    public static int min(int a, int b, int c, int d) {

        if (c <= min(a,b) & c <= d){
            return c;
        } else if (d <= min(a,b) & d <= c){
            return d;
        } else return min(a, b);

        //напишите тут ваш код

    }

    public static int min(int a, int b) {
        if (a < b){
            return a;
        } else return b;
        //напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
