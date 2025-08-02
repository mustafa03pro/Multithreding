package com.mustafa.july24.Scenariomultithreding;

public class LiveTracking extends Thread {
	@Override
	public void run() {
		//System.out.println("Updating ride location... 20% completed");
		try {
			Thread.sleep(2000);
			System.out.println("Updating ride location... 20% completed");
			
		}
		catch (InterruptedException e) {
			System.err.println(e);
		}
		try {
			Thread.sleep(2000);
			System.out.println("Updating ride location... 40% completed");
			
		}
		catch (InterruptedException e) {
			System.err.println(e);
		}
		try {
			Thread.sleep(2000);
			System.out.println("Updating ride location... 60% completed");
			
		}
		catch (InterruptedException e) {
			System.err.println(e);
		}
		try {
			Thread.sleep(2000);
			System.out.println("Updating ride location... 80% completed");
			
		}
		catch (InterruptedException e) {
			System.err.println(e);
		}
		System.out.println("Ride completed!");
	}

}
