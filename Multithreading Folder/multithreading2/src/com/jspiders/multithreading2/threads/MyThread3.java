package com.jspiders.multithreading2.threads;


public class MyThread3 extends Thread {

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			if (i > 2) {
				this.stop();
			}
			System.out.println("MyThread 33 is now running");
		}
	}

}
 