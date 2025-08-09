package com.mustafa.july30.multithreding;

class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread-1 running");
        });

        t1.start();
        t1.join();
        t1.start();
    }
}