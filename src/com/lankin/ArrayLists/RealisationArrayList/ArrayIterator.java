package com.lankin.ArrayLists.RealisationArrayList;

import com.lankin.Iterator.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private int index = 0;
    private E[]value;

    public ArrayIterator(E[] value) {
        this.value = value;
    }


    @Override
    public boolean hasNext() {
        return index < value.length;
    }

    @Override
    public E next() {
        return value[index++];
    }
}
