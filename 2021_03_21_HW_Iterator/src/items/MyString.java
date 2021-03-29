package items;

import iterators.MyStringIterator;

import java.util.Iterator;


public class MyString implements Iterable<Character> {
    char[] letters;

    public MyString(String str) {

        this.letters = str.toCharArray();
    }

    @Override
    public String toString() {

        return new String(letters);
    }

    @Override
    public Iterator<Character> iterator() {

        return new MyStringIterator(letters);
    }

    public char[] getLetters() {

        return letters;
    }
}
