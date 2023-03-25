package com.piseth.java.school;

public class KhmerLanguage implements Language{

	@Override
	public void greeting() {
		System.out.println("Suo Sdey");
	}

	@Override
	public void introduce(String name) {
		System.out.println("Knhom Jmuos " + name);
	}

}
