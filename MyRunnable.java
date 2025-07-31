package com.mustafa.july23.multithreding;


class MyRunnable implements Runnable 
{
    public void run() 
    {
        System.out.println("Running");
    }

    public static void main(String[] args) 
    {
        Thread t = new Thread();
        t.start();
    }
}

