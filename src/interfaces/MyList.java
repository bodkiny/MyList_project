package interfaces;

public interface MyList<E> {
    int size();

    boolean add(E element);

    void add(E element, int index);

    E removeByIndex(int index);

    E[] toArray();

    boolean contains(E element);
}
