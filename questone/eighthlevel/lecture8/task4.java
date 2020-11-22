package questone.eighthlevel.lecture8;

import java.util.HashSet;
import java.util.Set;

public class MakingSet {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("л" + i);
        }
        return set;
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
