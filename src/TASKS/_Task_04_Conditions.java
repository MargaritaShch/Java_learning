package TASKS;
import java.util.Scanner;

public class _Task_04_Conditions {
    public static void main(String[]  args){
    // Напиши программу, которая запрашивает у пользователя:Температуру (целое число) и говорит, тепло ли на улице:
    // t > 25 → "Жарко"
    // t от 10 до 25 → "Прохладно"
    // t < 10 → "Холодно"
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите температуру: ");
    int t = scanner.nextInt(); // Читает число
    
    if(t > 25){
        System.out.println("Жарко");
    } else if(t >=10 && t <= 25){
        System.out.println("Прохладно");
    } else{
        System.out.println("Прохладно");
    }
    
    // Месяц (число от 1 до 12) и говорит времена года (switch-case):
    // 1, 2, 12 → "Зима"
    // 3, 4, 5 → "Весна"
    // 6, 7, 8 → "Лето"
    // 9, 10, 11 → "Осень"
    System.out.print("Введите номер месяца: ");
    int month = scanner.nextInt();

    switch (month) {
        case 1,2,12:
            System.out.println("Зима");
            break;
        case 3, 4, 5:
            System.out.println("Весна");
            break;
        case 6, 7, 8:
            System.out.println("Лето");
            break;
        case 9, 10, 11:
            System.out.println("Осень");
            break;
        default:
            System.out.println("Некорректное число! Введите 1-12.");
       }

    scanner.close();
    }
}
