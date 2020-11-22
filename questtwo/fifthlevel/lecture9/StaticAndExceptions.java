package questtwo.fifthlevel.lecture9;

public class StaticAndExceptions {
    public static int A = 0;


    static {

        try {
            throw new ExceptionInInitializerError();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //throw an exception here - выбросьте эксепшн тут
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}

