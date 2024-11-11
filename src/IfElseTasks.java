public class IfElseTasks {
// Задача 1:
// Напишите программу, которая проверяет, является ли заданное число положительным, отрицательным или равным нулю, и выводит соответствующее сообщение.
public static void Task1(int x){
    if(x > 0){
        System.out.print("Positiv");
    } else if(x < 0){
        System.out.println("Negativ");
    } else{
        System.out.println("Zero");
    }
}

// Задача 2:
// Напишите программу, которая принимает два числа и выводит большее из них. Если числа равны, программа должна вывести сообщение о равенстве.
public static void Task2(int x, int y){
    if(x > y){
        System.out.print(x);
    } else if(x == y){
        System.out.println("Equals");
    } else {
        System.out.println(y);
    }
}
// Задача 3:
// Напишите программу, которая проверяет, является ли введенный год високосным. Високосный год делится на 4, но не делится на 100, за исключением тех случаев, когда он также делится на 400.
public static void Task3(int year){
    if(year % 400 == 0){
        System.out.println("Висосоксный год");
    } else if(year % 100 == 0 ){
        System.out.println("НЕ Висосоксный год");
    } 
    else if(year % 4 == 0 ){
        System.out.println("Висосоксный год");
    } else{
        System.out.println("НЕ висосоксный год");
    }
}
// Задача 4:
// Напишите программу, которая проверяет, является ли введенная строка пустой (не содержит символов) или не пустой, и выводит соответствующее сообщение.
public static void Task4(String str){
    if(str.trim().isEmpty()){
        System.out.println("Строка пустая");
    }  else{
        System.out.println("Строка не пустая");
    }
}
// Задача 5:
// Напишите программу, которая принимает оценку (целое число от 0 до 100) и выводит сообщение о категории оценки (например, "Отлично", "Хорошо", "Удовлетворительно" или "Неудовлетворительно") на основе определенного диапазона значений.
public static void Task5(int num){
    if(num >= 0 && num <= 25){
        System.out.println("Неудовлетворительно");
    }  else if(num > 25 && num <=50){
        System.out.println("Удовлетворительно");
    }
    else if(num > 50 && num <=75){
        System.out.println("Хорошо");
    }
    else if(num > 75 && num <=100){
        System.out.println("Отлично");
    } else{
        System.out.println("Число должно быть от 0 до 100 включительно");
    }
}
}
