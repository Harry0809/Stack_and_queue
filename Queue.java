package com.stack_Queue_operations;

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
}