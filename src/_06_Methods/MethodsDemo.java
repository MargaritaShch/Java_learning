package _06_Methods;

public class MethodsDemo {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int max(int a, int b){
        return (a>b) ? a : b;
    }

    public static void main(String[] args) {
        System.err.println("Сумма 5 и 11: "+ sum(5,11));
        System.err.println("Умножение 2 и 7: "+ multiply(2,7));
        System.err.println("Максимум из 24 и 21: "+ max(24,21));
    }
}
