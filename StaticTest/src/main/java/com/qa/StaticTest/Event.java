package com.qa.StaticTest;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event implements ActionListener {
	TextField txt;
	public void actionPerformed(ActionEvent x) {
		txt.setText("Hello");
	}
	
	public Event(TextField x) {
		txt = x;
	}
}
