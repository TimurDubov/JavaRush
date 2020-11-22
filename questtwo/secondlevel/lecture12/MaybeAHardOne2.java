package questtwo.secondlevel.lecture12;

public class MaybeAHardOne2 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {

        if (o instanceof Tiger) {
            Tiger a = (Tiger) o;
            return a.name();
        } else if (o instanceof Lion){
            Lion a = (Lion) o;
            return a.name();
        } else if (o instanceof Bull){
            Bull a = (Bull) o;
            return a.name();
        } else if (o instanceof Cow){
            Cow a = (Cow) o;
            return a.name();
        } else if (o instanceof Cat) {
            Cat a = (Cat) o;
            return a.name();
        } else if (o instanceof Animal){
            Animal a = (Animal) o;
            return a.name();
        } else return "";

    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
        @Override
        public String name(){
            return "Кот";
        }
    }

    public static class Tiger extends Cat {

        @Override
        public String name(){
            return "Тигр";
        }
    }

    public static class Lion extends Cat {
        @Override
        public String name(){
            return "Лев";
        }
    }

    public static class Bull extends Animal {
        @Override
        public String name(){
            return "Бык";
        }
    }

    public static class Cow extends Animal {
        @Override
        public String name(){
            return "Корова";
        }
    }

    public static class Animal {

        public  String name(){
            return "Животное";
        }
    }
}

