package iterators;

import java.util.Iterator;

public class MyReverseIterator implements Iterator<Character> {

    char[] letters;
    int index;

    public MyReverseIterator(char[] letters) {
        this.letters = letters;
        index = letters.length - 1;
    }

    @Override
    public boolean hasNext() {
        // if(index>=0) return true;
//		return false;
        return index >= 0;
    }

    @Override
    public Character next() {
        return letters[index--];
    }
}
