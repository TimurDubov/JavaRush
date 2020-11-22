package questone.ninthlevel.lecture2;

public class LoggingStackTrace {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName() + ": " + Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + s);



    }
}

