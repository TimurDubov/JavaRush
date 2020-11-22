package questtwo.secondlevel.lecture12;

public class AddingAbstractMethods {
    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public  void fly() {

        }
    }

    public abstract static class SwimmingPegasus extends Pegasus {
        public abstract void swim();

    }

}

