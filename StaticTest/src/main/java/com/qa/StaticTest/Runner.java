package com.qa.StaticTest;

import java.awt.*;

public class Runner {

	public static void main(String[] args) {
	/*	Bank as = Bank.create();
		Bank zx = Bank.create();
		
		System.out.println(as.sta);
		System.out.println(zx.sta);
		as.sta = 50;
		System.out.println(as.sta);
		System.out.println(zx.sta);*/
		
		Frame f = new Frame();
		Button b1 = new Button("click1");
		Button b2 = new Button("click2");
		Button b3 = new Button("click3");
		Button b4 = new Button("click4");
		Event e = new Event();
		b1.addActionListener(e);
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.EAST);
		f.add(b3, BorderLayout.SOUTH);
		f.add(b4, BorderLayout.WEST);
		f.setSize(400,400);
		f.setVisible(true);
		
	}

}
