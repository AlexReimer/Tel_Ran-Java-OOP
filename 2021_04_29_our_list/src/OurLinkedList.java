import interfaces.OurList;

import java.util.Comparator;
import java.util.Iterator;

//TODO *** implement
public class OurLinkedList<E> implements OurList<E> {

    private Node first;
    private Node last;
    private int size;


    @Override
    public E get(int index) {
        Node node = getNodeByIndex(index);
        return node == null ? null : (E) node.element;
    }

    private Node getNodeByIndex(int index) {
        if (index < 0 || index >= size)
            return null;
        Node node = first;

        for (int i = 0; i < index; i++) {
            node = node.next;

        }
        return node;
    }

    @Override
    public void add(E elt) {
        Node newNode = new Node(last, (Node) element, null);
        if (last != null)
            last.next = newNode;
        else
            first = newNode;
        last = newNode;
        size++;
    }

    @Override
    public E remove(int index) {
        Node node = getNodeByIndex(index);
        if (node == null) return null;
        return (E) unlink(node);
    }

    private Object unlink(Node node) {
        size--;
        if(node.next == null) {
            last.prev.next = null;
            last = last.prev;
            return node.element;
        }
        if (node.prev == null) {
            first.next.prev = null;
            return node.element;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        return node.element;

    }

    @Override
    public boolean remove(E elt) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void set(int index, E elt) {
        for (Node i = first; i != null; i = i.next) {
            if (i.element == getNodeByIndex(index)) {
                remove((E) i.element);
                add(element);
            }
        }

    }

    @Override
    public boolean contains(E elt) {
        return false;
    }

    @Override
    public void sort(Comparator<E> comparator) {

    }

    @Override
    public E max(Comparator<E> comparator) {
        return null;
    }

    @Override
    public E min(Comparator<E> comparator) {
        return null;
    }

    @Override
    public Iterator<E> backwardIterator() {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
