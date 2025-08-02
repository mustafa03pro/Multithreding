package com.mustafa.july24.Scenariomultithreding;

public class RatingSystem extends Thread {
	@Override
	public void run() {
		System.out.println("Requesting user rating...");
		try {
			Thread.sleep(1500);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("User rated the ride: 5 star");
	}

}
