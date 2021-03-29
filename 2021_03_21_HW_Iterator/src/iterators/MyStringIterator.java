package iterators;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

    char[] letters;
    int index;

    public MyStringIterator(char[] letters) {
        this.letters = letters;
        index = 0;
    }

    @Override
    public boolean hasNext() {
//        if (index < str.letters.length) return true;
//          return false;
        return index < letters.length;
    }

    @Override
    public Character next() {
        // Character ch = index [0] ;
        return letters[index++];
    }
}
