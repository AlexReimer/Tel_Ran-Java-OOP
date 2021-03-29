package interfaces;

public interface IList extends Iterable<Object> {
    //методы

    //добавление
    boolean add(Object obj);

    int size();

    //дай мне нужный элемент
    Object get(int index);

    //remove по индексу
    // удалит объект  - увольнение сотрудника напр. -
    // НО и вернет его - для переноса в другую коллекцию, напр.
    Object remove(int index);

    //передаете объект, удаляете и если получиось, то тру
    boolean remove (Object obj);

    int indexOf(Object obj);

    //вернуть индект последнего нужного элемннта - соответсвующего какому-то условию
    int lastIndexOf(Object obj);

    boolean contains(Object obj);

    //будет возвращать актуальные части массива
    Object[] ToArray ();

    void clear ();
}