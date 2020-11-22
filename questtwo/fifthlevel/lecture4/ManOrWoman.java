package questtwo.fifthlevel.lecture4;

public class ManOrWoman {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human AbstractHuman) {

    }

    public static class Human {

    }

    public static class Man extends Human{

    }

    public static class Woman extends Human {

    }
}
