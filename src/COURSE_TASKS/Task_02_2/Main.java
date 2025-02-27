package COURSE_TASKS.Task_02_2;

public class Main {
    public static void main(String[] args) {
        LogicFunc logic = new LogicFunc();
        Object[] obj = {false, "Python", true, "Locust", false, "JS", true, "K6"};
        System.out.println(logic.IFS(obj));

        MathFunc math = new MathFunc();
        Object[] testArray = {1, 2.5, 3, 4.0, 5};
        System.out.println(math.SUM(testArray));
    }
    
}
