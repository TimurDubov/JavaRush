package questone.ninthlevel.lecture6Exceptions;

public class StringEqualsNull {
    public static void main(String[] args) {
        //напишите тут ваш код

        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e){
            System.out.println(e);
        }


        //напишите тут ваш код
    }
}
