package _04_Conditions;
import java.util.Scanner;

public class IfElseAndSwitchDemo {
    public static void main(String[] args){
        //класс, который умеет читать ввод с клавиатуры
        Scanner scanner = new Scanner(System.in);

        //if-else
        System.out.print("Введите число: ");
        //поток ввода, который читает текст с клавиатуры
        int num = scanner.nextInt(); // Читает число

        if(num >0 ){
            System.out.println("Положиетльное число");
        } else if(num <0){
            System.out.println("Отрицательное число");
        } else {
            System.out.println("НОЛЬ");
        }

       //Switch-case
       System.out.print("Введите день недели (1-7): ");
       int day = scanner.nextInt();

       switch (day) {
        case 1:
            System.out.println("Понедельник");
            break;
        case 2:
            System.out.println("Вторник");
            break;
        case 3:
            System.out.println("Среда");
            break;
        case 4:
            System.out.println("Четверг");
            break;
        case 5:
            System.out.println("Пятница");
            break;
        case 6:
            System.out.println("СУббота");
            break;
        case 7:
            System.out.println("Воскресенрье");
            break;
        default:
            System.out.println("Некорректное число! Введите 1-7.");
       }

    scanner.close();
    }
}
