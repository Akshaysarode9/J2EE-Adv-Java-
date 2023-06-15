package com.jspiders.multithreading3.main;

import com.jspiders.multithreading3.resource.Shop;
import com.jspiders.multithreading3.threads.Customer;
import com.jspiders.multithreading3.threads.Supplier;

public class ShopMain {

	public static void main(String[] args) {
		Shop shop = new Shop(5);

		Customer customer = new Customer(shop);
		Supplier supplier = new Supplier(shop);

		customer.start();
		supplier.start();
	}

}