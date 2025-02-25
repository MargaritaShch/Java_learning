package COURSE_TASKS.Task_02;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Loops whileLoop = new While();
        Loops doWhileLoop = new DoWhile();
        Loops forLoop = new Fori();

        int number = 5;
        int[] array = {5, 3, 8, 1, 2};
        boolean isAsc = false;

        System.out.println("=== ЗАДАЧИ НА SUM ALL NUMBERS ===");
        System.out.println("While: " + whileLoop.sumAllNumbers(number));
        System.out.println("DoWhile: " + doWhileLoop.sumAllNumbers(number));
        System.out.println("For: " + forLoop.sumAllNumbers(number));
    
        System.out.println("\n=== ЗАДАЧИ НА FACTORIAL ===");
        System.out.println("While: " + whileLoop.factorial(number));
        System.out.println("DoWhile: " + doWhileLoop.factorial(number));
        System.out.println("For: " + forLoop.factorial(number));  

        System.out.println("\n=== ЗАДАЧИ ПО SORT ARRAYS WITH BOOLEAN ===");
        System.out.println("While: " + Arrays.toString(whileLoop.sort(array, isAsc)));
        System.out.println("DoWhile: " + Arrays.toString(doWhileLoop.sort(array, isAsc)));
        System.out.println("For: " + Arrays.toString(forLoop.sort(array, isAsc))); 

        System.out.println("\n=== ЗАДАЧИ ПО SORT ARRAYS ===");
    }
    
}
