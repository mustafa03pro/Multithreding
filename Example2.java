package com.mustafa.july23.multithreding;

public class Example2 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread()
	{
	   @Override
	   public void run()
	   {	      
	        for(int i=1; i<=10; i++)
	        {
	          System.out.println("i value is :"+i);
	          try
		  {
		    Thread.sleep(1000);
		  }
		  catch(InterruptedException e)
		  {
		     System.out.println("Thread is interrupted");
		     Thread.currentThread().interrupt();
		  }
	        }
	      
	   }
	};

        t.start();
        t.interrupt();
    }
}
