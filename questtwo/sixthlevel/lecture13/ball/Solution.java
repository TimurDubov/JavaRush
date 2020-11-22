package questtwo.sixthlevel.lecture13.ball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);


    static {
        threads.add(new A1());
        threads.add(new B2());
        threads.add(new C3());
        threads.add(new D4());
        threads.add(new E5());
    }

    public static void main(String[] args) {



    }

    public static class A1 extends Thread{
        @Override
        public void run() {
            while (true){

            }
        }
    }
    public static class B2 extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class C3 extends Thread{

        @Override
        public void run() {
            try {
                while (true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class D4 extends Thread implements Message{


        boolean bool = true;
        @Override
        public void run() {
            while (bool){

            }

        }

        @Override
        public void showWarning() {
            bool = false;
        }


    }
    public static class E5 extends Thread{

        @Override
        public void run() {
            int a = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                while (true){
                    String s = reader.readLine();
                    if (s.equals("N")){
                        break;
                    } else a = a + Integer.parseInt(s);
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            System.out.println(a);
        }
    }


}