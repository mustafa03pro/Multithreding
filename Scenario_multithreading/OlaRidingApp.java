package com.mustafa.july24.Scenariomultithreding;

public class OlaRidingApp {

	public static void main(String[] args) throws InterruptedException {
		RideRequest r1=new RideRequest();
		FareCalculation f1=new FareCalculation();
		DriverAssignment d1=new DriverAssignment();
		LiveTracking l1=new LiveTracking();
		PaymentProcessing p1=new PaymentProcessing();
		RatingSystem r2=new RatingSystem();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				
			}
			
		});
				
		
		r1.start();
		
		f1.start();
		r1.join();
		d1.start();
		d1.join();
		l1.start();
		l1.join();
		p1.start();
		p1.join();
		r2.start();
		
		
		

	}

}
