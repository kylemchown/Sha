package com.qa.StaticTest;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class TestStatic {
	public Bank a;
	public Bank b;
	public Bonk c;
	public Bonk d;
	
	@Before
	public void setup() {
		a = Bank.create();
		b = Bank.create();
		c = new Bonk(5);
		d = new Bonk(5);
	}
	
	@Test
	public void setSta(){

		a.sta = 11111;
		assertEquals(11111, b.sta);
	}
	
	@Test
	public void setBonkSta() {
		c.non = 10;
		assertTrue(!(c.non == d.non));
	}
	
	
}
