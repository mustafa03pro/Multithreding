package com.mustafa.july30.multithreding;

public class Test7 extends Thread 
{
static String name = "ravi";

public static void main(String args[]) 
{
Test7 t = new Test7();
t.Test(name);
System.out.print(" " + name);
}

public void Test(String name) {
start();
System.out.print(" method");
}

public void run() {
System.out.print(" run");
}
}
