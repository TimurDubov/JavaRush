package questone.sixthlevel.lecture8;

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
        //напишите тут ваш код

    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;

        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
