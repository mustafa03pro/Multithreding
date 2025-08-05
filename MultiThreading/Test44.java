package com.mustafa.july28.multithreding;


public class Test44 extends Thread
{
public static void main(String argv[])
{
Test44 b = new Test44();
b.run();
b.start();
} 
public void start()
{
for (int i = 0; i < 10; i++)
{
System.out.println("Value of i = " + i); 
}  
}
}
