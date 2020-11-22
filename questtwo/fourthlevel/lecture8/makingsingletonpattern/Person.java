package questtwo.fourthlevel.lecture8.makingsingletonpattern;

public class Person {

    private static Person singleton = null;

    private Person(){

    }

    public static Person getPerson(){
        if (singleton == null){
            singleton = new Person();
        }
        return singleton;
    }



}
