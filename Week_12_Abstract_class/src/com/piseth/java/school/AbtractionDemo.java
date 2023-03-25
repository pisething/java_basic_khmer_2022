package com.piseth.java.school;

public class AbtractionDemo {
	public static void main(String[] args) {
		//Language language = new Language();
		
		KhmerLanguage khmerLanguage = new KhmerLanguage();
		//khmerLanguage.display();
		//khmerLanguage.infor();
		khmerLanguage.sayHello();
		
		ThaiLanguage thaiLanguage = new ThaiLanguage();
		thaiLanguage.sayHello();
	}
}
