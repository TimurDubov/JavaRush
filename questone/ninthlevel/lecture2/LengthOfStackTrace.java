package questone.ninthlevel.lecture2;

public class LengthOfStackTrace {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        int a = stack.length;
        System.out.println(a);
        return a;
        //напишите тут ваш код
    }
}

