package _03_Operators;

public class OperatorsDemo {
    public static void main(String[] args){
        int a = 10, b=3;

        //Арифметические операторы
        System.out.println("Сложение: " + (a+b));
        System.out.println("Вычитание: " + (a-b));
        System.out.println("Умножение: " + (a*b));
        System.out.println("Деление: " + (a/b));
        System.out.println("Остаток: " + (a%b));

        //Операторы сравнения
        System.out.println("a > b? " + (a >b));
        System.out.println("a < b? " + (a <b));
        System.out.println("a >= b? " + (a >=b));
        System.out.println("a <= b? " + (a <=b));
        System.out.println("a == b? " + (a ==b));
        System.out.println("a != b? " + (a !=b));

        //Логические операторы
        boolean x = true, y = false;

        System.out.println("x && y: " + (x && y)); // Логическое И
        System.out.println("x || y: " + (x || y)); // Логическое ИЛИ
        System.out.println("!x: " + (!x)); // Логическое НЕ
        
        //Побитовые операторы
        int p = 5;  // 0101 в двоичной системе
        int q = 3;  // 0011 в двоичной системе

        System.out.println("p & q: " + (p & q)); // Побитовое И (0101 & 0011 = 0001)
        System.out.println("p | q: " + (p | q)); // Побитовое ИЛИ (0101 | 0011 = 0111)
        System.out.println("p ^ q: " + (p ^ q)); // Побитовое XOR (0101 ^ 0011 = 0110)
        System.out.println("~p: " + (~p)); // Побитовое НЕ (инверсия битов)
        System.out.println("p<<1:  " + (p<<1)); // Сдвиг влево (увеличение в 2 раза)
        System.out.println("p>>1:  " + (p>>1)); // Сдвиг вправо (деление на 2)

        //Тернарный оператор
        int min = (a<b) ? a : b;

        System.out.println("Минимальное значение: " + min);

        //Оператор instanceof
        String text = "Hello";
        System.out.println("Text instanceof String: " + (text instanceof String));
       
    }
}
