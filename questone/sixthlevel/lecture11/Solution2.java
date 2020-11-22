package questone.sixthlevel.lecture11;

public class Solution2 {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());

    }


    public static class Idea {
        public String getDescription(){
            return "I think i am starting to hate Java :((((";
        }
    }

    //напишите тут ваш код
}

