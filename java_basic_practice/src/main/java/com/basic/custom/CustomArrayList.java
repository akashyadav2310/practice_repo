package com.basic.custom;

import java.util.Arrays;

public class CustomArrayList {

	private int[] data;
	
	private static int DEFAULT_SIZE = 5;
	
	private int size = 0; // Initially we set '0'
	
	
	
	public CustomArrayList() {
		this.data = new int[DEFAULT_SIZE];
	}
	
	public void add(int num) {
		if(isFull()) {
			resize();
		}
		data[size++] = num;
	}

	private void resize() {
		int[] temp = new int[data.length * 2];
		for(int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp; // Assign data to temp
	}

	public int get(int index) {
		return data[index];
	}
	
	public void set(int index, int value) {
		data[index] = value;
	}
	
	public int remove() {
		int removed = data[size - 1];
		size--;
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
		return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
	}

	public static void main(String[] args) {
		CustomArrayList customList = new CustomArrayList();
		System.out.println(customList);
		customList.add(1);
		customList.add(2);
		customList.add(3);
		customList.add(4);
		customList.add(5);
		System.out.println(customList);
//		customList.add(6);
//		customList.add(7);
//		System.out.println(Arrays.toString(customList.data));
		System.out.println(customList.size);
		customList.remove();
		//customList.add(6);
		System.out.println(customList.size);

		//System.out.println(customList.get(4));
		System.out.println(customList);
	}

}
