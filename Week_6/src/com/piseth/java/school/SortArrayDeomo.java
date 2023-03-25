package com.piseth.java.school;

import java.util.Arrays;

public class SortArrayDeomo {

	public static void main(String[] args) {
		//Sorting
		int a[] = {50,34,12,36,60,23};
		System.out.println(Arrays.toString(a));
		
		for(int i =0; i< a.length; i++) {
			for(int j= i+1; j <a.length; j++) {
				if(a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
