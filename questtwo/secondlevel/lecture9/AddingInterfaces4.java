package questtwo.secondlevel.lecture9;

public class AddingInterfaces4 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements CanFly, CanRun, CanSwim {

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements CanSwim, CanRun {

       @Override
        public void swim() {

        }

        @Override
        public void run() {

        }
    }

    public class Airplane implements CanFly, CanRun {

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}

