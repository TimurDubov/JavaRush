package questone.eighthlevel.lecture11;


import java.util.HashSet;
import java.util.Set;

public class JoinCatsAndDogs {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> resultDogs = new HashSet<>();

        resultDogs.add(new Dog());
        resultDogs.add(new Dog());
        resultDogs.add(new Dog());
        //напишите тут ваш код
        return resultDogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {

        Set<Object> catsAndDogs = new HashSet<>();

        catsAndDogs.addAll(cats);
        catsAndDogs.addAll(dogs);

        //напишите тут ваш код
        return catsAndDogs;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {

        pets.removeAll(cats);
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {

        for (Object o : pets){
            System.out.println(o);
        }
        //напишите тут ваш код
    }

    public static class Cat {

    }
    public static class Dog {

    }
    //напишите тут ваш код
}

