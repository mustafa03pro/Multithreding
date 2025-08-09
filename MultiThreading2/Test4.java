package com.mustafa.july30.multithreding;

class Test {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        });

        t.start();
        t.run();
    }
}