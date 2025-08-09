package com.mustafa.july30.multithreding;


public class Test10 extends Thread {

    public static void main(String[] args) throws Exception {
    Test10 t = new Test10();
    t.start();
    t.method();
    }

    public void run() {
    System.out.println("run");
    }

    public void method() {
	hello();
    System.out.println("method");
}

public void hello()
	{
	hello1();
	System.out.println("PR");
	}

	public void hello1()
	{
	
	System.out.println("RR");
	}
}
