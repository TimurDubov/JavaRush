package questtwo.secondlevel.lecture6;

public class MakingAbstractClasses5 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        @Override
        public String getName(){
            return "Кошка";
        }

        @Override
        public Pet getChild(){

            return null;
        }
    }

    public static class Dog extends Pet{
        @Override
        public String getName(){
            return "Собака";
        }

        @Override
        public Pet getChild(){

            return null;
        }

    }

}

