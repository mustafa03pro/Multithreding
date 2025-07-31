package com.mustafa.july23.multithreding;
class child extends Thread{
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




public class EvenOdd 
{

	public static void main(String[] args) throws InterruptedException 
	{
	   child c1=new child();
	   c1.start();
	   c1.join();
	   
		   for(int i=0;i<100;i++) {
			   if(i%2==0) {
				   System.out.println(i+" by "+Thread.currentThread().getName());
			   }
		   
	   }

	}

}
