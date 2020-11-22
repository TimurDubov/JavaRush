package questtwo.sixthlevel.lecture13;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();

        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable{
        private int startValue = 1;
        private int countIndexUp = Solution.number;

        @Override
        public void run() {
            try {
                while (true){
                    System.out.println(toString());
                    startValue++;
                    if (startValue > countIndexUp){
                        Thread.sleep(500);
                        break;
                    }

                }
            } catch (InterruptedException e){

            }
        }

        @Override
        public String toString() {
            return Thread.currentThread().getName() + ": " + startValue;
        }

        //Add your code here - добавь код тут
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
