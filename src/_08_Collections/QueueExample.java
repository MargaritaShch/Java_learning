package _08_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>() ;

        queue.add("Ты");
        queue.add("хороший");
        queue.add("ученик");

        System.out.println("Очерель: " + queue);

        //удаление первого элемента
        System.out.println("До: " + queue.poll());
        System.out.println("Очередь после: " + queue);

        //посмотреть первый элемент без удаления
        System.out.println("Очередь после: " + queue.peek());
    }
}
