package questtwo.sixthlevel.lecture10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSeconds {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            seconds = 0;
            try {
                while (true){
                    Thread.sleep(1000);
                    seconds++;
                    if (interrupted()){
                        System.out.println(seconds);
                    }
                }
                //add your code here - добавьте код тут
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}

