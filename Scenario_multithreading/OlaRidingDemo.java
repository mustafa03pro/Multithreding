package com.mustafa.july24.Scenariomultithreding;

public class OlaRidingDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread ride=new Thread( new Runnable() {
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
		});
		Thread Driver=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(3000);
				}
				catch (InterruptedException e) {
					System.out.println(e);
				}
				System.out.println("Driver found and assigned!");
				
			}
		});
		Thread Fare=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Calculating estimated fare...");
				try{
					Thread.sleep(1500);
					
				}
				catch (InterruptedException e) {
					System.out.println(e);
				}
				System.out.println("Estimated fare: 135.75 RS.");
				
			}
		});
		Thread Live=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					
					Thread.sleep(2000);
					for(int i=20;i<100;i+=20) {
						
						System.out.println("Updating ride location... "+i+"% completed");
						Thread.sleep(2000);
					}
					
					
				}
				catch (InterruptedException e) {
					System.err.println(e);
				}
				
				System.out.println("Ride completed!");
				
			}
		});
		Thread Payment=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Processing payment...");
				try {
					Thread.sleep(2000);
				}
				catch (InterruptedException e) {
					// TODO: handle exception
				}
				System.out.println("Payment successful!");
				
			}
		});
		Thread Rating=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Requesting user rating...");
				try {
					Thread.sleep(1500);
				}
				catch (InterruptedException e) {
					// TODO: handle exception
				}
				System.out.println("User rated the ride: 5 star");
				
			}
		});
		ride.start();
		Fare.start();
		ride.join();
		Driver.start();
		Driver.join();
		Live.start();
		Live.join();
		Payment.start();
		Payment.join();
		Rating.start();
	
		
		

	}

}
