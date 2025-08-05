package com.mustafa.july28.multithreding;


class MyThread extends Thread 
{
public void run() 
{
		for (int i=0; i < 10; i++) 
		{
			System.out.println("hello world1"+i);
		}
	}
}
public class Test36
{
public static void main(String [] args) 
{
MyThread t1 = new MyThread();
t1.start();
try 
{
t1.join(); 
} 
catch (InterruptedException e) 
{
System.out.println("ERROR: Thread was interrupted");
}       
System.out.println("Thread is done!");
	}
}

