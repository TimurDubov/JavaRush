package questtwo.thirdlevel.lecture11;

import java.awt.*;

public class AddingInterfaces6 {

    public static void main(String[] args) throws Exception {
    Fox bigFox = new BigFox();
    System.out.println(bigFox.getName());
    System.out.println(bigFox.getColor());
}

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }

    }

    public static class BigFox extends Fox {

        @Override
        public Color getColor() {
            return null;
        }
    }

}


