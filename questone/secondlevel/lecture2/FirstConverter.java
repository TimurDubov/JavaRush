package questone.secondlevel.lecture2;

public class FirstConverter {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {

        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
        return fahrenheit;

    }
}
