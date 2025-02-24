package TASKS;

public class _Task06_Methods {
    public static double division(int num1, int num2){
        if(num2 == 0){
            System.out.println("Делить на ноль нельзя");
        } 
        return(double) num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println("Результат деления: " + division(6, 3));
    }
}
