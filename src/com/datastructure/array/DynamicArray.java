package com.datastructure.array;

import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T> {

	private T[] arr;
	private int len;
	private int capacity;

	public DynamicArray() {
		this(4); // default capacity is 4 in case capacity is not provided.
	}

	public DynamicArray(int capacity) {

		this.capacity = capacity;
		len = 0;
		arr = (T[]) new Object[capacity];

	}

	public int len() {
		return len;
	}

	public boolean isEmpty() {
		return len == 0;
	}

	public T get(int index) {
		return arr[index];
	}

	public void set(int index, T value) {
		arr[index] = value;
	}

	// to add a new element
	public void add(T value) {
		// if len =0 +1, >= capacity =0,
		if (len + 1 >= capacity) {
			if (capacity == 0)
				capacity = 1;
			else
				capacity *= 2;
			
			T[] new_arr = (T[]) new Object[capacity];
			for (int i = 0; i < len; i++)
				new_arr[i] = arr[i];
			arr = new_arr;
		}
		arr[len++] = value;
	}

	public void clear(){
		for(int i =0; i < len; i++)
			arr[i] = null;
		len =0;
	}
	// remove value at index
	public T removeAt(int rm_index) {
		if (rm_index >= len && rm_index < 0)
			throw new IndexOutOfBoundsException();
		T rm_data = arr[rm_index];
		T[] new_arr = (T[]) new Object[len - 1];
		for (int i = 0, j = 0; i < len; i++, j++) {
			if (i == rm_index)
				j--;
			else
				new_arr[j] = arr[i];
		}
		arr = new_arr;
		capacity = len - 1;
		return rm_data;
	}

	public boolean remove(Object obj) {
		for (int i = 0; i < len; i++) {
			if (obj.equals(arr[i]))
				removeAt(i);
			return true;
		}
		return false;

	}

	public int indexOf(Object obj) {
		for (int i = 0; i < len; i++)
			if (obj.equals(arr[i]))
				return i;
		return -1;

	}

	public boolean contains(Object obj) {
		return indexOf(obj) != -1;
	}

	public java.util.Iterator<T> iterator() {

		return new java.util.Iterator<T>() {
			int index = 0;

			@Override
			public boolean hasNext() {
				return index < len;
			}

			@Override
			public T next() {
				return arr[index++];
			}
		};
	}
@Override public String toString(){
	if(len == 0) return "[]";
	else{
		StringBuilder sb = new StringBuilder( len ).append("[");
		for(int i =0; i < len-1; i++){
			sb.append(arr[i]+", ");
			System.out.println("Inside toString");
			}
		return sb.append(arr[len-1]+"]").toString();
	}
	
}
	
}
