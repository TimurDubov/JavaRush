package questtwo.secondlevel.lecture12;

public class AddingMoreInterfaces4 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO2 implements Businessman{

        @Override
        public void workHard() {

        }
    }
    public static class CTO extends CTO2 implements Businessman{

    }
}
