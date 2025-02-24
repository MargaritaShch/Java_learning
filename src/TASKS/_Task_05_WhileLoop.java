package TASKS;

public class _Task_05_WhileLoop {
    //Находит сумму всех чётных чисел от 1 до 100.
    public static void main(String[] args) {
        int num = 2;
        int result = 0;

        while(num <= 100){
            result += num;
            num+=2; 
        }
        System.out.println("Сумма всех ченых чисел:" + result); 
    }
}
