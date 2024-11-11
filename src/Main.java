public class Main{
    //точка входа в программу
        public static void main(String[] args) {
        //Cycle Tasks
        System.out.println("===== Task 1: Четные числа от 1 до 20 =====");
        CycleTasks.Task1();
        System.out.println("\n===== Task 2: Сумма чисел от 1 до 100 =====");
        CycleTasks.Task2();
        System.out.println("\n===== Task 3: Таблица умножения для числа 5 =====");
        CycleTasks.Task3();
        System.out.println("\n===== Task 4:Вывод целых чисел массива =====");
        CycleTasks.Task4();
        System.out.println("\n===== Task 5: Найти определенную букву =====");
        CycleTasks.Task5();

        //CIf-Else Tasks
        System.out.println("===== Task 1: Является ли заданное число положительным, отрицательным или равным нулю =====");
        IfElseTasks.Task1(10);
        IfElseTasks.Task1(-10);
        IfElseTasks.Task1(0);
        System.out.println("===== Task 2: Выводит большее из них. Если числа равны, программа должна вывести сообщение о равенстве =====");
        IfElseTasks.Task2(10, 9);
        IfElseTasks.Task2(8, 11);
        IfElseTasks.Task2(11, 11);
        System.out.println("===== Task 3: Високосный год =====");
        IfElseTasks.Task3(1943);
        IfElseTasks.Task3(2000);
        System.out.println("===== Task 4: Пустая или не пустая строка =====");
        IfElseTasks.Task4(" ");
        IfElseTasks.Task4("No empty");
        System.out.println("===== Task 5: Оценка =====");
        IfElseTasks.Task5(25);
        IfElseTasks.Task5(100);
    }
}