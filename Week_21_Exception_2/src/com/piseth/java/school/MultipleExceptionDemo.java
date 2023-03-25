package com.piseth.java.school;

public class MultipleExceptionDemo {

	public static void main(String[] args) {
		String[] names = {"Dara", "Thida", "Seyha"};
		try {
			int number = 25/30;
			String name1 = names[3];
			System.out.println(name1);
			
		}/*catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {  
		
			e.printStackTrace();
		}*/
		/*
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
		}
		*/
		// implicit = auto
		// explicit = manual
		catch(ArrayIndexOutOfBoundsException |  ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finish");
 	}

}
