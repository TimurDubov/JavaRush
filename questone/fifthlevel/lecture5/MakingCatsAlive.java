package questone.fifthlevel.lecture5;

public class MakingCatsAlive {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Васька", 4, 10, 15);
        Cat cat2 = new Cat("Дашка", 3, 6, 12);
        Cat cat3 = new Cat("Машка", 7, 8, 16);

    }


    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
