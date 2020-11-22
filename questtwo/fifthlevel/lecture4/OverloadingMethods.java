package questtwo.fifthlevel.lecture4;

public class OverloadingMethods {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(short m, int n, String s) {
        System.out.println(m + n + s);
    }
    public static void printMatrix(long m, long n, Object value){
        System.out.println("test1");
    }

    public static void printMatrix(Integer m, Integer n, Object value){
        System.out.println("test2");
    }

    public static void printMatrix(Integer m, int n, Object value){
        System.out.println("test3");
    }

    public static void printMatrix(int m, Integer n, String value){
        System.out.println("test3");
    }

    public static void printMatrix(int m, Integer n, Object value){
        System.out.println("test3");
    }

    public static void printMatrix(long m, Integer n, String value){
        System.out.println("test3");
    }

    public static void printMatrix(Double m, Integer n, String value){
        System.out.println("test3");
    }
}
