import interfaces.OurList;

import java.util.Comparator;
import java.util.Iterator;

//TODO implements two methods max() and min () and test them with numbers
public class OurArrayList<E> implements OurList<E> {

    private static final int INITIAL_CAPACITY = 16;

    private int size;
    private Object[] source;


    public OurArrayList() {
        source = new Object[INITIAL_CAPACITY];
    }


    @Override
    public void add(E element) {
        if (size == source.length)
            increaseCapacity();

        source[size] = element;
        size++;
    }

    // O(n), where n is size
    void increaseCapacity() {
        int newCapacity = source.length * 2;
        Object[] newSource = new Object[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);
        source = newSource;
    }


    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) source[index];
    }

    //вспомогательный метод, используемый другими здесь многократно,
    // чтобы не повторять код в методах основных
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("param pam pam");
        }
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E res = (E) source[index];
        System.arraycopy(source, index + 1, source, index, size - index - 1);
        size--;
        source[size] = null;
        return res;
    }

    @Override
    public boolean remove(E elt) {
        int index = findIndexOfElement(elt);
        if (index == -1) // -1 if not found
            return false;
        remove(index);
        return true;

    }

    //вспомогательный метод, используемый другими здесь многократно,
    //    чтобы не повторять код в методах основных
    /**
     * @param elt
     * @return the index of elt if found, -1 otherwise
     */
    private int findIndexOfElement(E elt) {
        // consider the case when the elt is null
        if (elt == null) {
            for (int i = 0; i < size; i++) {
                if (source[i] == null)
                    return i;
            }
            return -1;
        } else {
            for (int i = 0; i < size; i++) {
                if (elt.equals(source[i]))
                    return i;
            }
            return -1;
        }

    }




    @Override
    public int size() {
        return size();
    }

    @Override
    public void set(int index, E elt) {
        checkIndex(index);
        source[index] = elt;

    }

    @Override
    public boolean contains(E elt) {
        return findIndexOfElement(elt) != -1;


    }

    @Override
    public void sort(Comparator<E> comparator) {
        for (int i = 0; i < size; i++) {

            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                E currentMin = (E) source[minIndex];
                if (comparator.compare(currentMin, (E) source[j]) > 0) {
                    minIndex = j;

                }
            }
            E temp = (E) source[i];
            source[i] = source[minIndex];
            source[minIndex] = temp;
        }
    }

    @Override
    public E max(Comparator<E> comparator) {
        return null;
    }

    @Override
    public E min(Comparator<E> comparator) {
        return null;
    }



    public Iterator<E> backwardIterator() {
        return new BackwardIterator<>((E[]) source, size);
    }


    @Override
    public Iterator<E> iterator() { //T из class ForwardIterator здесь становится E
        Iterator<E> iterator = new ForwardIterator<>((E[]) source, size);
        return iterator;
    }


    private static class ForwardIterator<T> implements Iterator<T> {

        int size;
        T[] source;

        //the field ist responsible for the current iterated element
        int currentElementIndex = 0;

        public ForwardIterator(T[] source, int size) {
            this.source = source;
            this.size = size;
        }


        @Override
        public boolean hasNext() {
            return currentElementIndex < size;
        }

        @Override
        public T next() {
            if (currentElementIndex >= size)
                throw new IndexOutOfBoundsException();

            T result = source[currentElementIndex];
            currentElementIndex++;
            return result;
        }
    }
    private static class BackwardIterator<T> implements Iterator<T> {

        T[] source;
        //the field is responsible for the current iterated element
        int currentElementIndex;

        public BackwardIterator(T[] source, int size) {
            this.source = source;
            currentElementIndex = size - 1;
        }

        @Override
        public boolean hasNext() {
            return currentElementIndex >= 0;
        }

        @Override
        public T next() {
            if (currentElementIndex < 0)
                throw new IndexOutOfBoundsException();

            T res = source[currentElementIndex];
            currentElementIndex--;
            return res;
        }
    }

}
