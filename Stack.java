package com.stack_Queue_operations;


public class Stack<T> {

    LinkedList<T> linkedList;

    public Stack() {
        this.linkedList = new LinkedList<>();
    }


    public void push(T key) {
        linkedList.push(key);
    }


    public void print() {
        linkedList.display();
    }

    public T pop() {
        return linkedList.pop();
    }
}