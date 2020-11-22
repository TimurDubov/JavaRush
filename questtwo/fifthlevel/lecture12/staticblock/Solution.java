package questtwo.fifthlevel.lecture12.staticblock;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();

        //add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = reader.readLine();
            if (s.equals("helicopter")){
                result = new Helicopter();
            } else if (s.equals("plane")){
                int a = Integer.parseInt(reader.readLine());
                result = new Plane(a);

            }
            reader.close();

        } catch (IOException e) {

        }

        //add your code here - добавьте код тут
    }
}
