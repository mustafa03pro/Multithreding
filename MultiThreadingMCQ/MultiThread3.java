package com.mustafa.Aug05.multiThredingMCQ;


class Test1 implements Runnable
{
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		thread.stop();
		System.out.println(thread.getState());
	}
}
public class MultiThread3
{
	public static void main(String[] args) {
		Test1 nit = new Test1();
		nit.run();
	}
}
