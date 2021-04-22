package iterators;

import java.util.Iterator;

import items.Range;

public class RangeIterator implements Iterable<Integer> {

    private Range range;
    private int position;

    public RangeIterator(Range range) {
        this.range = range;
        position = range.getMin();
    }

//    @Override
//    public boolean hasNext() {
//        if (position <= range.getMax())
//            return true;
//        return false;
    //return position <=range.getMax();
//    }
//
//    @Override
//    public Integer next() {
////		Integer i = position;
////		position++;
////		return i;
//        return position++;
//    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
