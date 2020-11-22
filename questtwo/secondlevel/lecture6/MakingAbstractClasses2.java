package questtwo.secondlevel.lecture6;

public class MakingAbstractClasses2 {
    public static void main(String[] args) {

    }

    public abstract static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}

