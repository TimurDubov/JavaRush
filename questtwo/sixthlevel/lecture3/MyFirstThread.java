package questtwo.sixthlevel.lecture3;

public class MyFirstThread {

    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();


    }

    public static class TestThread implements Runnable{

        @Override
        public void run() {
            System.out.println("My first thread");
        }


    }

}
