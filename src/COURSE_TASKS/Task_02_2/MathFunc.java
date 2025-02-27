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
    String[] operators = {">=", "<=", ">", "<"};
    boolean isNumCondition = false;
    double conditionValue = 0;
    String operatorFound = "";
    double sum = 0;


    if(objects1.length != objects2.length){
        return  "N/A. Не соответствуют размерности";
    }

    for(String op : operators){
        if(condition.startsWith(op)){
            isNumCondition = true;
            operatorFound = op;

            try {
                conditionValue = Double.parseDouble(condition.substring(op.length()).trim());
            } catch(NumberFormatException e){
                return "N/A. Не числовой формат";
            }
            break;
        }
    }

    
    for (int i = 0; i < objects1.length; i++) {
        //eсли числовое условие
        if (isNumCondition) {
            if (!isNumber(objects1[i])) {
                return "N/A. Object is not integer but must be";
            }
            
            double objValue = o2double(objects1[i]);

            if ((operatorFound.equals(">") && objValue > conditionValue) ||
                (operatorFound.equals("<") && objValue < conditionValue) ||
                (operatorFound.equals(">=") && objValue >= conditionValue) ||
                (operatorFound.equals("<=") && objValue <= conditionValue)) {
                sum += o2double(objects2[i]);
            }
        } else {
            if (objects1[i].toString().equals(condition)) {
                sum += o2double(objects2[i]);
            }
        }
    }
    return sum;
}
/*TODO разработать метод SUMIF
1. переиспльзовать метод SUMIF (читай документацию https://support.google.com/docs/answer/3093583?hl=ru&sjid=566149943412964060-EU)
*/
public Object SUMIF(Object[] objects1, String condition){
    return SUMIF(objects1, condition,  objects1);
}

}
