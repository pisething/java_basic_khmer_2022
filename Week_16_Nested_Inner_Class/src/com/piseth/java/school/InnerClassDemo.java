package com.piseth.java.school;

import com.piseth.java.school.Computer.Ram;

public class InnerClassDemo {

	public static void main(String[] args) {
		Computer com1 = new Computer("DELL");
		//com1.
		
		Computer.CPU cpu1 = com1.new CPU(4, "MD");
		
		//com1.display();
		//cpu1.info();
		
		Computer.Ram ram1 = new Ram();
	}

}
