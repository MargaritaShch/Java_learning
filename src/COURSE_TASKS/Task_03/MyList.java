package school.xset.lesson3.list;

import java.util.*;

public class MyList implements List {

    private Object[] array;

    public MyList(){
        array = new Object[10];
    }

    public void print(){
        int len = size();
        for (int i = 0; i < len; i++) {
            if (i == len-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    @Override
    public Object get(int index) {
        /* TODO Разработать метод get
            1. метод должен проверять на вход невалидные индексы и выбрасывать исключение throw new IndexOutOfBoundsException();
            2. метод должен возвращать объект из array по индексу
         */
        if (index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public void add(int index, Object element) {
        /* TODO Разработать метод add(int index, Object element)
            1. метод должен проверять на вход невалидные индексы и выбрасывать исключение throw new IndexOutOfBoundsException();
            2. метод должен увеличивать размер array на 10 если это необходимо
            3. метод должен добавлять объект на позицию index, все объекты справа должны быть сдвинуты
         */
        if (index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }
        int len = size();
        if (array.length - 1 <= len){
            Object[] oldObjs = array;
            array = new Object[oldObjs.length + 10];
            for (int i = 0; i < oldObjs.length; i++) {
                array[i] = oldObjs[i];
            }
        }
        for (int i = len; i >= index; i--) {
            array[i+1] = array[i];
        }
        array[index] = element;
        return;
    }

    @Override
    public Object remove(int index) {
        /* TODO Разработать метод remove(int index)
            1. метод должен проверять на вход невалидные индексы и выбрасывать исключение throw new IndexOutOfBoundsException();
            2. метод должен удалить объект на позиции index и сдвинуть объекты справа на единицу (чтобы заполнить пустоту)
            3. метод должен вернуть удаленный объект
         */


        return null;
    }

    @Override
    public int indexOf(Object o) {
        /* TODO Разработать метод indexOf(Object o)
            1. метод должен вернуть первый индекс позиции на которой находится объект o, если его нет, то вернуть -1
         */
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        /* TODO Разработать метод lastIndexOf(Object o)
            1. метод должен вернуть последний индекс позиции на которой находится объект o, если его нет, то вернуть -1
         */
        return -1;
    }

    @Override
    public boolean isEmpty() {
        /* TODO
            1. вернуть true если все объекты null
            2. вернуть false в противном случае
         */
        return true;
    }

    @Override
    public int size() {
        /* TODO реализация метода size в MyList
            1. метод должен возвращать количество ненулевых объектов
            2. предполагаем что метод add не будет добавлять null (см. ТУДУ для add)
         */
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) return i;
        }
        return array.length;
    }

    @Override
    public boolean add(Object o) {
        /* TODO реализовать метод add
            1. метод должен добавлять в array объект o на первую позицию со значением null
            2. метод должен возвращять false если o == null
            3. метод должен увеличивать array на 10 если array заполнен. Данные не должны быть потеряны
            4. метод должен реализовывать проверку на увеличение возвращаемого значения из size()
         */

        int len = size();
        add(len, o);
        if (len + 1 == size()) return true;
        else return false;
    }


    @Override
    public boolean contains(Object o) {
        /* TODO реализовать метод contains
            1. метод должен возвращать true если объект находится в array и false в противном случае
         */
        return false;
    }

    @Override
    public Object[] toArray() {
        /* TODO реализовать метод toArray
            1. метод должен возвращать массив объектов размера size()
         */
        return null;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    @Override
    public Object set(int index, Object element) {
        /* TODO реализовать метод set
            1. метод должен заменять объект на позиции index на element
            2. метод должен проверять на невалидные индексы
         */
        return null;
    }

    @Override
    public boolean remove(Object o) {
        /* TODO реализовать метод remove(Object o)
            1. метод должен удалять объект o
            2. метод должен вернуть false если такого объекта нет
         */
        return true;
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        array = new Object[10];
    }



    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

}
