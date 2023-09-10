package org.example;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add("Cat");
        myArrayList.add("Dog");
        myArrayList.add("Pig");

        System.out.println("Розмір колекції: " + myArrayList.size());

        System.out.println("Елемент за індексом 0: " + myArrayList.get(0));
        System.out.println("Елемент за індексом 1: " + myArrayList.get(1));
        System.out.println("Елемент за індексом 2: " + myArrayList.get(2));

        myArrayList.remove(1);

        System.out.println("Розмір колекції після видалення: " + myArrayList.size());

        myArrayList.clear();

        System.out.println("Розмір колекції після очищення: " + myArrayList.size());
        System.out.println("-----------------------------------------------------");

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("Artem");
        myLinkedList.add("Dima");
        myLinkedList.add("Alex");

        System.out.println("Розмір колекції: " + myLinkedList.size());

        System.out.println("Елемент за індексом 0: " + myLinkedList.get(0));
        System.out.println("Елемент за індексом 1: " + myLinkedList.get(1));
        System.out.println("Елемент за індексом 2: " + myLinkedList.get(2));

        myLinkedList.remove(2);

        System.out.println("Розмір колекції після видалення: " + myLinkedList.size());

        myLinkedList.clear();

        System.out.println("Розмір колекції після очищення: " + myLinkedList.size());
        System.out.println("-----------------------------------------------------");

        MyQueue myQueue = new MyQueue();

        myQueue.add("Pen");
        myQueue.add("Pencil");
        myQueue.add("Line");

        System.out.println("Розмір черги: " + myQueue.size());

        System.out.println("Перший елемент: " + myQueue.peek());

        System.out.println("Видалений елемент: " + myQueue.poll());

        System.out.println("Розмір черги після видалення: " + myQueue.size());

        myQueue.clear();

        System.out.println("Розмір черги після очищення: " + myQueue.size());
        System.out.println("-----------------------------------------------------");

        MyStack myStack = new MyStack();

        myStack.push("Sofa");
        myStack.push("Bed");
        myStack.push("Chair");

        System.out.println("Розмір стеку: " + myStack.size());

        System.out.println("Вершина стеку: " + myStack.peek());

        System.out.println("Видалена вершина стеку: " + myStack.pop());

        System.out.println("Розмір стеку після видалення: " + myStack.size());

        myStack.clear();

        System.out.println("Розмір стеку після очищення: " + myStack.size());
        System.out.println("-----------------------------------------------------");

        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put("ключ1", "Значення 1");
        myHashMap.put("ключ2", "Значення 2");
        myHashMap.put("ключ3", "Значення 3");

        System.out.println("Розмір мапи: " + myHashMap.size());

        System.out.println("Значення за ключем 'ключ1': " + myHashMap.get("ключ1"));
        System.out.println("Значення за ключем 'ключ2': " + myHashMap.get("ключ2"));
        System.out.println("Значення за ключем 'ключ3': " + myHashMap.get("ключ3"));

        myHashMap.remove("ключ2");

        System.out.println("Розмір мапи після видалення: " + myHashMap.size());

        myHashMap.clear();

        System.out.println("Розмір мапи після очищення: " + myHashMap.size());
    }
}
