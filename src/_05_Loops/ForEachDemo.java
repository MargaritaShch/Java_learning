package _05_Loops;

public class ForEachDemo {
    public static void main(String[] args){
        int[] numbers = {145, 342, 2343, 423, 23, 96, 11, 20, 590, 1457};

        for(int number : numbers){
            if(number%3==0){
                System.out.println("Четные числа: "+ number+' ');
            }
        }
    }
}
