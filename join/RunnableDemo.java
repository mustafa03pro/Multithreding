package com.mustafa.Aug2.join;

public class RunnableDemo {

	public static void main(String[] args) {
		Runnable r1=() -> {
			String name=Thread.currentThread().getName();
			System.out.println(name);
			
		};
		Thread t1=new Thread(r1);
		t1.start();

	}

}
