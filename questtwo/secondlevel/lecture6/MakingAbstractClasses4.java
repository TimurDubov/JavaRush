package questtwo.secondlevel.lecture6;

public class MakingAbstractClasses4 {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal{

        @Override
        public String getName() {
            return "Корова";
        }
    }

}
