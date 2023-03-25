package com.piseth.java.school;

import java.util.Arrays;

public class ArrayOperationDemo {

	public static void main(String[] args) {
		//addNewElement();
		//addNewElementAtSpecificIndex();
		//updateElement();
		//updateManyElement();
		//removeElement();
		removeManyElement();
	}
	
	public static void removeManyElement() {
		int[] a = {23,65,40,12,45, 40, 56, 40, 38};
		int valueToDelete = 40;
		int count = 0;
		
		for(int i=0; i< a.length; i++) {
			if(a[i] == valueToDelete) {
				count++;
			}
		}
		
		
		int[] b = new int[a.length - count];
		int index = 0;
		for(int i=0; i< a.length; i++) {
			if(a[i] != valueToDelete) {
				b[index] = a[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
	}
	
	public static void removeElement() {
		int[] a = {23,65,70,12,45};
		int indexToDelete = 2;
		// {23,65,12,45}
		int[] b = new int[a.length-1];
		//step 1
		for(int i=0; i<indexToDelete; i++) {
			b[i] = a[i];
		}
		//step 2
		for(int i=indexToDelete; i<b.length; i++) {
			b[i] = a[i+1];
		}
		a = b;
		System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(b));
	}
	
	public static void updateManyElement() {
		int[] a = {23,65,70,12};
		// any element which is greater than 60 => add more 20
		System.out.println(Arrays.toString(a));
		for(int i =0; i< a.length; i++) {
			if(a[i] > 60) {
				a[i] = a[i] + 20;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void updateElement() {
		int[] a = {23,45,24,12};
		int indexToUpdate = 2;
		int newValue = 100;
		
		System.out.println(Arrays.toString(a));
		// {23,45,100,12}
		a[indexToUpdate] = newValue;
		System.out.println(Arrays.toString(a));
	}
	
	public static void addNewElementAtSpecificIndex() {
		int[] a = {23,45,24,12};
		int indexToAdd = 1;
		int newValue = 38;
		
		int[] b = new int[a.length + 1];
		
		// step 1
		for(int i =0; i< indexToAdd; i++) {
			b[i] = a[i];
		}
		// step 2
		b[indexToAdd] = newValue;
		// step 3
		for(int i= indexToAdd + 1; i<b.length; i++) {
			b[i] = a[i-1];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		a = b;
		
	}
	
	public static void addNewElement() {
		int[] a = {23,45,24,12};
		// new element = 38
		// a = {23,45,24,12,38}
		
		int newElement = 38;
		
		int[] b = new int[a.length + 1];
		//display
		System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(b));
		
		// step copy
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		b[b.length - 1] = newElement;
		// display again
		//System.out.println("===================");
		//System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(b));
		a = b;
		
		System.out.println(Arrays.toString(a));
	}
	

}
