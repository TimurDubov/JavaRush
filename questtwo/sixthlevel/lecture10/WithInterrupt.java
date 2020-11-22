package questtwo.sixthlevel.lecture10;

public class WithInterrupt {

    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
        //Add your code here - добавь код тут
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {

        @Override
        public void run() {

        }
    }
}
