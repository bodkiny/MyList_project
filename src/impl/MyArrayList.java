package impl;

import interfaces.MyList;

public class MyArrayList<E> implements MyList<E> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E element) {
        return false;
    }

    @Override
    public void add(E element, int index) {

    }

    @Override
    public E removeByIndex(int index) {
        return null;
    }

    @Override
    public E[] toArray() {
        return null;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }
}
