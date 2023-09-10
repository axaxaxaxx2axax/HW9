package org.example;

public class MyQueue {
    private Object[] data;
    private int size;

    private int first;
    private int last;
    public MyQueue() {
        data = new Object[10];
        size = 0;
        first = 0;
        last = -1;
    }

    public void add(Object value) {
        if (size == data.length) {
            resize();
        }
        last = (last + 1) % data.length;
        data[last] = value;
        size++;
    }

    public void clear() {
        for (int i = 0; i < size; i++){
            data[(first + i) % data.length] = null;
        }
        size = 0;
        first = 0;
        last = -1;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Черга пуста");
        }
        return data[first];
    }

    public Object poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Черга пуста");
        }
        Object value = data[first];
        data[first] = null;
        first = (first + 1) % data.length;
        size--;
        return value;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        int newCap = data.length * 2;
        Object[] newData = new Object[newCap];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(first + i) % data.length];
        }
        data = newData;
        first = 0;
        last = size - 1;
    }
}
