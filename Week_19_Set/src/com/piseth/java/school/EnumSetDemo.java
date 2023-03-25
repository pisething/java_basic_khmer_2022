package com.piseth.java.school;

import java.util.EnumSet;

public class EnumSetDemo {
	public static void main(String[] args) {
		/*
		 * Set<Size> sizes = new HashSet<>(); sizes.add(Size.SMALL);
		 * sizes.add(Size.MEDIUM); sizes.add(Size.LARGE); sizes.add(Size.EXTRALARGE);
		 */
		
		//System.out.println(sizes);
		//System.out.println(Size.getAll());
		
		EnumSet<Size> sizes2 = EnumSet.allOf(Size.class);
		//System.out.println(sizes2);
		
		EnumSet<Size> set3 = EnumSet.noneOf(Size.class);
		set3.add(Size.LARGE);
		//System.out.println(set3);
		
		EnumSet<Size> set4 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
		//System.out.println(set4);
		
		EnumSet<Size> set5 = EnumSet.of(Size.MEDIUM, Size.EXTRALARGE);
		System.out.println(set5);
	}
}
