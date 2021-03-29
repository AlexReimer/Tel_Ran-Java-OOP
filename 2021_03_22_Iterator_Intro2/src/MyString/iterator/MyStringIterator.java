package MyString.iterator;

import MyString.MyString;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

    //нужно передать то, что Iterator будет итерировать, поэтому поля
    private StringBuilder strB;
    private int currentPos;
    private int size;

    public MyStringIterator(StringBuilder strB) {
        this.strB = strB;
        currentPos = 0;
        size = strB.length();
    }

    @Override
    public boolean hasNext() {
        //до тех пор пока currentPos меньше size -> верни true
        return currentPos<size;
    }

    @Override
    public Character next() {
//        Character current = strB.charAt(currentPos);
//        currentPos ++;
//        return current;
        return strB.charAt(currentPos++);
    }

    //01234
    //Hello
    @Override
    public void remove (){
        //чтобы Iterator не шел вперед после обнаружениея искомого, сделай шаг назад и удали
        //тк next возвращет искомый элемент, и дедает шаг вперед, а нам нужно для удаления, чтобы он нашел,
        //но не шел вперед перед удалением
        strB.deleteCharAt(--currentPos);
        //эдемент удаелн поэтому size уменьшился
        size --;

    }
}
