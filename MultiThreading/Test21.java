package com.mustafa.july28.multithreding;


class Test21 
{
	public static void main(String[] args) 
	{		
		try
		{
			Hourse h = new Hourse();
			Thread t1= new Thread(h,"MyHorse");
			Thread t2= new Thread(h,"YourHorse");
			new Test21().go(t2);
			t1.start(); t2.start();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		void go(Thread t)
		{
			t.start();
		}	
		

			
	}
	
	
}
 class Hourse implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
	}
}