package questone.secondlevel.lecture5;

public class CatDogFish {
    public static void main(String[] args) {

        Woman woman1 = new Woman();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Fish fish1 = new Fish();
        cat1.owner = woman1;
        dog1.owner = woman1;
        fish1.owner = woman1;
        //напишите тут ваш код
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
