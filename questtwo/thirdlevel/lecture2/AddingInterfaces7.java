package questtwo.thirdlevel.lecture2;

public class AddingInterfaces7 {
    public static void main(String[] args) throws Exception{

    }

    interface CanMove{
        Double speed();
    }

    interface CanFly extends CanMove{
        Double speed(CanFly a);
    }
}
