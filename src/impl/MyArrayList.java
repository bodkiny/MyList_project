package impl;

import interfaces.MyList;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACITY = 15;
    private Object[] container;
    private int size;

    public MyArrayList() {
        container = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(final int initCapacity) {
        if (initCapacity >= 0) {
            container = new Object[initCapacity];
        } else {
            throw new IllegalArgumentException("Invalid capacity value: " + initCapacity);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E element) {
        add(element, size);
        return true;
    }

    @Override
    public void add(E element, int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index < 0) {
            throw new IllegalArgumentException("Invalid argument: " + index);
        }

        if (size == container.length) {
            grow();
        }

        if (index < size) {
            System.arraycopy(container, index, container, index + 1, size - index);
        }

        container[index] = element;
        size++;
    }

    private void grow() {
        int prevCapacity = container.length;
        int newCapacity = prevCapacity * 2;
        Object[] newContainer = new Object[newCapacity];
        System.arraycopy(container, 0, newContainer, 0, prevCapacity);
        container = newContainer;
    }

    @Override
    public E removeByIndex(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index < 0) {
            throw new IllegalArgumentException("Invalid argument: " + index);
        }

        E elementToRemove = (E) container[index];
        size--;
        System.arraycopy(container, index + 1, container, index, size - index);

        return elementToRemove;
    }

    @Override
    public E[] toArray() {
        return (E[]) Arrays.copyOf(container, size);
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (container[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
}
