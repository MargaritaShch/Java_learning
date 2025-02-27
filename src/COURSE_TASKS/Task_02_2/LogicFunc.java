package COURSE_TASKS.Task_02_2;

public class LogicFunc {
/*TODO разработать функцию IFS
1. если парам1==истина, то вернуть парам2, далее в цикле проверять парные параметры, завершить цикл когда будет истина
2. вернуть null если не одно условние не истина
3. вернуть строку с ошибкой "N/A. Количество переменных должно быть четным" если количество объектов не четное
4. вернуть строку с ошибкой "N/A. Объект на четной позиции должен быть типа Boolean" если на четной позиции не boolean
*/
    public Object IFS(Object[] objs){
        if(objs.length % 2 != 0) {
            return "N/A. Количество переменных должно быть четным";
        } 
        //проход по четным индексам i+=2
        for(int i =0; i < objs.length; i+=2){
            if(!(objs[i] instanceof Boolean)){
                return "N/A. Объект на четной позиции должен быть типа Boolean"; 
            };

            boolean isTrue = (Boolean) objs[i];
                if(isTrue){
                    return objs[i+1];
                }
        }
        return null;
    }
}
