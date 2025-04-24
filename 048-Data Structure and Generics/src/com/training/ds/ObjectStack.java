package com.training.ds;

public class ObjectStack {
	Object[] objects;

	int index = 0;

	public ObjectStack(int size) {
		this.objects = new Object[size];
	}

	public void push(Object data) {
		this.objects[index] = data;
		index++;
	}

	public Object pop() {
		index--;
		Object r = this.objects[index];
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
