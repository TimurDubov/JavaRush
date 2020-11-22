package questone.fifthlevel.lecture7;

public class Cat {

    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name){
        this.name = name;
        this.age = 10;
        this.weight = 12;
        this.color = "Черный";
    }


    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Черный";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 12;
        this.color = "Черный";
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.color = "Черный";
    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 10;
    }





    public static void main(String[] args) {

    }
}
