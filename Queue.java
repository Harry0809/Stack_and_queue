package com.stack_Queue_operations;

import com.bridgelabz.linkedlist.LinkedList;

public class Queue<T> {
    LinkedList<T> linkedList;

    public Queue() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueu(T key) {
        linkedList.add(key);
    }
    public void print() {
        linkedList.display();
    }

    public boolean isEmpty(){
        if(linkedList.size() == 0)
            return true;
        else
            return false;
    }

    public T peek(){
        return linkedList.peek();
    }


    public T dequeue() {
        return linkedList.pop();
    }
}