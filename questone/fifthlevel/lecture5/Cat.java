package questone.fifthlevel.lecture5;

public class Cat {
    int age;
    int weight;
    int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int a = 0;
        int b = 0;

        if (this.age > anotherCat.age){
            ++a;
        } else if (this.age < anotherCat.age){
            ++b;
        }

        if (this.weight > anotherCat.weight){
            ++a;
        } else if (this.weight < anotherCat.weight){
             ++b;
        }

        if (this.strength > anotherCat.strength){
            ++a;
        } else if (this.strength < anotherCat.strength){
            ++b;
        }

        if (a > b){
            return true;
        } else return false;
        //напишите тут ваш код
    }



    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.age = 13;
        cat1.weight = 32;
        cat1.strength = 36;
        cat2.age = 13;
        cat2.weight = 32;
        cat2.strength = 36;

        System.out.println(cat1.fight(cat2));



    }
}
