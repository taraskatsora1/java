package com.epam;

import java.util.Iterator;

public class ArrayImpl implements Array {
    private Object[] objects;

    public ArrayImpl(int size) {

        objects = new Object[size];
    }

    @Override
    public void add(Object element) {
        //todo: extend array's size if needed?
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                objects[i] = element;
                return;
            }
        }
    }

    @Override
    public void set(int index, Object element) {
        //todo: extend array's sie if needed?
        objects[index] = element;
    }

    @Override
    public void clear() {
        for (int i = 0; i < objects.length; i++) {
            objects[i] = null;
        }
    }

    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public Iterator<Object> iterator() {
        return new IteratorImpl();
    }


    @Override
    public Object get(int index) {

        return objects[index];
    }

    @Override
    public int indexOf(Object element) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null && objects[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void remove(int index) {
        for (int i = 0; i < objects.length; i++) {
            objects[index] = 0;
        }
    }

    @Override
    public String toString() {
        String result = "";
        //for ...


        return result;

    }

    private class IteratorImpl implements Iterator<Object> {
        int current = 1;
        Object[] objects;

        @Override
        public boolean hasNext() {
            for (int i = 0; i < objects.length; i++) {
                if (objects[i].equals(current)){
                    return true;
                }
            }
            return false;
        }

        @Override
        public Object next() {
            return objects[current + 1];
        }

        @Override
        public void remove() {

        }

    }

    public static void main(String[] args) {
        ArrayImpl array = new ArrayImpl(5);
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");

        array.set(0, "N");
        array.set(4, "ZZZ");
        System.out.println(array.get(2));
        array.remove(1);
        System.out.println(array.indexOf("C"));
        System.out.println( array.size());

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

    }

}
