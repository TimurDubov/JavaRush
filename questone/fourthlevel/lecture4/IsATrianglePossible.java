package questone.fourthlevel.lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsATrianglePossible {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();

        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);

        if (a + b > c && a + c > b && b + c > a){
            System.out.println("Треугольник существует");
        } else System.out.println("Треугольник не существует");
    }
}
