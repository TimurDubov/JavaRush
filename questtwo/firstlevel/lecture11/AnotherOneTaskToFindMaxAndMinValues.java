package questtwo.firstlevel.lecture11;

public class AnotherOneTaskToFindMaxAndMinValues {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > minValue){
                minValue = inputArray[i];

            }

        }

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < maxValue){
                maxValue = inputArray[i];

            }
        }
        // напишите тут ваш код

        return new Pair<Integer, Integer>(maxValue, minValue);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}

