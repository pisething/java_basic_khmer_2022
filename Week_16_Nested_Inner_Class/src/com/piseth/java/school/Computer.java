package com.piseth.java.school;

public class Computer {
	private String model;
	
	public Computer(String model) {
		this.model = model;
	}
	
	public void display() {
		System.out.println("This is a computer " + model);
	}
	
	private void showInfo() {
		System.out.println("Computer infor");
	}
	
	 static class Ram{
		private int memorySize;
		
		public void show() {
			//display();
		}
	}
	
	protected class CPU{
		private int core;
		private String type;
		
		public CPU(int core, String type) {
			super();
			this.core = core;
			this.type = type;
		}
		
		private void showInfo() {
			System.out.println("CPU infor");
		}



		public void info() {
			System.out.println("Number of core=" + core);
			System.out.println("CPU type =" + type);
			//display();
			Computer.this.showInfo();
		}
	}
}
