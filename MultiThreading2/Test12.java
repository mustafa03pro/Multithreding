package com.mustafa.july30.multithreding;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("MyThread: run()");
	}

	public void start()
	{
		System.out.println("MyThread: start()");
	}
}

class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("MyRunnable: run()");
	}

	public void start()
	{
		System.out.println("MyRunnable: start()");
	}
}

public class Test12 
{
	public static void main(String args[])
	{
		MyThread myThread  =  new MyThread();
		MyRunnable Myrunnable = new MyRunnable();
		Thread thread  =  new Thread(Myrunnable);
		myThread.start();
		thread.start();
	}
}

