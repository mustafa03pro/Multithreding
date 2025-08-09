package com.mustafa.july30.multithreding;

class Job extends Thread 
{
    private Integer number = 0;
    public void run() 
    {
        for (int i = 1; i <= 1000000; i++) 
	{
            number++;
        }
    }
    public Integer getNumber() 
    {
        return number;
    }
}
public class Test8 {
    public static void main(String[] args) {
        Job thread = new Job();
        thread.start();
		try
		{
			thread.join();
		}
		catch (Exception e)
		{
		}
        System.out.println(thread.getNumber());
    }
}
