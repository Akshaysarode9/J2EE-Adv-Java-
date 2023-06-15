package com.jspiders.multithreading3.threads;


import com.jspiders.multithreading3.resource.Shop;

public class Customer extends Thread {

	Shop shop;

	public Customer(Shop shop) {
		this.shop = shop;
	}

	@Override
	public void run() {
		shop.orderProducts(10);
	}

}
