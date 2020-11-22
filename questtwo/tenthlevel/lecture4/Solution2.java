package questtwo.tenthlevel.lecture4;

import java.io.Serializable;

public class Solution2 {

    public static void main(String[] args) {

    }


    public static class Object implements Serializable {
        public String string1;
        public String string2;


    }

    public static int stringCount;

    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }

    }


}
