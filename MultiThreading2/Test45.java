package com.mustafa.july30.multithreding;

public class Test45 extends Thread
{
static String sName = "good";
public static void main(String argv[]) 
{
Test45 t = new Test45();
t.nameTest(sName);

System.out.println(sName);    
}

public void nameTest(String sName)
{
sName = sName + " idea ";
start();
}

public void run()
{
for(int i=0; i<4; i++)
{
 sName = sName + " " + i;
}
}

}