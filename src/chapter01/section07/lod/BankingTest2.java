package chapter01.section07.lod;

import java.util.HashMap;
import java.util.Map;

class Bank {
	private Map<String, Integer> safe;
	
	public Bank() {
		safe = new HashMap<String, Integer>();
	}

	public int widtrawal(String customerCode,int money) {
		int balance =safe.get(customerCode) -money;
		safe.put(customerCode, balance);
		return balance;
	}
	public int deposit(String customerCode ,int money) {
		int balance =safe.get(customerCode) +money;
		safe.put(customerCode, balance);
		return balance;
	}
	
	public void makeAccount(String customerCode, int currentMoney) {
		safe.put(customerCode, currentMoney);
	}
}

class BankTeller {
	public Bank bank;

	public BankTeller() {
		bank = new Bank();
	}

	public int widtrawal(String customerCode,int money) {
		return bank.widtrawal(customerCode, money);
	}
	public int deposit(String customerCode ,int money) {
		return bank.deposit(customerCode, money);
	}
	
	public void makeAccount(String customerCode, int currentMoney) {
		bank.makeAccount(customerCode, currentMoney);
	}
}

class Customer {
	public String customerCode;
	public int currentMoney;
	public BankTeller teller;

	public Customer(String customerCode, int currentMoney) {
		teller = new BankTeller();
		this.currentMoney = currentMoney;
		this.customerCode = customerCode;
	}

	public int withdrawal(String customerCode, int money) {
		teller.widtrawal(customerCode, money);
		return currentMoney -= money;
	}
	public int deposit(String customerCode ,int money) {
		teller.deposit(customerCode, money);
		return currentMoney += money;
	}
	
	public void makeAccount() {
		teller.makeAccount(customerCode, currentMoney);
	}
}

public class BankingTest2 {
	public static void main(String[] args) {
		Customer kim = new Customer("CUST-A0001", 1000);
		kim.makeAccount();
		
		System.out.println("ÀÔ±Ý ÈÄ ÀÜ¾× : " + kim.deposit("CUST-A0001",10));
		System.out.println("Ãâ±Ý ÈÄ ÀÜ¾× : " + kim.withdrawal("CUST-A0001",20));
	}
}
