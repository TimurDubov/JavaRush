package questtwo.secondlevel.lecture2;

public class IOverridingMethods1 {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {

        @Override
        public String getName() {
            return "Я не корова, Я - кит.";
        }
    }
}

