package questone.thirdlevel.lecture8;

public class SumFromNumbers {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }

    public static int sumDigitsInNumber(int number) {

        String sLength = String.valueOf(number);
        int nLength = sLength.length();

        int a = 0;

        for (int i = 0; i < nLength; i++) {
                a = a + (number % 10);
                number = number / 10;
        }
        return a;
    }
}
