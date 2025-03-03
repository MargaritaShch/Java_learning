package school.xset.lesson3.practice;

import java.util.List;

public class Accountants {
    List<Double> operations;

    public Accountants(List<Double> list){
    /* TODO разработать конструктор Accountants
        1. Конструктор должен инициализировать переменную operations
     */
    }

    public void income(Double o){
    /* TODO разработка метода income
        1. должен добавлять число в конец списка операций
        2. добавленное число должно быть обязательно со знаком плюс
     */
    }

    public void incomeWithPosition(int p, Double o){
    /* TODO разработка метода incomeWithPosition
        1. должен добавлять число на переданную позицию
        2. добавленное число должно быть обязательно со знаком плюс
     */
    }

    public void outcome(Double o){
    /* TODO разработка метода outcome
        1. должен добавлять число в конец списка операций
        2. добавленное число должно быть обязательно со знаком минус
     */
    }

    public Double get(int i){
    /* TODO разработка метода get
        1. должен возвращать число из переданной позиции
     */
        return null;
    }

    public int count(){
    /* TODO разработка метода count
        1. должен возвращать число операций
     */
        return -1;
    }

}
