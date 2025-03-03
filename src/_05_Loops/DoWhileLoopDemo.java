package _05_Loops;
import java.util.Scanner;

public class DoWhileLoopDemo {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input;

        do{
            System.out.println("Введите команду учше для входа: ");
            input = scanner.nextLine();
        } while (!input.equals("exit"));

        System.out.println("Выход из программы");
        scanner.close();
    }
   
}
