package _08_Collections;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        //создание списка
        ArrayList<String> names = new ArrayList<>();

        //добавление эл-ов
        names.add("Mark");
        names.add("Jessica");
        names.add("John");

        System.out.println("List: " + names);

        //get index
        System.out.println("First index: " + names.get(0));

        //удвление эл-та
        names.remove("Jessica");
        System.out.println("After remove: " + names);
    }
}
