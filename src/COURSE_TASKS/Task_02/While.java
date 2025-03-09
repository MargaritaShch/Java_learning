package COURSE_TASKS.Task_02;

import java.util.Arrays;

public class While implements Loops{
/* TODO разработать метод sumAllNumbers
1. Метод должен возвращать сумму всех чисел от 1 до а (включительно)
2. реализовать в 3 классах: While
*/  
    @Override
    public int sumAllNumbers(int a) {
        int sum = 0;
        int num = 1;

        while(num<=a){
            sum +=num;
            num++;
        }
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

        if (b == 0) return 1;

        while(num <=b){
            result *= num;
            num++;
        }
        return result;
    }

/* TODO разработать метод sort
1. Метод должен возвращать отсортированный массив чисел
2. если isAsc - true, то сортировка должна быть по возрастанию, иначе наоборот
*/
    @Override
    public int[] sort(int[] ints, boolean isAsc) {
        Arrays.sort(ints); 

        //по убыв
        if (!isAsc) { 
            int i = 0;
            while (i < ints.length / 2) {
                int temp = ints[i];
                ints[i] = ints[ints.length - 1 - i];
                ints[ints.length - 1 - i] = temp;
                i++;
            }
        }
        return ints;
    }

/* TODO разработать метод sort
1. Метод должен возвращать отсортированный массив чисел
2. Отсортированный массив должен быть по убыванию
*/
    @Override
    public int[] sort(int[] ints) {
        Arrays.sort(ints); 
        int i = 0;
        
        while (i < ints.length / 2) {
            int temp = ints[i];
            ints[i] = ints[ints.length - 1 - i];
            ints[ints.length - 1 - i] = temp;
            i++;
        }

        return ints;
    }
}
