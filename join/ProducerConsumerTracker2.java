package com.mustafa.Aug2.join;

import java.util.Scanner;

class StoreData {
	private int number;
	private boolean produced=false;
	public StoreData(int number) {
		super();
		this.number = number;
		
	}
	public synchronized void produce(int value) {
		while(produced) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				
			}
			
		}
		number=value;
		System.out.println("Produced:"+value);
		produced=true;
		notify();
	}
	public synchronized void consumer() {
		while(!produced) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				
			}
		}
	
		System.out.println("consumer:"+number);
		produced=false;
		notify();
	}
}
class Producer1 implements Runnable{
	private StoreData data;
	
	

	private int limit;



	public Producer1(StoreData data, int limit) {
		super();
		this.data = data;
		this.limit = limit;
	}
	public void run() {
	     for (int i = 1; i <= limit; i++) {
	         data.produce(i);
	     }
	
}}
class Consumer1 implements Runnable{
	private StoreData data;
	private int limit;
	public Consumer1(StoreData data, int limit) {
		super();
		this.data = data;
		this.limit = limit;
	}
	public void run() {
	
		     for (int i = 1; i <= limit; i++) {
		         data.consumer();
		     }
		
	}
}
public class ProducerConsumerTracker2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int limit;
		try {
			limit=sc.nextInt();
			if(limit<=0) {
				System.err.println("Invalid input! Limit must be a positive integer.");
				return;
			}
		}
		catch (Exception e) {
			System.err.println("Invalid input! Please enter a numeric value.");
			return;
		}
		StoreData share=new StoreData(limit);
		Producer1 prod=new Producer1(share, limit);
		Consumer1 con=new Consumer1(share, limit);
		Thread produ=new Thread(prod);
		Thread cons=new Thread(con);
		produ.start();
		cons.start();
		

	}}


