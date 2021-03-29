package appl;

import items.MyString;
import iterators.MyReverseIterator;

import java.util.Iterator;

public class MyStringAppl {

    public static void main(String[] args) {

        String str1 = "The early bird catches the worm";
        MyString myStr = new MyString(str1);
        for(Character ch : myStr) {
            System.out.print(ch+" ");
        }
        System.out.println();


        Iterator <Character> iterRevers = new MyReverseIterator (myStr.getLetters());
        while (iterRevers.hasNext()) {
            System.out.print(iterRevers.next() + " ");
        }
        System.out.println();
    }
}
