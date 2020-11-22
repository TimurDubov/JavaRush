package questone.eighthlevel.lecture3;

import java.util.HashSet;
import java.util.Set;

public class MakingSet {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        
        strings.add("арбуз");
        strings.add("банан");
        strings.add("вишня");
        strings.add("груша");
        strings.add("дыня");
        strings.add("ежевика");
        strings.add("женьшень");
        strings.add("земляника");
        strings.add("ирис");
        strings.add("картофель");

        for (String text :
                strings) {
            System.out.println(text);
        }
    }
    
    
}
