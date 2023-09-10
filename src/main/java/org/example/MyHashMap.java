package org.example;

public class MyHashMap {
    private Node[] table;
    private int size;

    public MyHashMap() {
        table = new Node[16];
        size = 0;
    }

    public void put(Object key, Object value) {
        if (key == null) {
            throw new IllegalArgumentException("Ключ не може бути null");
        }

        int hash = key.hashCode();
        int index = hash % table.length;

        Node newNode = new Node(key, value);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    // Замінюємо значення, якщо ключ вже існує
                    current.value = value;
                    return;
                }
                if (current.next == null) {
                    break;
                }
                current = current.next;
            }
            current.next = newNode;
        }

        size++;
    }

    public void remove(Object key) {
        if (key == null) {
            return; // Нічого не робимо, якщо ключ null
        }

        int hash = key.hashCode();
        int index = hash % table.length;

        Node current = table[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next; // Видалення першого елемента списку
                } else {
                    prev.next = current.next; // Видалення середнього або останнього елемента списку
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void clear() {
        for (int i = 0; i < table.length; i++) {
            table[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        if (key == null) {
            return null;
        }

        int hash = key.hashCode();
        int index = hash % table.length;

        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    private class Node {
        private Object key;
        private Object value;
        private Node next;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}
