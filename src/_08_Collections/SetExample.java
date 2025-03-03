package _08_Collections;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        
        HashSet<String> uniqNames = new HashSet<>();

        uniqNames.add("Maria");
        uniqNames.add("Michael");
        uniqNames.add("Tom");

        System.out.println("Get set: "+ uniqNames);

        uniqNames.remove("Maria");
        System.out.println("Delete: " + uniqNames);

        System.out.println("Size: " + uniqNames.size());

        //проверка наличия элемента
        System.out.println(uniqNames.contains("Maria"));
    }
}
