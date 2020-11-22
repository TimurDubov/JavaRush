package questone.sixthlevel.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VeryDifficultOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String uncleName = reader.readLine();
        Cat catUncle = new Cat(uncleName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catUncle);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrandmother,null);


        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catUncle);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            String m = parent1!=null ? ", mother is " + parent1.name : ", no mother";
            String f = parent2!=null ? ", father is " + parent2.name : ", no father";
            return "The cat's name is " + name + m + f;

        }
    }

}
