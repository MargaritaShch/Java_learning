package TASKS;
import java.util.Scanner;

public class _Task_05_DoWhileLoop {
    //Запрашивает у пользователя ввод числа, пока он не введёт отрицательное значение.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;

        do{
            System.out.print("Введите число: ");
            num = scanner.nextInt();
        }while(num > 0 );
            System.out.println("Выход из программы");
            scanner.close();
    }
}
