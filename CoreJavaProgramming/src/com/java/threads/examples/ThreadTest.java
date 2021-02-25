package com.java.threads.examples;

public class ThreadTest {

	public static void main(String s[])
	{
		MyThread myThreadObj = new MyThread("FIRST-THREAD");
		myThreadObj.start();
		
		SecondThread secondThreadObj = new SecondThread("SECOND-THREAD");
		secondThreadObj.start();
		
		try {
		for (int cnt = 0; cnt < 10; cnt ++) {
			System.out.println("MAIN THREAD - "+cnt);
			Thread.sleep(2000);
		}}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
