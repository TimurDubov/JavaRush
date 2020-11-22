package questone.eighthlevel.lecture11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakingPeople {
    public static void main(String[] args) {

        Human Children = new Human("Kids1",false,12);
        Human Children1 = new Human("Kids2",false,12);
        Human Children2 = new Human("Kids3",false,12);
        Human Father = new Human("Father", true, 58, Children,Children1,Children2);
        Human Mother = new Human("Mother", false, 58,Children,Children1,Children2);
        Human GrandFather1 = new Human("GrandFather1", true, 58, Mother);
        Human GrandFather2 = new Human("GrandFather2", true, 58, Father);
        Human GrandMother1 = new Human("GrandMother1", false, 58,Father);
        Human GrandMother2 = new Human("GrandMother2", false, 58,Mother);

        System.out.println(GrandFather1.toString());
        System.out.println(GrandFather2.toString());
        System.out.println(GrandMother1.toString());
        System.out.println(GrandMother2.toString());
        System.out.println(Father.toString());
        System.out.println(Mother.toString());
        System.out.println(Children.toString());
        System.out.println(Children1.toString());
        System.out.println(Children2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age , Human ... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = Arrays.asList(children);
        }
        public Human(String name) {
            this.name = name;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}