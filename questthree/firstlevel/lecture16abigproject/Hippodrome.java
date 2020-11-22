package questthree.firstlevel.lecture16abigproject;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses = new ArrayList<>();

    static Hippodrome game;

    public Hippodrome(List list){

        horses = list;
    }
    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {

        List<Horse> horses1 = new ArrayList<>();
        horses1.add(new Horse("\uD83D\uDC0E",3.0,0));
        horses1.add(new Horse("\uD83D\uDC0E",3.0,0));
        horses1.add(new Horse("\uD83D\uDC0E",3.0,0));

        game = new Hippodrome(horses1);

        game.run();

        game.printWinner();
    }


    public void move(){
        horses.get(0).move();
        horses.get(1).move();
        horses.get(2).move();
    }

    public void run(){

        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void print(){

        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }

        for (int i = 0; i < 8; i++) {
            System.out.println();
        }
    }


    public Horse getWinner(){

        Horse horse = horses.get(0);

        for (int i = 0; i < horses.size() - 1; i++) {
            if (horses.get(i).distance < horses.get(i+1).distance){
                horse = horses.get(i+1);
            }
        }
        return horse;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().name + "!");
    }


}
