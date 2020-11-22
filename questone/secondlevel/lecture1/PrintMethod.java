package questone.secondlevel.lecture1;

public class PrintMethod {
    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");

    }

    public static void print(String s) {

        for (int i = 0; i < 4; i++) {
            System.out.println(s);
        }
        //В задании нужно было вызвать метод print в методе main
        //Чтобы он сработал несколько раз посредством цикла
    }
}
