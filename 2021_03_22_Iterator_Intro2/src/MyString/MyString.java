package MyString;

import MyString.iterator.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable <Character>{

    private StringBuilder strB;

    public MyString(String str) {
        //инициализация нового объекта, куда загоняется str;
        // StringBuilder заполниться str плюс 16 пустых запасных элементов
        this.strB = new StringBuilder(str);
        // инициализация нового объекта на 16 элементов (StringBuilder),
        // через append в него добавляется str поэлементно. емли больше 16 эл. то StringBuilder бужет добавлять
        // this.strB = new StringBuilder();
        // strB.append(str);
    }

    public void addChar(char c) {
        strB.append(c);
    }

    public void removeChar(char c) {
        //не можем обратиться к indexOf  тк он принимает строку, а у нас приходит символ 'char c'
        //нам нужен wrapper (класс.обертка) чтобы его стрингануть, а потом обратиться через  индекс к элементу для удаления
        int index = strB.indexOf(Character.toString(c));
        strB.deleteCharAt(index);
    }

    @Override
    public String toString() {
        return strB.toString();
    }

    public StringBuilder getStrB() {
        return strB;
    }

    public void setStrB(StringBuilder strB) {
        this.strB = strB;
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(strB);
    }
}
