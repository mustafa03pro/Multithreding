package com.mustafa.july23.multithreding;


public class Mythred extends Thread 
{
public void run() 
{
    System.out.println("Thread is running");
}

public static void main(String[] args) 
{
    Mythred t = new Mythred();
    t.run(); 
}
}
