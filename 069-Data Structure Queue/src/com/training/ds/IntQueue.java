package com.training.ds;

public class IntQueue {
	int[] arr;
	int index;
	int capacity;
	int front;

	public IntQueue(int qSize) throws Exception {
		if (qSize < 0) {
			Exception e = new Exception("Invalid queue size");
			throw e;
		}
		this.index = 0;
		this.front = 0;
		this.capacity = qSize;
		this.arr = new int[qSize];
	}

	public void enQueue(int x) throws Exception {
		if (index == capacity) {// if Queue is full
			Exception e = new Exception("Queue is full");
			throw e;
		}
		arr[index] = x;
		// Increment queue size
		index++;
	}

	public void deQueue() throws Exception {
		if (index == 0) {// if queue is empty
			Exception e = new Exception("Queue is empty");
			throw e;
		}
		// shift all the elements to the left
		for (int i = 1; i < index; i++) {
			arr[i - 1] = arr[i];
		}
		// decrement queue size
		index--;
	}

	public int getFront() {
		if (index == 0) {
			// if queue is empty
			return -1;
		}
		return arr[front];
	}

	public String toString() {

		String str = "[";
		for (int i = 0; i < index; i++)
			if (i == index - 1)
				str = str + this.arr[i];
			else {
				str = str + this.arr[i] + ",";
			}
		str = str + "]";
		return str;

	}
}
