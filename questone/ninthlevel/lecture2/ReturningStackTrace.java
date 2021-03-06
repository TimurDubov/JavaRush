package questone.ninthlevel.lecture2;

public class ReturningStackTrace {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        return Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        return Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }
}
