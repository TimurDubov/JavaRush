package questone.seventhlevel.lecture12;

public class Solution {
    public static void main(String[] args) {


        Human human1 = new Human("валя",false,90);
        Human human2 = new Human("Галя", false, 80);
        Human human3 = new Human("Uncle1", true,70);
        Human human4 = new Human("Uncle2", true, 60);
        Human human5 = new Human("Mom", false,40,human3, human1);
        Human human6 = new Human("Father", true, 41, human4, human2);
        Human human7 = new Human("Son", true, 10,human6, human5);
        Human human8 = new Human("Аня", false,21, human6,human5);
        Human human9 = new Human("Катя", false, 19, human6, human5);



        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
        // напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        // напишите тут ваш код

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}