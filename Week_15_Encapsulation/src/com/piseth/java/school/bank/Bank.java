package com.piseth.java.school.bank;

public class Bank {
	private String bankName;
	private BankAccount[] bankAccounts;
	
	public Bank(String bankName, BankAccount[] bankAccounts) {
		super();
		this.bankName = bankName;
		this.bankAccounts = bankAccounts;
	}
	
	public void addBankAccount(BankAccount bankAccount) {
		if(bankAccounts == null) {
			bankAccounts = new BankAccount[1];
			bankAccounts[0] = bankAccount;
		}else {
			BankAccount[] temporary = new BankAccount[bankAccounts.length + 1];
			for(int i=0; i<bankAccounts.length; i++) {
				temporary[i] = bankAccounts[i];
			}
			temporary[bankAccounts.length] = bankAccount;
			bankAccounts = temporary;
		}
	}

	private BankAccount getBankAccountByNumber(String accountNumber) {
		for(BankAccount ba : bankAccounts) {
			if(ba.getAccountNumber().equals(accountNumber)) {
				return ba;
			}
		}
		return null;
	}
	
	private boolean isEnoughBalance(BankAccount bankAccount, double amount) {
		/*
		if(bankAccount.getBalance() >= amount) {
			return true;
		}
		return false;
		*/
		return bankAccount.getBalance() >= amount;
	}
	
	private boolean isValidAmount(double amount) {
		return amount > 0;
	}
	
	private void withdraw(BankAccount bankAccount, double amount) {
		double balance = bankAccount.getBalance() - amount;
		bankAccount.setBalance(balance);
	}
	
	private void deposit(BankAccount bankAccount, double amount) {
		double balance = bankAccount.getBalance() + amount;
		bankAccount.setBalance(balance);
	}
	
	public void transfer(String accountSource, String accountTarget, double amount) {
		BankAccount source = getBankAccountByNumber(accountSource);
		if(source == null) {
			System.out.println("Invalid Source Account Number");
			return;
		}
		BankAccount target = getBankAccountByNumber(accountTarget);
		if(target == null) {
			System.out.println("Invalid Target Account Number");
			return;
		}
		boolean isValidBalance = isEnoughBalance(source, amount);
		if(!isValidBalance) {
			System.out.println("Balance is not enough");
			return;
		}
		if(!isValidAmount(amount)) {
			System.out.println("Amount must be greater than 0");
			return;
		}
		withdraw(source, amount);
		deposit(target, amount);
	}
	
	public void displayAccounts() {
		for(BankAccount bankAccount : bankAccounts) {
			System.out.println(bankAccount.toString());
		}
	}
}
