package questtwo.sixthlevel.lecture3;

import java.util.Date;

public class TalkingAboutMusic {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        @Override
        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        @Override
        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }

        @Override
        public void run() {
            Date startTime;
            Date endTime;
            startTime = startPlaying();
            long a = startTime.getTime();
            sleepNSeconds(1);
            endTime = stopPlaying();
            long b = endTime.getTime();
            System.out.println("Playing " + (b - a) + " ms");
        }
    }
}

