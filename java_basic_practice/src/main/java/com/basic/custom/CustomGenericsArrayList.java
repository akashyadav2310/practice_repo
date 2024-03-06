package com.basic.custom;

import java.util.Arrays;

public class CustomGenericsArrayList<T> {

	private Object[] data;
	
	private static int DEFAULT_SIZE = 5;
	
	private int size = 0; // Initially we set '0'
	
	
	
	public CustomGenericsArrayList() {
		this.data = new Object[DEFAULT_SIZE];
	}
	
	public void add(T num) {
		if(isFull()) {
			resize();
		}
		data[size++] = num;
	}

	private void resize() {
		Object[] temp = new Object[data.length * 2];
		for(int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp; // Assign data to temp
	}

	public T get(int index) {
		return (T)(data[index]);
	}
	
	public void set(int index, T value) {
		data[index] = value;
	}
	
	public T remove() {
		T removed = (T)(data[--size]);
		return removed;
	}
	
	public int size() {
		return size;
	}
	
	private boolean isFull() {
		return size == data.length;
	}
	
	

	@Override
	public String toString() {
		return "CustomGenericsArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
	}

	public static void main(String[] args) {
		CustomGenericsArrayList<Integer> customGenList = new CustomGenericsArrayList<>();
		System.out.println(customGenList);
		customGenList.add(1);
		customGenList.add(2);
		customGenList.add(3);
		customGenList.add(4);
		customGenList.add(5);
		System.out.println(customGenList);
//		customList.add(6);
//		customList.add(7);
//		System.out.println(Arrays.toString(customList.data));
		System.out.println(customGenList.size);
		customGenList.remove();
		customGenList.remove();
		System.out.println(customGenList.size);

		System.out.println(customGenList.get(4));
		System.out.println(customGenList);
	}


}
