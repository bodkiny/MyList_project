package impl;

import interfaces.MyList;

public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACITY = 15;
    private Object[] container;
    private int size;

    public MyArrayList() {
        container = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(final int initCapacity) {
        if(initCapacity >= 0){
            container = new Object[initCapacity];
        } else {
            throw new IllegalArgumentException("Invalid capacity value: " + initCapacity);
        }
    }

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
