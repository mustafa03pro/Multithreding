package com.mustafa.july24.Scenariomultithreding;

public class RideRequest extends Thread {
	@Override
	public void run() {
		System.out.println("User requested a ride...");
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Searching for nearby drivers...");
	}

}
