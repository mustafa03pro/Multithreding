package com.mustafa.Aug05.multiThredingMCQ;


class Test implements Runnable
{
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getState());
	}
}
public class MultiThread2
{
	public static void main(String[] args) {
		Test nit = new Test();
		nit.run();
	}
}