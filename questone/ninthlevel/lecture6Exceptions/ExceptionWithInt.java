package questone.ninthlevel.lecture6Exceptions;

public class ExceptionWithInt {
    public static void main(String[] args) {
        //напишите тут ваш код

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e){
            System.out.println(e);
        }

        


        //напишите тут ваш код
    }
}
