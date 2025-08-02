package com.mustafa.july24.Scenariomultithreding;

public class PaymentProcessing extends Thread{
	@Override
	public void run() {
		System.out.println("Processing payment...");
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("Payment successful!");
	}

}
