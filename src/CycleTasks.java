public class CycleTasks {
// Задача 1:
// Напишите программу, которая выводит на экран все четные числа от 1 до 20.
public static void Task1(){
    for (int i =0; i < 21; i++){
        if(i%2==0){
            System.out.println(i);
        }
    }
}
// Задача 2:
// Напишите программу, которая считает сумму чисел от 1 до 100 и выводит результат.
public static void Task2(){
    int sum  = 0;
    for (int i =0; i < 101; i++){
        sum += i;
    }
    System.out.println(sum);
}

// Задача 3:
// Напишите программу, которая выводит таблицу умножения для числа 5 (например, 5 x 1 = 5, 5 x 2 = 10 и так далее до 5 x 10).
public static void Task3(){
    int num = 5;
    for(int i = 0; i<=10; i++){
       int result = num * i;
       System.out.println(result);
    }
}

// Задача 4:
// Напишите программу, которая выводит все элементы массива целых чисел [3, 5, 7, 9, 11] с использованием for-цикла.
public static void Task4(){
    int [] arr= {3, 5, 7, 9, 11};
    for(int i = 0; i<arr.length; i++){
        System.out.println(arr[i]);
       };
    }
// Задача 5:
// Напишите программу, которая считает количество символов 'a' в строке "banana" с использованием for-цикла.
public static void Task5(){
    String str = "banana";
    char[] StringArray = str.toCharArray();
    int sum  = 0;
    for(int i = 0; i<StringArray.length; i++){
        if(StringArray[i] == 'a'){
           sum += 1;
        }
       };
       System.out.println(sum);
    }
}


