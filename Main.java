package com.stack_Queue_operations;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		Stack<Integer> stack = new Stack<>();

		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.print();
		System.out.println();
		while (!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
			stack.print();
			System.out.println();
		}

		queue.enqueu(56);
		queue.enqueu(30);
		queue.enqueu(70);
		queue.print();

		System.out.println();
		while (!queue.isEmpty()) {
			System.out.println(queue.peek());
			queue.dequeue();
			queue.print();
			System.out.println();
		}
	}
}