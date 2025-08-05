package com.mustafa.july28.multithreding;


class MyThreadA extends Thread
{
	String s;
	public void run(String s) 
	{ 
		this.s=s;
		for (;;) 
		{
			System.out.println("s will be printed :"+s);
		}
	}
}
class MyThreadB extends Thread 
{
	String t;
	public void run(String t) 
	{ 
		this.t=t;
		for (;;) 
		{
			System.out.println("t will be printed :"+t);
		}
	}
}
public class Test31
{
public static void main(String [] args) 
{
  MyThreadA t1 = new MyThreadA();
  MyThreadB t2 = new MyThreadB();
		t1.start();
		t2.start();
		
	}
}