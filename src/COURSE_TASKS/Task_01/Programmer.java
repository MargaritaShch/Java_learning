package COURSE_TASKS.Task_01;

public class Programmer {
    String name;
    int age;
    boolean isHasTask;
    boolean isKnowJava;

    public void goWork(){
        System.out.println(name + " ,пора за работу!");
    }

    public void goSleep(){
        System.out.println(name + " ,иди уже поспи, бедолага :)");
    }

    public void teachJava(Programmer anotherProgrammer) {
        //если текущий программист this знает java
        if (this.isKnowJava) { 
            //проверяем знания другого программиста
            if (!anotherProgrammer.isKnowJava) {
                anotherProgrammer.isKnowJava = true;
                System.out.println(name + " начал обучать " + anotherProgrammer.name + " программированию на Java.");
            } else {
                System.out.println(anotherProgrammer.name + " уже знает Java");
            }
        } else {
            //если текущий программист  this НЕ знает java, он не может обучать
            System.out.println(name + " не может обучать " + anotherProgrammer.name + ", так как сам не знает Java.");
        }
    }
}
