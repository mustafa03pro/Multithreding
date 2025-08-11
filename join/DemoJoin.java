package com.mustafa.Aug2.join;
class Alpha extends Thread{
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		t.setName("beta_thread");
		Beta b1=new Beta();
		b1.setName("beta thread");
		b1.start();
		
		try {
			
			b1.join();
			System.out.println("alpha thread re-started");
			
		}
		catch(InterruptedException e) {
			
		}
		for(int i=1;i<10;i++) {
			System.out.println(i+" by "+name);
		}
		
	}
}

public class DemoJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a1=new Alpha();
		a1.setName("Alpha_thread");
		a1.start();

	}

}
class Beta extends Thread{
	Thread t=Thread.currentThread();
	String name=t.getName();
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i+" by "+name);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			
		}
		System.out.println("beta thread is ended");
	}
}
