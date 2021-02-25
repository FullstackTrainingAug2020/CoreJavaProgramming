package com.java.threads.examples;

public class SecondThread extends Thread{
	
	String threadName;

	SecondThread(String name) {
		threadName = name;
	}

	@Override
	public void run(){
		try {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println("My Thread - " + cnt + " with Name: " + threadName);
			Thread.sleep(1500);
		}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}

}
