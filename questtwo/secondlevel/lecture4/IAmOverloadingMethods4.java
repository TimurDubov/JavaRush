package questtwo.secondlevel.lecture4;

public class IAmOverloadingMethods4 {
    public static void main(String[] args) {

    }

    public static int min(int a, int b){
        if (a < b){
            return a;
        } else return b;
    }

    public static long min(long a, long b){
        if (a < b){
            return a;
        } else return b;
    }

    public static double min(double a, double b){
        if (a < b){
            return a;
        } else return b;
    }
    //Напишите тут ваши методы
}

