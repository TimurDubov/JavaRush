package questtwo.secondlevel.lecture12;

public class AddingMoreInterfaces {
    public static void main(String[] args) {

    }

    public interface CanFly{
        void fly();
    }
    public interface CanClimb{
        void climb();
    }
    public interface CanRun{
        void run();
    }




    public class Cat implements CanRun, CanClimb {
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements CanRun{
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat implements CanRun, CanClimb {
    }

    public class Duck implements CanRun, CanFly{
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}

