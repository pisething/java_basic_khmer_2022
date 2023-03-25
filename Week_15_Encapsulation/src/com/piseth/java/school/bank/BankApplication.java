package com.piseth.java.school.bank;

public class BankApplication {

	public static void main(String[] args) {
		 BankAccount[] bankAccounts = {
				new BankAccount("001", "dara", 300),
				new BankAccount("002", "thida", 200),
				new BankAccount("003", "cheata", 250)
				};
		 
		Bank bank = new Bank("ABA",bankAccounts);
		bank.displayAccounts();
		bank.transfer("001", "003", 100);
		System.out.println("========================");
		bank.displayAccounts();
		
		System.out.println("======= After adding new account =================");
		
		bank.addBankAccount(new BankAccount("004", "Piseth", 500));
		bank.displayAccounts();
		
	}

}
