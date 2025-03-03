package _08_Collections;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap <String, Integer> ages = new HashMap<>();

        ages.put("Stephan", 25);
        ages.put("Victor", 32);
        ages.put("Josh", 41);

        System.out.println("Возраст Стефана: "+ages.get("Stephan"));

        //получить все ключи
        System.out.println("Все люди: "+ages.keySet());

        //получить все значения
        System.out.println("Все люди: "+ages.values());

        //добавить/обновить элемент
        ages.put("Mark", 23);
        System.out.println("Все люди: "+ ages);
    }
}
