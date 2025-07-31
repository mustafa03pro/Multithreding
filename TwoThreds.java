package com.mustafa.july23.multithreding;


class child1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			if(i%2!=0) {
				System.out.println(i+" by "+Thread.currentThread().getName());
			}
		}
		System.out.println("------------------------------------------");
	}
}
class child2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i+" by "+Thread.currentThread().getName());
			}
		}
		
	}
}



public class TwoThreds 
{

	public static void main(String[] args) throws InterruptedException 
	{
	   child1 c1=new child1();
	   child2 c2=new child2();
	   c2.start();
	   c2.join();
	   
		  
	   c1.start();
	   

	}

}
