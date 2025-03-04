package COURSE_TASKS.Task_03;

import java.util.ArrayList;
import java.util.List;

public class Accountants {
    private List<Double> operations;

    public Accountants(List<Double> list){
    /* TODO разработать конструктор Accountants
        1. Конструктор должен инициализировать переменную operations
     */
        this.operations = new ArrayList<>(list);
    }

    public void income(Double o){
    /* TODO разработка метода income
        1. должен добавлять число в конец списка операций
        2. добавленное число должно быть обязательно со знаком плюс
     */
        if (o < 0) {
            o = Math.abs(o); 
        }
        operations.add(o);
    }

    public void incomeWithPosition(int p, Double o){
    /* TODO разработка метода incomeWithPosition
        1. должен добавлять число на переданную позицию
        2. добавленное число должно быть обязательно со знаком плюс
     */
        if (p < 0 || p > operations.size()) {
            throw new IndexOutOfBoundsException("Некорректный индекс");
        }
        if (o < 0) {
            o = Math.abs(o); //+
        }
        operations.add(p, o);
    }

    public void outcome(Double o){
    /* TODO разработка метода outcome
        1. должен добавлять число в конец списка операций
        2. добавленное число должно быть обязательно со знаком минус
     */
        if (o > 0) {
            o = -o; //-
        }
        operations.add(o);
    }

    public Double get(int i){
    /* TODO разработка метода get
        1. должен возвращать число из переданной позиции
     */
        if (i < 0 || i >= operations.size()) {
            throw new IndexOutOfBoundsException("WRONG index");
        }
        return operations.get(i);
    }

    public int count(){
    /* TODO разработка метода count
        1. должен возвращать число операций
     */
    return operations.size();
    }

    public List<Double> getOperations() {
        return new ArrayList<>(operations); 
    }

}
