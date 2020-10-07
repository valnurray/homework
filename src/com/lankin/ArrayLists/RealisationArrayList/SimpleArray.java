package com.lankin.ArrayLists.RealisationArrayList;

import java.util.Iterator;

public class SimpleArray <E> implements Simple<E>{
    private E[] values;

    public SimpleArray(){
        values = (E[]) new Object();
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void update(int index, E e) {

    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) new ArrayIterator<E>(values);
    }
}
