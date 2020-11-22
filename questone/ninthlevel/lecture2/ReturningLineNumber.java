package questone.ninthlevel.lecture2;

public class ReturningLineNumber {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }


    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        for (StackTraceElement element:
                stackTraceElements
             ) {
            System.out.println(element.getLineNumber());

        }
        return  stackTraceElements[2].getLineNumber();
    }
}
