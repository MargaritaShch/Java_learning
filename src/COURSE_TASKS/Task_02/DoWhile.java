package COURSE_TASKS.Task_02;

import java.util.Arrays;
import java.util.Scanner;

public class DoWhile implements Loops {
/* TODO разработать метод sumAllNumbers
1. Метод должен возвращать сумму всех чисел от 1 до а (включительно)
2. реализовать в 3 классах:  DoWhile
*/
    @Override
    public int sumAllNumbers(int a) {
        int sum = 0;
        int num =1;

        do{
            sum+=num;
            num++;
        } while (num<=a);

        return sum;
    }

/* TODO разработать метод factorial
1. Метод должен возвращать факториал от числа b < 10
2. реализовать в 3 классах: While, DoWhile, For
*/
    @Override
    public long factorial(int b) {
        int num = 1;
        long result = 1;
        
       //искл.
        if (b < 0 || b >= 10) {
            throw new IllegalArgumentException("ERROR: b must be in the range [0, 9]");
        }

        //0! = 1
        if (b == 0) return 1;

        do{
            result *= num;
            num++;
        }
        while(num <=b);
            
        return result;
    }


/* TODO разработать метод sort
1. Метод должен возвращать отсортированный массив чисел
2. если isAsc - true, то сортировка должна быть по возрастанию, иначе наоборот
*/
    @Override
    public int[] sort(int[] ints, boolean isAsc) {
        Arrays.sort(ints); 

        //по убыв.
        if (!isAsc) { 
            int i = 0;
            do {
                int temp = ints[i];
                ints[i] = ints[ints.length - 1 - i];
                ints[ints.length - 1 - i] = temp;
                i++;
            } while (i < ints.length / 2);
        }
        return ints;
    }

/* TODO разработать метод sort
1. Метод должен возвращать отсортированный массив чисел
2. Отсортированный массив должен быть по убыванию
*/
    public int[] sort(int[] ints) {
        return sort(ints, false); 
    }
}
