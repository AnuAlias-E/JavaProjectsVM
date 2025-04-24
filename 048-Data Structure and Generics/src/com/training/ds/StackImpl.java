package com.training.ds;

import com.training.exceptions.InvalidStackSizeException;
import com.training.exceptions.StackEmptyException;
import com.training.exceptions.StackIsFullException;
ublic class StackImpl<T> implements Stack<T> {
	Object[] objects;

	int index = 0;

	public StackImpl(int size) throws Exception {
		if (size < 0) {
			Exception e = new InvalidStackSizeException("Stack size cannot be Negative value");
			throw e;
		}
		this.objects = new Object[size];
	}

	public void push(T data) throws Exception {
		if(index==objects.length) {
			Exception e  = new StackIsFullException("Stack Already Full");
			throw e;
		}
		this.objects[index] = data;
		index++;
	}

	public T pop() throws Exception {
		if(index==0) {
			Exception e  = new StackEmptyException("Stack has no elements , nothing to pop ");
			throw e;
		}
		index--;
		T r = (T) this.objects[index];
		return r;

	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < index; i++)
			if (i == index - 1)
				str = str + this.objects[i];
			else {
				str = str + this.objects[i] + ",";
			}
		str = str + "]";
		return str;
	}

}
