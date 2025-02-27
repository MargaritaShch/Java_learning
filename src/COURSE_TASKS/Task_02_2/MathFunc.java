package COURSE_TASKS.Task_02_2;

public class MathFunc {
/*TODO Разработать функцию SUM
1. если все значения числовые, то вернуть их сумму (переводить все в Double)
2. разработать вспомогательный метод boolean isNumber(Object o), который возвращает true если объект числовой
3. разработать вспомогательный метод Double o2double(Object o), преобразует объект в Double
*/
public Object SUM(Object[] objects){
    double sum = 0;
    for (int i= 0; i<objects.length; i++){
        if(isNumber(objects[i])){
            sum += o2double(objects[i]);
        }
    }
    return sum;
}

public static boolean isNumber(Object o){
    return o instanceof Number;  
}

public static double o2double(Object o){
    //преобразование к типу double
    return ((Number) o).doubleValue();
}  

/*TODO разработать метод SUMIF
1. Вернтуь сумму objects2 для позиций, в которых objects1 удовлетворяет condition
2. condition - это текстовая переменная, которая будет либо цифра со знаками ><= или любой текст
3. если condition начинается на один из ><=, то сравниваем objects1 как цифры, если нет, тот как String
4. вернуть "N/A. Не соответствуют размерности" если objects1 и objects2 разной длины
5. вернуть "N/A. Object is not integer but must be" если condition начинается с ><= и в objects1 не число
*/
public Object SUMIF(Object[] objects1, String condition, Object[] objects2){

}

/*TODO разработать метод SUMIF
1. переиспльзовать метод SUMIF (читай документацию https://support.google.com/docs/answer/3093583?hl=ru&sjid=566149943412964060-EU)
*/
public Object SUMIF(Object[] objects1, String condition){

}

}
