package questone.fifthlevel.lecture5;

public class CatsFight {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Васька", 4, 10, 15);
        Cat cat2 = new Cat("Дашка", 3, 6, 12);
        Cat cat3 = new Cat("Машка", 7, 8, 16);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat1.fight(cat3));
        //напишите тут ваш код
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
