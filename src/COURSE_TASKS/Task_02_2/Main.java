package COURSE_TASKS.Task_02_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАДАЧA IFS ===");
        LogicFunc logic = new LogicFunc();
        Object[] obj = {false, "Python", true, "Locust", false, "JS", true, "K6"};
        System.out.println(logic.IFS(obj));

        System.out.println("=== ЗАДАЧA SUM ===");
        MathFunc math = new MathFunc();
        Object[] testArray = {1, 2.5, 3, 4.0, 5};
        System.out.println(math.SUM(testArray));

        System.out.println("=== ЗАДАЧA SUMIF ===");
        Object[] objects1 = {10, 5, 20, 15, 30, 25};
        Object[] objects2 = {100, 50, 200, 150, 300, 250};
        String condition1 = ">10";
        String condition2 = "<20";
        // System.out.println(math.SUMIF(objects1, condition2, objects2)); //РАССКОММЕТИРОВАТЬ

        System.out.println("=== ЗАДАЧA SUMIF ПЕРЕИСПОЛЬЗОВАНИЕ ===");
        System.out.println(math.SUMIF(objects1, condition2));
    }
}
