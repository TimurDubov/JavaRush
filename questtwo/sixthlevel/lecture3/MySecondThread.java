package questtwo.sixthlevel.lecture3;

public class MySecondThread {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread{

        static {
            System.out.println("it's a static block inside TestThread");
        }

        @Override
        public void run(){
            System.out.println("it's a run method");
        }
    }
}

