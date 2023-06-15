package com.jspiders.multithreading2.main;


import com.jspiders.multithreading2.threads.Person1;
import com.jspiders.multithreading2.threads.Person2;
import com.jspiders.multithreading2.threads.MyThread3;

@SuppressWarnings("unused")
public class ThreadMain {

	public static void main(String[] args) {

		MyThread3 myThread1 = new MyThread3();
		myThread1.setName("Thread-1");
		myThread1.setPriority(9);

		MyThread3 myThread2 = new MyThread3();
		Thread thread = new Thread(myThread2);
		thread.setName("Thread-2");
		thread.setPriority(10);

		myThread1.start();
		thread.start();
		MyThread3 myThread3 = new MyThread3();
		myThread3.start();

	}
}

