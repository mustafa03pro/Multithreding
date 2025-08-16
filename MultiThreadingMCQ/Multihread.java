package com.mustafa.Aug05.multiThredingMCQ;


public class Multihread extends Thread
{	
	public static void main(String[] args) {
		Multihread m1 = new Multihread();
		Multihread m2 = new Multihread();
		Multihread m3 = new Multihread();
		m1.start();
		m2.start();
		m3.start();
		
		for(int i=0;i<5;i++) 
		{
			m2.yield();
			System.out.println(Thread.currentThread().getName());
		}
	}
public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
