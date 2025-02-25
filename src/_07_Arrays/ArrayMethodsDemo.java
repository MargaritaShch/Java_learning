package _07_Arrays;
import java.util.Arrays;

public class ArrayMethodsDemo {
    //Метод для поиска минимального элемента массива
    public static int findMin(int[] arr){
        int min = arr[0];
        //for each
        for(int num : arr){
            if(num <min){
                min=num;
            }
        }
        return min;
    }

    //Метод для поиска максимального элемента массива
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(num >max){
                max=num;
            }
        }
        return max;
    }

    //Метод для сортировки массива по возрастанию
    public static int[] sortAsc(int[] arr){
        //копия массива
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        return sorted;
    }

    //Метод для сортировки массива по возрастанию
    public static int[] sortDes(int[] arr){
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        //проход по половине массива
        for(int i = 0; i < sorted.length / 2 ; i++){
            //первый элемент
            int temp = sorted[i];
            //последнее значение массива
            sorted[i] = sorted[sorted.length - 1 - i];
            //последний элемент записываем в первый 
            sorted[sorted.length - 1 -i] = temp;
        }
        return sorted;
    }


    public static void main(String[] args) {
        int[] nummbes = {1,2,3,4,5,6,7,8};
        int[] nummbes2 = {3, 1,2,4,7,5,6,8};
        System.out.println("Исходный массив: " + Arrays.toString(nummbes));
        System.out.println("Минимальное знаечние  в масиве: " + findMin(nummbes));
        System.out.println("Максимальное знаечние  в масиве: " + findMax(nummbes));
        System.out.println("Сортированныq массив по возрастанию: " + Arrays.toString(sortAsc(nummbes2)));
        System.out.println("Сортированныq массив по убыванию: " + Arrays.toString(sortDes(nummbes2)));
    }
}
