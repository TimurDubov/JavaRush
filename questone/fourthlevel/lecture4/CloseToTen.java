package questone.fourthlevel.lecture4;

public class CloseToTen {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {


        int aa = a - 10;
        int bb = b - 10;

        if (abs(aa) > abs(bb)){
            System.out.println(b);
        } else if (abs(aa) < abs(bb)){
            System.out.println(a);
        } else if (abs(aa) == abs(bb)){
            System.out.println(a);
        }

        if (2 > 1){

        }
        // напишите тут ваш код

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
