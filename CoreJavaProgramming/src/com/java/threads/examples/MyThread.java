package com.java.threads.examples;

public class MyThread extends Thread {

	String threadName;

	MyThread(String name) {
		threadName = name;
	}

	@Override
	public void run(){
		try {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println("My Thread - " + cnt + " with Name: " + threadName);
			Thread.sleep(2000);
		}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	
	
}
/*
 * try { mt.join();} catch(Exception ex) { ex.printStackTrace(); }
 */
