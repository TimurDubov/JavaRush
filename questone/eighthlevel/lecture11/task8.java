package questone.eighthlevel.lecture11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemovingACat  {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();

        cats.remove(iterator.next());

        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        //напишите тут ваш код. step 2 - пункт 2
        return set;
    }

    public static void printCats(Set<Cat> cats) {

        for (Cat s : cats){
            System.out.println(s);
        }

        // step 4 - пункт 4
    }

    // step 1 - пункт 1

    public static class Cat{

    }
}


