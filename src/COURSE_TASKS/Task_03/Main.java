package COURSE_TASKS.Task_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Accountants accountants = new Accountants(new ArrayList<>());
        MyList myList = new MyList();

        System.out.println("=== MYLIST ===");
        //add(Object o)
        System.out.println("\nadd elements:");
        myList.add("plug");
        myList.add("stub");
        myList.add("java");
        myList.print();

        //get(int index)
        System.out.println("\nget(1): " + myList.get(1)); 

        //indexOf(Object o)
        System.out.println("\nget index 'java': " + myList.indexOf("java"));
        System.out.println("get 'с++' does not exist: " + myList.indexOf("с++")); 

        //lastIndexOf(Object o)
        myList.add("Apple");
        System.out.println("\nlast index 'plug': " + myList.lastIndexOf("plug"));

        //remove(int index)
        System.out.println("\ndelete index 1:");
        myList.remove(1);
        myList.print(); 

        //contains(Object o)
        System.out.println("\nHave 'java'? " + myList.contains("java")); 
        System.out.println("Have 'stub'? " + myList.contains("Banana")); 

        //size()
        System.out.println("\nSize list списка: " + myList.size()); 

        //remove(Object o)
        System.out.println("\ndelete 'java': " + myList.remove("java"));
        myList.print(); 

        //set(int index, Object element)
        System.out.println("\nchange 'plug' on 'c++' in index 1:");
        myList.set(1, "Grapes");
        myList.print(); 

        //clear()
        System.out.println("\nDelete list:");
        myList.clear();
        myList.print(); 
        System.out.println("Is empty? " + myList.isEmpty()); 


        
        System.out.println("=== ACCOUNTANTS ===");
        //income()
        System.out.println("\nAdd income:");
        accountants.income(460.0);
        accountants.income(-120.0); //
        System.out.println("Operations count: " + accountants.count());
        System.out.println("Operations list: " + accountants.getOperations()); 

        //incomeWithPosition() 
        System.out.println("\nAdd income at position 1:");
        accountants.incomeWithPosition(1, -130.0); 
        System.out.println("Operations count: " + accountants.count());
        System.out.println("Operations list: " + accountants.getOperations()); 

        //outcome() да
        System.out.println("\nAdd outcome:");
        accountants.outcome(170.0); 
        accountants.outcome(-130.0); 
        System.out.println("Operations count: " + accountants.count());
        System.out.println("Operations list: " + accountants.getOperations()); 

        //get() 
        System.out.println("\nGet value at index 2: " + accountants.get(2));

        //count() 
        System.out.println("\nTotal operations: " + accountants.count());
    }
}
