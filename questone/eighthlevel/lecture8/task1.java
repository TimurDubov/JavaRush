package questone.eighthlevel.lecture8;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AddingAndDeletingNumbersInSet {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
        // напишите тут ваш код

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {

        Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()){
            if (integerIterator.next() > 10){
                integerIterator.remove();
            }
        }
        return set;
        // напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
