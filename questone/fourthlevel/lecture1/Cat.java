package questone.fourthlevel.lecture1;

public class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {
        this.name = name;
        //напишите тут ваш код

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
