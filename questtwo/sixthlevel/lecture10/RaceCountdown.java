package questtwo.sixthlevel.lecture10;

public class RaceCountdown {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();

        Thread.sleep(3500);
        clock.interrupt();


        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {

            try{
                while (true){

                    if (numSeconds > 0){
                        System.out.println(numSeconds);
                        numSeconds--;
                        Thread.sleep(1000);

                    } else {
                        System.out.println("Марш!");
                        break;
                    }

                }
            } catch (InterruptedException e){
                System.out.println("Прервано!");
            }

            //add your code here - добавь код тут
        }
    }
}
