package questone.ninthlevel.lecture11;

public class Easy {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e){
            e.printStackTrace();
        }

    }

    public static void divideByZero(){
        System.out.println(15 / 0);
    }
}