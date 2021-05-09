package interfaces;

import java.util.Comparator;
import java.util.Iterator;

public interface OurList<E> extends Iterable<E> {
    /**
     * the method returns element by the index
     *
     * @param index
     * @return the element if index is between 0 and size-1
     * @throws IndexOutOfBoundsException otherwise
     */
    E get(int index);


    /**
     * adds element to the list
     *
     * @param elt
     */
    void add(E elt);

    /**
     * removes the element by zhe index from the collection
     *
     * @param index
     * @return element to be removed
     */
    E remove(int index);

    /**
     * removes the element if found in the collection
     *
     * @param elt
     * @return true if found and removed, false othesise
     * @throws IndexOutOfBoundsException if index is incorrect
     */
     boolean remove(E elt);

    /**
     * @return size of the collection
     */
     int size();

    /**
     * puts the element dy the index
     *
     * @param index
     * @param elt
     * @throws IndexOutOfBoundsException if index is incorrect
     */
     void set(int index, E elt);

    /**
     * @param elt
     * @return true if the element is found in the collection
     */
     boolean contains(E elt);


    /**
     * The method must sort this list according to the comparator rule
     *
     * @param comparator
     */
     void sort(Comparator<E> comparator);

    E max(Comparator <E> comparator);

    E min (Comparator <E> comparator);


    /**
     * The method returns an iterator which iterators in the backward order
     * The iterator must throw IndexOutOfBoundExeption if the it.next() is invoked and no elements
     * remain to iterate over
     *
     * @return iterator in backward order
     */
    Iterator<E> backwardIterator();


    /**
     * The method returns an iterator which iterators in the regular order
     * The iterator must throw IndexOutOfBoundExeption if the it.next() is invoked and no elements
     * remain to iterate over
     *
     * @return iterator in regular order
     */
    @Override
    Iterator<E> iterator();


}
