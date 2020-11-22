package questone.fourthlevel.lecture1;

public class SumPriceOfApples {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {

            Apple.applesPrice = Apple.applesPrice +applesPrice;
            //напишите тут ваш код

        }
    }
}
