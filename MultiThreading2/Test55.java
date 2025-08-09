package com.mustafa.july30.multithreding;

class Test55 extends Thread 
{
	static Thread tf, ts;

	public synchronized void run()
	{
		System.out.println(Thread.currentThread().getName()+"");
		ts.start();
	}

	public static void main(String[] args) 
	{
		tf = new Thread(new Test55(),"SCJP");
		ts = new Thread(new Test55(),"SCJWD");
		tf.start();
	}

}
