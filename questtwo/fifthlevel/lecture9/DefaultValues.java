package questtwo.fifthlevel.lecture9;

public class DefaultValues {

    int intVar;
    double doubleVar;
    Double DoubleVar;
    boolean booleanVar;
    Object ObjectVar;
    Exception ExceptionVar;
    String StringVar;

    public static void main(String[] args) {

        DefaultValues defaultValues = new DefaultValues();
        System.out.println(defaultValues.intVar);
        System.out.println(defaultValues.doubleVar);
        System.out.println(defaultValues.DoubleVar);
        System.out.println(defaultValues.booleanVar);
        System.out.println(defaultValues.ObjectVar);
        System.out.println(defaultValues.ExceptionVar);
        System.out.println(defaultValues.StringVar);
    }
}
