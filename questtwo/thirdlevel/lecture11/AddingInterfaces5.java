package questtwo.thirdlevel.lecture11;

import java.awt.*;

public class AddingInterfaces5 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public abstract static class Fox implements Animal{
        public String getName() {
            return "Fox";
        }

    }
}
