package com.jspiders.multithreading2.resource;

public class Account {
int accountBalance;
public Account (int accountBalance) {

this.accountBalance=accountBalance;
}	

public void checkBalance() {
System.out.println("Current Balance:"+ accountBalance);
} 
public void depositAmount(int amount) {
	System.out.println("Depositing"+amount+"resourceAccount");
	accountBalance+=amount;
	checkBalance();
}
public void withdrawAmount(int amount) {
	System.out.println("Trying to withdraw"+amount+"rs from account");
	if (amount>accountBalance) {
		System.out.println("Insufficient balance.");
	}else {
		accountBalance -=amount;
	checkBalance();
	}
}
}
