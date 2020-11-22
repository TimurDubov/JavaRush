package questone.sixthlevel.lecture8;

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a + b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a - b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a * b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double aa = a;
        double bb = b;
        double c = aa /bb;
        return c;
    }

    public static double percent(int a, int b) {
        double aa = a;
        double bb = b;
        double c = (aa / 100) * bb;
        //напишите тут ваш код
        return c;
    }

    public static void main(String[] args) {

    }
}