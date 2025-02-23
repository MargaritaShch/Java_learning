package COURSE_TASKS.Task_01;

public class Main {
    public static void main(String[] args){
        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();

        programmer1.age = 23;
        programmer1.name = "Марк";
        programmer1.goWork();
        programmer1.isHasTask = false;
        programmer1.isKnowJava = false;

        programmer2.age = 29;
        programmer2.name = "Давид";
        programmer2.goWork();
        programmer2.isHasTask = true;
        programmer2.isKnowJava = true;

        programmer1.teachJava(programmer2);
        if (programmer2.isKnowJava && !programmer2.isHasTask) {
            programmer2.teachJava(programmer1);
        }
        
        System.out.println("Программист первый: " + programmer1.name + ", возраст: " + programmer1.age + ", имеет задание: " + (programmer1.isHasTask ? "Да" : "Нет") + ", знает Java: " + (programmer1.isKnowJava ? "Да" : "Нет"));

        System.out.println("Программист второй: " + programmer2.name + ", возраст: " + programmer2.age + ", имеет задание: " + (programmer2.isHasTask ? "Да" : "Нет") + ", знает Java: " + (programmer2.isKnowJava ? "Да" : "Нет"));

        programmer1.goSleep();
        programmer2.goSleep();
    }
}
