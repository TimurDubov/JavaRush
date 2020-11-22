package questone.fourthlevel.lecture6;

public class ALotOfCycles {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        while (a < 11){
            b = 0;
            while (b < 10){
                ++b;
                System.out.print(b * a + " ");
            }
            System.out.println();
            ++a;
        }
    }
}
