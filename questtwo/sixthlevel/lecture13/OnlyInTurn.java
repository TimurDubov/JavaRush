package questtwo.sixthlevel.lecture13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OnlyInTurn {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }


    public static class Read3Strings extends Thread{
        ArrayList<String> arrayList = new ArrayList<>();
        @Override
        public void run() {

            try {
                for (int i = 0; i < 3; i++) {
                    arrayList.add(reader.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        void printResult(){
            String s = "";

            for (int i = 0; i < arrayList.size(); i++) {
                if (i < arrayList.size() - 1){
                    s = s + arrayList.get(i) + " ";
                } else s = s + arrayList.get(i);

            }
            System.out.println(s);
        }

    }

    //add your code here - добавьте код тут
}

