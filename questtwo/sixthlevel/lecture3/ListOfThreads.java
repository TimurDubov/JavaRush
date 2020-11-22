package questtwo.sixthlevel.lecture3;

import java.util.ArrayList;
import java.util.List;

public class ListOfThreads {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));


        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}

