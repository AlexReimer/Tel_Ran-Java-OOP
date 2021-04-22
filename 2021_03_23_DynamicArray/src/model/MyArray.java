package model;

import interfaces.IList;
import iterators.MyArrayIterator;

import java.util.Arrays;
import java.util.Iterator;

public class MyArray implements IList{
    private static final int INITIAL_SIZE = 16;
    public Object[] MyAray;
    private Object[] array;
    private int size = 0;

    //constructor размером, заданную пользователем
    public MyArray(int capacity) {
        //создание массива объектов, ссылка на него в поле array
        array = new Object[capacity];
    }

    //constructor размером 16
    public MyArray() {
        //array = new Object [INITIAL_SIZE];
        this(INITIAL_SIZE); //отсылка объекта на самого себя
    }

    @Override
    public boolean add(Object obj) {
        if (obj == null) return false;
        //проверь есть ли еще место, если нет, увелись на одлин
        if (array.length == size)
            //создает новый массив. переностит теду адементы из сторого
            // и увеличивает ращмер в два раза
            allocateArray();
        //add new element in size and then ++;
        array[size++] = obj;
        return true;
    }

    //создает новый массив. переностит туда алементы из сторого
    // и увеличивает размер в два раза - создавая буфер
    private void allocateArray() {
//        Object[]temp = new Object[array.length*2];
//        //перенесли все из страрого в новый
//        for (int i = 0; i < array.length; i++) {
//            temp[i]=array[i];
//        }
//        array = temp;

        //или всё в одну строку
        array = Arrays.copyOf(array, array.length * 2);
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public Object get(int index) {
        if (index < 0 && index >= size) return null;
        // если проверка прошла, верни элемент
        return array[index];
    }

    //index 0 1 2 3 4 5
    //array 1 3 5 7 8 11
    //array 1 3 5 8 11 |null
    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) return null;
        Object temp = array[index];
        if (index < size - 1) {
//            //сдвигай спава на место удаленного элемета
//            for (int i = index; i < size-1; i++) {
//                array[i] = array [i+1];
        }
        //копируем массив System.arraycopy - 5 аргументов,
        // последний из которых - размер копируемой части,
        // его расчитываем по формуле ize - index -
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        //после сзвига вправо уменьшаем актуальный размер дин.массива size
        array[size - 1] = null;
        size--;

        return temp;
    }


    @Override
    public boolean remove(Object obj) {
        if (obj == null) return false;
        int index = indexOf(obj); //call exist method unten
        Object res = remove(index); //call exist method Above
        return res != null;
    }

    @Override
    public int indexOf(Object obj) {
        if (obj == null) return -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        if (obj == null) return -1;
        int lastI = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) {
                lastI = i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object obj) {
        if (obj == null) return false;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] ToArray() {
        Object[] temp = new Object[size];
//        for(int i=0; i<size; i++){
//            temp[i]=array[i];
//        }
//        return temp;
//    }
        System.arraycopy(array, 0, temp, 0, size);
        return temp;
    }


    @Override
    //очистить массив
    public void clear() {
//        for (int i = 0; i < size; i++) {
//            array[i] = null;
//        }
        Object[] temp = new Object[0];
        array = temp;
        size = 0;
    }

    @Override
    public Iterator<Object> iterator() {

        return new MyArrayIterator(this);
    }
}
