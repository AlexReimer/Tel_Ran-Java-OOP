package MyString.appl;

import MyString.MyString;
import MyString.iterator.MyStringIterator;

import java.util.Iterator;

public class MyStringAppl {
    public static void main(String[] args) {
        //  0123456789012345678901234
        MyString ms = new MyString("Two beer or not two beer");
        // "Two ber or not two ber"
        System.out.println(ms);

        for (Character c : ms) {
            System.out.print(c + " ");
        }
        System.out.println();

        deleteChar(ms, 'e');
        System.out.println(ms);
    }


    public static void deleteChar(MyString ms, char ch) {
        // iterator ->  size 25, currentPos = 0 -> 1 -> 2 -> 3 -> 5 (заданная 'e') в обход iterator
        // мы начинаем удаляем 'e', а он не знает. поэтому StringIndexOutOfBoundsException: String index out of range: 22
        // НЕЛЬЗЯ - напрямую оюращаться к String чтобы удалить или прибавить элемнт
//        for (Character c : ms ){
//            if (c == ch) {
//                ms.removeChar(ch);
//            }
//        }

        //чтобы не было как выше, нужно в самом Iterator прописать ремов метод
        Iterator<Character> iter = new MyStringIterator(ms.getStrB());
        while (iter.hasNext()) {
            if (iter.next() == ch) iter.remove();
        }
    }
}
