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
        if (b <= 1) {
            return 1;
        }

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
    public int[] sort(int[] ints, boolean isAsc){
        int[] sortArr = Arrays.copyOf(ints, ints.length);
        //сортировка по возрастанию
        Arrays.sort(sortArr);
        int i = 0;
        if(isAsc == false){
            while(i < sortArr.length / 2){
                int temp = sortArr[i];
                    sortArr[i] = sortArr[sortArr.length - 1 - i];
                    sortArr[sortArr.length - 1 - i] = temp;
                    i++;
            }
        }  
        return sortArr;
    }
}
