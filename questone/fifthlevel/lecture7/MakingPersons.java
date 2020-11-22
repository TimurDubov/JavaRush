package questone.fifthlevel.lecture7;

public class MakingPersons {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.initialize("Вася", 18);
        //напишите тут ваш код
    }

    static class Person {
        String name;
        int age;


        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
        //напишите тут ваш код
    }

}
