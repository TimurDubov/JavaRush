package questone.fifthlevel.lecture9;

public class Friend {

    String name;
    int age;
    char sex;

    public Friend(String name){
        this.name = name;

    }
    public Friend(String name, int age){
        this.name = name;
        this.age = age;

    }
    public Friend(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public static void main(String[] args) {
        Friend friend1 = new Friend("Вася");

        System.out.println(friend1.name);

    }
}
