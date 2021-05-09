package model;

import interfaces.IList;

import java.util.Iterator;

public class MyLinkedList implements IList {
    private Node first;
    private Node last;
    private int size;


    @Override
    public boolean add(Object element) {
        Node newNode = new Node(last, (Node) element, null);
        //если элементы были
        if (last != null)
            last.next = newNode;
            //если эл были
        else
            first = newNode;
        //даже если эл были, перелинкуй
        last = newNode;
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        //так как индекса у LinkedList нет, нужно итерировать
        Node node = getNodeByIndex(index);
        return node == null ? null : node.element;
    }

    //доп. метод чтобы get метод заработал ибо ему нужден индекс
    private Node getNodeByIndex(int index) {
        if (index < 0 || index >= size)
            return null;
        Node node = first;
        //      0  1  2  3  4  5
        //      [] [] [] [] [] []
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //удаление по индексу
    @Override
    public Object remove(int index) {
        Node node = getNodeByIndex(index);
        if (node == null) return null;

        return unlink(node);
    }

    //получает ноде из метода getNodeByIndex
    private Object unlink(Node node) {
        size--;
        //если хочу удалить последнюю ноду
        if(node.next == null) {
            //node.next==null значит это последняя нода
            last.prev.next = null; //перелинкуем чтобы предпоследний стал последним
            last = last.prev; //теперь предпоследний стал последним и можно удалять в ретурне
            return node.element;
        }
        //если хочу удалить первую ноду
        if (node.prev == null) {
            first.next.prev = null;
            return node.element;
        }
        //если хочу удалить ноду в середине
        node.prev.next = node.next;
        node.next.prev = node.prev;
        return node.element;

    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public int indexOf(Object obj) {
        //индекса как такового у LinkedList нет, поэтлму эмулиреум его через цикл
        int index = 0;
        if (obj == null) {
            //шагаеем по Нодам - встань на первый эдемент first, и иди до null
            for (Node x = first; x != null; x = x.next) {
                //заглядываем в Node
                if (x.element == obj) return index;
                index++;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (obj.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }


    @Override
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    @Override
    public Object[] ToArray() {
        return new Object[0];
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }
}
