package COURSE_TASKS.Task_02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fori implements Loops {
/* TODO разработать метод sumAllNumbers
1. Метод должен возвращать сумму всех чисел от 1 до а (включительно)
2. реализовать в 3 классах: For
*/
    @Override
    public int sumAllNumbers(int a) {
        int sum = 0;

        for(int i = 1; i<=a; i++){
            sum +=i;
        }
        return sum;
    }

/* TODO разработать метод factorial
1. Метод должен возвращать факториал от числа b < 10
2. реализовать в 3 классах: While, DoWhile, For
*/
    @Override
    public long factorial(int b) {
        long result = 1;

        //искл. 
        if (b <= 1) {
            return 1;
        }

        for(int i = 1; i<=b; i++){
                result *= i;
        }      
        return result;
    }

/* TODO разработать метод sort
1. Метод должен возвращать отсортированный массив чисел
2. если isAsc - true, то сортировка должна быть по возрастанию, иначе наоборот
*/
    @Override
    public int[] sort(int[] ints, boolean isAsc){
        int[] sortArr = Arrays.copyOf(ints, ints.length);
        //сортировка по возрастанию
        Arrays.sort(sortArr);
        if(isAsc == false){
            for(int i = 0; i < sortArr.length / 2; i++){
                int temp = sortArr[i];
                sortArr[i] = sortArr[sortArr.length - 1 - i];
                sortArr[sortArr.length - 1 - i] = temp;
            }    
        }
        return sortArr;
    }

/* TODO разработать метод sort
1. Метод должен возвращать отсортированный массив чисел
2. Отсортированный массив должен быть по убыванию
*/
    @Override
    public int[] sort(int[] ints){
        int[] arr = Arrays.copyOf(ints, ints.length);
        Arrays.sort(arr);
        for(int i = 0; i<arr.length /2 ; i++){
            int temp = arr[i];
            arr[0] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
       

}