package questone.fifthlevel.lecture9;

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;


    public Cat(String name){
        this.name = name;
        weight = 10;
        age = 5;
        color = "Черный";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "Черный";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        weight = 10;
        color = "Черный";
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 5;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 5;
    }

    public static void main(String[] args) {

    }
}
