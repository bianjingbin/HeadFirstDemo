package com.actionlistener;

import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

	public static void main(String[] args) {
		//ActionListener al = new TimePrinter();
		//Timer t = new Timer(1000, al);
		Timer t = new Timer(1000,event->System.out.println ("The time is " + new Date()));
		t.start();
		JOptionPane. showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}
