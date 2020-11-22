package questtwo.sixthlevel.lecture10;

public class WithoutInterrupt {
    static boolean a = true;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        a = false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (a) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
