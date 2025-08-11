package com.mustafa.Aug2.join;

import java.util.Scanner;

//Main class
public class ProducerConsumerTracker {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int limit;

     System.out.print("Enter the limit: ");
     try {
         limit = scanner.nextInt();
         if (limit <= 0) {
             System.out.println("Invalid input! Limit must be a positive integer.");
             return;
         }
     } catch (Exception e) {
         System.out.println("Invalid input! Please enter a numeric value.");
         return;
     }

     SharedData sharedData = new SharedData();

     Producer producer = new Producer(sharedData, limit);
     Consumer consumer = new Consumer(sharedData, limit);

     Thread producerThread = new Thread(producer);
     Thread consumerThread = new Thread(consumer);

     producerThread.start();
     consumerThread.start();
 }
}

//Shared resource class
class SharedData {
 private int number;
 private boolean produced = false;

 public synchronized void produce(int value) {
     while (produced) {
         try {
             wait();
         } catch (InterruptedException ignored) {}
     }
     number = value;
     System.out.println("Produced: " + number);
     produced = true;
     notify();
 }

 public synchronized void consume() {
     while (!produced) {
         try {
             wait();
         } catch (InterruptedException ignored) {}
     }
     System.out.println("Consumed: " + number);
     produced = false;
     notify();
 }
}

//Producer class
class Producer implements Runnable {
 private final SharedData data;
 private final int limit;

 public Producer(SharedData data, int limit) {
     this.data = data;
     this.limit = limit;
 }

 @Override
 public void run() {
     for (int i = 1; i <= limit; i++) {
         data.produce(i);
     }
 }
}

//Consumer class
class Consumer implements Runnable {
 private final SharedData data;
 private final int limit;

 public Consumer(SharedData data, int limit) {
     this.data = data;
     this.limit = limit;
 }

 @Override
 public void run() {
     for (int i = 1; i <= limit; i++) {
         data.consume();
     }
 }
}

