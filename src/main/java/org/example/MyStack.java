package org.example;

public class MyStack {
    private Object[] data;
    private int size;
    private int top;

    public MyStack() {
        data = new Object[10];
        size = 0;
        top = -1;
    }

    public void push(Object value) {
        if (size == data.length) {
            resize();
        }
        top++;
        data[top] = value;
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
        top--;
        size--;
    }

    public void clear() {
        for (int i = 0; i <= top; i++) {
            data[i] = null;
        }
        size = 0;
        top = -1;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній");
        }
        return data[top];
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній");
        }
        Object value = data[top];
        data[top] = null;
        top--;
        size--;
        return value;
    }

    private void resize() {
        int newCap = data.length * 2;
        Object[] newData = new Object[newCap];
        for (int i = 0; i <= top; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    private boolean isEmpty() {
        return top == -1;
    }
}
