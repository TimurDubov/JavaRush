package questtwo.fifthlevel.lecture9;

public class StaticAndCats {

    public static class Cat{
        public String name;
    }


    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "barsik";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }
}
