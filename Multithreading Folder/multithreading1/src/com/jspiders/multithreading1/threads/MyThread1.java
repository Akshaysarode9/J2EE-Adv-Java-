package com.jspiders.multithreading1.threads;

public class MyThread1 extends Thread {
@Override
public void run() {
	
	System.out.println("Name of Thread :" +this.getName());

System.out.println("Priority of thread :" +this.getPriority());}
}
