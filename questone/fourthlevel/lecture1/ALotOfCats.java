package questone.fourthlevel.lecture1;

public class ALotOfCats {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        Cat.count++;
        //напишите тут ваш код

        Cat cat2 = new Cat();
        Cat.count++;
        //напишите тут ваш код

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
