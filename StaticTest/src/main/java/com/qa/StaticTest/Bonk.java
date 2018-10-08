package com.qa.StaticTest;

public class Bonk {
	static int sta;
	static {
		sta = 1;
	}
	int non;
	
	public Bonk(int a) {
		non = a;
	}
}
