package com.mustafa.july24.Scenariomultithreding;

public class DriverAssignment  extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Driver found and assigned!");
	}

}
