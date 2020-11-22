package questtwo.seventhlevel.lecture4.mvf;

public class IMF {
    private static IMF imf;

    public static IMF getFund() {

        synchronized (imf){
            if (imf == null){
                imf = new IMF();
            }
        }
        //add your code here - добавь код тут
        return imf;
    }

    private IMF() {
    }
}