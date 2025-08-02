package com.mustafa.july24.Scenariomultithreding;

public class demo {

	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hai");
				
			}
		});

		t1.start();
	}

}
