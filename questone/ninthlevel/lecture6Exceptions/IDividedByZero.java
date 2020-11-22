package questone.ninthlevel.lecture6Exceptions;

public class IDividedByZero {
    public static void main(String[] args) {
        //напишите тут ваш код

        try {
            int a = 42 / 0;
        } catch (ArithmeticException e){
            System.out.println(e);
        }


        //напишите тут ваш код
    }
}
