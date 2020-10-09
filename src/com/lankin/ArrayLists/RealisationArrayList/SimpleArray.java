package com.lankin.ArrayLists.RealisationArrayList;

import java.util.Iterator;

public class SimpleArray <E> implements Simple<E>{
    public static void main(String[] args) {
        Simple<String> strings = new SimpleArray<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        strings.update(1,"upd");
        strings.delete(1);

        System.out.println(strings.get(1));
//        System.out.println(strings.size());
    }

    private E[] values;

    public SimpleArray(){

        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try{
            E [] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values [values.length - 1] = e;
            return true;
        }catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try{
            E [] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElemOfArray = temp.length - index - 1;
            System.arraycopy(temp, index+1, values, index, amountElemOfArray);

        }catch (ClassCastException ex){
            ex.printStackTrace();
        }



    }

    @Override
    public E get(int index) {

        return values[index];
    }

    @Override
    public int size() {

        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {

        return (Iterator<E>) new ArrayIterator<E>(values);
    }
}
