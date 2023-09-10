package org.example;

import java.util.ArrayList;

public class MyArrayList {
    private Object[] data;
    private int size;
    public int size() {
        return size;
    }
    public MyArrayList() {
        data = new Object[10];
        size = 0;
    }

    public void add(Object value) {
        if (size == data.length){
            resize();
        }
        data[size] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Невірний індекс");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Невірний індекс");
        }
        return data[index];
    }



    private void resize() {
        int newCap = data.length * 2;
        Object[] newData = new Object[newCap];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

}
