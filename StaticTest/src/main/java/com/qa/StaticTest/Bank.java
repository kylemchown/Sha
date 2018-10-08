package com.qa.StaticTest;

public class Bank {
	int sta;
	static Bank x;
	static {
		x = new Bank();
	}
	
	private Bank() {
		sta = 30;
	}
	
	public static Bank create() {
		return x;
	}
}
